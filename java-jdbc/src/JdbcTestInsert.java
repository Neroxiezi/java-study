import java.sql.*;

/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 11:27 2019/5/21
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */

public class JdbcTestInsert {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC&characterEncoding=utf-8";
        String user = "root";
        String password = "root";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(url, user, password);
        Statement stmt = conn.createStatement();
        System.out.println(stmt);
        String sql = "INSERT INTO demo1(`id`,`name`,`nickname`,`age`)VALUES(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, 35);
        ps.setString(2, "Wang");
        ps.setString(3, "Ken");
        ps.setInt(4, 20);
        ps.executeUpdate();
        conn.close();


    }
}
