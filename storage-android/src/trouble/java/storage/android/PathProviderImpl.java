package storage.android;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.Process;
import android.text.TextUtils;

import java.io.File;

import androidx.annotation.Nullable;

final class PathProviderImpl extends PathProvider {
    @Override
    public File getTemporaryDirectory(Context context) {
        File cacheDir = null;
        if (context.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, Process.myPid(), Process.myUid()) == PackageManager.PERMISSION_GRANTED) {
            cacheDir = context.getExternalCacheDir();
        }
        if (cacheDir == null) {
            cacheDir = context.getCacheDir();
        }
        return cacheDir;
    }

    @Override
    public File getFilesDirectory(Context context, @Nullable String type) {
        File filesDir = null;
        if (context.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, Process.myPid(), Process.myUid()) == PackageManager.PERMISSION_GRANTED) {
            filesDir = context.getExternalFilesDir(type);
        }
        if (filesDir == null) {
            filesDir = context.getFilesDir();
            if (!TextUtils.isEmpty(type)) {
                filesDir = new File(filesDir, type);
                if (!filesDir.exists()) {
                    filesDir.mkdirs();
                }
            }
        }
        return filesDir;
    }

    @Override
    public File getPublicDirectory(Context context) {
        if (context.checkPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE, Process.myPid(), Process.myUid()) == PackageManager.PERMISSION_GRANTED) {
            if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
                return Environment.getExternalStorageDirectory();
            }
        }
        return null;
    }
}
