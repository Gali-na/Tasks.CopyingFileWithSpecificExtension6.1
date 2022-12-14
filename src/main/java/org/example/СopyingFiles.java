package org.example;

import java.io.*;

public class СopyingFiles {
    public static boolean copyFile(String namesFiles, File fileFromCopy, File fileWhereCopy) {
        String[] endingFiles = namesFiles.split(" ");
        for (String ending : endingFiles) {
            String name = fileFromCopy.getAbsolutePath() + "\\" + ending;
            try (InputStream reder = new BufferedInputStream(new FileInputStream(fileFromCopy.getAbsolutePath() + "\\" + ending));
                 OutputStream writer = new BufferedOutputStream(new FileOutputStream(new File(fileWhereCopy.getAbsolutePath() + "\\" + ending)))) {
                byte[] arryByte = new byte[1024];
                while (reder.read(arryByte) > -1) {
                    writer.write(arryByte);

                }
            } catch (IOException e) {
                e.getMessage();
            }
        }
        return false;
    }

}
