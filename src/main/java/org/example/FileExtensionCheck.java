package org.example;

import java.io.File;

public class FileExtensionCheck {
    public static String folderCheck(File file, String... namesExtensionEndingsFile) {
        String rezult = "Source specified on this path is not available";
        if (FolderCheck.folderCheck(file) == false) {
            return rezult;
        }
        MyFileFilter myFileFilter = new MyFileFilter(namesExtensionEndingsFile);
        File[] filesAfterSort = file.listFiles(myFileFilter);
        if (filesAfterSort.length == 0) {
            return rezult = "There are no files with the specified extension in the folder";
        }
        StringBuilder stringBuilderRezultNameFiles = new StringBuilder();
        for (File file1 : filesAfterSort) {
            stringBuilderRezultNameFiles.append(file1.getName());
            stringBuilderRezultNameFiles.append(" ");
        }
        return stringBuilderRezultNameFiles.toString();
    }
}
