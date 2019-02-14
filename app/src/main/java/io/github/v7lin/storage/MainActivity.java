package io.github.v7lin.storage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

public class MainActivity extends Activity {

    private static final String TAG = "Storage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "Cache Dir: " + getCacheDir().getAbsolutePath());
        Log.e(TAG, "Files Dir: " + getFilesDir().getAbsolutePath());
        Log.e(TAG, "Obb Dir: " + getObbDir().getAbsolutePath());
        Log.e(TAG, "Dir - null: " + getDir(null, Context.MODE_PRIVATE).getAbsolutePath());
        Log.e(TAG, "Dir - Music: " + getDir(Environment.DIRECTORY_MUSIC, Context.MODE_PRIVATE).getAbsolutePath());

        Log.e(TAG, "External Cache Dir: " + getExternalCacheDir().getAbsolutePath());
        Log.e(TAG, "External Files Dir - null: " + getExternalFilesDir(null).getAbsolutePath());
        Log.e(TAG, "External Files Dir - Music:" + getExternalFilesDir(Environment.DIRECTORY_MUSIC).getAbsolutePath());

        Log.e(TAG, "Root Directory" + Environment.getRootDirectory().getAbsolutePath());
        Log.e(TAG, "Data Directory" + Environment.getDataDirectory().getAbsolutePath());
        Log.e(TAG, "External Storage Directory" + Environment.getExternalStorageDirectory().getAbsolutePath());
    }

    //2019-02-14 15:34:52.847 31764-31764/io.github.v7lin.storage E/Storage: Cache Dir: /data/user/0/io.github.v7lin.storage/cache
    //2019-02-14 15:34:52.848 31764-31764/io.github.v7lin.storage E/Storage: Files Dir: /data/user/0/io.github.v7lin.storage/files
    //2019-02-14 15:34:52.858 31764-31764/io.github.v7lin.storage E/Storage: Obb Dir: /storage/emulated/0/Android/obb/io.github.v7lin.storage
    //2019-02-14 15:34:52.859 31764-31764/io.github.v7lin.storage E/Storage: Dir - null: /data/user/0/io.github.v7lin.storage/app_null
    //2019-02-14 15:34:52.859 31764-31764/io.github.v7lin.storage E/Storage: Dir - Music: /data/user/0/io.github.v7lin.storage/app_Music

    //2019-02-14 15:34:52.869 31764-31764/io.github.v7lin.storage E/Storage: External Cache Dir: /storage/emulated/0/Android/data/io.github.v7lin.storage/cache
    //2019-02-14 15:34:52.872 31764-31764/io.github.v7lin.storage E/Storage: External Files Dir - null: /storage/emulated/0/Android/data/io.github.v7lin.storage/files
    //2019-02-14 15:34:52.875 31764-31764/io.github.v7lin.storage E/Storage: External Files Dir - Music:/storage/emulated/0/Android/data/io.github.v7lin.storage/files/Music

    //2019-02-14 15:34:52.875 31764-31764/io.github.v7lin.storage E/Storage: Root Directory/system
    //2019-02-14 15:34:52.875 31764-31764/io.github.v7lin.storage E/Storage: Data Directory/data
    //2019-02-14 15:34:52.878 31764-31764/io.github.v7lin.storage E/Storage: External Storage Directory/storage/emulated/0
}
