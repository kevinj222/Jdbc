package Ustbatchno3.jdbc;


import java.sql.*;

public class EmployeeTable {
  public static void main(String[] args) {
    // Set up database connection parameters
    String url = "jdbc:mysql://localhost:3306/test2";
    String username = "root";
    String password = "pass@word1";

    try {
      // Create a connection to the database
      Connection conn = DriverManager.getConnection(url, username, password);

      // Create a statement object
//      Statement stmt = conn.createStatement();

   /*   // Execute the CREATE TABLE statement
      String sql = "CREATE TABLE employee ("
                 + "id INT NOT NULL AUTO_INCREMENT,"
                 + "name VARCHAR(255),"
                 + "age INT,"
                 + "department VARCHAR(255),"
                 + "PRIMARY KEY (id)"
                 + ")";
      stmt.executeUpdate(sql);

      // Close the statement and connection objects
      stmt.close();
      conn.close();*/
      java.sql.Statement stmt=(java.sql.Statement) conn.createStatement();
      String Sql="INSERT INTO EMPLOYEE VALUES(101,'MAHNAZ',19,'ali')";
      stmt.executeUpdate(Sql);
      Sql="INSERT INTO EMPLOYEE VALUES(102,'SASI',29,'ABU')";
      stmt.executeUpdate(Sql);
      Sql="INSERT INTO EMPLOYEE VALUES(103,'ZARA',39,'SHEEBA')";
      stmt.executeUpdate(Sql);
      Sql="INSERT INTO EMPLOYEE VALUES(104,'MUSAFIR',69,'VSTAR')";
      stmt.executeUpdate(Sql);
      
      System.out.println("Employee table created successfully!");

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}