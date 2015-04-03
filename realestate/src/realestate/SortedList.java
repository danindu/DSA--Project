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
}
