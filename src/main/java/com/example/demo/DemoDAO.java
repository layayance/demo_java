package com.example.demo;

import com.example.demo.models.Axe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DemoDAO {

    String path = "D:\\projets_oc\\demo\\demo\\demo.db";
    String url = "jdbc:sqlite:" + path;  // Connexion JDBC à SQLite
    public List<Axe> listeAxes;

    public void addAxe(List<Axe> listeAxes) {
        // La requête SQL pour insérer des données dans la table Axe
        String sql = "INSERT INTO Axe (id_axe, nom_axe, nom_usage, code_type_axe, lib_type_axe, secteurs) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection con = DriverManager.getConnection(url);
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            for(Axe axe : listeAxes) {
                // Paramètres de la requête
                pstmt.setString(1, axe.getIdAxe());  // 1er paramètre (id_axe)
                pstmt.setString(2, axe.getNomAxe());  // 2e paramètre (nom_axe)
                pstmt.setString(3, axe.getNomUsage());  // 3e paramètre (nom_usage)
                if (axe.getTypeAlertc() != null) {
                    pstmt.setString(4, axe.getTypeAlertc().getCodeTypeAxe());   // nom de la colonne en bdd: code_type_axe
                    pstmt.setString(5, axe.getTypeAlertc().getLibTypeAxe());   // nom de la colonne en bdd: lib_type_axe
                }
                if (axe.getSecteurs() != null) {
                    pstmt.setString(6, axe.getSecteurs().getSecteursGeo());
                }

                // Exécuter la requête d'insertion
                pstmt.executeUpdate();

                // Afficher les résultats
                System.out.println("Données insérées avec succès !!!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}

