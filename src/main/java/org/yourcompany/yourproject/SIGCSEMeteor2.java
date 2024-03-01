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

    private static ArrayList<Meteor> readData (String filename) {
        ArrayList<Meteor> meteors = new ArrayList <>();

        File dataFile = new File (filename);

        try (Scanner fileScanner = new Scanner(dataFile)) {
            ArrayList<String> lines = new ArrayList<>();

            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }
            // loop index starts at 1 to skip the header row 
            for (int index = 1; index < lines.size(); index++) {  
                String l = lines.get(index);

                String[] data = l.split (",");
                if (data.length > 9 ) {
                                 
                    Meteor m = new Meteor (data[0], Integer.parseInt(data[1]), data[2], data[3], 
                                              Double.parseDouble(data[4]), data[5], data[6], 
                                                new GeoLocation (Double.parseDouble(data[7]), Double.parseDouble(data[8])));
                
                
                    meteors.add(m);
                }
            }
        }
        catch (FileNotFoundException error) {
            handleError (error);
        }
        
        return meteors;
    }

    public static void handleError(Exception error) {
        System.out.println ("The following error occured: ");
        System.out.println (error.getMessage());
    }

    public static void main(String[] args) {
        System.out.println ("Hi!");

        ArrayList <Meteor> myMeteors = readData ("C:\\Users\\Crystal Furman\\SIGCSEMeteor2\\src\\main\\java\\org\\yourcompany\\yourproject\\Meteorite_Landings.csv");
        ArrayList <Meteor> lowMassMeteors = new ArrayList<>();
        System.out.println ("All done reading");
        for (int i = 0; i < 10 && i < myMeteors.size(); i++) {
            if (5000 > myMeteors.get(i).mass()) {
                lowMassMeteors.add(myMeteors.get(i));

            }
        }
        System.out.println (lowMassMeteors);
        System.out.println ("All done printing");
    }
}
