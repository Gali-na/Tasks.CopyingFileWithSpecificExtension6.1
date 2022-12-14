package org.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

import org.mockito.MockedStatic;
import org.mockito.Mockito;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class MyFileFilterTest {
    private MyFileFilter prepereMyFileFilter() {
        String[] arryString = new String[]{"txt", "pdf"};
        MyFileFilter myFileFilterTest = new MyFileFilter(arryString);
        return myFileFilterTest;
    }

    @Mock
    private File fileMockedStatic;

    @Test
    void accept_FileWithEndingExcist_GetTrue() {
        File[] files = new File[]{new File("C:\\Users\\Acer Nitro 5\\Desktop\\New English text\\txt.txt")};
        assertEquals(true, prepereMyFileFilter().accept(files[0]));
    }
    @Test
    void accept_FileWithEndingThatNotExcist_GetFalse() {
        File[] files = new File[]{new File("C:\\Users\\Acer Nitro 5\\Desktop\\New English text\\txt.exl")};
        assertEquals(false, prepereMyFileFilter().accept(files[0]));
    }
}