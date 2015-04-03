/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author team Olympians
 */
public class HouseFile {
    private static BufferedReader inputFile;
    private static PrintWriter outputFile;
    private static boolean inputFileOpen    = false;
    private static boolean outputFileOpen   = false;
    private static String newHouseFirstLine = "";
    
    public static void reset() throws IOException{
        if(inputFileOpen){
            inputFile.close();
        }
        if(outputFileOpen){
            outputFile.close();
        }
//        inputFile           = new BufferedReader(new FileReader("houses.txt"));
        inputFile           = new BufferedReader(new FileReader("src\\realestate\\houses.txt"));
        inputFileOpen       = true;
        newHouseFirstLine   = inputFile.readLine();
    }
    
    public static boolean searchMoreHouses(){
        if(!inputFileOpen || newHouseFirstLine == null){ return false; }
        else{ return true; }
    }
    
    public static ListHouse getNextHouse() throws IOException{
        int lotNumber       = 0;
        String firstName    = "abcd";
        String lastName     = "abcd";
        int price           = 0;
        int squareFeet      = 0;
        int numOfBedrooms   = 0;
        
        lotNumber       = Integer.parseInt(newHouseFirstLine);
        firstName       = inputFile.readLine();
        lastName        = inputFile.readLine();
        price           = Integer.parseInt(inputFile.readLine());
        squareFeet      = Integer.parseInt(inputFile.readLine());
        numOfBedrooms   = Integer.parseInt(inputFile.readLine());
        
        newHouseFirstLine = inputFile.readLine();
        
        ListHouse house = new ListHouse(lotNumber,firstName,lastName,price,squareFeet,numOfBedrooms);
        return house;
    }
}
