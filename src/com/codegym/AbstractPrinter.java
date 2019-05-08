package com.codegym;

public abstract class AbstractPrinter {

    protected String printerName;

    public AbstractPrinter(String printerName) {
        this.printerName = printerName;
    }

    public abstract void print(String message);
}
