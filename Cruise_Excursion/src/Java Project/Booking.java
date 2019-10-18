
import java.awt.Color;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Booking extends javax.swing.JFrame {

    static String ID;
    static String seatt;

    public Booking() {
        initComponents();
        this.setTitle("Booking");
        portid.setBackground(new Color(0, 0, 0, 64));

        number.setBackground(new Color(0, 0, 0, 64));
        requestBook.setBackground(new Color(0, 0, 0, 64));
        down.setBackground(new Color(0, 0, 0, 64));
        seat.setBackground(new Color(0, 0, 0, 64));
        //allExcursionName();
        allPortID();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        portid = new javax.swing.JButton();
        searchh = new javax.swing.JComboBox<>();
        down = new javax.swing.JButton();
        requestBook = new javax.swing.JButton();
        search1 = new javax.swing.JComboBox<>();
        seat = new javax.swing.JButton();
        number = new javax.swing.JTextField();
        set = new javax.swing.JLabel();
        excursion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(960, 600));

        jPanel1.setMinimumSize(new java.awt.Dimension(960, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 600));
        jPanel1.setLayout(null);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Back.png"))); // NOI18N
        back.setBorder(null);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(0, 30, 50, 40);

        portid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        portid.setForeground(new java.awt.Color(255, 255, 255));
        portid.setText("Port Id");
        portid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portidActionPerformed(evt);
            }
        });
        jPanel1.add(portid);
        portid.setBounds(220, 200, 170, 30);

        searchh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        searchh.setForeground(new java.awt.Color(255, 255, 255));
        searchh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Port Id" }));
        searchh.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                searchhMouseMoved(evt);
            }
        });
        searchh.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchhFocusGained(evt);
            }
        });
        searchh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchhMouseClicked(evt);
            }
        });
        searchh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchhActionPerformed(evt);
            }
        });
        jPanel1.add(searchh);
        searchh.setBounds(450, 200, 380, 30);

        down.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        down.setForeground(new java.awt.Color(255, 255, 255));
        down.setText("Excursion Name");
        down.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downActionPerformed(evt);
            }
        });
        jPanel1.add(down);
        down.setBounds(220, 270, 170, 30);

        requestBook.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        requestBook.setForeground(new java.awt.Color(255, 255, 255));
        requestBook.setText("Book");
        requestBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBookActionPerformed(evt);
            }
        });
        jPanel1.add(requestBook);
        requestBook.setBounds(580, 430, 100, 31);

        search1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        search1.setForeground(new java.awt.Color(255, 255, 255));
        search1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "First choose Port ID" }));
        search1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                search1MouseMoved(evt);
            }
        });
        search1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search1MouseClicked(evt);
            }
        });
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });
        jPanel1.add(search1);
        search1.setBounds(450, 270, 380, 30);

        seat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        seat.setForeground(new java.awt.Color(255, 255, 255));
        seat.setText("No. of Seats");
        jPanel1.add(seat);
        seat.setBounds(217, 340, 180, 30);

        number.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        number.setForeground(new java.awt.Color(255, 255, 255));
        number.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                numberMouseClicked(evt);
            }
        });
        number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberActionPerformed(evt);
            }
        });
        number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                numberKeyReleased(evt);
            }
        });
        jPanel1.add(number);
        number.setBounds(450, 340, 380, 30);

        set.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        set.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(set);
        set.setBounds(630, 370, 230, 20);

        excursion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Booking.jpg"))); // NOI18N
        jPanel1.add(excursion);
        excursion.setBounds(0, 0, 960, 600);

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
        new Dashboard().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void portidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portidActionPerformed

    private void searchhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchhActionPerformed
        allExcursionName(); // TODO add your handling code here:

    }//GEN-LAST:event_searchhActionPerformed

    private void downActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_downActionPerformed

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_search1ActionPerformed

    private void numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberActionPerformed

    private void searchhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchhMouseClicked

    }//GEN-LAST:event_searchhMouseClicked

    private void search1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_search1MouseMoved

    private void searchhMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchhMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_searchhMouseMoved

    private void requestBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBookActionPerformed

        if (number.getText().equals("") || search1.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter all the feilds provided!");

        } else if (!set.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the valid seat number!");
        } else if (search1.getSelectedItem().equals("First choose Port ID") || searchh.getSelectedItem().equals("Choose Port Id")) {
            JOptionPane.showMessageDialog(null, "Please specify the Port ID and excursion name properly!");
        } else if (Integer.parseInt(number.getText()) > 32) {

            JOptionPane.showMessageDialog(null, "Number of seat cannot be more than 32 !");
        } else {

            checkSeats();
            try {
                checkIfAlreadyBooked();
            } catch (IOException | ClassNotFoundException ex) {
                Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_requestBookActionPerformed
    private void checkIfAlreadyBooked() throws IOException, ClassNotFoundException {
        Socket s = new Socket("127.0.0.1", 4011);//sends request to server to check if already booked
        ObjectInputStream is = new ObjectInputStream(s.getInputStream());
        ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
        String msg[] = new String[]{"check if already booked", new Login().usernamee, ID};
        os.writeObject(msg);//sends request in array form

        String[] message = (String[]) is.readObject();
        if (message[0].equals("Username already booked!")) {
            JOptionPane.showMessageDialog(null, "Sorry, " + new Login().usernamee + " you already had booked this excursion previously!");
        } else if (message[0].equals("Username had not book yet!")) {
            //JOptionPane.showMessageDialog(null,"Booking successfull");
            //manipulateSeat();
            checkUserInWaitList();
        }

    }

   private void checkUserInWaitList() throws IOException, ClassNotFoundException {
        Socket s = new Socket("127.0.0.1", 4011);//send request to sever if user in check wait list
        ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
        ObjectInputStream is = new ObjectInputStream(s.getInputStream());

        String message[] = new String[]{"check in wait list", new Login().usernamee, ID};
        os.writeObject(message);//sends request in array format

        String[] message1 = (String[]) is.readObject();
        if (message1[0].equals("Username already exist!")) {
            JOptionPane.showMessageDialog(null, "You had previoulsy booked and you are in wait list");
        } else if (message1[0].equals("Username not exist!")) {
            manipulateSeat();

        }

    }

    private void allExcursionName() {

        try {
            //System.out.println("It comes");
            search1.removeAllItems();

            Socket s = new Socket("127.0.0.1", 4011);
            ObjectInputStream is = new ObjectInputStream(s.getInputStream());
            ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
            String msg[] = new String[]{"retrive excursion name", (String) searchh.getSelectedItem()};//to check to retrive all excursion name
            os.writeObject(msg);
            System.out.println(msg[1]);
            String[] message = (String[]) is.readObject();//accept data in array format from  server

            for (int i = 0; i < (message.length - 1); i++) {
                search1.addItem(message[i]);//add all the excursion name 
                //System.out.println(message[i]);
            }

            System.out.println("Server: excursion name retrived");

            // TODO add your handling code here:
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void search1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search1MouseClicked


    }//GEN-LAST:event_search1MouseClicked
    private void ifSeatLessThanZero() throws IOException, ClassNotFoundException {
        Socket s = new Socket("127.0.0.1", 4011);
        ObjectInputStream is = new ObjectInputStream(s.getInputStream());
        ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());

        String msg1[] = new String[]{"add to wait list", number.getText(), new Login().usernamee, ID};
        os.writeObject(msg1);

        String[] message1 = (String[]) is.readObject();
        if (message1[0].equals("Server: Successfully added to waiting list")) {

            JOptionPane.showMessageDialog(null, "Your seat have been successfuly added to the waiting list!");
        } else if (message1[0].equals("Sorry, You already had booked the excursion!")) {
            JOptionPane.showMessageDialog(null, "Sorry " + new Login().usernamee + ", You already have booked the seat for excursion!");
        }

    }

    private void addBookingAsPerAvailability() throws IOException, ClassNotFoundException {

        Socket s = new Socket("127.0.0.1", 4011);

        ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
        ObjectInputStream is = new ObjectInputStream(s.getInputStream());
        String a = (String) searchh.getSelectedItem();
        String b = (String) search1.getSelectedItem();

        String Register[] = new String[]{"book", new Login().usernamee, ID, seatt };
        os.writeObject(Register);

        String[] message = (String[]) is.readObject();

        if (message[0].equals("You had already booked previously")) {
            System.out.println("Server: " + message[0]);
            JOptionPane.showMessageDialog(null, "Sorry " + new Login().usernamee + ", You had already booked previously");
        } else if (message[0].equals("Server: Successfully booked")) {
            //manipulateSeat();
            JOptionPane.showMessageDialog(null, "" + new Login().usernamee + ", Your seat had been successfully addd to the waiting list!");
//                    

        }

    }

    private void manipulateSeat() throws IOException, ClassNotFoundException {
        Socket s = new Socket("127.0.0.1", 4011);
        ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
        ObjectInputStream is = new ObjectInputStream(s.getInputStream());

        String message[] = new String[]{"decrease seat", number.getText(), seatt, ID};
        os.writeObject(message);

        String[] message1 = (String[]) is.readObject();
        if (message1[0].equals("Decreased!")) {
            //JOptionPane.showMessageDialog(null,"decreased");
            checkToAddForWaitList();
        }

    }

    private void checkToAddForWaitList() throws IOException, ClassNotFoundException {

        if (Integer.parseInt(seatt) <= 0) 
        {
            int answer = JOptionPane.showConfirmDialog(null, "Sorry, Current available seat=  " + seatt + "  \n Would you like to be in the waiting list?");
            if (answer == 0) {
                ifSeatLessThanZero();

                             }
        } 
        else if ((Integer.parseInt(seatt) > 0)) 
        {
            int y = Integer.parseInt(seatt) - Integer.parseInt(number.getText());
            if (y < 0) 
            {
                int yy = y * (-1);
                int answer = JOptionPane.showConfirmDialog(null, "Your " + yy + " would be added to the waiting list!");
                if (answer == 0) 
                {
                    addExceedSeatToWaiting(yy);
                }

            } 
            else if (y >= 0) 
            {
                booking();
            }
            //JOptionPane.showMessageDialog(null,"Successfully booked!");
        }

    }

    private void addExceedSeatToWaiting(int incoming) throws IOException, ClassNotFoundException {
        int at = incoming;
        System.out.println(at);
        Socket s = new Socket("127.0.0.1", 4011);
        ObjectInputStream is = new ObjectInputStream(s.getInputStream());
        ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
        String msg1[] = new String[]{"add to wait list", Integer.toString(at), new Login().usernamee, ID};
        os.writeObject(msg1);

        String[] message1 = (String[]) is.readObject();
        if (message1[0].equals("Server: Successfully added to waiting list")) {

            addBookingAsPerAvailability();
            //JOptionPane.showMessageDialog(null, message1[0]);
        } else if (message1[0].equals("Sorry, You already had booked the excursion!")) {
            JOptionPane.showMessageDialog(null, "Sorry " + new Login().usernamee + ", You already have booked the seat for excursion!");
        }

    }

    private void checkSeats() {
        try {

            Socket s = new Socket("127.0.0.1", 4011);
            ObjectInputStream is = new ObjectInputStream(s.getInputStream());
            ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
            String msg[] = new String[]{"retrive Excursion ID and seats", (String) search1.getSelectedItem(), number.getText(), (String) searchh.getSelectedItem(), new Login().usernamee, ID};
            os.writeObject(msg);
            String[] message = (String[]) is.readObject();

            ID = message[0];
            seatt = message[1];
            System.out.println(ID);
            System.out.println(seatt);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    private void booking() {
        try {

            Socket s = new Socket("127.0.0.1", 4011);
            ObjectInputStream is = new ObjectInputStream(s.getInputStream());
            ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
            String a = (String) searchh.getSelectedItem();
            String b = (String) search1.getSelectedItem();

            String Register[] = new String[]{"book", new Login().usernamee, ID, number.getText()};
            os.writeObject(Register);

            String[] message1 = (String[]) is.readObject();

            if (message1[0].equals("You had already booked previously")) {
                System.out.println("Server: " + message1[0]);
                JOptionPane.showMessageDialog(null, "Sorry " + new Login().usernamee + ", You had already booked previously");
            } else if (message1[0].equals("Server: Successfully booked")) {
                System.out.println(message1[0]);
                JOptionPane.showMessageDialog(null, new Login().usernamee + ", You had successfully booked your excursion ");

            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    private void allPortID() {
        try {

            Socket s = new Socket("127.0.0.1", 4011);
            ObjectInputStream is = new ObjectInputStream(s.getInputStream());
            ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
            String Register[] = new String[]{"retrive Port Id"};
            os.writeObject(Register);
            String[] message = (String[]) is.readObject();
            for (int i = 0; i < message.length - 1; i++) {
                searchh.addItem(message[i]);
            }
            System.out.println("Server: Port ID retrived");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    private void searchhFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchhFocusGained
        allPortID();

    }//GEN-LAST:event_searchhFocusGained

    private void numberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_numberMouseClicked

    }//GEN-LAST:event_numberMouseClicked

    private void numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numberKeyReleased
        String pattern = "^[0-9]{1,2}";
        Pattern pat = Pattern.compile(pattern);
        Matcher match = pat.matcher(number.getText());
        if (!match.matches()) {
            set.setText("Invalid number of seat.");
        } else {
            set.setText("");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_numberKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton down;
    private javax.swing.JLabel excursion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField number;
    private javax.swing.JButton portid;
    private javax.swing.JButton requestBook;
    private javax.swing.JComboBox<String> search1;
    private javax.swing.JComboBox<String> searchh;
    private javax.swing.JButton seat;
    private javax.swing.JLabel set;
    // End of variables declaration//GEN-END:variables
}
