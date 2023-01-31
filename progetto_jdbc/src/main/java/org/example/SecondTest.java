package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SecondTest {

    public static void main(String[] args) {
        String driver = "com.mysql.cj.jdbc.Driver";
        String urlDb="jdbc:mysql://localhost:3306/my_database_example?useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String user = "root";
        String password ="Omega-1089";

        try {
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(urlDb,user,password);
            Statement stm = connection.createStatement();

            String firstUpdate = "update automobile set marca = 'Peugeout', modello = '206' where id=7";
            stm.executeUpdate(firstUpdate);
            String firstDelete = "delete from persona where nome like 'Giovanni'";
            stm.executeUpdate(firstDelete);

            String firstSelectOnPersona = "select * from persona";
            ResultSet rs = stm.executeQuery(firstSelectOnPersona);
            String nome,cognome;

            System.out.println("Tuple presenti nella tabella 'persona' (solo nome e cognome)");
            while (rs.next()){
                nome = rs.getString("nome");
                cognome= rs.getString ("cognome");
                System.out.println("nome = "+nome+" cognome = "+cognome);
            }

            //Funziona
            //JDBC permette di fare le istruzioni DDL
            /*
            String createStudenteTable = "create table studente (id int(20) primary key, nome char(20));";
            stm.executeUpdate(createStudenteTable);
            */

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
