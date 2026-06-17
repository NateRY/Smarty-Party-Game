package database;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PlayerDatabaseManager {
    //Database Access Object
    static Connection conn = DatabaseManager.connect();




    public static boolean verifylogin(String username, String password) {

        if( username.equals("") || password.equals("") ) {return  false;}



        String loginStatment = "SELECT * FROM player WHERE username = ? AND password = ?";


        try{


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

        if(verifylogin(username, password)){return false;}


        String loginStatment = "INSERT INTO player (username, password) VALUES (?, ?)";


        try{

            PreparedStatement statement = conn.prepareStatement(loginStatment);

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




    public static String getUserAccount(String username, String password) {



        String getUsernameStatment = "SELECT * FROM player WHERE username = ? AND password = ?";

        try{
            PreparedStatement statement = conn.prepareStatement(getUsernameStatment);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();
            if(resultSet.next()){
                return resultSet.getString("username");
            }



        }catch (Exception e){
            e.printStackTrace();
        }

        return  null;
    }




    public static boolean UpdatePlayer(String username, int id) {
        //this function will update Player account at the end of each round

        return false;
    }








}
