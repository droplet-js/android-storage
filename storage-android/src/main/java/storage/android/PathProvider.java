package storage.android;

import android.content.Context;
import android.os.Environment;

import java.io.File;

import androidx.annotation.Nullable;

public abstract class PathProvider {

    public abstract File getTemporaryDirectory(Context context);

    public File getDocumentsDirectory(Context context) {
        return getFilesDirectory(context, Environment.DIRECTORY_DOCUMENTS);
    }

    public abstract File getFilesDirectory(Context context, @Nullable String type);

    public abstract File getPublicDirectory(Context context);

    // ---

    public static PathProvider provider() {
        return new PathProviderImpl();
    }
}
