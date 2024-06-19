package org.example.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

    private static void checkedExceptionWithThrows() throws FileNotFoundException {
        File file = new File("not_existing_file.txt");
        FileInputStream stream = new FileInputStream(file);
    }
}
