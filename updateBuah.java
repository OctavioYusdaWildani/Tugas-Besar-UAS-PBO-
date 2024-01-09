import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class updateBuah {
    // Driver
    private static final String URL = "jdbc:mysql://localhost:3306/buah";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void updateEmployeeCredentials(Scanner scanner) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "UPDATE tb SET nama = ?, harga = ? WHERE id = ? ";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                System.out.println("----UPDATE DATA BUAH YANG TERSEDIA----");
                System.out.print("ID Buah       :");
                String id = scanner.next();

                System.out.print("Nama Buah     :");
                String nama = scanner.next();

                System.out.print("Harga Buah    :Rp ");
                Integer harga = scanner.nextInt();

                preparedStatement.setString(1, nama); 
                preparedStatement.setInt(2, harga);   
                preparedStatement.setString(3, id);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Data buah berhasil diperbarui!");
                } else {
                    System.out.println("Tidak ditemukan data buah dengan ID tersebut");
                }
            }
        } catch (SQLException e) {
            // e.printStackTrace();
        }
    }
}