import java.sql.*;

/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 10:46 2019/5/21
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */

public class JdbcTestSelect {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 加载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        // 获得数据库连接
        String url = "jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC";
        String user = "root";
        String password = "root";
        Connection conn = DriverManager.getConnection(url, user, password);
        // System.out.println(conn);
        // 操作数据库 实现增删改查  查询
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM demo1");
        System.out.println(rs);
        // 得到和处理结果集
        int id,age;
        String name,nickname;
        System.out.println("id\t姓名\t性别\t地址\t");
        while (rs.next()) {
            id = rs.getInt("id");
            name = rs.getString("name");
            nickname = rs.getString("nickname");
            age = rs.getInt("age");
            System.out.println(id + "\t" + name + "\t" + nickname + "\t" + age);
        }

        rs.close();
    }
}
