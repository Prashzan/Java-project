import java.awt.Color;
public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        this.setTitle("Dashboard");
        signOut.setBackground(new Color(0,0,0,64));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        viewWaitList = new javax.swing.JButton();
        viewBooking = new javax.swing.JButton();
        makeBooking = new javax.swing.JButton();
        aboutUs = new javax.swing.JButton();
        signOut = new javax.swing.JButton();
        userProfile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 50));
        setResizable(false);
        setSize(new java.awt.Dimension(960, 600));

        jPanel1.setMinimumSize(new java.awt.Dimension(960, 600));
        jPanel1.setLayout(null);

        viewWaitList.setContentAreaFilled(false);
        viewWaitList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewWaitList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewWaitListActionPerformed(evt);
            }
        });
        jPanel1.add(viewWaitList);
        viewWaitList.setBounds(520, 60, 140, 20);

        viewBooking.setContentAreaFilled(false);
        viewBooking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBookingActionPerformed(evt);
            }
        });
        jPanel1.add(viewBooking);
        viewBooking.setBounds(350, 60, 120, 20);

        makeBooking.setContentAreaFilled(false);
        makeBooking.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        makeBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeBookingActionPerformed(evt);
            }
        });
        jPanel1.add(makeBooking);
        makeBooking.setBounds(160, 60, 130, 20);

        aboutUs.setContentAreaFilled(false);
        aboutUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutUsActionPerformed(evt);
            }
        });
        jPanel1.add(aboutUs);
        aboutUs.setBounds(30, 60, 80, 20);

        signOut.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        signOut.setForeground(new java.awt.Color(255, 255, 255));
        signOut.setText("Sign Out");
        signOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signOutActionPerformed(evt);
            }
        });
        jPanel1.add(signOut);
        signOut.setBounds(840, 10, 110, 30);

        userProfile.setContentAreaFilled(false);
        userProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userProfileActionPerformed(evt);
            }
        });
        jPanel1.add(userProfile);
        userProfile.setBounds(709, 53, 100, 20);

        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Dashboard.jpg"))); // NOI18N
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
    }// </editor-fold>//GEN-END:initComponents

    private void makeBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeBookingActionPerformed
        this.dispose();
        Booking book= new Booking();//to make booking page visible
        book.setVisible(true);        
    }//GEN-LAST:event_makeBookingActionPerformed

    private void viewWaitListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewWaitListActionPerformed
        this.dispose();
        WaitingList wait= new WaitingList();//to make waiting  page visible
        wait.setVisible(true);
    }//GEN-LAST:event_viewWaitListActionPerformed

    private void viewBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBookingActionPerformed
        this.dispose();
        ViewBooking viewBook=new ViewBooking();//to make view booking page visible
        viewBook.setVisible(true);        
    }//GEN-LAST:event_viewBookingActionPerformed

    private void aboutUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutUsActionPerformed
        this.dispose();
        AboutUs about= new AboutUs();//to make aboutUs page visible
        about.setVisible(true);
    }//GEN-LAST:event_aboutUsActionPerformed

    private void signOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signOutActionPerformed
        this.dispose();
        new Homepage().setVisible(true);//to signout
    }//GEN-LAST:event_signOutActionPerformed

    private void userProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userProfileActionPerformed
        this.dispose();
        UserProfile user=new UserProfile();//to make user profile page visible
        user.setVisible(true);       
    }//GEN-LAST:event_userProfileActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutUs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton makeBooking;
    private javax.swing.JButton signOut;
    private javax.swing.JButton userProfile;
    private javax.swing.JButton viewBooking;
    private javax.swing.JButton viewWaitList;
    // End of variables declaration//GEN-END:variables

    void visible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
