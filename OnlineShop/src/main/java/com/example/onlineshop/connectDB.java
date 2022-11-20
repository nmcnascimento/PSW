package com.example.onlineshop;
import java.sql.*;

public class connectDB {
    /* syntax for DB_URL:         jdbc:postgresql://<database_host>:<port>/<database_name> */
    static final String url = "jdbc:postgresql://10.227.240.130:5432/pswt0204";
    static final String user   = "pswt0204";
    static final String password = "#!Pc_db?9";
    //static final String sel_admin  = "SELECT * FROM visitor;";
    static final String show_sp = "SHOW search_path;";
    static final String set_sp = "SET search_path TO pedroecompanhia;";

    public static void main(String[] args) {
        // connect to db
        Connection conn;
        try {
            conn = DriverManager.getConnection(url, user, password);

            // set search path
            try {
                Statement s = conn.createStatement();
                ResultSet r = s.executeQuery(set_sp);
                r.close();
                s.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            // Show search path
            try {
                Statement s = conn.createStatement();
                ResultSet r = s.executeQuery(show_sp);
                while (r.next()){
                    System.out.println(r.getString(1));
                }
                r.close();
                s.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            String nuser = "cust1";
            String npass = "pass1234";
            if(registUser(nuser,npass,conn) == 0){
                System.out.println("Regist done with success!");
                int val = validateLogin(nuser,npass,conn);
                if (val == 0){
                    System.out.println("Login success");
                } else if (val == 1) {
                    System.out.println("Invalid username");
                } else if (val == 2) {
                    System.out.println("Invalid Password");
                }
            }
            else {
                System.out.println("User already exists!");
            }


            //System.out.println("Values: "+values[0]+" "+values[1]);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int validateLogin(String username, String password, Connection connection){
        /*Function returns: 0 in case of valid username and password
                            1 in case of invalid username
                            2 in case of invalid password
         */
        System.out.println("Validate Login");
        String[] values = new String[100];
        if(find_user_in_table(username,connection,values) == 1) {
            System.out.println("User found!");
            System.out.println("Verifying password...");
            if (values[1].equals(password)){
                return 0;
            }
            else {
                return 2;
            }
        }
        else{
            return 1;
        }
    }

    public static int find_user_in_table(String user, Connection connection, String[] values){
        /*
        Function that puts in values the user and password
         */
        System.out.println("Finding "+ user +" in table...");
        String query = "SELECT * FROM visitor WHERE username = '"+user+"';";

        try {
            Statement s = connection.createStatement();
            ResultSet r = s.executeQuery(query);
            ResultSetMetaData rmd = r.getMetaData();
            int columnNumber = rmd.getColumnCount();
            int i = 1;
            //System.out.println("Number of rows:"+columnNumber);
            while (columnNumber != 0) {
                if (i==1){      //
                    r.next();
                    //System.out.println(r.getString(i));
                    //System.out.println(user);
                    if (!(r.getString(i).equals(user))){
                        System.out.println("Why tho?");
                        r.close();
                        s.close();
                        return 0;

                    }
                }
                //System.out.println("while");
                values[i-1] = r.getString(i);
                //System.out.println(r.getString(i));
                i++;
                columnNumber--;

            }
            r.close();
            s.close();
            return 1;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    public static int registUser(String user,
                                  String pass,
                                  Connection connection){
        /*
            Functions returns 0 in case of success
                              1 in case of unsuccess
         */

        String query = "INSERT INTO visitor(username, password) VALUES ('"+user+"','"+pass+"');";

        try {
            System.out.println("Regist new user: "+user);
            System.out.println("Password: "+pass);
            String[] values = new String[100];
            if(find_user_in_table(user,connection,values)==1){
                return 1;
            }
            System.out.println("User not registed aready...begin regist...");
            Statement s = connection.createStatement();
            s.executeUpdate(query);
            s.close();
            return 0;

        }catch (SQLException e){
            System.out.println(e.getMessage());
            return 1;
        }

    }


}
