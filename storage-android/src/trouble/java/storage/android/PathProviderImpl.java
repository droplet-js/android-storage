package storage.android;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.Process;

import java.io.File;

final class PathProviderImpl extends PathProvider {

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
