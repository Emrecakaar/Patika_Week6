import java.sql.*;

public class Main {
    public static final String DB_URL = "jdbc:mysql://localhost/root";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        String sql = "SELECT * FROM employees";
        String pstm = "INSERT INTO employees (employee_name, employee_position, employee_salary) VALUES (?,?,?)";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            Statement str = connect.createStatement();
            PreparedStatement prst = connect.prepareStatement(pstm);

            prst.setString(1,"Emre Çakar");
            prst.setString(2,"Chef");
            prst.setString(3,"100000");
            prst.executeUpdate();

            prst.setString(1,"Özgür Ün");
            prst.setString(2,"Emlakçı");
            prst.setString(3,"50000");
            prst.executeUpdate();

            prst.setString(1,"Şahin abi");
            prst.setString(2,"Galerici");
            prst.setString(3,"115000");
            prst.executeUpdate();

            prst.setString(1,"Ganyotçu Arif");
            prst.setString(2,"Şoför");
            prst.setString(3,"25000");
            prst.executeUpdate();

            prst.setString(1,"Recep İvedik");
            prst.setString(2,"Yatırımcı");
            prst.setString(3,"10000");
            prst.executeUpdate();


            ResultSet data = str.executeQuery(sql);
            while (data.next()) {
                System.out.println("##############################################################");
                System.out.println("ID : " + data.getInt("employee_id"));
                System.out.println("ADI : " + data.getString("employee_name"));
                System.out.println("POZİSYONU : " + data.getString("employee_position"));
                System.out.println("MAAŞI : " + data.getInt("employee_salary"));
            }
            prst.close();
            str.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}