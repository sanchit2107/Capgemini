package com.capgemini.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class MyDBConnection {
private static Connection con;
static {
try {
Class.forName("oracle.jdbc.driver.OracleDriver");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
"cap1","cap1");
} catch (SQLException |ClassNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
public static Connection getConnection(){
return con;
}
}