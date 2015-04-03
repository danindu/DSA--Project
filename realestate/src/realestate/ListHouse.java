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
    
    ListHouse(int lotNumber, String firstName, String lastName, int price, int squareFeet, int numOfBedrooms) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        this.lotNumber      = lotNumber;
        this.firstName      = firstName;
        this.lastName       = lastName;
        this.price          = price;
        this.squareFeet     = squareFeet;
        this.numOfBedrooms  = numOfBedrooms;
    }
        
    @Override
    public int compareTo(Listable otherHouse) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ListHouse other = (ListHouse)otherHouse;
        return (this.lotNumber - other.lotNumber);
    }

    @Override
    public Listable copy() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        ListHouse newcopy = new ListHouse(this.lotNumber, this.firstName, this.lastName, this.price, this.squareFeet, this.numOfBedrooms);
        return newcopy;
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
