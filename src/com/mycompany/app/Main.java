package com.mycompany.app;

/**
 * Created by Fei Chen on 2/25/2017.
 */
public class Main
{
    public static void main(String[] args)
    {
        // move the master branch forward
        // add one line comment to make the master branch ahead of dev
        // add one line to test the git branch via IntelliJ
        System.out.println("Hello World.");

        CLineService lCLineService = new CLineService("testing cline service");

        lCLineService.Print();

        // change some attributes and then print again
        lCLineService.Print();

        System.out.println("Excellent IntelliJ ...");
        System.out.println("Done the experiment!");
    }
}
