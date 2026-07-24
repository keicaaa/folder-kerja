/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author ACER SWIFT 1
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class Koneksi {

    public static Connection getKoneksi() {

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mahasiswa2",
                    "root",
                    "");

        } catch (Exception e) {
            System.out.println(e);
        }

        return con;
    }

}
