import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class creatBuah {
    private static final String URL = "jdbc:mysql://localhost:3306/buah";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void insertEmployeeData(Scanner scanNEW) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "INSERT INTO tb (id, nama, harga) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println("----MEMBUAT DATA BUAH BARU----");

                System.out.print("Masukkan ID Buah      :");
                String idobat = scanNEW.next();
                preparedStatement.setString(1, idobat);

                System.out.print("Masukkan Nama Buah    :");
                String usernameValue = scanNEW.next();        
                preparedStatement.setString(2, usernameValue);

                System.out.print("Masukkan Harga Buah   :Rp ");
                String harga = scanNEW.next();
                preparedStatement.setString(3, harga);


                
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Berhasil menambah data buah baru");
                } else {
                    System.out.println("Tidak dapat menambah data buah baru");
                }

                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
