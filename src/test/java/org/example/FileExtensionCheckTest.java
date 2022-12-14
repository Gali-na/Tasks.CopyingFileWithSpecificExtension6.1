package org.example;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class FileExtensionCheckTest {

    @Test
    void folderCheck_FileIsNull_GetErrorMessage() {
        File file = null;
        String rezultExpected = "Source specified on this path is not available";
        assertEquals(rezultExpected, FileExtensionCheck.folderCheck(file));

    }

    @Test
    void folderCheck_FileIsEmpty_GetErrorMessage() {
        File file = new File("English2");
        String rezultExpected = "There are no files with the specified extension in the folder";
        assertEquals(rezultExpected, FileExtensionCheck.folderCheck(file));

    }

    @Test
    void folderCheck_FileIsNotEmpty_GetStringWithNamesOfFile() {
        String[] arryEnding = new String[]{"txt"};
        File file = new File("English text");
        String rezultExpected = "txt.txt ";
        assertTrue(rezultExpected.equals(FileExtensionCheck.folderCheck(file, arryEnding)));

    }

}