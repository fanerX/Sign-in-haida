package my_data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLdata {
    private final String driver = "com.mysql.jdbc.Driver";
    private final String jdbcUrl = "jdbc:mysql://192.168.1.104:3306/faner?useSSL=false&serverTimezone=UTC";
    private String username = "root";
    private String password = "root";
    private Connection connection = null;

    /**
     * 打开链接
     * */
    public MySQLdata(){
        try{
            //加载数据库驱动
            Class.forName(driver);
            //创建数据库链接,需要三个参数，数据库地址，用户名和密码
            connection = DriverManager.getConnection(jdbcUrl,username,password);
        }catch (Exception e){
            e.printStackTrace();
        }
    }







    /**
     * 关闭链接
    * */
    public void closeConnection(){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
