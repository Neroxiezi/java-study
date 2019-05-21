import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author: 南丞
 * @Email: lampxiezi@163.com
 * @Date:Created in 14:40 2019/5/21
 * @Description: I don't know why to write like this.
 * .------..------..------.
 * |B.--. ||U.--. ||G.--. |
 * | :(): || (\/) || :/\: |
 * | ()() || :\/: || :\/: |
 * | '--'B|| '--'U|| '--'G|
 * `------'`------'`------'
 */

public class DemoJDBC {
    public static void main(String[] args) throws Exception {
        //加载驱动类
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 通过DriverManager 获取数据库连接
        String url = "jdbc:mysql://127.0.0.1:3306/test?serverTimezone=UTC&characterEncoding=utf-8";
        String user = "root";
        String password = "root";
        Connection connection = (Connection) DriverManager.getConnection(url, user, password);
        // 通过Connection对象获取Statement对象, Statement执行sql语句
        Statement statement = (Statement) connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from demo1");

        // 操作ResultSet结果集
        while (resultSet.next()) {
            // 第一种获取字段方式
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            System.out.println("----");
            // 第二种获取字段的方式
            System.out.println(resultSet.getString("id"));
        }
        // 关闭数据库连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}