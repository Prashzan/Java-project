
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class WaitingList extends javax.swing.JFrame {

    
    
    public WaitingList() 
    {
        this.setTitle("View Waiting List");
        initComponents();
        viewMyWaitList();
        wait.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        waitListTable = new javax.swing.JTable();
        wait = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        seat = new javax.swing.JTextField();
        cancelWaitList = new javax.swing.JButton();
        update = new javax.swing.JButton();
        errorMessage = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(960, 600));

        jPanel1.setMinimumSize(new java.awt.Dimension(960, 600));
        jPanel1.setLayout(null);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(0, 30, 50, 40);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("View Waiting List");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(380, 20, 290, 50);

        waitListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Port_ID", "Excursion ID", "Name", "Rank", "Username", "Seats", "Date"
            }
        ));
        waitListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                waitListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(waitListTable);
        if (waitListTable.getColumnModel().getColumnCount() > 0) {
            waitListTable.getColumnModel().getColumn(0).setPreferredWidth(2);
            waitListTable.getColumnModel().getColumn(1).setPreferredWidth(3);
            waitListTable.getColumnModel().getColumn(3).setPreferredWidth(1);
            waitListTable.getColumnModel().getColumn(5).setResizable(false);
            waitListTable.getColumnModel().getColumn(5).setPreferredWidth(2);
        }

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 210, 910, 170);

        wait.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Update Waiting List");
        wait.add(jLabel4);
        jLabel4.setBounds(40, 10, 180, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seat");
        wait.add(jLabel5);
        jLabel5.setBounds(30, 70, 34, 14);

        seat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seatKeyReleased(evt);
            }
        });
        wait.add(seat);
        seat.setBounds(110, 60, 150, 30);

        cancelWaitList.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancelWaitList.setText("Cancel ");
        cancelWaitList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelWaitListMouseClicked(evt);
            }
        });
        cancelWaitList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelWaitListActionPerformed(evt);
            }
        });
        wait.add(cancelWaitList);
        cancelWaitList.setBounds(150, 110, 90, 20);

        update.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        wait.add(update);
        update.setBounds(50, 110, 80, 20);

        errorMessage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        errorMessage.setForeground(new java.awt.Color(255, 255, 255));
        wait.add(errorMessage);
        errorMessage.setBounds(110, 90, 150, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame 4.jpg"))); // NOI18N
        wait.add(jLabel3);
        jLabel3.setBounds(0, 0, 270, 150);

        jPanel1.add(wait);
        wait.setBounds(260, 390, 270, 150);

        heading.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(heading);
        heading.setBounds(210, 174, 570, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Waiting List.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new Dashboard().setVisible(true);  //to perform back action      // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed
    private void viewMyWaitList()
    {
        DefaultTableModel model = (DefaultTableModel) waitListTable.getModel();  //to get model of table 
            while(model.getRowCount() > 0)//check if there is data in table
            {
                model.removeRow(0);//to clear the table
            }
            
            heading.setText("Click into the table to edit your number of seats.");
       
               
        try
        {
               Socket s = new Socket("127.0.0.1",4011);//send request to server
               ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
               ObjectInputStream is = new ObjectInputStream(s.getInputStream());
               String b []= new String[] {"show waiting list",new Login().usernamee};
               os.writeObject(b);
               String data[][];
               data=(String[][]) is.readObject();// to accept 2D array
               
              
               for (String[]row:data)// to print the 2D array in table
                {
                    model.addRow(row);
                }
               
               waitListTable.setModel(model);
               System.out.println("Server: Waiting list shown");

        }
        catch(Exception e)
                {
                     e.printStackTrace();
                }
        
    }
    private void waitListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waitListTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)waitListTable.getModel();
            
        try{
                    wait.setVisible(true);
                    
                    int selectedRowIndex = waitListTable.getSelectedRow();

                    seat.setText(model.getValueAt(selectedRowIndex, 5).toString());//to select 6th component of the row
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"You had not book anything to edit.");
                wait.setVisible(false);
                //e.printStackTrace();
            }
            
    }//GEN-LAST:event_waitListTableMouseClicked

    private void cancelWaitListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelWaitListMouseClicked
       DefaultTableModel model = (DefaultTableModel)waitListTable.getModel();
        int selectedRowIndex = waitListTable.getSelectedRow();
        String verify=model.getValueAt(selectedRowIndex, 5).toString();
        if(seat.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter the number of seats!");

            }
        else if(!errorMessage.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter the valid seat number!");
        }
        else if(Integer.parseInt(verify)!=Integer.parseInt(seat.getText()))
        {
            JOptionPane.showMessageDialog(null,"Please specify previously allocated values!");
            
            
        }
        else
        {
                try
                {
                    
                Socket s = new Socket("127.0.0.1",4011);//send request for waiting by user


                       ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                       ObjectInputStream is = new ObjectInputStream(s.getInputStream());
                       String b []= new String[] {"cancel waiting by user",model.getValueAt(selectedRowIndex, 3).toString(),model.getValueAt(selectedRowIndex, 1).toString(),seat.getText()};
                       os.writeObject(b);

                       JOptionPane.showMessageDialog(null,"Successfully canceled");
                       seat.setText("");
                       viewMyWaitList();
                       wait.setVisible(false);
                }
                catch(Exception e)
                        {
                             e.printStackTrace();
                        }  
        }
         
    }//GEN-LAST:event_cancelWaitListMouseClicked

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        DefaultTableModel model = (DefaultTableModel)waitListTable.getModel();
        int selectedRowIndex = waitListTable.getSelectedRow();
        String verify=model.getValueAt(selectedRowIndex, 5).toString();
        if(seat.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter the number of seats!");

            }
        else if(!errorMessage.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter the valid seat number!");
        }
         else if(Integer.parseInt(seat.getText())==0)
        {
            JOptionPane.showMessageDialog(null,"Number of seat cannot be zero!");
        }
          else if(Integer.parseInt(seat.getText())==32)
        {
            JOptionPane.showMessageDialog(null,"Number of seat should not exceed 32!");
        }
        else if(Integer.parseInt(verify)==Integer.parseInt(seat.getText()))
        {
            JOptionPane.showMessageDialog(null,"You had nothing to update!");
            
            
        }
        else if(Integer.parseInt(seat.getText())==0)
         {
             JOptionPane.showMessageDialog(null,"Sorry, Number of seat cannot be allocated as zero!");
             
         }
        else
        {
                try
                {
                    
                Socket s = new Socket("127.0.0.1",4011);//send request to server to update number of seats


                       ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                       ObjectInputStream is = new ObjectInputStream(s.getInputStream());
                       String b []= new String[] {"update number of seats in waiting list",seat.getText(),model.getValueAt(selectedRowIndex, 3).toString(),model.getValueAt(selectedRowIndex, 1).toString(),model.getValueAt(selectedRowIndex, 5).toString()};
                       os.writeObject(b);

                       JOptionPane.showMessageDialog(null,"Successfully Updated");
                       seat.setText("");
                       viewMyWaitList();
                       wait.setVisible(false);
                }
                catch(Exception e)
                        {
                             e.printStackTrace();
                        }  
        }
    }//GEN-LAST:event_updateActionPerformed

    private void seatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seatKeyReleased
 String pattern="^[0-9]{1,2}";// to check validation of the seat
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(seat.getText());
        if (!match.matches())
        {
            errorMessage.setText("Invalid number of seat.");
        } 
        else
        {
           errorMessage.setText(""); 
        }        // TODO add your handling code here:
    }//GEN-LAST:event_seatKeyReleased

    private void cancelWaitListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelWaitListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelWaitListActionPerformed

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton cancelWaitList;
    private javax.swing.JLabel errorMessage;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField seat;
    private javax.swing.JButton update;
    private javax.swing.JPanel wait;
    private javax.swing.JTable waitListTable;
    // End of variables declaration//GEN-END:variables
}
