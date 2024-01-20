import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost/root";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        String sql = "SELECT * FROM employees";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement str = connect.createStatement();
            ResultSet data = str.executeQuery(sql);
            while (data.next()) {
                System.out.println("##############################################################");
                System.out.println("ID : " + data.getInt("employee_id"));
                System.out.println("ADI : " + data.getString("employee_name"));
                System.out.println("POZİSYONU : " + data.getString("employee_position"));
                System.out.println("MAAŞI : " + data.getInt("employee_salary"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}