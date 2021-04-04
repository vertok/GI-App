//package pack_test;
import java.sql.*;
public class test{
    public static void main(String [] args) 
        {
            String url = "jdbc:postgresql://kdbs2.dom.htw-dresden.de:5432/gis";
            String user = "***";
            String pw = "***#";

            try 
            {
                DriverManager.registerDriver(new org.postgresql.Driver());
            }
            catch (SQLException e) 
            {
                System.out.println("Fehler beim Laden des Treibers");
            }

            //try {	
            Connection dbconn = DriverManager.getConnection(url, user, pw);
            //}
            //catch (SQLException e) {
              //  System.out.println("Fehler: Keine Verbindung zur Datenbank!\nÜberprüfen Sie bitte Ihre Anmeldedaten!");
        }
        }
