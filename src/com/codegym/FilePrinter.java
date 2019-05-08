package com.codegym;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FilePrinter extends AbstractPrinter {

    private String path;

    public FilePrinter(String printerName, String path) {
        super(printerName);
        this.path = path;
    }

    @Override
    public void print(String message) {
        File file = new File(path);
        try {
            PrintStream printStream = new PrintStream(new FileOutputStream(file));
            printStream.println(this.printerName + ": " + message);
            printStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
