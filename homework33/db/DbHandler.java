package homework33.db;

import homework33.diary.Note;

import java.sql.*;

public class DbHandler {
    private static Connection connection;
    private static String DB_NAME = "Diary";
    private static final String dbUrl = "jdbc:sqlite:homework33/db/Diary.sqlite3";

    private static Connection getConnection(){
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(dbUrl);
            if (conn == null) {
                throw new SQLException("Error reading DB");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static int getNextAvailableId(){
        connection = getConnection();
        int result = 0;
        ResultSet resultSet;
        try {
            resultSet = connection.prepareStatement("SELECT count(1) FROM " + DB_NAME + ".Notes")
                    .executeQuery();
            if (resultSet.next()) {
                result = resultSet.getInt(1);
                resultSet.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result + 1;
    }

    public static void addNoteRecord(Note note){
        connection = getConnection();
        int id = getNextAvailableId();
        try {
           connection.prepareStatement("INSERT INTO " + DB_NAME + ".Notes " +
                    " VALUES (" + id  + ", '" + note.getAuthor() + "', '" + note.getValue() + "', '" +
                    note.getAddedAt() + "', '" + note.getUpdatedAt() + "')").executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();
    }

    public static void removeNoteRecord(int id){
        connection = getConnection();
        PreparedStatement statement;
        try {
        connection.prepareStatement("DELETE FROM " + DB_NAME + ".Notes WHERE Id='" + id + "'").executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();
    }

    public static void removeNoteRecord(String noteValue){
        connection = getConnection();
        PreparedStatement statement;
        try {
            connection.prepareStatement("DELETE FROM " + DB_NAME + ".Notes WHERE Text='" + noteValue + "'")
                    .executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();
    }

    public static void updateNoteRecord(int id, String noteValue){
        connection = getConnection();
        PreparedStatement statement;
        try {
        connection.prepareStatement("UPDATE " + DB_NAME +
                ".Notes SET Text='" + noteValue + "' WHERE Id=" + id).executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();
    }

    public static void updateNoteRecord(String oldValue, String newValue){
        connection = getConnection();
        PreparedStatement statement;
        try {
            connection.prepareStatement("UPDATE " + DB_NAME +
                    ".Notes SET Text='" + newValue + "' WHERE Text=" + oldValue).executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        closeConnection();
    }

    private static void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
