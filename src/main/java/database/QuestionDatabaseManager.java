package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

public class QuestionDatabaseManager extends DatabaseManager {

    public QuestionDatabaseManager() throws SQLException {

    String stq = "SELECT * FROM questions";

    Statement stmt = Objects.requireNonNull(connect()).createStatement();

    ResultSet rs = stmt.executeQuery(stq);

    while (rs.next()) {
        System.out.println(rs.getString(1));
    }

    }
}
