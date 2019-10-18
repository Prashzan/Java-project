
import java.io.*;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.regex.Matcher;
import java.util.regex.*;
import javax.swing.JOptionPane;


public class UserProfile extends javax.swing.JFrame {

   
    public UserProfile() {
        
        initComponents();
        this.setTitle("User Profile");
        showCustomerInfo();
        edit.setVisible(false);
    }
 private void showCustomerInfo()
    {
          try {
           
            Socket s = new Socket("127.0.0.1",4011);// rewuest server to retrive customer details
            ObjectInputStream is = new ObjectInputStream(s.getInputStream());
            ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
            String details []= new String[] {"retrive customer details",new Login().usernamee};//sends request in the form of array
            os.writeObject(details);
            
            
            String [] message = (String []) is.readObject();//accept request in the form of array
            First.setText(message[0]);
            Last.setText(message[1]);
            Username.setText(message[2]);
            Email.setText(message[3]);
            Cabin.setText(message[4]);
            
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        First = new javax.swing.JLabel();
        Last = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Cabin = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        edit = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        updateProfile = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        firstt = new javax.swing.JTextField();
        lastt = new javax.swing.JTextField();
        emaill = new javax.swing.JTextField();
        cabinn = new javax.swing.JTextField();
        firsttt = new javax.swing.JLabel();
        lasttt = new javax.swing.JLabel();
        emailll = new javax.swing.JLabel();
        cabinnn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("User Details");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(350, 20, 290, 50);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 240, 100, 14);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(310, 290, 90, 22);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(310, 340, 90, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(310, 390, 70, 22);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cabin Number: ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(310, 440, 130, 20);

        First.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        First.setForeground(new java.awt.Color(255, 255, 255));
        First.setText("jLabel8");
        jPanel1.add(First);
        First.setBounds(450, 234, 170, 20);

        Last.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Last.setForeground(new java.awt.Color(255, 255, 255));
        Last.setText("jLabel9");
        jPanel1.add(Last);
        Last.setBounds(450, 284, 170, 20);

        Username.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.setText("jLabel10");
        jPanel1.add(Username);
        Username.setBounds(450, 340, 160, 20);

        Email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Email.setForeground(new java.awt.Color(255, 255, 255));
        Email.setText("jLabel11");
        jPanel1.add(Email);
        Email.setBounds(450, 390, 170, 20);

        Cabin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Cabin.setForeground(new java.awt.Color(255, 255, 255));
        Cabin.setText("jLabel12");
        jPanel1.add(Cabin);
        Cabin.setBounds(450, 440, 170, 20);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Edit Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(370, 500, 110, 20);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(10, 30, 40, 40);

        edit.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("First Name");
        edit.add(jLabel9);
        jLabel9.setBounds(20, 80, 80, 17);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Last Name");
        edit.add(jLabel10);
        jLabel10.setBounds(20, 120, 70, 17);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");
        edit.add(jLabel11);
        jLabel11.setBounds(20, 160, 35, 17);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cabin Number");
        edit.add(jLabel12);
        jLabel12.setBounds(20, 200, 100, 17);

        updateProfile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateProfile.setText("Submit");
        updateProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateProfileActionPerformed(evt);
            }
        });
        edit.add(updateProfile);
        updateProfile.setBounds(180, 240, 80, 25);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Edit Profile");
        edit.add(jLabel13);
        jLabel13.setBounds(100, 30, 100, 22);

        firstt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firsttKeyReleased(evt);
            }
        });
        edit.add(firstt);
        firstt.setBounds(140, 70, 160, 30);

        lastt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lasttKeyReleased(evt);
            }
        });
        edit.add(lastt);
        lastt.setBounds(140, 110, 160, 30);

        emaill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emaillKeyReleased(evt);
            }
        });
        edit.add(emaill);
        emaill.setBounds(140, 150, 160, 30);

        cabinn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cabinnKeyReleased(evt);
            }
        });
        edit.add(cabinn);
        cabinn.setBounds(140, 190, 160, 30);

        firsttt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        firsttt.setForeground(new java.awt.Color(255, 255, 255));
        edit.add(firsttt);
        firsttt.setBounds(140, 100, 160, 10);

        lasttt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lasttt.setForeground(new java.awt.Color(255, 255, 255));
        edit.add(lasttt);
        lasttt.setBounds(140, 140, 160, 10);

        emailll.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emailll.setForeground(new java.awt.Color(255, 255, 255));
        edit.add(emailll);
        emailll.setBounds(140, 180, 160, 10);

        cabinnn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cabinnn.setForeground(new java.awt.Color(255, 255, 255));
        edit.add(cabinnn);
        cabinnn.setBounds(140, 220, 160, 10);
        edit.add(jLabel8);
        jLabel8.setBounds(0, 0, 0, 0);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame 4.jpg"))); // NOI18N
        edit.add(jLabel15);
        jLabel15.setBounds(0, 0, 320, 280);

        jPanel1.add(edit);
        edit.setBounds(630, 280, 320, 280);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/User Profile.jpg"))); // NOI18N
        jPanel1.add(jLabel14);
        jLabel14.setBounds(0, 0, 960, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void EditPanel()
    {
        try {
           
            Socket s = new Socket("127.0.0.1",4011);//send request to server for editing the details 
            ObjectInputStream is = new ObjectInputStream(s.getInputStream());
            ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
            String details []= new String[] {"retrive customer details for editing",new Login().usernamee};
            os.writeObject(details);
            String [] message = (String []) is.readObject();
            firstt.setText(message[0]);
            lastt.setText(message[1]);
            
            emaill.setText(message[2]);
            cabinn.setText(message[3]);
            System.out.println("Server: customer details retrived ");
          }
          catch(Exception e)
          {
              e.printStackTrace();
              
          }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        edit.setVisible(true);
        EditPanel();
                // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateProfileActionPerformed
         if(firstt.getText().equals("")||lastt.getText().equals("")|| emaill.getText().equals("")|| cabinn.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please enter all the feilds provided!");

            }
        else if(!firsttt.getText().equals("")||!lasttt.getText().equals("")||!emailll.getText().equals("")||!cabinnn.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter the valid information!");
        }
        else if(firstt.getText().equals(First.getText())&&lastt.getText().equals(Last.getText())&&emaill.getText().equals(Email.getText())&&cabinn.getText().equals(Cabin.getText()))
        {
           JOptionPane.showMessageDialog(null,"Nothing to update!"); 
        }
        else
            {
        try
        {
        Socket s = new Socket("127.0.0.1",4011);//send request to server for updation
        

               ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
               ObjectInputStream is = new ObjectInputStream(s.getInputStream());
               String b []= new String[] {"update data",firstt.getText(),lastt.getText(),new Login().usernamee,emaill.getText(),cabinn.getText()};
               os.writeObject(b);
               JOptionPane.showMessageDialog(null,"Successfully Updated");
               showCustomerInfo();
        }
        catch(Exception e)
                {
                     e.printStackTrace();
                } 
            }// TODO add your handling code here:
    }//GEN-LAST:event_updateProfileActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new Dashboard().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void firsttKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firsttKeyReleased
        String pattern="[a-zA-Z]{2,}";// check validation of first name
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(firstt.getText());
        if (!match.matches())
        {
            firsttt.setText("Invalid first name!");
        } 
        else
        {
           firsttt.setText(""); 
        }
    }//GEN-LAST:event_firsttKeyReleased

    private void lasttKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lasttKeyReleased
         String pattern="[a-zA-Z]{2,}";// check validation of last name
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(lastt.getText());
        if (!match.matches())
        {
            lasttt.setText("Invalid first name!");
        } 
        else
        {
           lasttt.setText(""); 
        }
    }//GEN-LAST:event_lasttKeyReleased

    private void emaillKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emaillKeyReleased
         String pattern="\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";// check validation of email
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(emaill.getText());
        if (!match.matches())
        {
            emailll.setText("Invalid email!");
        } 
        else
        {
           emailll.setText(""); 
        }
    }//GEN-LAST:event_emaillKeyReleased

    private void cabinnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cabinnKeyReleased
                 String pattern="[a-zA-Z0-9]{2,4}";// check validation of cabin number
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(cabinn.getText());
        if (!match.matches())
        {
            cabinnn.setText("Invalid cabin number!");
        }    
        
        else
        {
           cabinnn.setText(""); 
        }
    }//GEN-LAST:event_cabinnKeyReleased

    
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cabin;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel First;
    private javax.swing.JLabel Last;
    private javax.swing.JLabel Username;
    private javax.swing.JButton back;
    private javax.swing.JTextField cabinn;
    private javax.swing.JLabel cabinnn;
    private javax.swing.JPanel edit;
    private javax.swing.JTextField emaill;
    private javax.swing.JLabel emailll;
    private javax.swing.JTextField firstt;
    private javax.swing.JLabel firsttt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastt;
    private javax.swing.JLabel lasttt;
    private javax.swing.JButton updateProfile;
    // End of variables declaration//GEN-END:variables
}
