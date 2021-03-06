/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package realestate;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Team Olympians
 */
public class RealEstate extends javax.swing.JFrame {

    /**
     * Creates new form RealEstate
     */
    
    private static SortedList houseList = new SortedList();
    
    public RealEstate() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lbl_message = new javax.swing.JLabel();
        txt_searchBox = new javax.swing.JTextField();
        btn_Find = new javax.swing.JButton();
        txt_LotNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_FirstName = new javax.swing.JTextField();
        txt_LastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_Price = new javax.swing.JTextField();
        txt_SquareFeet = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_NumberOfBedrooms = new javax.swing.JTextField();
        btn_Next = new javax.swing.JButton();
        btn_Clear = new javax.swing.JButton();
        btn_Add = new javax.swing.JButton();
        btn_Reset = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                saveToFile(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("HomeVisit Real Estate System");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lbl_message.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        txt_searchBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_searchBox.setToolTipText("Insert Lot number");

        btn_Find.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_Find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/realestate/images/search.png"))); // NOI18N
        btn_Find.setText("Find");
        btn_Find.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Find.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Find.setIconTextGap(10);
        btn_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_FindActionPerformed(evt);
            }
        });

        jLabel2.setText("Lot Number");

        jLabel3.setText("First Name");

        jLabel4.setText("Last Name");

        jLabel5.setText("Price");

        jLabel6.setText("Square Feet");

        jLabel7.setText("Number of Bedrooms");

        btn_Next.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/realestate/images/next.png"))); // NOI18N
        btn_Next.setText("Next");
        btn_Next.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Next.setIconTextGap(10);
        btn_Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NextActionPerformed(evt);
            }
        });

        btn_Clear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/realestate/images/clear.png"))); // NOI18N
        btn_Clear.setText("Clear");
        btn_Clear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Clear.setIconTextGap(8);
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        btn_Add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/realestate/images/add.png"))); // NOI18N
        btn_Add.setText("Add");
        btn_Add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Add.setIconTextGap(14);
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn_Reset.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Reset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/realestate/images/reset.png"))); // NOI18N
        btn_Reset.setText("Reset");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        btn_Delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_Delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/realestate/images/delete.png"))); // NOI18N
        btn_Delete.setText("Delete");
        btn_Delete.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_Delete.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_Delete)
                                .addGap(27, 27, 27)
                                .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txt_SquareFeet, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txt_Price, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txt_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txt_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txt_LotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_NumberOfBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lbl_message, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(txt_searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_message, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Find, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_LotNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_SquareFeet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_NumberOfBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Next, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_FindActionPerformed
        clearHouse();
        String searchBoxTxtField  = txt_searchBox.getText();
        
        int searchLotNum;
        String firstName    = "abcd";
        String lastName     = "abcd";
        int price           = 0;
        int squareFeet      = 0;
        int numOfBedrooms   = 0;
        
        try{
            searchLotNum = Integer.parseInt(searchBoxTxtField);
            ListHouse searchHouse = new ListHouse(searchLotNum,firstName,lastName,price,squareFeet,numOfBedrooms);
            if(houseList.isThere(searchHouse)){
                ListHouse searchedHouse = (ListHouse) houseList.retieve(searchHouse);
                showHouse(searchedHouse);
            }
            else{
                lbl_message.setText("Lot Number Not Found.");
            }
        }
        catch(NumberFormatException e){
            if(searchBoxTxtField.equals("")){
                lbl_message.setText("Insert the lot number of the house you wish to search");   
            }
            else{
                lbl_message.setText("Lot number must be an Integer!");
            }
            txt_searchBox.setText("");
        }
        
    }//GEN-LAST:event_btn_FindActionPerformed

    private void btn_NextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NextActionPerformed
        txt_searchBox.setText("");
        int listLength = houseList.getLength();
        if( listLength > 0 ){
            ListHouse nextHouse;
            nextHouse = (ListHouse) houseList.getNextItem();
            showHouse(nextHouse);
        }
        else{
            clearHouse();
            lbl_message.setText("House List is empty");
        }
    }//GEN-LAST:event_btn_NextActionPerformed

    public static ListHouse getFromUI(){
        
        int lotNumber       = -1;
        String firstName    = "abcd";
        String lastName     = "abcd";
        int price           = 0;
        int squareFeet      = 0;
        int numOfBedrooms   = 0;
        
        firstName       = txt_FirstName.getText();
        lastName        = txt_LastName.getText();
        
        String numOfBedroomsTxtField  = txt_NumberOfBedrooms.getText();
        try{
            numOfBedrooms           = Integer.parseInt(numOfBedroomsTxtField);
        }
        catch(NumberFormatException e){
            lbl_message.setText("Number of bedrooms field must be an Integer!");
            txt_NumberOfBedrooms.setText("");
        }
        
        String squareFeetTxtField  = txt_SquareFeet.getText();
        try{
            squareFeet           = Integer.parseInt(squareFeetTxtField);
        }
        catch(NumberFormatException e){
            lbl_message.setText("Square Feet field must be an Integer!");
            txt_SquareFeet.setText("");
        }
        
        String priceTxtField  = txt_Price.getText();
        try{
            price           = Integer.parseInt(priceTxtField);
        }
        catch(NumberFormatException e){
            lbl_message.setText("Price field must be an Integer!");
            txt_Price.setText("");
        }
        
        if( firstName.equals("") || lastName.equals("") ){
            lbl_message.setText("First name and Last name fields are required!");
        }
        
        String lotNumTxtField  = txt_LotNumber.getText();
        try{
            lotNumber       = Integer.parseInt(lotNumTxtField);
        }
        catch(NumberFormatException e){
            lbl_message.setText("Lot number field must be an Integer!");
            txt_LotNumber.setText("");
        }
        
        ListHouse uiHouse = new ListHouse(lotNumber,firstName,lastName,price,squareFeet,numOfBedrooms);
        
        return uiHouse;
    }
    
    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        lbl_message.setText("");
        txt_searchBox.setText("");
        clearHouse();
    }//GEN-LAST:event_btn_ClearActionPerformed
    
    public static void clearHouse (){
        txt_LotNumber.setText("");
        txt_FirstName.setText("");
        txt_LastName.setText("");
        txt_Price.setText("");
        txt_SquareFeet.setText("");
        txt_NumberOfBedrooms.setText("");
    }
    
    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        txt_searchBox.setText("");
        ListHouse insertHouse = getFromUI();
        if( insertHouse.lotNumber() != -1 && insertHouse.price() != 0 && insertHouse.squareFeet() != 0 && insertHouse.numOfBedrooms() != 0  && !insertHouse.firstName().equals("")  && !insertHouse.lastName().equals("")  ){
            if(houseList.isThere(insertHouse)){
                lbl_message.setText("The house you specified is already in the list");
            }
            else if(houseList.isFull()){
                lbl_message.setText("The House List is Full!");
            }
            else{
                int lotNum = insertHouse.lotNumber();
                houseList.insert(insertHouse);
                lbl_message.setText("Lot number : "+lotNum+" house is inserted!");
                clearHouse();
            }
        }  
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
        txt_searchBox.setText("");
        houseList.resetlist();
        int listLength = houseList.getLength();
        if( listLength > 0 ){
            ListHouse nextHouse;
            nextHouse = (ListHouse) houseList.getNextItem();
            showHouse(nextHouse);
        }
        else{
            clearHouse();
            lbl_message.setText("House List is empty");
        }  
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        txt_searchBox.setText("");
        int listLength1 = houseList.getLength();
        if( listLength1 > 0 ){
            ListHouse deleteHouse = getFromUI();
            if( deleteHouse.lotNumber() != -1 && deleteHouse.price() != 0 && deleteHouse.squareFeet() != 0 && deleteHouse.numOfBedrooms() != 0  && !deleteHouse.firstName().equals("")  && !deleteHouse.lastName().equals("")  ){
                if(!houseList.isThere(deleteHouse)){
                    lbl_message.setText("The house you specified is not in the list");
                }
                else{
                    int lotNum = deleteHouse.lotNumber();
                    houseList.delete(deleteHouse);
                    int listLength2 = houseList.getLength();
                    if( listLength2 > 0 ){
                        ListHouse nextHouse;
                        nextHouse = (ListHouse) houseList.getNextItem();
                        showHouse(nextHouse);
                        lbl_message.setText("Lot number : "+lotNum+" house is deleted!");
                    }
                    else{
                        clearHouse();
                        lbl_message.setText("House List is empty");
                    }
                }
            }
        }
        else{
            lbl_message.setText("House List is empty");
        }
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void saveToFile(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_saveToFile
        try {
            int listLength = houseList.getLength();
            houseList.resetlist();
            HouseFile.rewrite();
            for (int i = 0 ; i < listLength ; i++) {
                ListHouse house = (ListHouse) houseList.getNextItem();
                HouseFile.printToFile(house);
            }
            HouseFile.close();
        } catch (IOException ex) {
            Logger.getLogger(RealEstate.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(WIDTH);
    }//GEN-LAST:event_saveToFile

    
    public static void showHouse (ListHouse house){
        int lotNum = house.lotNumber();
        String fname = house.firstName();
        String lname = house.lastName();
        int price = house.price();
        int squateFeet = house.squareFeet();
        int numOfBed = house.numOfBedrooms();
        
        lbl_message.setText("Displaying house lot number : "+lotNum);
        txt_LotNumber.setText(Integer.toString(lotNum));
        txt_FirstName.setText(fname);
        txt_LastName.setText(lname);
        txt_Price.setText(Integer.toString(price));
        txt_SquareFeet.setText(Integer.toString(squateFeet));
        txt_NumberOfBedrooms.setText(Integer.toString(numOfBed));
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RealEstate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        ListHouse house;
        HouseFile.reset();
        while(HouseFile.searchMoreHouses()){
            house = HouseFile.getNextHouse();
            houseList.insert(house);
        }
        HouseFile.close();
       
        //display main window
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RealEstate().setVisible(true);
                int listLength = houseList.getLength();
                if( listLength > 0 ){
                    houseList.resetlist();
                    ListHouse house1;
                    house1 = (ListHouse) houseList.getNextItem();
                    showHouse(house1);
                }
                else{
                    clearHouse();
                    lbl_message.setText("House List is empty");
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Find;
    private javax.swing.JButton btn_Next;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private static javax.swing.JLabel lbl_message;
    private static javax.swing.JTextField txt_FirstName;
    private static javax.swing.JTextField txt_LastName;
    private static javax.swing.JTextField txt_LotNumber;
    private static javax.swing.JTextField txt_NumberOfBedrooms;
    private static javax.swing.JTextField txt_Price;
    private static javax.swing.JTextField txt_SquareFeet;
    protected static javax.swing.JTextField txt_searchBox;
    // End of variables declaration//GEN-END:variables
}
