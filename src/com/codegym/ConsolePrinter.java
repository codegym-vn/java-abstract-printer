package com.codegym;

public class ConsolePrinter extends AbstractPrinter {

    public ConsolePrinter(String printerName) {
        super(printerName);
    }

    @Override
    public void print(String message) {
        System.out.println(this.printerName + " :" + message);
    }
}
