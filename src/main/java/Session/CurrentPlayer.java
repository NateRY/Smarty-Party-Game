package Session;

public class CurrentPlayer{

    private static String currentUserName;
    private static int currentUserID;
    private static String currentUserHighScore;
    private static int currentUserHighRound;
    private static int currentUserHighLevel;


    public CurrentPlayer(){

        CurrentPlayer.currentUserName = "";
        CurrentPlayer.currentUserID = 0;
        CurrentPlayer.currentUserHighScore = "";
        CurrentPlayer.currentUserHighRound = 0;
        CurrentPlayer.currentUserHighLevel = 0;


    }

    public CurrentPlayer(String currentUserName, int currentUserID, String currentUserHighScore,
                         int currentUserHighRound, int currentUserHighLevel)
    {

        setCurrentUserName(currentUserName);
        setCurrentUserID(currentUserID);
        setCurrentUserHighScore(currentUserHighScore);
        setCurrentUserHighRound(currentUserHighRound);
        setCurrentUserHighLevel(currentUserHighLevel);

    }




    public void setCurrentUserName(String currentUserName){
        CurrentPlayer.currentUserName = currentUserName;}

    public void setCurrentUserID(int currentUserID){
        CurrentPlayer.currentUserID = currentUserID;
    }
    public void setCurrentUserHighScore(String currentUserHighScore){
        CurrentPlayer.currentUserHighScore = currentUserHighScore;
    }

    public void setCurrentUserHighRound(int currentUserHighRound){
        CurrentPlayer.currentUserHighRound = currentUserHighRound;
    }

    public void setCurrentUserHighLevel(int currentUserHighLevel){
        CurrentPlayer.currentUserHighLevel = currentUserHighLevel;
    }

    public String getCurrentUserName(){return CurrentPlayer.currentUserName;}
    public int getCurrentUserID(){return CurrentPlayer.currentUserID;}
    public String getCurrentUserHighScore(){return CurrentPlayer.currentUserHighScore;}
    public int getCurrentUserHighRound(){return CurrentPlayer.currentUserHighRound;}
    public int getCurrentUserHighLevel(){return CurrentPlayer.currentUserHighLevel;}





}
