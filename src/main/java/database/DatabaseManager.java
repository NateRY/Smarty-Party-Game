package database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseManager {

    private static final String URL = "jdbc:mysql://localhost:3306/smartyparty";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "NajiRtothemoon1@";


    public static Connection connect(){

        try{
            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        catch (Exception e) {e.printStackTrace();}


        return null;

    }







}
