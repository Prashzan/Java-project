
import java.awt.Color;
import java.awt.Font;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    static String usernamee;

    public Login() {
        initComponents();
        this.setTitle("Log In");
        username.setBackground(new Color(0, 0, 0, 64));
        password.setBackground(new Color(0, 0, 0, 64));
        signIn.setBackground(new Color(0, 0, 0, 64));
        signUp.setBackground(new Color(0, 0, 0, 64));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        signUp = new javax.swing.JButton();
        signIn = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 50));
        setMinimumSize(new java.awt.Dimension(960, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(960, 630));

        jPanel1.setMinimumSize(new java.awt.Dimension(960, 600));
        jPanel1.setLayout(null);

        username.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("Username");
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username);
        username.setBounds(590, 180, 330, 40);

        password.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.setText("Pssword");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password);
        password.setBounds(590, 270, 330, 40);

        signUp.setContentAreaFilled(false);
        signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        jPanel1.add(signUp);
        signUp.setBounds(680, 380, 100, 30);

        signIn.setContentAreaFilled(false);
        signIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signInActionPerformed(evt);
            }
        });
        jPanel1.add(signIn);
        signIn.setBounds(680, 320, 100, 30);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(30, 20, 40, 40);

        jLabel1.setMaximumSize(new java.awt.Dimension(960, 630));
        jLabel1.setMinimumSize(new java.awt.Dimension(960, 630));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sign In.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 960, 600);

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

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        username.setText("");
    }//GEN-LAST:event_usernameActionPerformed
    
    private void signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInActionPerformed
        if (username.getText().equals("") || password.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the valid username or password.");
        } else {
            try {
                usernamee = username.getText();
                Socket s = new Socket("127.0.0.1", 4011);
                ObjectInputStream is = new ObjectInputStream(s.getInputStream());
                ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                String Login[] = new String[]{"check login", username.getText(), password.getText()};
                os.writeObject(Login);
            

                String[] message = (String[]) is.readObject();
                String result = Arrays.toString(message);
                
                //System.out.println(result);
                if (result.equals("[Admin says to login!]")) {
                    this.dispose();
                    new Admin().setVisible(true);
                    //System.out.println(result);

                } else if (result.equals("[Invalid email and password]")) {
                    System.out.println("Server: Invalid email or password");
                    JOptionPane.showMessageDialog(null, "Invalid username or password");
                } else {
                    System.out.println("Server: Successfully logged in");
                    this.dispose();
                    new Dashboard().setVisible(true);
                }
                }
            catch (Exception e ) {
                JOptionPane.showMessageDialog(null,"Server is offline!");
                        }

             
        }


        // TODO add your handling code here:
    }//GEN-LAST:event_signInActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Register register = new Register();
        register.setVisible(true);
    }//GEN-LAST:event_signUpActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        username.setText("");
        username.setFont(new Font("Times New Roman", Font.BOLD, 18));
        ;  // TODO add your handling code here:
    }//GEN-LAST:event_usernameMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        password.setText("");
        password.setFont(new Font("Times New Roman", Font.BOLD, 18));        // TODO add your handling code here:
    }//GEN-LAST:event_passwordMouseClicked

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.dispose();
        new Homepage().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton signIn;
    private javax.swing.JButton signUp;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
