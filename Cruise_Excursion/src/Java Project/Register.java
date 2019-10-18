import java.awt.Color;
import java.io.*;
import jdk.nashorn.internal.ir.Statement;
import java.net.*;
import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register extends javax.swing.JFrame {

public Register() {
        initComponents();
        this.setTitle("Register");//To set title
        first.setBackground(new Color(0,0,0,64));//to set background
        last.setBackground(new Color(0,0,0,64));
        username.setBackground(new Color(0,0,0,64));
        password.setBackground(new Color(0,0,0,64));
        cabin.setBackground(new Color(0,0,0,64));
        email.setBackground(new Color(0,0,0,64));
        check.setBackground(new Color(0,0,0,64));
        termsAndConditions.setVisible(false);
        
       
       
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        password = new javax.swing.JPasswordField();
        last = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        cabin = new javax.swing.JTextField();
        first = new javax.swing.JTextField();
        check = new javax.swing.JCheckBox();
        signup = new javax.swing.JButton();
        back = new javax.swing.JButton();
        valid1 = new javax.swing.JLabel();
        valid3 = new javax.swing.JLabel();
        valid4 = new javax.swing.JLabel();
        valid5 = new javax.swing.JLabel();
        valid2 = new javax.swing.JLabel();
        valid6 = new javax.swing.JLabel();
        termAndCndition = new javax.swing.JButton();
        termsAndConditions = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 50));
        setResizable(false);
        setSize(new java.awt.Dimension(960, 650));

        jPanel1.setPreferredSize(new java.awt.Dimension(960, 600));
        jPanel1.setLayout(null);

        password.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passwordKeyReleased(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(600, 420, 300, 30);

        last.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        last.setForeground(new java.awt.Color(255, 255, 255));
        last.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastKeyReleased(evt);
            }
        });
        jPanel1.add(last);
        last.setBounds(600, 220, 300, 30);

        username.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                usernameKeyReleased(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(600, 280, 300, 30);

        email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        jPanel1.add(email);
        email.setBounds(600, 350, 300, 30);

        cabin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cabin.setForeground(new java.awt.Color(255, 255, 255));
        cabin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cabinActionPerformed(evt);
            }
        });
        cabin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cabinKeyReleased(evt);
            }
        });
        jPanel1.add(cabin);
        cabin.setBounds(600, 480, 300, 30);

        first.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        first.setForeground(new java.awt.Color(255, 255, 255));
        first.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstKeyReleased(evt);
            }
        });
        jPanel1.add(first);
        first.setBounds(600, 160, 300, 30);
        jPanel1.add(check);
        check.setBounds(600, 520, 20, 30);

        signup.setContentAreaFilled(false);
        signup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jPanel1.add(signup);
        signup.setBounds(690, 560, 100, 30);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(30, 20, 40, 40);

        valid1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        valid1.setForeground(new java.awt.Color(204, 0, 0));
        valid1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valid1KeyReleased(evt);
            }
        });
        jPanel1.add(valid1);
        valid1.setBounds(750, 190, 150, 20);

        valid3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        valid3.setForeground(new java.awt.Color(204, 0, 0));
        valid3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valid3KeyReleased(evt);
            }
        });
        jPanel1.add(valid3);
        valid3.setBounds(730, 310, 170, 20);

        valid4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        valid4.setForeground(new java.awt.Color(204, 0, 0));
        valid4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valid4KeyReleased(evt);
            }
        });
        jPanel1.add(valid4);
        valid4.setBounds(790, 380, 120, 20);

        valid5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        valid5.setForeground(new java.awt.Color(204, 0, 0));
        valid5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valid5KeyReleased(evt);
            }
        });
        jPanel1.add(valid5);
        valid5.setBounds(750, 510, 160, 20);

        valid2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        valid2.setForeground(new java.awt.Color(204, 0, 0));
        valid2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                valid2KeyReleased(evt);
            }
        });
        jPanel1.add(valid2);
        valid2.setBounds(750, 250, 150, 20);

        valid6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        valid6.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(valid6);
        valid6.setBounds(720, 450, 180, 20);

        termAndCndition.setContentAreaFilled(false);
        termAndCndition.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        termAndCndition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                termAndCnditionActionPerformed(evt);
            }
        });
        jPanel1.add(termAndCndition);
        termAndCndition.setBounds(630, 530, 250, 10);

        termsAndConditions.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Terms and Conditions:");
        termsAndConditions.add(jLabel3);
        jLabel3.setBounds(130, 20, 260, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("1. Each person is permitted to register only once.");
        termsAndConditions.add(jLabel4);
        jLabel4.setBounds(20, 70, 460, 14);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("2. Once registered, you shall be the sole user and operator");
        termsAndConditions.add(jLabel5);
        jLabel5.setBounds(20, 90, 470, 17);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" of your user account.");
        termsAndConditions.add(jLabel6);
        jLabel6.setBounds(30, 110, 190, 17);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("3. You are not allowed to book your excursion twice from");
        termsAndConditions.add(jLabel7);
        jLabel7.setBounds(20, 130, 470, 22);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(" same account.");
        termsAndConditions.add(jLabel8);
        jLabel8.setBounds(30, 150, 130, 17);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("4. None of the malware act are tolerated.");
        termsAndConditions.add(jLabel9);
        jLabel9.setBounds(20, 170, 440, 17);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        termsAndConditions.add(jButton1);
        jButton1.setBounds(220, 200, 53, 25);
        termsAndConditions.add(jLabel2);
        jLabel2.setBounds(0, 0, 0, 0);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame 1.jpg"))); // NOI18N
        termsAndConditions.add(jLabel11);
        jLabel11.setBounds(0, 0, 500, 230);

        jPanel1.add(termsAndConditions);
        termsAndConditions.setBounds(30, 190, 500, 230);
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Register.jpg"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(0, 0, 960, 600);

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
    }// </editor-fold>//GEN-END:initComponents

    private void cabinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cabinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cabinActionPerformed
  
        
        

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
    if(first.getText().equals("")||last.getText().equals("")||username.getText().equals("")|| password.getText().equals("")|| email.getText().equals("")|| cabin.getText().equals(""))//checks if all feild are empty
            {
                JOptionPane.showMessageDialog(null,"Please enter all the feilds provided!");

            }
    
    //to valid all information
        else if(!valid1.getText().equals("")||!valid2.getText().equals("")||!valid3.getText().equals("")||!valid4.getText().equals("")||!valid5.getText().equals("")||!valid6.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please enter the valid information!");
        }
        else if(!check.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Please, accept the terms and conditions before proceeding!");
        }
        else
            {
             try {
                Socket s = new Socket("127.0.0.1",4011);//send request to server in port 4011

               ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
               ObjectInputStream is = new ObjectInputStream(s.getInputStream());
               String Register []= new String[] {"register",first.getText(),last.getText(),username.getText(),email.getText(),password.getText(),cabin.getText()};//sends data in form of array
               os.writeObject(Register);
               
               
               
               String [] message = (String []) is.readObject();// read the result of server in the form of array
               //System.out.println(message[0]);
               
               
               if (message[0].equals("Username/Email already registered!"))
               {
                   System.out.println("Server: "+message[0]);
                   JOptionPane.showMessageDialog(null,"Username/Email already exist. Please try the new one");
               }
               else if(message[0].equals("Server: Successfully registered"))
               {
                    JOptionPane.showMessageDialog(null,"Successfully registered!");

                   System.out.println(message[0]);
                   this.dispose();
                   Login signin =new Login();
                   signin.setVisible(true);
               }
                
               


               
            } 
        catch (Exception e) 
            {
                
                JOptionPane.showMessageDialog(null,"Server is offline    ");
            }   
    }
        
    }//GEN-LAST:event_signupActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new Homepage().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void firstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstKeyReleased
         String pattern="[a-zA-Z]{2,}";
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(first.getText());
        if (!match.matches())
        {
            valid1.setText("Invalid first name!");
        } 
        else
        {
           valid1.setText(""); 
        }
        

    }//GEN-LAST:event_firstKeyReleased

    private void lastKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastKeyReleased
          String pattern="[a-zA-Z]{2,}";// regex pattern to check last name
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(last.getText());
        if (!match.matches())
        {
            valid2.setText("Invalid last name!");
        }   
        else
        {
           valid2.setText(""); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_lastKeyReleased

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        String pattern="\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";// regex pattern to check email
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(email.getText());
        if (!match.matches())
        {
            valid4.setText("Invalid email!");
        }
        
        else
        {
           valid4.setText(""); 
        }

        
                // TODO add your handling code here:  
    }//GEN-LAST:event_emailKeyReleased

    private void cabinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cabinKeyReleased
         String pattern="[A-Z0-9]{2,4}";// regex pattern to check cabin
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(cabin.getText());
        if (!match.matches())
        {
            valid5.setText("Invalid cabin number!");
        }    
        
        else
        {
           valid5.setText(""); 
        }// TODO add your handling code here:
    }//GEN-LAST:event_cabinKeyReleased

    private void valid1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valid1KeyReleased
               // TODO add your handling code here:
    }//GEN-LAST:event_valid1KeyReleased

    private void valid2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valid2KeyReleased
                 // TODO add your handling code here:
    }//GEN-LAST:event_valid2KeyReleased

    private void valid3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valid3KeyReleased
               // TODO add your handling code here:
    }//GEN-LAST:event_valid3KeyReleased

    private void valid4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valid4KeyReleased
         // TODO add your handling code here:
    }//GEN-LAST:event_valid4KeyReleased

    private void valid5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valid5KeyReleased
            // TODO add your handling code here:
    }//GEN-LAST:event_valid5KeyReleased

    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernameKeyReleased
       String pattern="^[a-zA-Z0-9]{2,}";//// regex pattern to check username
        Pattern pat=Pattern.compile(pattern);
        Matcher match=pat.matcher(username.getText());
        if (!match.matches())
        {
            valid3.setText("Invalid username!");
            
            
        } 
        else
        {
           valid3.setText(""); 
        }
    }//GEN-LAST:event_usernameKeyReleased

    private void termAndCnditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_termAndCnditionActionPerformed
        termsAndConditions.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_termAndCnditionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        termsAndConditions.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordKeyReleased
        if(password.getText().length()<8) //check if the password is minimum of 8 characters
        {
            valid6.setText("at least 8 characters!");
        }
        else
        {
            valid6.setText("");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_passwordKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField cabin;
    private javax.swing.JCheckBox check;
    private javax.swing.JTextField email;
    private javax.swing.JTextField first;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField last;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signup;
    private javax.swing.JButton termAndCndition;
    private javax.swing.JPanel termsAndConditions;
    private javax.swing.JTextField username;
    private javax.swing.JLabel valid1;
    private javax.swing.JLabel valid2;
    private javax.swing.JLabel valid3;
    private javax.swing.JLabel valid4;
    private javax.swing.JLabel valid5;
    private javax.swing.JLabel valid6;
    // End of variables declaration//GEN-END:variables

    private Statement setString(int i, String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
