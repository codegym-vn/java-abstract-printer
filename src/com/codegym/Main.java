package com.codegym;

public class Main {

    public static void main(String[] args) {
	    AbstractPrinter consolePrinter = new ConsolePrinter("First Printer");
	    AbstractPrinter filePrinter = new FilePrinter("Second Printer", "log.txt");

	    consolePrinter.print("This is a log");
	    filePrinter.print("This is another log");
    }
}
