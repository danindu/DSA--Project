/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate;

/**
 *
 *  @author team Olympians
 */
public abstract class List {
    protected Listable[] list;
    protected int numOfItems;
    protected int currentPosition;
    
    public List(int maxItems){
        numOfItems = 0;
        list = new Listable[maxItems];
    }
    
    public boolean isFull(){
        return (list.length == numOfItems);
    }
    
    public int getLength(){
        return numOfItems;
    }
    
    public abstract boolean isThere(Listable item);
    
    public abstract Listable retieve(Listable item);
    
    public abstract void insert(Listable item);
    
    public abstract void delete(Listable item);
    
    public void resetlist(){
        currentPosition = 0;
    }
    
    public Listable getNextItem(){
        Listable nextItem = list[currentPosition];
        if( currentPosition == (numOfItems-1) )
            currentPosition = 0;
        else
            currentPosition++;

        return nextItem.copy();
    }    
}
