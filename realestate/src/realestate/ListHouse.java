/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate;

/**
 *
 * @author team Olympians
 */
public class ListHouse implements Listable{

    private int lotNumber;
    private String firstName;
    private String lastName;
    private int price;
    private int squareFeet;
    private int numOfBedrooms;
    
    @Override
    public int compareTo(Listable other) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Listable copy() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int lotNumber(){
        return lotNumber;
    }
    
    public String firstName(){
        return firstName;
    }
    
    public String lastName(){
        return lastName;
    }
    
    public int price(){
        return price;
    }
    
    public int squareFeet(){
        return squareFeet;
    }
    
    public int numOfBedrooms(){
        return numOfBedrooms;
    }
    
}
