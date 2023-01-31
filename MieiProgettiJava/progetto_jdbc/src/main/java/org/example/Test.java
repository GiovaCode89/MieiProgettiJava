package org.example;

import java.sql.*;

public class Test {

    public static void main(String[] args) {
        String driverName= "com.mysql.cj.jdbc.Driver";
        String dbUrl="jdbc:mysql://localhost:3306/my_database_example?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user="root";
        String password="Omega-1089";

        try {
            Class.forName(driverName);
            Connection connection = DriverManager.getConnection(dbUrl, user, password);
            Statement statement = connection.createStatement();

            ResultSet rs= statement.executeQuery("select * from persona");

            while( rs.next() )
            {
                Integer id = rs.getInt("id");
                String nome = rs.getString("nome");
                String cognome = rs.getString("cognome");
                System.out.println("Id: " + id + " - nome: " + nome + " - cognome: " + cognome);
            }


        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }



}
