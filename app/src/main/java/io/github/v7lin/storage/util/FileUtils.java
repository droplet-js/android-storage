package io.github.v7lin.storage.util;

import android.content.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class FileUtils {

    private FileUtils() {
        super();
    }

    public static boolean hasAssets(Context context, String path) {
        try {
            String[] assets = context.getAssets().list("");
            return assets != null && assets.length > 0 && Arrays.asList(assets).indexOf(path) > -1;
        } catch (IOException e) {
        }
        return false;
    }

    public static String[] listAssets(Context context, String path) {
        try {
            return context.getAssets().list(path);
        } catch (IOException e) {
        }
        return null;
    }

    public static void copyFromAssets(Context context, String assessFilePath, String targetFilePath) {
        try {
            InputStream in = context.getAssets().open(assessFilePath);
            File file = new File(targetFilePath);
            if (!file.exists()) {
                try {
                    file.getParentFile().mkdirs();
                } catch (Exception e) {
                    return;
                }
            }
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            FileOutputStream fs = new FileOutputStream(targetFilePath);
            byte[] buffer = new byte[1024];
            int n;
            while ((n = in.read(buffer)) != -1) {
                fs.write(buffer, 0, n);
            }
            in.close();
            fs.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
