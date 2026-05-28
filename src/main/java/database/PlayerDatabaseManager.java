package database;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PlayerDatabaseManager {
    //Database Access Object


    public static boolean verifylogin(String username, String password) {

        String loginStatment = "SELECT * FROM player WHERE username = ? AND password = ?";


        try{
            Connection conn = DatabaseManager.connect();

            PreparedStatement statement = conn.prepareStatement(loginStatment);

            statement.setString(1, username);
            statement.setString(2, password);

            ResultSet resultSet = statement.executeQuery();

            return resultSet.next();

        } catch (Exception e){

            e.printStackTrace();
        }

        return false;

    }


    public static boolean CreatePlayer(String username, String password) {

        if(verifylogin(username, password)){
            return false;
        }
        String loginStatment = "INSERT INTO player (username, password) VALUES (?, ?)";


        try{
            Connection connect = DatabaseManager.connect();

            PreparedStatement statement = connect.prepareStatement(loginStatment);

            statement.setString(1, username);
            statement.setString(2, username);

            int row =  statement.executeUpdate();

            if(row > 0){
                System.out.println("Successfully Created Player");
                return true;
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return false;
    }







}
