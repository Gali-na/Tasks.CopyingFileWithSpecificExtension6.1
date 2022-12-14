package org.example;

import org.junit.jupiter.api.Test;

import java.io.*;

import static junit.framework.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class СopyingFilesTest {

    @Test
    void copyFile_FilesExist_SuccessfulResult() {
        File file = new File("C:\\Users\\Acer Nitro 5\\Desktop\\English text");
        File file2 = new File("C:\\Users\\Acer Nitro 5\\Desktop\\New English text");
        String nameFile = " test.txt";
        СopyingFiles.copyFile(nameFile, file, file2);
        try (InputStream reader = new BufferedInputStream(new FileInputStream(file));
             InputStream reader2 = new BufferedInputStream(new FileInputStream(file2))) {
            byte[] bytes = new byte[1024];
            byte[] bytes2 = new byte[1024];
            int count = 0;
            while ((count = reader.read(bytes)) > 0) {

            }
            while ((count = reader.read(bytes2)) > 0) {

            }
            assertEquals(bytes, bytes2);
        } catch (IOException e) {
            e.getMessage();
        }
    }
    @Test
    void copyFile_OneOfFileIsNotExist_ReturnFalse() {
        File file = new File("C:\\Users\\Acer Nitro 5\\Desktop\\English text");
        File file2 =  new File(".");
        String nameFile = " test.txt";
        assertEquals(false, СopyingFiles.copyFile(nameFile, file, file2));
    }
}

