import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        boolean pilihan1 = true;

      
         //create
         Scanner scanNEW = new Scanner(System.in);
         creatBuah.insertEmployeeData(scanNEW);
         System.out.println("");
 
         //update
         Scanner scanner = new Scanner(System.in);
         updateBuah.updateEmployeeCredentials(scanner);
         System.out.println("");
 
         //rm
         removeBuah.deleteEmployeeById();
         System.out.println("");
         
        //read
        tampilDB liat = new tampilDB();


        try {
            Scanner input = new Scanner(System.in);
            ArrayList<Order> orders = new ArrayList<>(); // ArrayList untuk menyimpan pesanan

            do {
                System.out.println("Pilih Metode Pemesanan:");
                System.out.println("\n1. Tersedia");
                System.out.println("2. PreOrder");
                System.out.print("Pilihan Anda: ");

                int pilihan = input.nextInt();
                if (pilihan == 1 || pilihan == 2) {
                    System.out.println("Anda memilih metode pemesanan yang " + (pilihan == 1 ? "tersedia." : "PreOrder."));
                    Scanner bu = new Scanner(System.in);
                    System.out.print("Nama Pelanggan: ");
                    String Nama = bu.nextLine();
                    System.out.print("Alamat: ");
                    String Alamat = bu.nextLine();
                    System.out.print("No TLP: ");
                    String tlp = bu.nextLine();
                    System.out.print("Nama Buah: ");
                    String NamaBuah = bu.nextLine();
                    System.out.print("Harga Buah: ");
                    Integer HargaBuah = bu.nextInt();
                    System.out.print("Jumlah Beli: ");
                    Integer JumlahBeli = bu.nextInt();
                    bu.nextLine(); // membersihkan newline character

                    Order newOrder = new Order(Nama, Alamat, tlp, NamaBuah, HargaBuah, JumlahBeli);
                    orders.add(newOrder); // Menambah pesanan ke ArrayList

                    newOrder.status();
                    //newOrder.cetakStruk();

                    pilihan1 = false;

                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan1);

            // Menampilkan semua pesanan yang telah dibuat
            System.out.println("\nDaftar Pesanan:");
            for (Order order : orders) {
                System.out.println("Nama Pelanggan: " + order.nama);
                System.out.println("Nama Buah: " + order.namaBuah);
                System.out.println("Jumlah Beli: " + order.jumlahBeli);
                System.out.println("Total Bayar: Rp." + order.TotalBayar);
                System.out.println("------------------------------");
            }

        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid. Silahkan coba lagi.");
        }
    }
}
