
import java.awt.Color;
import java.awt.Font;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Admin extends javax.swing.JFrame {

   
    public Admin() {
        initComponents();
        this.setTitle("Super Admin Panel");
        first.setBackground(new Color(0, 0, 0, 64));
        last.setBackground(new Color(0, 0, 0, 64));
        email.setBackground(new Color(0, 0, 0, 64));
        cabin.setBackground(new Color(0, 0, 0, 64));
        // port.setBackground(new Color(0,0,0,64));
        excursion.setBackground(new Color(0, 0, 0, 64));
        seat.setBackground(new Color(0, 0, 0, 64));
        updateUserInfo.setBackground(new Color(0, 0, 0, 64));
        updateBookInfo.setBackground(new Color(0, 0, 0, 64));
        deleteUserInfo.setBackground(new Color(0, 0, 0, 64));
        cancelBookInfo.setBackground(new Color(0, 0, 0, 64));
        // wait.setBackground(new Color(0,0,0,64));
        seater.setBackground(new Color(0, 0, 0, 64));
        updateWaitList.setBackground(new Color(0, 0, 0, 64));
        cancelWaitList.setBackground(new Color(0, 0, 0, 64));
        moveToBooking.setBackground(new Color(0, 0, 0, 64));
        Detail.setVisible(false);
        booking.setVisible(false);
        waitingg.setVisible(false);
        viewAllUserInfo();
        ViewBookingInfo();
        ViewWaitingInfo();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        view = new javax.swing.JPanel();
        searchfeild = new javax.swing.JTextField();
        searchUserInfo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewAllUserInfo = new javax.swing.JTable();
        Detail = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        deleteUserInfo = new javax.swing.JButton();
        updateUserInfo = new javax.swing.JButton();
        cabin = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        last = new javax.swing.JTextField();
        first = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        firstt = new javax.swing.JLabel();
        emaill = new javax.swing.JLabel();
        lastt = new javax.swing.JLabel();
        cabinn = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewAllBookingInfo = new javax.swing.JTable();
        searchfeild1 = new javax.swing.JTextField();
        search1 = new javax.swing.JButton();
        booking = new javax.swing.JPanel();
        cancelBookInfo = new javax.swing.JButton();
        updateBookInfo = new javax.swing.JButton();
        excursion = new javax.swing.JTextField();
        seat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        excursionn = new javax.swing.JLabel();
        seatt = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        viewAllWaitingInfo = new javax.swing.JTable();
        waiting = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        waitingg = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        seater = new javax.swing.JTextField();
        updateWaitList = new javax.swing.JButton();
        cancelWaitList = new javax.swing.JButton();
        moveToBooking = new javax.swing.JButton();
        valid2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        signout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(970, 645));
        setResizable(false);
        setSize(new java.awt.Dimension(970, 645));
        getContentPane().setLayout(null);

        jTabbedPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane2MouseClicked(evt);
            }
        });
        jTabbedPane2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTabbedPane2KeyPressed(evt);
            }
        });

        view.setPreferredSize(new java.awt.Dimension(960, 600));
        view.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewMouseClicked(evt);
            }
        });

        searchfeild.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        searchfeild.setText("Enter Username ");
        searchfeild.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchfeildMouseClicked(evt);
            }
        });
        searchfeild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchfeildActionPerformed(evt);
            }
        });

        searchUserInfo.setText("Search");
        searchUserInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchUserInfoActionPerformed(evt);
            }
        });

        viewAllUserInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Username", "Email", "Cabin Number"
            }
        ));
        viewAllUserInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewAllUserInfoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewAllUserInfo);

        Detail.setPreferredSize(new java.awt.Dimension(665, 220));
        Detail.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cabin Number");
        Detail.add(jLabel7);
        jLabel7.setBounds(50, 150, 140, 22);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        Detail.add(jLabel6);
        jLabel6.setBounds(50, 120, 80, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Last Name");
        Detail.add(jLabel4);
        jLabel4.setBounds(50, 80, 84, 22);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("First Name");
        Detail.add(jLabel3);
        jLabel3.setBounds(50, 50, 100, 17);

        deleteUserInfo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        deleteUserInfo.setForeground(new java.awt.Color(255, 255, 255));
        deleteUserInfo.setText("Delete");
        deleteUserInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteUserInfoMouseClicked(evt);
            }
        });
        Detail.add(deleteUserInfo);
        deleteUserInfo.setBounds(350, 190, 100, 25);

        updateUserInfo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateUserInfo.setForeground(new java.awt.Color(255, 255, 255));
        updateUserInfo.setText("Update");
        updateUserInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateUserInfoMouseClicked(evt);
            }
        });
        updateUserInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserInfoActionPerformed(evt);
            }
        });
        Detail.add(updateUserInfo);
        updateUserInfo.setBounds(200, 190, 100, 25);

        cabin.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cabin.setForeground(new java.awt.Color(255, 255, 255));
        cabin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cabinKeyReleased(evt);
            }
        });
        Detail.add(cabin);
        cabin.setBounds(200, 150, 250, 30);

        email.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        Detail.add(email);
        email.setBounds(200, 110, 250, 30);

        last.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        last.setForeground(new java.awt.Color(255, 255, 255));
        last.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastKeyReleased(evt);
            }
        });
        Detail.add(last);
        last.setBounds(200, 70, 250, 30);

        first.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        first.setForeground(new java.awt.Color(255, 255, 255));
        first.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstActionPerformed(evt);
            }
        });
        first.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstKeyReleased(evt);
            }
        });
        Detail.add(first);
        first.setBounds(200, 30, 250, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Edit User Information");
        Detail.add(jLabel14);
        jLabel14.setBounds(230, 10, 200, 22);

        firstt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        firstt.setForeground(new java.awt.Color(255, 255, 255));
        firstt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firsttKeyReleased(evt);
            }
        });
        Detail.add(firstt);
        firstt.setBounds(310, 60, 140, 10);

        emaill.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emaill.setForeground(new java.awt.Color(255, 255, 255));
        emaill.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emaillKeyReleased(evt);
            }
        });
        Detail.add(emaill);
        emaill.setBounds(310, 140, 140, 10);

        lastt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lastt.setForeground(new java.awt.Color(255, 255, 255));
        lastt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lasttKeyReleased(evt);
            }
        });
        Detail.add(lastt);
        lastt.setBounds(310, 100, 140, 10);

        cabinn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cabinn.setForeground(new java.awt.Color(255, 255, 255));
        cabinn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cabinnKeyReleased(evt);
            }
        });
        Detail.add(cabinn);
        cabinn.setBounds(290, 180, 150, 10);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame 2.jpg"))); // NOI18N
        Detail.add(jLabel13);
        jLabel13.setBounds(0, 0, 670, 250);

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(viewLayout.createSequentialGroup()
                        .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(viewLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jScrollPane1))
                            .addGroup(viewLayout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(searchfeild, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(searchUserInfo)
                                .addGap(0, 154, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchfeild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchUserInfo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Detail, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("User Information", view);

        viewAllBookingInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Exc_ID", "Port ID", "Seats", "Name", "Date"
            }
        ));
        viewAllBookingInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewAllBookingInfoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(viewAllBookingInfo);
        if (viewAllBookingInfo.getColumnModel().getColumnCount() > 0) {
            viewAllBookingInfo.getColumnModel().getColumn(0).setPreferredWidth(1);
            viewAllBookingInfo.getColumnModel().getColumn(1).setPreferredWidth(2);
            viewAllBookingInfo.getColumnModel().getColumn(2).setPreferredWidth(2);
            viewAllBookingInfo.getColumnModel().getColumn(4).setPreferredWidth(2);
            viewAllBookingInfo.getColumnModel().getColumn(5).setPreferredWidth(5);
            viewAllBookingInfo.getColumnModel().getColumn(6).setPreferredWidth(4);
        }

        searchfeild1.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        searchfeild1.setText("Enter Username");
        searchfeild1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchfeild1MouseClicked(evt);
            }
        });
        searchfeild1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchfeild1KeyPressed(evt);
            }
        });

        search1.setText("Search");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        booking.setLayout(null);

        cancelBookInfo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancelBookInfo.setForeground(new java.awt.Color(255, 255, 255));
        cancelBookInfo.setText("Cancel");
        cancelBookInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBookInfoMouseClicked(evt);
            }
        });
        booking.add(cancelBookInfo);
        cancelBookInfo.setBounds(420, 140, 80, 25);

        updateBookInfo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateBookInfo.setForeground(new java.awt.Color(255, 255, 255));
        updateBookInfo.setText("Update");
        updateBookInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBookInfoMouseClicked(evt);
            }
        });
        updateBookInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookInfoActionPerformed(evt);
            }
        });
        booking.add(updateBookInfo);
        updateBookInfo.setBounds(300, 140, 80, 25);

        excursion.setEditable(false);
        excursion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        excursion.setForeground(new java.awt.Color(255, 255, 255));
        excursion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excursionActionPerformed(evt);
            }
        });
        excursion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                excursionKeyReleased(evt);
            }
        });
        booking.add(excursion);
        excursion.setBounds(290, 40, 220, 30);

        seat.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        seat.setForeground(new java.awt.Color(255, 255, 255));
        seat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatActionPerformed(evt);
            }
        });
        seat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seatKeyReleased(evt);
            }
        });
        booking.add(seat);
        seat.setBounds(290, 90, 220, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Excursion ID");
        booking.add(jLabel10);
        jLabel10.setBounds(130, 50, 130, 17);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Number of Seats");
        booking.add(jLabel11);
        jLabel11.setBounds(130, 90, 130, 22);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Edit Booking List");
        booking.add(jLabel12);
        jLabel12.setBounds(320, 10, 140, 14);

        excursionn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        excursionn.setForeground(new java.awt.Color(255, 255, 255));
        booking.add(excursionn);
        excursionn.setBounds(330, 70, 180, 10);

        seatt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        seatt.setForeground(new java.awt.Color(255, 255, 255));
        booking.add(seatt);
        seatt.setBounds(370, 120, 140, 10);
        booking.add(jLabel8);
        jLabel8.setBounds(0, 0, 0, 0);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame 3.jpg"))); // NOI18N
        booking.add(jLabel9);
        jLabel9.setBounds(0, 0, 670, 180);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(searchfeild1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(search1)
                        .addGap(0, 162, Short.MAX_VALUE))
                    .addComponent(booking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchfeild1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(search1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(booking, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane2.addTab("Booking Info", jPanel6);

        viewAllWaitingInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Port ID", "Excursion ID", "Name", "Rank", "Username", "Seats", "Date"
            }
        ));
        viewAllWaitingInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewAllWaitingInfoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(viewAllWaitingInfo);
        if (viewAllWaitingInfo.getColumnModel().getColumnCount() > 0) {
            viewAllWaitingInfo.getColumnModel().getColumn(0).setPreferredWidth(2);
            viewAllWaitingInfo.getColumnModel().getColumn(1).setPreferredWidth(3);
            viewAllWaitingInfo.getColumnModel().getColumn(3).setPreferredWidth(2);
            viewAllWaitingInfo.getColumnModel().getColumn(4).setPreferredWidth(3);
            viewAllWaitingInfo.getColumnModel().getColumn(5).setPreferredWidth(2);
        }

        waiting.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        waiting.setText("Enter Username");
        waiting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                waitingMouseClicked(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        waitingg.setLayout(null);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Edit Waiting List Information");
        waitingg.add(jLabel15);
        jLabel15.setBounds(210, 20, 250, 30);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Number of Seat");
        waitingg.add(jLabel17);
        jLabel17.setBounds(80, 80, 140, 17);

        seater.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        seater.setForeground(new java.awt.Color(255, 255, 255));
        seater.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                seaterKeyReleased(evt);
            }
        });
        waitingg.add(seater);
        seater.setBounds(230, 70, 190, 30);

        updateWaitList.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateWaitList.setForeground(new java.awt.Color(255, 255, 255));
        updateWaitList.setText("Update");
        updateWaitList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateWaitListMouseClicked(evt);
            }
        });
        updateWaitList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateWaitListActionPerformed(evt);
            }
        });
        waitingg.add(updateWaitList);
        updateWaitList.setBounds(280, 130, 80, 25);

        cancelWaitList.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cancelWaitList.setForeground(new java.awt.Color(255, 255, 255));
        cancelWaitList.setText("Cancel waiting list");
        cancelWaitList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelWaitListActionPerformed(evt);
            }
        });
        waitingg.add(cancelWaitList);
        cancelWaitList.setBounds(430, 130, 150, 25);

        moveToBooking.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        moveToBooking.setForeground(new java.awt.Color(255, 255, 255));
        moveToBooking.setText("Move to Booking");
        moveToBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveToBookingActionPerformed(evt);
            }
        });
        waitingg.add(moveToBooking);
        moveToBooking.setBounds(90, 130, 140, 25);

        valid2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        valid2.setForeground(new java.awt.Color(255, 255, 255));
        waitingg.add(valid2);
        valid2.setBounds(260, 100, 160, 10);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Frame 3.jpg"))); // NOI18N
        waitingg.add(jLabel5);
        jLabel5.setBounds(0, 0, 660, 170);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(waitingg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(waiting, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(Search)
                        .addGap(0, 129, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waiting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(waitingg, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Waiting List Info", jPanel5);

        getContentPane().add(jTabbedPane2);
        jTabbedPane2.setBounds(270, 110, 690, 510);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Super Admin");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 70, 130, 30);

        signout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        signout.setText("Sign Out");
        signout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signoutActionPerformed(evt);
            }
        });
        getContentPane().add(signout);
        signout.setBounds(840, 10, 110, 25);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Admin.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 970, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTabbedPane2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane2KeyPressed

    private void viewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_viewMouseClicked

    private void searchUserInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchUserInfoActionPerformed
        String feild = searchfeild.getText();
        if (feild.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty feild");
        } else {
            try {
                Socket s = new Socket("127.0.0.1", 4011);

                ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(s.getInputStream());

                String b[] = new String[]{"search username", feild};
                os.writeObject(b);

                String returnn[] = (String[]) is.readObject();
                DefaultTableModel model = (DefaultTableModel) viewAllUserInfo.getModel();

                model.addRow(returnn);
                viewAllUserInfo.setModel(model);
                searchfeild.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }//GEN-LAST:event_searchUserInfoActionPerformed
    private void emptyTable() {
        Detail.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) viewAllUserInfo.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        searchfeild.setText("");
        searchfeild.setFont(new Font("Times New Roman", Font.PLAIN, 14));
    }
    private void searchfeildMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchfeildMouseClicked
        emptyTable();// TODO add your handling code here:
    }//GEN-LAST:event_searchfeildMouseClicked

    private void searchfeildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchfeildActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfeildActionPerformed
    private void viewAllUserInfo() {
        try {
            DefaultTableModel model = (DefaultTableModel) viewAllUserInfo.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            Socket s = new Socket("127.0.0.1", 4011);

            ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream is = new ObjectInputStream(s.getInputStream());

            String b[] = new String[]{"view all information"};
            os.writeObject(b);

            String data[][];
            data = (String[][]) is.readObject();

            viewAllUserInfo.setModel(model);
            for (String[] row : data) {
                model.addRow(row);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void ViewBookingInfo() {
        try {
            DefaultTableModel model = (DefaultTableModel) viewAllBookingInfo.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            Socket s = new Socket("127.0.0.1", 4011);

            ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream is = new ObjectInputStream(s.getInputStream());

            String b[] = new String[]{"view booking information"};
            os.writeObject(b);

            String data[][];
            data = (String[][]) is.readObject();

            for (String[] row : data) {
                model.addRow(row);
            }
            viewAllBookingInfo.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchBooking() {
        String feild = searchfeild1.getText();
        if (feild.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty feild");
        } else {
            try {
                Socket s = new Socket("127.0.0.1", 4011);

                ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(s.getInputStream());

                String b[] = new String[]{"search booking", feild};
                os.writeObject(b);

                DefaultTableModel model = (DefaultTableModel) viewAllBookingInfo.getModel();

                String data[][];
                data = (String[][]) is.readObject();

                for (String[] row : data) {
                    model.addRow(row);
                }

                viewAllBookingInfo.setModel(model);
                System.out.println("Server: Booking shown");

                searchfeild1.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        searchBooking();
        // TODO add your handling code here:
    }//GEN-LAST:event_search1ActionPerformed

    private void searchfeild1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchfeild1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchfeild1KeyPressed

    private void searchfeild1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchfeild1MouseClicked
        booking.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) viewAllBookingInfo.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        searchfeild1.setText("");
        searchfeild1.setFont(new Font("Times New Roman", Font.PLAIN, 14));         // TODO add your handling code here:
    }//GEN-LAST:event_searchfeild1MouseClicked

    private void viewAllUserInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllUserInfoMouseClicked
        try {
            Detail.setVisible(true);
            DefaultTableModel model = (DefaultTableModel) viewAllUserInfo.getModel();
            int selectedRowIndex = viewAllUserInfo.getSelectedRow();

            first.setText(model.getValueAt(selectedRowIndex, 0).toString());
            last.setText(model.getValueAt(selectedRowIndex, 1).toString());

            email.setText(model.getValueAt(selectedRowIndex, 3).toString());
            cabin.setText(model.getValueAt(selectedRowIndex, 4).toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_viewAllUserInfoMouseClicked

    private void updateUserInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateUserInfoMouseClicked
        DefaultTableModel model = (DefaultTableModel) viewAllUserInfo.getModel();
        int selectedRowIndex = viewAllUserInfo.getSelectedRow();
        String firsT = model.getValueAt(selectedRowIndex, 0).toString();
        String lasT = model.getValueAt(selectedRowIndex, 1).toString();
        String emaiL = model.getValueAt(selectedRowIndex, 3).toString();
        String cabiN = model.getValueAt(selectedRowIndex, 4).toString();
        if (first.getText().equals("") || last.getText().equals("") || email.getText().equals("") || cabin.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all the feilds provided!");

        } else if (!firstt.getText().equals("") || !lastt.getText().equals("") || !emaill.getText().equals("") || !cabinn.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the valid information!");
        } else if (first.getText().equals(firsT) && last.getText().equals(lasT) && email.getText().equals(emaiL) && cabin.getText().equals(cabiN)) {
            JOptionPane.showMessageDialog(null, "Nothing to update!");
        } else {

            try {

                Socket s = new Socket("127.0.0.1", 4011);

                ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(s.getInputStream());
                // DefaultTableModel model = (DefaultTableModel)table1.getModel();
                //int selectedRowIndex = table1.getSelectedRow();

                String b[] = new String[]{"update data", first.getText(), last.getText(), model.getValueAt(selectedRowIndex, 2).toString(), email.getText(), cabin.getText()};
                os.writeObject(b);

                String returnn[] = (String[]) is.readObject();
                if (returnn[0].equals("email changed")) {
                    JOptionPane.showMessageDialog(null, "Successfully Updated");
                } else if (returnn[0].equals("Email already used")) {
                    JOptionPane.showMessageDialog(null, "Email already is use!");
                }

                first.setText("");
                last.setText("");
                email.setText("");
                cabin.setText("");
                viewAllUserInfo();
                Detail.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_updateUserInfoMouseClicked

    private void deleteUserInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteUserInfoMouseClicked
        DefaultTableModel model = (DefaultTableModel) viewAllUserInfo.getModel();
        int selectedRowIndex = viewAllUserInfo.getSelectedRow();
        String firsT = model.getValueAt(selectedRowIndex, 0).toString();
        String lasT = model.getValueAt(selectedRowIndex, 1).toString();
        String emaiL = model.getValueAt(selectedRowIndex, 3).toString();
        String cabiN = model.getValueAt(selectedRowIndex, 4).toString();
        if (first.getText().equals("") || last.getText().equals("") || email.getText().equals("") || cabin.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all the feilds provided!");

        } else if (!firstt.getText().equals("") || !lastt.getText().equals("") || !emaill.getText().equals("") || !cabinn.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the valid information!");
        } else if (!first.getText().equals(firsT) || !last.getText().equals(lasT) || !email.getText().equals(emaiL) || !cabin.getText().equals(cabiN)) {
            JOptionPane.showMessageDialog(null, "Please specify the previously allocated values!");
        } else {

            try {

                Socket s = new Socket("127.0.0.1", 4011);

                ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(s.getInputStream());
                // DefaultTableModel model = (DefaultTableModel)table1.getModel();
                // int selectedRowIndex = table1.getSelectedRow();

                String b[] = new String[]{"delete record from admin", model.getValueAt(selectedRowIndex, 2).toString()};
                os.writeObject(b);
                JOptionPane.showMessageDialog(null, "Successfully Deleted");
                first.setText("");
                last.setText("");
                email.setText("");
                cabin.setText("");
                viewAllUserInfo();
                Detail.setVisible(false);
                //String returnn[]=(String[]) is.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_deleteUserInfoMouseClicked

    private void viewAllBookingInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllBookingInfoMouseClicked
        try {
            booking.setVisible(true);
            DefaultTableModel model = (DefaultTableModel) viewAllBookingInfo.getModel();
            int selectedRowIndex = viewAllBookingInfo.getSelectedRow();

            excursion.setText(model.getValueAt(selectedRowIndex, 2).toString());
            seat.setText(model.getValueAt(selectedRowIndex, 4).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_viewAllBookingInfoMouseClicked

    private void updateBookInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBookInfoMouseClicked
        DefaultTableModel model = (DefaultTableModel) viewAllBookingInfo.getModel();
        int selectedRowIndex = viewAllBookingInfo.getSelectedRow();

        String Excursion = model.getValueAt(selectedRowIndex, 2).toString();
        String Seat = model.getValueAt(selectedRowIndex, 4).toString();
        if (excursion.getText().equals("") || seat.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all the feilds provided!");

        } else if (!excursionn.getText().equals("") || !seatt.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the valid information!");
        } else if (Integer.parseInt(seat.getText()) > 32) {
            JOptionPane.showMessageDialog(null, "More than 32 seat cannot be booked/waited!");
        } else if (excursion.getText().equals(Excursion) && seat.getText().equals(Seat)) {
            JOptionPane.showMessageDialog(null, "Nothing to update!");
        } else if (Integer.parseInt(seat.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "Sorry, Number of seat cannot be allocated as zero!");

        } else {
            try {

                Socket s = new Socket("127.0.0.1", 4011);

                ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(s.getInputStream());
                // DefaultTableModel model = (DefaultTableModel)table2.getModel();
                // int selectedRowIndex = table2.getSelectedRow();

                String b[] = new String[]{"update booking by admin", model.getValueAt(selectedRowIndex, 0).toString(), excursion.getText(), seat.getText(), model.getValueAt(selectedRowIndex, 2).toString(), model.getValueAt(selectedRowIndex, 4).toString(), model.getValueAt(selectedRowIndex, 5).toString()};
                os.writeObject(b);
                String result[] = (String[]) is.readObject();
                if (result[0].equals("Sorry, there is not enough seat that you want to book for!")) {
                    JOptionPane.showMessageDialog(null, result[0]);
                } else if (result[0].equals("Successfully updated!")) {
                    JOptionPane.showMessageDialog(null, result[0]);
                }

                excursion.setText("");
                seat.setText("");
                ViewBookingInfo();
                booking.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_updateBookInfoMouseClicked

    private void cancelBookInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBookInfoMouseClicked

        DefaultTableModel model = (DefaultTableModel) viewAllBookingInfo.getModel();
        int selectedRowIndex = viewAllBookingInfo.getSelectedRow();
        //String Excursion = model.getValueAt(selectedRowIndex, 2).toString();
        String Seatter = model.getValueAt(selectedRowIndex, 4).toString();
        System.out.println(seat.getText());
        System.out.println(Seatter);
         if ( !seat.getText().equals(Seatter)) {
            JOptionPane.showMessageDialog(null, "Please specify the previously allocated values!");
        }
        else if ( seat.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the valid information!");
        }
        else if (excursion.getText().equals("") || seat.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all the feilds provided!");

        }   else if (Integer.parseInt(seat.getText()) > 32) {

            JOptionPane.showMessageDialog(null, "Number of seat cannot be more than 32 !");
        } else {
            try {
                Socket s = new Socket("127.0.0.1", 4011);

                ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(s.getInputStream());
                //DefaultTableModel model = (DefaultTableModel)table2.getModel();
                //int selectedRowIndex = table2.getSelectedRow();

                String b[] = new String[]{"cancel booking by admin", model.getValueAt(selectedRowIndex, 0).toString(), seat.getText(), model.getValueAt(selectedRowIndex, 2).toString()};
                os.writeObject(b);
                JOptionPane.showMessageDialog(null, "Successfully Cancelled!");

                excursion.setText("");
                seat.setText("");
                ViewBookingInfo();
                booking.setVisible(false);

                //String returnn[]=(String[]) is.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cancelBookInfoMouseClicked

    private void firstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstActionPerformed

    private void seatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatActionPerformed

    private void firstKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstKeyReleased
        String pattern = "[a-zA-Z]{2,}";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(first.getText());
        if (!match.matches()) {
            firstt.setText("Invalid first name!");
        } else {
            firstt.setText("");
        }   // TODO add your handling code here:
    }//GEN-LAST:event_firstKeyReleased

    private void lastKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastKeyReleased
        String pattern = "[a-zA-Z]{2,}";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(last.getText());
        if (!match.matches()) {
            lastt.setText("Invalid last name!");
        } else {
            lastt.setText("");
        }    // TODO add your handling code here:
    }//GEN-LAST:event_lastKeyReleased

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyReleased
        String pattern = "^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{3,}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(email.getText());
        if (!match.matches()) {
            emaill.setText("Invalid email!");
        } else {
            emaill.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_emailKeyReleased

    private void cabinKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cabinKeyReleased
        String pattern = "[a-zA-Z0-9]{2,}";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(cabin.getText());
        if (!match.matches()) {
            cabinn.setText("Invalid cabin number!");
        } else {
            cabinn.setText("");
        }// TODO add your handling code here:
    }//GEN-LAST:event_cabinKeyReleased

    private void firsttKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firsttKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_firsttKeyReleased

    private void lasttKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lasttKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lasttKeyReleased

    private void emaillKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emaillKeyReleased

        // TODO add your handling code here:
    }//GEN-LAST:event_emaillKeyReleased

    private void cabinnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cabinnKeyReleased

    }//GEN-LAST:event_cabinnKeyReleased

    private void updateUserInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateUserInfoActionPerformed

    private void seatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seatKeyReleased
        String pattern = "[0-9]{1,}";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(seat.getText());
        if (!match.matches()) {
            seatt.setText("Invalid number of seat");
        } else {
            seatt.setText("");
        }
    }//GEN-LAST:event_seatKeyReleased

    private void updateBookInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBookInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateBookInfoActionPerformed

    private void waitingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waitingMouseClicked

        waitingg.setVisible(false);
        DefaultTableModel model = (DefaultTableModel) viewAllWaitingInfo.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        waiting.setText("");
        waiting.setFont(new Font("Times New Roman", Font.PLAIN, 14));
    }//GEN-LAST:event_waitingMouseClicked

    private void ViewWaitingInfo() {
        try {
            DefaultTableModel model = (DefaultTableModel) viewAllWaitingInfo.getModel();
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            Socket s = new Socket("127.0.0.1", 4011);

            ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream is = new ObjectInputStream(s.getInputStream());

            String b[] = new String[]{"view waiting info"};
            os.writeObject(b);

            String data[][];
            data = (String[][]) is.readObject();

            for (String[] row : data) {
                model.addRow(row);
            }
            viewAllWaitingInfo.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void searchWaiting() {

        if (waiting.equals("")) {
            JOptionPane.showMessageDialog(null, "Empty feild!");
        } else {
            try {
                Socket s = new Socket("127.0.0.1", 4011);

                ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(s.getInputStream());

                String b[] = new String[]{"search waiting", waiting.getText()};
                os.writeObject(b);

                DefaultTableModel model = (DefaultTableModel) viewAllWaitingInfo.getModel();
                String data[][];
                data = (String[][]) is.readObject();

                for (String[] row : data) {
                    model.addRow(row);
                }
                viewAllWaitingInfo.setModel(model);

                viewAllWaitingInfo.setModel(model);
                waiting.setText("");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        searchWaiting();
    }//GEN-LAST:event_SearchActionPerformed

    private void viewAllWaitingInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewAllWaitingInfoMouseClicked
        try {
            waitingg.setVisible(true);
            DefaultTableModel model = (DefaultTableModel) viewAllWaitingInfo.getModel();
            int selectedRowIndex = viewAllWaitingInfo.getSelectedRow();

            seater.setText(model.getValueAt(selectedRowIndex, 5).toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_viewAllWaitingInfoMouseClicked

    private void seaterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_seaterKeyReleased
        String pattern = "[0-9]{1,3}";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(seater.getText());
        if (!match.matches()) {
            valid2.setText("Invalid number of seat!");
        } else {
            valid2.setText("");
        }         // TODO add your handling code here:
    }//GEN-LAST:event_seaterKeyReleased

    private void updateWaitListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateWaitListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateWaitListActionPerformed

    private void cancelWaitListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelWaitListActionPerformed
        DefaultTableModel model = (DefaultTableModel) viewAllWaitingInfo.getModel();
        int selectedRowIndex = viewAllWaitingInfo.getSelectedRow();

        String numberOfSeat = model.getValueAt(selectedRowIndex, 5).toString();
        if (seater.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all the feilds provided!");

        } else if (!valid2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the valid information!");
        } else if (!numberOfSeat.equals(seater.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter the previously allocated values!");

        } else {
            try {

                Socket s = new Socket("127.0.0.1", 4011);

                ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(s.getInputStream());
                //DefaultTableModel model = (DefaultTableModel)table3.getModel();
                //int selectedRowIndex = table3.getSelectedRow();

                String b[] = new String[]{"cancel waiting by admin", model.getValueAt(selectedRowIndex, 3).toString(), model.getValueAt(selectedRowIndex, 1).toString(), seater.getText()};
                os.writeObject(b);
                JOptionPane.showMessageDialog(null, "Successfully Cancelled!");
                seater.setText("");

                ViewWaitingInfo();
                waitingg.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_cancelWaitListActionPerformed

    private void updateWaitListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateWaitListMouseClicked
        DefaultTableModel model = (DefaultTableModel) viewAllWaitingInfo.getModel();
        int selectedRowIndex = viewAllWaitingInfo.getSelectedRow();
        String numberOfSeat = model.getValueAt(selectedRowIndex, 5).toString();
        if (seater.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all the feilds provided!");

        } else if (numberOfSeat.equals(seater.getText())) {
            JOptionPane.showMessageDialog(null, "Nothing to update!");

        } else if (!valid2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the valid information!");
        } else if (Integer.parseInt(seater.getText()) > 32) {
            JOptionPane.showMessageDialog(null, "More than 32 seats cannot be booked/waited!");
        } else if (Integer.parseInt(seater.getText()) == 0) {
            JOptionPane.showMessageDialog(null, "You cannot update the number of seat into zero!");
        } else {
            try {

                Socket s = new Socket("127.0.0.1", 4011);

                ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
                ObjectInputStream is = new ObjectInputStream(s.getInputStream());
                //DefaultTableModel model = (DefaultTableModel)table3.getModel();
                // int selectedRowIndex = table3.getSelectedRow();

                String b[] = new String[]{"updatee waitingg by admin", seater.getText(), model.getValueAt(selectedRowIndex, 3).toString(), model.getValueAt(selectedRowIndex, 1).toString(), model.getValueAt(selectedRowIndex, 5).toString()};

                os.writeObject(b);
                String returnn[] = (String[]) is.readObject();
                if (returnn[0].equals("The assigned waiting rank is already fulfilled!")) {
                    JOptionPane.showMessageDialog(null, returnn[0]);
                } else if (returnn[0].equals("Successfully updated!")) {
                    JOptionPane.showMessageDialog(null, "Successfully Updated!");

                }
                seater.setText("");

                ViewWaitingInfo();
                waitingg.setVisible(false);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_updateWaitListMouseClicked

    private void jTabbedPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane2MouseClicked
        viewAllUserInfo();
        ViewBookingInfo();
        ViewWaitingInfo();

    }//GEN-LAST:event_jTabbedPane2MouseClicked

    private void moveToBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveToBookingActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) viewAllWaitingInfo.getModel();
            int selectedRowIndex = viewAllWaitingInfo.getSelectedRow();
            Socket s = new Socket("127.0.0.1", 4011);

            ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream is = new ObjectInputStream(s.getInputStream());
            //DefaultTableModel model = (DefaultTableModel)table3.getModel();
            //int selectedRowIndex = table3.getSelectedRow();

            String b[] = new String[]{"move waiting to booking", model.getValueAt(selectedRowIndex, 4).toString(), model.getValueAt(selectedRowIndex, 1).toString(), model.getValueAt(selectedRowIndex, 5).toString(), model.getValueAt(selectedRowIndex, 3).toString()};
            os.writeObject(b);
            //JOptionPane.showMessageDialog(null,"Successfully Cancelled!");
            seater.setText("");
            String result[] = (String[]) is.readObject();
            if (result[0].equals("Seat is not enough to add in booking!")) {
                JOptionPane.showMessageDialog(null, result[0]);

            } else if (result[0].equals("Successfully moved to the booking!")) {
                JOptionPane.showMessageDialog(null, result[0]);

            }
            ViewWaitingInfo();
            waitingg.setVisible(false);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_moveToBookingActionPerformed

    private void excursionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_excursionKeyReleased
        String pattern = "[0-9]{1,}";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(seat.getText());
        if (!match.matches()) {
            excursionn.setText("Invalid number of seat");
        } else {
            excursionn.setText("");
        }
    }//GEN-LAST:event_excursionKeyReleased

    private void excursionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excursionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_excursionActionPerformed

    private void signoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signoutActionPerformed
        this.dispose();
        new Homepage().setVisible(true);
    }//GEN-LAST:event_signoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Detail;
    private javax.swing.JButton Search;
    private javax.swing.JPanel booking;
    private javax.swing.JTextField cabin;
    private javax.swing.JLabel cabinn;
    private javax.swing.JButton cancelBookInfo;
    private javax.swing.JButton cancelWaitList;
    private javax.swing.JButton deleteUserInfo;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emaill;
    private javax.swing.JTextField excursion;
    private javax.swing.JLabel excursionn;
    private javax.swing.JTextField first;
    private javax.swing.JLabel firstt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField last;
    private javax.swing.JLabel lastt;
    private javax.swing.JButton moveToBooking;
    private javax.swing.JButton search1;
    private javax.swing.JButton searchUserInfo;
    private javax.swing.JTextField searchfeild;
    private javax.swing.JTextField searchfeild1;
    private javax.swing.JTextField seat;
    private javax.swing.JTextField seater;
    private javax.swing.JLabel seatt;
    private javax.swing.JButton signout;
    private javax.swing.JButton updateBookInfo;
    private javax.swing.JButton updateUserInfo;
    private javax.swing.JButton updateWaitList;
    private javax.swing.JLabel valid2;
    private javax.swing.JPanel view;
    private javax.swing.JTable viewAllBookingInfo;
    private javax.swing.JTable viewAllUserInfo;
    private javax.swing.JTable viewAllWaitingInfo;
    private javax.swing.JTextField waiting;
    private javax.swing.JPanel waitingg;
    // End of variables declaration//GEN-END:variables
}
