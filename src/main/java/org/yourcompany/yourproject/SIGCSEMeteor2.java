/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.yourcompany.yourproject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Crystal Furman
 */
public class SIGCSEMeteor2 {

    /**
     *reads comma separated data from a file that has a header row. 
     */
    public static ArrayList<Meteor> readData (String filename)
    {
        ArrayList<Meteor> meteors = new ArrayList <Meteor>();

        File dataFile = new File (filename);

        try (Scanner fileScanner = new Scanner(dataFile))
        {
            ArrayList<String> lines = new ArrayList<String>();

            while (fileScanner.hasNextLine())
            {
                lines.add(fileScanner.nextLine());
            }
            
            for (int index = 1; index < lines.size(); index++) // skips header row if you start at 1. 
            {
                String l = lines.get(index);
                
                //fills data with substrings of l separating at each comma. Commas are not included. 
                String[] data = l.split (",");
                if (data.length > 9 )
                {
                    
                // parseInt and parseDouble are used on the numeric data. All other data entries are of type string.               
                Meteor m = new Meteor (data[0], Integer.parseInt(data[1]), data[2], data[3], 
                                              Double.parseDouble(data[4]), data[5], data[6], 
                                                new GeoLocation (Double.parseDouble(data[7]), Double.parseDouble(data[8])));
                
                
                meteors.add(m);
               
                }
            }
        }
        catch (FileNotFoundException error)
        {
            handleError (error); //calls the method below with the error message
        }
        
        return meteors;
    }

    public static void handleError(Exception error)
    {
        System.out.println ("The following error occured: ");
        System.out.println (error.getMessage());
    }

    public static void main(String[] args) {
        System.out.println ("Hi!");

        //IMPORTANT: You should change the file path to represent where you saved your Meteorite file
        ArrayList <Meteor> myMeteors = readData ("C:\\Users\\Crystal Furman\\SIGCSEMeteor2\\src\\main\\java\\org\\yourcompany\\yourproject\\Meteorite_Landings.csv");
        ArrayList <Meteor> lowMassMeteors = new ArrayList<Meteor>();
        System.out.println ("All done reading");

        //creates a list of all meteors that have a mass less than 5000.
        for (int i = 0; i < 10 && i < myMeteors.size(); i++)
        {
            if (5000 > myMeteors.get(i).mass()) {
                lowMassMeteors.add(myMeteors.get(i));

            }
        }
        System.out.println (lowMassMeteors);
        System.out.println ("All done printing");
    }
}
