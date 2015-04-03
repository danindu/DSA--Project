/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate;

/**
 *
 * @author team Olympians
 */
public class SortedList extends List{

    public SortedList(int maxItems) {
        super(maxItems);
    }
    
    public SortedList() {
        super(50);
    }
    
    @Override
    public void insert(Listable item) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int insertIndex     = 0;
        boolean searchMore  = ( insertIndex < numOfItems );
        
        while(searchMore){
            int compareResult = item.compareTo(list[insertIndex]);
            if( compareResult < 0 ){
                searchMore  = false;
            }
            else{
                insertIndex++;
                searchMore  = ( insertIndex < numOfItems );
            }
        }
        for(int index = numOfItems ; index > insertIndex ; index-- ){
            list[index]     = list[index-1];
        }
        list[insertIndex]   = item.copy();
        numOfItems++;
    }    
    
    @Override
    public boolean isThere(Listable item) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int compareResult;
        int midPointIndex;
        int firstIndex      = 0;
        int lastIndex       = numOfItems - 1;
        boolean searchMore  = ( firstIndex <= lastIndex );
        boolean found       = false;
        
        while( searchMore && !found ){
            midPointIndex   = ( firstIndex + lastIndex )/2;
            compareResult   = item.compareTo(list[midPointIndex]);   
            if(compareResult == 0)
                found = true;
            else if(compareResult > 0){
                firstIndex  = midPointIndex + 1;
                searchMore  = ( firstIndex <= lastIndex );
            }
            else{
                lastIndex   = midPointIndex -1;
                searchMore  = ( firstIndex <= lastIndex );
            }
        }
        return found;
    }
    
    @Override
    public void delete(Listable item) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        int deleteIndex = 0;
        
        while( item.compareTo(list[deleteIndex]) != 0 ){
            deleteIndex++;
        }
        for(int index = deleteIndex+1 ; index < numOfItems ; index++ ){
            list[index-1] = list[index];
        }
        numOfItems--;
        if(currentPosition == 0)
            currentPosition = numOfItems-1;
        else
            currentPosition--;
    }
}
