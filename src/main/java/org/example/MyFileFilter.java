package org.example;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {
    String[] extension;

    public MyFileFilter(String... extension) {

        this.extension = extension;
    }

    @Override
    public boolean accept(File pathname) {
        for (String extensionItem : this.extension)
            if (pathname.getName().endsWith("." + extensionItem)) {
                return true;
            }

        return false;
    }
}
