package com.datastructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by tinhv on 15/09/2016.
 */
public class ReadLine
{
    public void readByLine() throws FileNotFoundException
    {
        Scanner linReader = new Scanner(new File("/Working/predix-tmca-app/predix-auto-create/text"));

        while (linReader.hasNext())
        {
            String line = linReader.nextLine();
            System.out.println(line);
        }
        linReader.close();

    }

    public static void main(String args[])  throws FileNotFoundException
    {
        ReadLine read = new ReadLine();
        read.readByLine();
    }
}
