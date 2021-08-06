package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Util {
    private final static String URL = "jdbc:mysql://localhost:3306/mytest";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "ЩдпфOlga2006///";
    private final static String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnect() {
        Connection connection = null;

        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Соединение с базой данных установлено!");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Неудачная попытка. Попробуйте ещё раз!");
        }
        return connection;
    }
}