/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate;

import java.io.IOException;

/**
 *
 * @author Danindu
 */
public class HouseFile {
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
