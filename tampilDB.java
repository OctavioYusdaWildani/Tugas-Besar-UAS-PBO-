import java.sql.*;

public class tampilDB {
    public tampilDB(){
        try {
            Connection db = DriverManager.getConnection("jdbc:mysql://localhost:3306/buah", "root", "");
            Statement mybu = db.createStatement();
            ResultSet myrs = mybu.executeQuery("select * FROM tb");

            while (myrs.next()) {
                // System.out.println("Membaca database yang ada ya pak:)");
                // System.out.println("*********************************************");
               // System.out.print("    ");
                System.out.print(myrs.getString("   id")+".");
               // System.out.print("    ");
                System.out.print(myrs.getString("   nama"));
               // System.out.print("    ");
                System.out.print(myrs.getInt("  harga"));
                //System.out.println("\n*********************************************");

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}