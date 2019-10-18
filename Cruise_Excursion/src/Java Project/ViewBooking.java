
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ViewBooking extends javax.swing.JFrame {

    public ViewBooking() {
        initComponents();
        this.setTitle("View Booking");
        editBooking.setVisible(false);
        
        viewMyBooking();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewBookingTable = new javax.swing.JTable();
        heading = new javax.swing.JLabel();
        editBooking = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        seatss = new javax.swing.JTextField();
        UpdateBooking = new javax.swing.JButton();
        cancelBooking = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(960, 600));

        jPanel1.setMinimumSize(new java.awt.Dimension(960, 600));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View Booking");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 30, 250, 50);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(10, 30, 40, 40);

        viewBookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Booking_ID", "Username", "Ex_ID", "Seats", "Name", "Date"
            }
        ));
        viewBookingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewBookingTableMouseClicked(evt);
            }
        });
        viewBookingTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                viewBookingTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(viewBookingTable);
        if (viewBookingTable.getColumnModel().getColumnCount() > 0) {
            viewBookingTable.getColumnModel().getColumn(0).setPreferredWidth(2);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(80, 170, 780, 180);

        heading.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText(".");
        jPanel1.add(heading);
        heading.setBounds(240, 130, 500, 30);

        editBooking.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edit Booking");
        editBooking.add(jLabel4);
        jLabel4.setBounds(70, 10, 150, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Number of Seats");
        editBooking.add(jLabel5);
        jLabel5.setBounds(20, 70, 130, 17);

        seatss.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seatssKeyReleased(evt);
            }
        });
        editBooking.add(seatss);
        seatss.setBounds(150, 70, 140, 30);

        UpdateBooking.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        UpdateBooking.setText("Update");
        UpdateBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBookingActionPerformed(evt);
            }
        });
        editBooking.add(UpdateBooking);
        UpdateBooking.setBounds(30, 130, 90, 25);

        cancelBooking.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancelBooking.setText("Cancel Booking");
        cancelBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBookingActionPerformed(evt);
            }
        });
        editBooking.add(cancelBooking);
        cancelBooking.setBounds(160, 130, 130, 25);

        errorMessage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(204, 0, 0));
        editBooking.add(errorMessage);
        errorMessage.setBounds(120, 100, 170, 14);
        editBooking.add(jLabel3);
        jLabel3.setBounds(0, 0, 0, 0);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame 4.jpg"))); // NOI18N
        editBooking.add(jLabel7);
        jLabel7.setBounds(0, 0, 300, 180);

        jPanel1.add(editBooking);
        editBooking.setBounds(320, 360, 300, 180);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/View Booking.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 960, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new Dashboard().setVisible(true);        
    }//GEN-LAST:event_backActionPerformed
    private void viewMyBooking()
    {
           DefaultTableModel model = (DefaultTableModel) viewBookingTable.getModel();  // to get the model of the table
        while(model.getRowCount() > 0)
            {
                model.removeRow(0);
            }
        heading.setText("Click into the table to edit your number of seats.");
               
        try
        {
               Socket s = new Socket("127.0.0.1",4011);// request server to show booking
               ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
               ObjectInputStream is = new ObjectInputStream(s.getInputStream());
               String b []= new String[] {"show Booking",new Login().usernamee};//send request in the form of array
               os.writeObject(b);
               String data[][];
               data=(String[][]) is.readObject();//accept data in 2D array form
               
              
               for (String[]row:data)//to print the data in JTable
                {
                    model.addRow(row);
                }
               
               viewBookingTable.setModel(model);
               System.out.println("Server: Booking shown");

        }
        catch(Exception e)
                {
                     e.printStackTrace();
                }
    }
    private void viewBookingTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_viewBookingTableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBookingTableKeyPressed

    private void viewBookingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewBookingTableMouseClicked
          
    
        try{
                    editBooking.setVisible(true);
                    DefaultTableModel model = (DefaultTableModel)viewBookingTable.getModel();
                    int selectedRowIndex = viewBookingTable.getSelectedRow();

                    seatss.setText(model.getValueAt(selectedRowIndex, 3).toString());//to selct the 4th component of the table
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"You had not book anything to edit.");
                editBooking.setVisible(false);
                
                //e.printStackTrace();
            }
    
    }//GEN-LAST:event_viewBookingTableMouseClicked

    private void UpdateBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBookingActionPerformed
        DefaultTableModel model = (DefaultTableModel)viewBookingTable.getModel();//to get model of Jtbale format
        int selectedRowIndex = viewBookingTable.getSelectedRow();
        String verify= model.getValueAt(selectedRowIndex, 3).toString();        
       if(seatss.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter the number of seats!");

            }
        else if(!errorMessage.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter the valid seat number!");
        }
        else if(Integer.parseInt(seatss.getText())>32)
        {
            JOptionPane.showMessageDialog(null,"More than 32 seat cannot be booked!");
            
        }
        else if(Integer.parseInt(seatss.getText())==0)
         {
             JOptionPane.showMessageDialog(null,"Sorry, Number of seat cannot be allocated as zero!");
             
         }
        else if(Integer.parseInt(verify)==Integer.parseInt(seatss.getText()))
        {
            JOptionPane.showMessageDialog(null,"You had nothing to update!");
            
            
        }
        else
        {
                try
                {
                    
                Socket s = new Socket("127.0.0.1",4011);


                       ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                       ObjectInputStream is = new ObjectInputStream(s.getInputStream());



                       String b []= new String[] {"update number of seats",seatss.getText(),new Login().usernamee,model.getValueAt(selectedRowIndex, 0).toString(),model.getValueAt(selectedRowIndex, 2).toString(),model.getValueAt(selectedRowIndex, 3).toString()};
                       os.writeObject(b);
                       
                       String result[]=(String []) is.readObject();
                       if(result[0].equals("Sorry, there is not enough seat that you want to book for!"))
                       {
                           JOptionPane.showMessageDialog(null,result[0]);
                       }
                       else if(result[0].equals("Successfully updated!"))
                       {
                           JOptionPane.showMessageDialog(null,result[0]);
                       }

                       
                       seatss.setText("");
                       viewMyBooking();
                       editBooking.setVisible(false);

                }
                catch(Exception e)
                        {
                             e.printStackTrace();
                        }        // TODO add your handling code here:
        }
    }//GEN-LAST:event_UpdateBookingActionPerformed
    /*public void updateSeatInDB(String seat)
    {
        
    }*/
    private void cancelBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBookingActionPerformed
        DefaultTableModel model = (DefaultTableModel)viewBookingTable.getModel();
        int selectedRowIndex = viewBookingTable.getSelectedRow();
        String verify= model.getValueAt(selectedRowIndex, 3).toString();
        if(seatss.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter the number of seats!");

            }
        else if(!errorMessage.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter the valid seat number!");
        }
        else if (Integer.parseInt(seatss.getText())>32)
    {
    
        JOptionPane.showMessageDialog(null,"Number of seat cannot be more than 32 !");
     }
        else if(Integer.parseInt(verify)!=Integer.parseInt(seatss.getText()))
        {
            JOptionPane.showMessageDialog(null,"Please enter previously allocated seat value to canncel booking!");
            
            
        }
        else
        {
            try
            {

                    Socket s = new Socket("127.0.0.1",4011);//to send request to server for cancelling request
                   ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                   ObjectInputStream is = new ObjectInputStream(s.getInputStream());
                   String b []= new String[] {"cancel booking",model.getValueAt(selectedRowIndex, 0).toString(),model.getValueAt(selectedRowIndex, 2).toString(),seatss.getText()};
                   os.writeObject(b);
                   JOptionPane.showMessageDialog(null,"Successfully Cancelled.");
                   seatss.setText("");
                   viewMyBooking();
                   editBooking.setVisible(false);

            }
            catch(Exception e)
                    {
                         e.printStackTrace();
                    }  
        }
    }//GEN-LAST:event_cancelBookingActionPerformed
    
    private void seatssKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seatssKeyReleased
       String pattern="^[0-9]{1,2}";// to check  seat validation
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(seatss.getText());
        if (!match.matches())
        {
            errorMessage.setText("Invalid number of seat.");
        } 
        else
        {
           errorMessage.setText(""); 
        }
    }//GEN-LAST:event_seatssKeyReleased

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateBooking;
    private javax.swing.JButton back;
    private javax.swing.JButton cancelBooking;
    private javax.swing.JPanel editBooking;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField seatss;
    private javax.swing.JTable viewBookingTable;
    // End of variables declaration//GEN-END:variables
}
