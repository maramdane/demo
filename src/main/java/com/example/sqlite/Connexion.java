package com.example.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connexion {
    public static void bdConnexion(){
        System.out.println("Connexion à la base de données");
        String url = "JDBC:sqlite::memory:";
        try(Connection conn = DriverManager.getConnection(url); Statement stmt = conn.createStatement();){
            System.out.println("Connexion réussie");
            // connexion à notre base de donnée locale
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}