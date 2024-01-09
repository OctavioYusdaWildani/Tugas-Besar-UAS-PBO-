import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class removeBuah {
    private static final String URL = "jdbc:mysql://localhost:3306/buah";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void deleteEmployeeById() {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            String sql = "DELETE FROM tb WHERE id = ?";

            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                Scanner rm = new Scanner(System.in);
                System.out.println("----MENGHAPUS DATA BUAH----");
                System.out.print("Masukkan Id Buah Untuk Dihapus:");
                String idobat = rm.next();
                preparedStatement.setString(1, idobat);
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("data buah berhasil dihapus!");
                } else {
                    System.out.println("tidak ditemukan data buah dengan id tersebut.");
                }
        
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}