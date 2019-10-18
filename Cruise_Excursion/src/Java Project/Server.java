

import java.io.*;
import java.net.*;
import java.sql.*;
import java.util.ArrayList;

public class Server {

    static String Booking_ID;

    private void ServerManipulation() throws IOException, ClassNotFoundException, SQLException {
        ServerSocket ss = new ServerSocket(4011);
        System.out.println("Server is Ready");
        System.out.println("Waiting for the client response. \n");

        while (true) {

            Socket s = ss.accept();//accept the request of client 
            ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
            ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
            String[] message = (String[]) ois.readObject();//read the info of user in array format
            String a = message[0];

            if (a.equals("register")) {
                // String Approach []= new String[]{"Server: Register Successfull"};
                // oos.writeObject(Approach);

                try {
                    Connection con = null;
                    PreparedStatement ps = null;
                    
                    //connecting with the database
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");

                    String query = "insert into customers(FirstName,LastName,Username,Email,Password,Cabin_Number)" + "values(?,?,?,?,?,?)";

                    ps = con.prepareStatement(query);
                    ps.setString(1, message[1]);
                    ps.setString(2, message[2]);
                    ps.setString(3, message[3]);
                    ps.setString(4, message[4]);
                    ps.setString(5, message[5]);
                    ps.setString(6, message[6]);
                    ps.executeUpdate();

                    ps.addBatch();
                    System.out.println("Client says " + a);
                    con.close();
                    String Msg[] = new String[]{"Server: Successfully registered"};
                    oos.writeObject(Msg);

                } catch (SQLException e) {
                    String Approach[] = new String[]{"Username/Email already registered!"};
                    oos.writeObject(Approach);

                }
                

            } else if (a.equals("add to wait list")) {
                try {
                    Connection con = null;
                    PreparedStatement ps = null;
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    System.out.println(message[1]);
                    String query = "INSERT INTO `waiting_list`(`Username`,`Excursion_ID`, `Number_of-Seat`,`Status`) VALUES (?,?,?,?)";

                    ps = con.prepareStatement(query);
                    ps.setString(1, message[2]);

                    ps.setString(2, message[3]);
                    ps.setString(3, message[1]);
                    ps.setString(4, "waited");

                    ps.executeUpdate();

                    ps.addBatch();
                    System.out.println("Client says " + a);
                    con.close();
                    String Msg[] = new String[]{"Server: Successfully added to waiting list"};
                    oos.writeObject(Msg);

                } catch (SQLException e) {
                    //String Msg []= new String[]{"Sorry, You already had booked the excursion!"};
                    //oos.writeObject(Msg);
                    e.printStackTrace();
                }

            } else if (a.equals("check login")) {
                try {
                    Connection con = null;
                    PreparedStatement ps = null;
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String name = message[1];
                    String pass = message[2];

                    String query = "select Username, Password from customers where Username=? and Password=? ";
                    ps = con.prepareStatement(query);
                    ps.setString(1, name);
                    ps.setString(2, pass);

                    ResultSet rs = ps.executeQuery();
                    //String user=null;
                    //String passp=null;

                    if (rs.next()) {
                        String user = rs.getString("Username");
                        String passp = rs.getString("Password");
                        if ((user.equals("admin") && name.equals(user))&&passp.equals("admin")&&pass.equals(passp)) {
                            String Msg[] = {"Admin says to login!"};
                            oos.writeObject(Msg);
                            System.out.println(Msg[0]);

                        } else {

                            String Msg[] = {"Valid email and password"};
                            oos.writeObject(Msg);
                            
                        }

                    } else {
                        String Msg[] = {"Invalid email and password"};
                        oos.writeObject(Msg);
                    }
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                    //JOptionPane.showMessageDialog(null,"Sorry, there is faliure in connecting Database!");
                }
            } else if (a.equals("book")) {
                try {
                    Connection con = null;
                    PreparedStatement ps = null;
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");

                    String query = "insert into booking(Username,Excursion_ID,Number_of_Seats,Status)" + "values(?,?,?,?)";

                    ps = con.prepareStatement(query);
                    ps.setString(1, message[1]);
                    ps.setString(2, message[2]);
                    ps.setString(3, message[3]);
                    ps.setString(4, "booked");

                    ps.executeUpdate();
                    ps.addBatch();
                    System.out.println("Client says " + a);
                    con.close();
                    String Approach[] = new String[]{"Server: Successfully booked"};
                    oos.writeObject(Approach);

                } catch (SQLException e) {

                    e.printStackTrace();
//                    String Approach []= new String[]{"You had already booked previously"};
//                    oos.writeObject(Approach);
                }
            } else if (a.equals("retrive Port Id")) {
                try {
                    //select all port id and store in array list
                    ArrayList<String> port = new ArrayList<String>();
                    Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT  DISTINCT `PORT_ID` FROM `excursion`";
                    PreparedStatement ps = con1.prepareStatement(query);

                    ResultSet rs = ps.executeQuery(query);
                    String portId[] = null;

                    while (rs.next()) {
                        String pat = rs.getString("Port_ID");
                        port.add(pat);

                    }
                    port.add("Port Id selected");
                    portId = port.toArray(new String[port.size()]);//changing array ist list into the array
                    oos.writeObject(portId);
                    System.out.println("Client says " + a);
                    con1.close();
                    // for (int i=0; i<port.size();i++)

                    //System.out.println(port.get(i));
                } catch (SQLException e) {

                    e.printStackTrace();
                }
            } else if (a.equals("check if already booked")) {

                try {

                    Connection con = null;
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT  `Username`,`Excursion_ID`,`Status` FROM `booking` WHERE `Username`=? AND `Excursion_ID`=? AND `Status`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[1]);
                    ps.setString(2, message[2]);
                    ps.setString(3, "booked");

                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        String Msg[] = {"Username already booked!"};
                        oos.writeObject(Msg);

                    } else {
                        String Msg[] = {"Username had not book yet!"};
                        oos.writeObject(Msg);
                    }
                    con.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (a.equals("check in wait list")) {
                try {

                    Connection con = null;
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT  `Username`,`Excursion_ID`,`Status` FROM `waiting_list` WHERE `Username`=? AND `Excursion_ID`=? AND `Status`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[1]);
                    ps.setString(2, message[2]);
                    ps.setString(3, "waited");

                    ResultSet rs = ps.executeQuery();

                    if (rs.next()) {
                        String Msg[] = {"Username already exist!"};
                        oos.writeObject(Msg);

                    } else {
                        String Msg[] = {"Username not exist!"};
                        oos.writeObject(Msg);
                    }
                    con.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (a.equals("decrease seat")) {

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                String query2 = "UPDATE `excursion` SET `Available_Seats`=? WHERE `Excursion_ID`=?";
                PreparedStatement pst = con.prepareStatement(query2);
                Integer entered = Integer.valueOf(message[1]);
                Integer total = Integer.valueOf(message[2]);
                Integer available = total - entered;
                pst.setInt(1, available);
                pst.setString(2, message[3]);
                String msg[] = {"Decreased!"};
                oos.writeObject(msg);

                pst.executeUpdate();
                pst.addBatch();
                con.close();

            } else if (a.equals("retrive Excursion ID and seats")) {
                try {
                    ArrayList<String> excursionn = new ArrayList<String>();
                    String a1 = message[1];
                    //System.out.println(a1);

                    Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = ("SELECT `Excursion_ID`  FROM `excursion` WHERE `Name`=?");
                    PreparedStatement psp = con1.prepareStatement(query);
                    psp.setString(1, a1);

                    String excursion[] = null;
                    ResultSet rsp = psp.executeQuery();

                    while (rsp.next()) {
                        String pat = rsp.getString("Excursion_ID");
                        excursionn.add(pat);

                    }
                    excursion = excursionn.toArray(new String[excursionn.size()]);
                    con1.close();
                    Connection con = null;
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query1 = "SELECT  `Available_Seats` FROM `excursion` WHERE `Excursion_ID`=?";
                    PreparedStatement ps = con.prepareStatement(query1);
                    ps.setString(1, excursion[0]);
                    ResultSet rs = ps.executeQuery();
                    int data = 0;
                    int count = 0;
                    while (rs.next()) {
                        data = rs.getInt("Available_Seats");
                    }
                    //System.out.println(data);
                    count = count + 1;

                    String pass[] = {excursion[0], Integer.toString(data)};
                    oos.writeObject(pass);

                } catch (SQLException e) {

                    e.printStackTrace();
                }

            } else if (a.equals("retrive excursion name")) {
                try {
                    String a1 = message[1];
                    
                    System.out.println(a1);
                    ArrayList<String> name = new ArrayList<String>();
                    Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = ("SELECT `Name`  FROM `excursion` WHERE `Port_ID`=?");
                    PreparedStatement ps = con1.prepareStatement(query);
                    ps.setString(1, a1);
                    System.out.println("Client says " + a);

                    ResultSet rs = ps.executeQuery();
                    String excursionn[] = null;

                    while (rs.next()) {
                        String pat = rs.getString("Name");
                        //portId=pat.split("");

                        name.add(pat);
                        //for (int i=0; i<name.size();i++)
                        //System.out.println(name.get(i));

                    }
                    name.add("Excursion name selected");
                    excursionn = name.toArray(new String[name.size()]);
                    oos.writeObject(excursionn);
                    System.out.println("Client says " + a);
                    con1.close();
                    // for (int i=0; i<port.size();i++)

                    //System.out.println(port.get(i));
                } catch (SQLException e) {

                    e.printStackTrace();
                }

            } else if (a.equals("view waiting info")) {
                try {
                    Connection con = null;
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT excursion.Port_ID,excursion.Excursion_ID,excursion.Name,waiting_list.Waiting_Position,waiting_list.Username,waiting_list.`Number_of-Seat`,waiting_list.Date FROM excursion INNER JOIN waiting_list ON excursion.Excursion_ID=waiting_list.Excursion_ID AND waiting_list.Status=?";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, "waited");
                    ResultSet rs = ps.executeQuery();

                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, "waited");
                    ResultSet rst = pst.executeQuery();
                    int count = 0;
                    int col = rs.getMetaData().getColumnCount();
                    System.out.println("Admin says " + a);
                    // System.out.println(col);

                    while (rs.next()) {
                        count = count + 1;
                    }
                    // System.out.println(count);
                    String data[][] = new String[count][col];//store the database result into the 2D array
                    int i = 0;
                    while (rst.next()) {
                        for (int j = 0; j < col; j++) {
                            data[i][j] = rst.getString(j + 1);
                            //System.out.println(data[i][j]);
                            //System.out.println(count);
                        }
                        i++;
                    }

                    oos.writeObject(data);//sending 2D array to the client
                    con.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (a.equals("view booking information")) {
                try {
                    Connection con = null;
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT booking.Booking_ID,booking.Username,excursion.Excursion_ID,excursion.Port_ID,booking.Number_of_Seats,excursion.Name,booking.Date_and_Time FROM booking INNER JOIN excursion ON excursion.Excursion_ID=booking.Excursion_ID AND booking.Status=?";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, "booked");
                    ResultSet rs = ps.executeQuery();
                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, "booked");
                    ResultSet rst = pst.executeQuery();
                    int count = 0;
                    int col = rs.getMetaData().getColumnCount();
                    System.out.println("Admin says " + a);
                    // System.out.println(col);

                    while (rs.next()) {
                        count = count + 1;
                    }
                    // System.out.println(count);
                    String data[][] = new String[count][col];
                    int i = 0;
                    while (rst.next()) {
                        for (int j = 0; j < col; j++) {
                            data[i][j] = rst.getString(j + 1);
                            //System.out.println(data[i][j]);
                            //System.out.println(count);
                        }
                        i++;
                    }

                    oos.writeObject(data);
                    con.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (a.equals("view all information")) {
                try {
                    Connection con = null;
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT `FirstName`,`LastName`,`Username`,`Email`,`Cabin_Number` FROM `customers`";
                    PreparedStatement ps = con.prepareStatement(query);
                    ResultSet rs = ps.executeQuery();
                    PreparedStatement pst = con.prepareStatement(query);
                    ResultSet rst = pst.executeQuery();
                    int count = 0;
                    int col = rs.getMetaData().getColumnCount();
                    // System.out.println(col);

                    while (rs.next()) {
                        count = count + 1;
                    }
                    // System.out.println(count);
                    String data[][] = new String[count][col];
                    int i = 0;
                    while (rst.next()) {
                        for (int j = 0; j < col; j++) {

                            data[i][j] = rst.getString(j + 1);
                            //System.out.println(data[i][j]);
                            //System.out.println(count);
                        }
                        i++;
                    }
                    System.out.println("Admin says " + a);

                    oos.writeObject(data);
                    con.close();

                } catch (SQLException e) {

                    e.printStackTrace();
                }

            } else if (a.equals("show waiting list")) {
                try {

                    String msg = message[1];
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT excursion.Port_ID,excursion.Excursion_ID,excursion.Name,waiting_list.Waiting_Position,waiting_list.Username,waiting_list.`Number_of-Seat`,waiting_list.Date FROM excursion INNER JOIN waiting_list ON excursion.Excursion_ID=waiting_list.Excursion_ID AND `Username`=? AND `Status`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, msg);
                    ps.setString(2, "waited");
                    ResultSet rs = ps.executeQuery();

                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, msg);
                    pst.setString(2, "waited");
                    ResultSet rst = pst.executeQuery();

                    int count = 0;
                    int col = rs.getMetaData().getColumnCount();
                    System.out.println("Client says " + a);
                    // System.out.println(col);

                    while (rs.next()) {
                        count = count + 1;
                    }
                    // System.out.println(count);
                    String data[][] = new String[count][col];
                    int i = 0;
                    while (rst.next()) {
                        for (int j = 0; j < col; j++) {
                            data[i][j] = rst.getString(j + 1);
                            //System.out.println(data[i][j]);
                            //System.out.println(count);
                        }
                        i++;
                    }

                    oos.writeObject(data);
                    con.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (a.equals("show Booking")) {
                try {
                    String msg = message[1];
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT booking.Booking_ID,booking.Username,excursion.Excursion_ID,booking.Number_of_Seats,excursion.Name,booking.Date_and_Time FROM booking INNER JOIN excursion ON excursion.Excursion_ID=booking.Excursion_ID AND Username=? AND booking.Status=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, msg);
                    ps.setString(2, "booked");
                    ResultSet rs = ps.executeQuery();

                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, msg);
                    pst.setString(2, "booked");
                    ResultSet rst = pst.executeQuery();

                    int count = 0;
                    int col = rs.getMetaData().getColumnCount();
                    System.out.println("Client says " + a);
                    // System.out.println(col);

                    while (rs.next()) {
                        count = count + 1;
                    }
                    // System.out.println(count);
                    String data[][] = new String[count][col];
                    int i = 0;
                    while (rst.next()) {
                        for (int j = 0; j < col; j++) {
                            data[i][j] = rst.getString(j + 1);
                            //System.out.println(data[i][j]);
                            //System.out.println(count);
                        }
                        i++;
                    }

                    oos.writeObject(data);
                    con.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (a.equals("cancel waiting by user")) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT  `Available_Seats` FROM `excursion` WHERE `Excursion_ID`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[2]);
                    ResultSet rs = ps.executeQuery();

                    String pat1 = null;
                    while (rs.next()) {

                        pat1 = rs.getString("Available_Seats");
                    }

                    int result = Integer.parseInt(pat1) + Integer.parseInt(message[3]);

                    String query2 = "UPDATE `excursion` SET `Available_Seats`=? WHERE `Excursion_ID`=?";
                    PreparedStatement pstt = con.prepareStatement(query2);
                    pstt.setString(1, Integer.toString(result));
                    pstt.setString(2, message[2]);
                    pstt.executeUpdate();

                    Connection con1 = null;
                    con1 = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query1 = "UPDATE `waiting_list` SET `Status`=? WHERE `Waiting_Position`=?";
                    PreparedStatement pst = con1.prepareStatement(query1);
                    pst.setString(1, "cancelled");
                    pst.setString(2, message[1]);
                    pst.executeUpdate();
                    System.out.println("Client says " + a);
                    pst.addBatch();
                    //System.out.println("It comes here");

                    String msg[] = {"Succesfully booking canceled!"};
                    oos.writeObject(msg);

                } catch (Exception e) {
                    // String msg[]={"You are not in waiting list to cancel!"};
                    // oos.writeObject(msg);
                    e.printStackTrace();
                }
            } else if (a.equals("cancel booking")) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT  `Available_Seats` FROM `excursion` WHERE `Excursion_ID`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[2]);
                    ResultSet rs = ps.executeQuery();

                    String pat1 = null;
                    while (rs.next()) {

                        pat1 = rs.getString("Available_Seats");
                    }

                    int result = Integer.parseInt(pat1) + Integer.parseInt(message[3]);

                    String query2 = "UPDATE `excursion` SET `Available_Seats`=? WHERE `Excursion_ID`=?";
                    PreparedStatement pstt = con.prepareStatement(query2);
                    pstt.setString(1, Integer.toString(result));
                    pstt.setString(2, message[2]);
                    pstt.executeUpdate();

                    String query1 = "UPDATE `booking` SET `Status`=? WHERE `Booking_ID`=?";
                    PreparedStatement pst = con.prepareStatement(query1);
                    pst.setString(1, "cancelled");
                    pst.setString(2, message[1]);
                    pst.executeUpdate();
                    pst.addBatch();
                    con.close();
                    System.out.println("Client says " + a);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (a.equals("update number of seats in waiting list")) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT  `Available_Seats` FROM `excursion` WHERE `Excursion_ID`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[3]);
                    ResultSet rs = ps.executeQuery();

                    String pat1 = null;
                    while (rs.next()) {

                        pat1 = rs.getString("Available_Seats");
                    }

                    int result1 = (Integer.parseInt(message[1]) - Integer.parseInt(message[4])) * -1;
                    int result = Integer.parseInt(pat1) + result1;

                    String query1 = "UPDATE `excursion` SET `Available_Seats`=? WHERE `Excursion_ID`=?";
                    PreparedStatement pst = con.prepareStatement(query1);
                    pst.setString(1, Integer.toString(result));
                    pst.setString(2, message[3]);
                    pst.executeUpdate();

                    String query2 = "UPDATE `waiting_list` SET `Number_of-Seat`=? WHERE `Waiting_Position`=?";

                    PreparedStatement psp = con.prepareStatement(query2);
                    psp.setString(1, message[1]);
                    psp.setString(2, message[2]);

                    psp.executeUpdate();
                    psp.addBatch();
                    con.close();
                    System.out.println("Client says " + a);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (a.equals("update number of seats")) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT  `Available_Seats` FROM `excursion` WHERE `Excursion_ID`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[4]);
                    ResultSet rs = ps.executeQuery();

                    String pat1 = null;
                    while (rs.next()) {

                        pat1 = rs.getString("Available_Seats");
                    }
                    int result = Integer.parseInt(pat1) - Integer.parseInt(message[1]);
                    int result1 = Integer.parseInt(message[5]) - Integer.parseInt(message[1]);
                    int result2 = Integer.parseInt(pat1) + result1;
                    System.out.println(result2);
                    if (result2 < 0) {
                        String pass[] = {"Sorry, there is not enough seat that you want to book for!"};
                        oos.writeObject(pass);

                    } else if (result2 >= 0) {

                        String query1 = "UPDATE `excursion` SET `Available_Seats`=? WHERE `Excursion_ID`=?";
                        PreparedStatement pst = con.prepareStatement(query1);
                        pst.setString(1, Integer.toString(result2));
                        pst.setString(2, message[4]);
                        pst.executeUpdate();

                        String query3 = "UPDATE `booking` SET `Number_of_Seats`=? WHERE `Booking_ID`=?";
                        PreparedStatement pstt = con.prepareStatement(query3);
                        pstt.setString(1, message[1]);
                        pstt.setString(2, message[3]);
                        pstt.executeUpdate();

                        String pass[] = {"Successfully updated!"};
                        oos.writeObject(pass);

                    }

                    System.out.println("Client says " + a);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (a.equals("search username")) {
                try {
                    String msg = message[1];
                    Connection con = null;

                    ArrayList<String> name = new ArrayList<String>();
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT `FirstName`,`LastName`,`Username`,`Email`,`Cabin_Number` FROM `customers` WHERE `Username`=?";

                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, msg);
                    ResultSet rs = ps.executeQuery();
                    System.out.println("Client says " + a);

                    String searched[] = null;
                    while (rs.next()) {
                        String pat1 = rs.getString("FirstName");
                        String pat2 = rs.getString("LastName");
                        String pat3 = rs.getString("Username");
                        String pat4 = rs.getString("Email");
                        String pat5 = rs.getString("Cabin_Number");

                        name.add(pat1);
                        name.add(pat2);
                        name.add(pat3);
                        name.add(pat4);
                        name.add(pat5);
                        //for (int i=0; i<name.size();i++)
                        //System.out.println(name.get(i));

                    }
                    searched = name.toArray(new String[name.size()]);

                    oos.writeObject(searched);
                    con.close();
                    System.out.println("Admin says " + a);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (a.equals("delete record from admin")) {
                try {
                    Connection con = null;
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "DELETE FROM `customers` WHERE `Username`=?";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[1]);
                    ps.executeUpdate();
                    ps.addBatch();
                    System.out.println("Client says " + a);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (a.equals("cancel booking by admin")) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT  `Available_Seats` FROM `excursion` WHERE `Excursion_ID`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[3]);
                    ResultSet rs = ps.executeQuery();

                    String pat1 = null;
                    while (rs.next()) {

                        pat1 = rs.getString("Available_Seats");
                    }

                    int result = Integer.parseInt(pat1) + Integer.parseInt(message[2]);

                    String query2 = "UPDATE `excursion` SET `Available_Seats`=? WHERE `Excursion_ID`=?";
                    PreparedStatement pstt = con.prepareStatement(query2);
                    pstt.setString(1, Integer.toString(result));
                    pstt.setString(2, message[3]);
                    pstt.executeUpdate();

                    String query3 = "UPDATE `booking` SET `Status`=? WHERE `Booking_ID`=?";
                    PreparedStatement pst = con.prepareStatement(query3);
                    pst.setString(1, "cancelled");
                    pst.setString(2, message[1]);
                    pst.executeUpdate();
                    pst.addBatch();
                    con.close();
                    System.out.println("Client says " + a);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (a.equals("cancel waiting by admin")) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT  `Available_Seats` FROM `excursion` WHERE `Excursion_ID`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[2]);
                    ResultSet rs = ps.executeQuery();

                    String pat1 = null;
                    while (rs.next()) {

                        pat1 = rs.getString("Available_Seats");
                    }

                    int result = Integer.parseInt(pat1) + Integer.parseInt(message[3]);

                    String query2 = "UPDATE `excursion` SET `Available_Seats`=? WHERE `Excursion_ID`=?";
                    PreparedStatement pstt = con.prepareStatement(query2);
                    pstt.setString(1, Integer.toString(result));
                    pstt.setString(2, message[2]);
                    pstt.executeUpdate();

                    String query3 = "UPDATE `waiting_list` SET `Status`=? WHERE `Waiting_Position`=?";

                    PreparedStatement pst = con.prepareStatement(query3);
                    pst.setString(1, "cancelled");
                    pst.setString(2, message[1]);
                    pst.executeUpdate();
                    pst.addBatch();
                    con.close();
                    System.out.println("Client says " + a);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (a.equals("updatee waitingg by admin")) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT  `Available_Seats` FROM `excursion` WHERE `Excursion_ID`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[3]);
                    ResultSet rs = ps.executeQuery();

                    String pat1 = null;
                    while (rs.next()) {

                        pat1 = rs.getString("Available_Seats");
                    }

                    int result1 = (Integer.parseInt(message[4]) - Integer.parseInt(message[1]));
                    int result = Integer.parseInt(pat1) + result1;

                    String query1 = "UPDATE `excursion` SET `Available_Seats`=? WHERE `Excursion_ID`=?";
                    PreparedStatement pst = con.prepareStatement(query1);
                    pst.setString(1, Integer.toString(result));
                    pst.setString(2, message[3]);
                    pst.executeUpdate();

                    String query2 = "UPDATE `waiting_list` SET `Waiting_Position`=?,`Number_of-Seat`=? WHERE `Waiting_Position`=?";
                    PreparedStatement psp = con.prepareStatement(query2);
                    psp.setString(1, message[2]);
                    psp.setString(2, message[1]);
                    psp.setString(3, message[2]);

                    psp.executeUpdate();
                    psp.addBatch();
                    con.close();
                    System.out.println("Client says " + a);
                    String Msg[] = {"Successfully updated!"};
                    oos.writeObject(Msg);

                } catch (Exception e) {
//                    String Msg[]={"The assigned waiting rank is already fulfilled!"};
//                    oos.writeObject(Msg);
                    e.printStackTrace();
                }
            } else if (a.equals("update booking by admin")) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT  `Available_Seats` FROM `excursion` WHERE `Excursion_ID`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[4]);
                    ResultSet rs = ps.executeQuery();

                    String pat1 = null;
                    while (rs.next()) {

                        pat1 = rs.getString("Available_Seats");
                    }
                    int result = Integer.parseInt(pat1) - Integer.parseInt(message[3]);
                    int result1 = Integer.parseInt(message[5]) - Integer.parseInt(message[3]);
                    int result2 = Integer.parseInt(pat1) + result1;
                    //System.out.println(result);
                    if (result2 < 0) {
                        System.out.println("the "+result);
                        String pass[] = {"Sorry, there is not enough seat that you want to book for!"};
                        oos.writeObject(pass);

                    } else if (result2 > 0) {

                        String query1 = "UPDATE `excursion` SET `Available_Seats`=? WHERE `Excursion_ID`=?";
                        PreparedStatement pst = con.prepareStatement(query1);
                        pst.setString(1, Integer.toString(result2));
                        pst.setString(2, message[4]);
                        pst.executeUpdate();

                        String query3 = "UPDATE `booking` SET `Excursion_ID`=?,`Number_of_Seats`=? WHERE `Booking_ID`=?";
                        PreparedStatement pstt = con.prepareStatement(query3);
                        pstt.setString(1, message[4]);
                        pstt.setString(2, message[3]);
                        pstt.setString(3, message[1]);
                        pstt.executeUpdate();

                        String pass[] = {"Successfully updated!"};
                        oos.writeObject(pass);

                    }

                    System.out.println("Admin says update booking");

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (a.equals("retrive customer details for editing")) {
                try {
                    String msg = message[1];
                    Connection con = null;

                    ArrayList<String> name = new ArrayList<String>();
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT `FirstName`, `LastName`, `Email`, `Cabin_Number` FROM `customers` WHERE `Username`=?";

                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, msg);
                    ResultSet rs = ps.executeQuery();

                    String searched[] = null;
                    while (rs.next()) {
                        String pat1 = rs.getString("FirstName");
                        String pat2 = rs.getString("LastName");

                        String pat3 = rs.getString("Email");
                        String pat4 = rs.getString("Cabin_Number");

                        name.add(pat1);
                        name.add(pat2);
                        name.add(pat3);
                        name.add(pat4);

                        //for (int i=0; i<name.size();i++)
                        //System.out.println(name.get(i));
                    }
                    System.out.println("searched");
                    searched = name.toArray(new String[name.size()]);
                    oos.writeObject(searched);
                    con.close();
                    System.out.println("Client says " + a);

                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (a.equals("retrive customer details")) {
                try {
                    String msg = message[1];
                    Connection con = null;

                    ArrayList<String> name = new ArrayList<String>();
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT `FirstName`, `LastName`, `Username`, `Email`, `Cabin_Number` FROM `customers` WHERE `Username`=?";

                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, msg);
                    ResultSet rs = ps.executeQuery();

                    String searched[] = null;
                    while (rs.next()) {
                        String pat1 = rs.getString("FirstName");
                        String pat2 = rs.getString("LastName");
                        String pat3 = rs.getString("Username");
                        String pat4 = rs.getString("Email");
                        String pat5 = rs.getString("Cabin_Number");

                        name.add(pat1);
                        name.add(pat2);
                        name.add(pat3);
                        name.add(pat4);
                        name.add(pat5);

                        //for (int i=0; i<name.size();i++)
                        //System.out.println(name.get(i));
                    }
                    System.out.println("searched");
                    searched = name.toArray(new String[name.size()]);
                    oos.writeObject(searched);
                    con.close();
                    System.out.println("Client says " + a);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (a.equals("update data")) {
                try {
                    Connection con = null;
                    con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "UPDATE `customers` SET `FirstName`=?,`LastName`=?,`Email`=?,`Cabin_Number`=? WHERE `Username`=?";

                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[1]);
                    ps.setString(2, message[2]);
                    ps.setString(3, message[4]);
                    ps.setString(4, message[5]);
                    ps.setString(5, message[3]);

                    ps.executeUpdate();
                    ps.addBatch();
                    con.close();
                    System.out.println("Client says " + a);
                    String Approach[] = new String[]{"email changed"};
                    oos.writeObject(Approach);
                } catch (Exception e) {
                    String Approach[] = new String[]{"Email already used"};
                    oos.writeObject(Approach);
                    //e.printStackTrace();

                }
            } else if (a.equals("search waiting")) {
                try {

                    String msg = message[1];
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT excursion.Port_ID,excursion.Excursion_ID,excursion.Name,waiting_list.Waiting_Position,waiting_list.Username,waiting_list.`Number_of-Seat`,waiting_list.Date FROM excursion INNER JOIN waiting_list ON excursion.Excursion_ID=waiting_list.Excursion_ID AND `Username`=? AND `Status`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, msg);
                    ps.setString(2, "waited");
                    ResultSet rs = ps.executeQuery();

                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, msg);
                    pst.setString(2, "waited");
                    ResultSet rst = pst.executeQuery();

                    int count = 0;
                    int col = rs.getMetaData().getColumnCount();
                    System.out.println("Admin says " + a);
                    // System.out.println(col);

                    while (rs.next()) {
                        count = count + 1;
                    }
                    // System.out.println(count);
                    String data[][] = new String[count][col];
                    int i = 0;
                    while (rst.next()) {
                        for (int j = 0; j < col; j++) {
                            data[i][j] = rst.getString(j + 1);
                            //System.out.println(data[i][j]);
                            //System.out.println(count);
                        }
                        i++;
                    }

                    oos.writeObject(data);
                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (a.equals("move waiting to booking")) {
                try {
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT  `Available_Seats` FROM `excursion` WHERE `Excursion_ID`=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, message[2]);
                    ResultSet rs = ps.executeQuery();

                    String pat1 = null;
                    while (rs.next()) {

                        pat1 = rs.getString("Available_Seats");
                    }
                    int result = Integer.parseInt(pat1) - Integer.parseInt(message[3]);
                    System.out.println(result);
                    if (result < 0) {
                        String pass[] = {"Seat is not enough to add in booking!"};
                        oos.writeObject(pass);

                    } else if (result > 0) {

                        String query1 = "UPDATE `excursion` SET `Available_Seats`=? WHERE `Excursion_ID`=?";
                        PreparedStatement pst = con.prepareStatement(query1);
                        pst.setString(1, Integer.toString(result));
                        pst.setString(2, message[2]);
                        pst.executeUpdate();

                        String query3 = "UPDATE `waiting_list` SET `Status`=? WHERE `Waiting_Position`=?";
                        PreparedStatement pstt = con.prepareStatement(query3);
                        pstt.setString(1, "cancelled");
                        pstt.setString(2, message[4]);
                        pstt.executeUpdate();

                        String query2 = "INSERT INTO `booking`( `Username`, `Excursion_ID`, `Number_of_Seats`, `Status`) VALUES (?,?,?,?)";
                        PreparedStatement psp = con.prepareStatement(query2);
                        psp.setString(1, message[1]);
                        psp.setString(2, message[2]);
                        psp.setString(3, message[3]);
                        psp.setString(4, "booked");
                        psp.executeUpdate();

                        String pass[] = {"Successfully moved to the booking!"};
                        oos.writeObject(pass);

                    }
                    //System.out.println(pat1);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (a.equals("search booking")) {
                try {

                    String msg = message[1];
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/cruise_excursion", "root", "");
                    String query = "SELECT booking.Booking_ID,booking.Username,excursion.Excursion_ID,booking.Number_of_Seats,excursion.Name,booking.Date_and_Time FROM booking INNER JOIN excursion ON excursion.Excursion_ID=booking.Excursion_ID AND Username=? AND booking.Status=? ";
                    PreparedStatement ps = con.prepareStatement(query);
                    ps.setString(1, msg);
                    ps.setString(2, "booked");
                    ResultSet rs = ps.executeQuery();

                    PreparedStatement pst = con.prepareStatement(query);
                    pst.setString(1, msg);
                    pst.setString(2, "booked");
                    ResultSet rst = pst.executeQuery();

                    int count = 0;
                    int col = rs.getMetaData().getColumnCount();
                    System.out.println("Admin says " + a);
                    // System.out.println(col);

                    while (rs.next()) {
                        count = count + 1;
                    }
                    // System.out.println(count);
                    String data[][] = new String[count][col];
                    int i = 0;
                    while (rst.next()) {
                        for (int j = 0; j < col; j++) {
                            data[i][j] = rst.getString(j + 1);
                            //System.out.println(data[i][j]);
                            //System.out.println(count);
                        }
                        i++;
                    }

                    oos.writeObject(data);
                    con.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

        }

    }

    public static void main(String[] args) {

        try {
            new Server().ServerManipulation();
        } catch (IOException | ClassNotFoundException | SQLException ex) {
            //Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex
            ex.printStackTrace();
        }

    }

}
