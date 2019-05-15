package test;

import android.content.Context;
import android.os.Environment;

public class AccessExternalFiles {

  public void accessFiles(Context context) {
    Environment.getExternalStorageDirectory(); // Noncompliant {{Make sure that external files are accessed safely here.}}
    Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES); // Noncompliant
    context.getExternalFilesDir(Environment.DIRECTORY_PICTURES); // Noncompliant
    context.getExternalFilesDirs(Environment.DIRECTORY_PICTURES); // can't be tested, added in API v19 and there is no dependency in maven repo
    context.getExternalMediaDirs(); // can't be tested API v21
    context.getExternalCacheDir(); // Noncompliant
    context.getExternalCacheDirs(); // can't be tested API v19
  }
}
