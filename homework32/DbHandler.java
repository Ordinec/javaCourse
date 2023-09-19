package homework32;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DbHandler {
    private static Connection connection;
    private static PreparedStatement statement;
    private static String DB_NAME = "test_schema";
    private static final String dbUrl = "jdbc:mysql://localhost:3306/";

    private static Connection getConnection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbUrl, "root", "password");
            if (conn == null) {
                throw new SQLException("Error reading DB");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static List<Student> selectStudent(String name) throws SQLException {
        List<Student> students = new LinkedList<>();
        connection = getConnection();
        ResultSet resultSet = connection.prepareStatement("SELECT COUNT(*) FROM " + DB_NAME + ".student WHERE " +
        "firstName = '" + name + "' OR lastName = '" + name + "'").executeQuery();
        resultSet.next();
        int count = resultSet.getInt("COUNT(*)");
        String sql = "SELECT * FROM " + DB_NAME + ".student WHERE firstName = '" + name + "' OR lastName = '" +
                name + "'";
        ResultSet resultSet2 = connection.prepareStatement(sql).executeQuery();
        try {
            for (int i = 0; i < count; i++) {
                resultSet2.next();
                students.add(new Student(resultSet2.getString("firstName"),
                        resultSet2.getString("lastName"),
                        resultSet2.getString("group")));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        closeStatement();
        closeConnection();
        return students;
    }

    public static void storeStudent(Student student) throws SQLException {
        connection = getConnection();
        PreparedStatement statement;
        ResultSet idSet = connection.prepareStatement("SELECT * FROM " + DB_NAME +
                ".student ORDER BY ID DESC LIMIT 1").executeQuery();
        idSet.next();
        int id = idSet.getInt("id");
        String sql = "INSERT INTO " + DB_NAME + ".student " +
            " VALUES (" + (id + 1)  + ", '" + student.getFirstName() + "', '" + student.getLastName() + "', '" +
                student.getGroup() + "')";
        statement = connection.prepareStatement(sql);
        statement.executeUpdate();
        closeStatement();
        closeConnection();
    }

    private static void closeStatement(){
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
