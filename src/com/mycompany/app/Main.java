package com.mycompany.app;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        // add one line to test the git branch via IntelliJ
        System.out.println("Hello World.");

        CLineService lCLineService = new CLineService("testing cline service");

        lCLineService.Print();

        System.out.println("Done");
    }
}
