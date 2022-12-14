package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Acer Nitro 5\\Desktop\\English text");
        File file2 = new File("C:\\Users\\Acer Nitro 5\\Desktop\\New English text");
        String[] names = new String[]{"txt", "docx"};
        if (FolderCheck.folderCheck(file) && FolderCheck.folderCheck(file2)) {
            String rezultCheckEndingFiles = FileExtensionCheck.folderCheck(file, names);
            String rezultNegative1 = "Source specified on this path is not available";
            String rezultNegative2 = "There are no files with the specified extension in the folder";
            if (rezultCheckEndingFiles.equals(rezultNegative1)) {
                System.out.println(rezultNegative1);
                return;
            }
            if (rezultCheckEndingFiles.equals(rezultNegative2)) {
                System.out.println(rezultNegative2);
                return;
            } else {
                СopyingFiles.copyFile(rezultCheckEndingFiles, file, file2);
            }
        } else {
            System.out.println("Copying to these addresses is not possible");
        }

        System.out.println(FileExtensionCheck.folderCheck(file, "txt", "docx"));
    }
}
