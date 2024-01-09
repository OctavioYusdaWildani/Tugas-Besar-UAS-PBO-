import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Order extends Buah{
    public Integer jumlahBeli;
    public Integer TotalBayar;

    public Order(String nama, String alamat, String nomorTelpon, String namaBuah, Integer harga,Integer jumlahBeli)
     {
        super(nama, alamat, nomorTelpon, namaBuah, harga);
        this.jumlahBeli=jumlahBeli;
        status();
        cetakStruk();
     }

     public void status() {
        if (jumlahBeli > 0) {
            TotalBayar = jumlahBeli * harga +2500 ;
            System.out.println("");
        } else {
            TotalBayar =  jumlahBeli * harga ;
            System.out.println("");
        }
    }

    @Override
    public void cetakStruk() {
        for( int pls =1; pls<=45; pls++){
            System.out.print("+");
        }
        System.out.println("\nINFORMATIKA FRUITY" );
            Date tanggalSekarang = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMMM yyyy");
        String tanggalTerformat = sdf.format(tanggalSekarang);
        System.out.println(" Tanggal      : " + tanggalTerformat);
            Date waktuSekarang = new Date();
            SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
        String waktuTerformat = sdf.format(waktuSekarang);
        System.out.println(" Waktu        : " + sdf2.format(waktuSekarang) + " WIB");
        System.out.println("*********************************************");
        System.out.println(" CASH RECEIPT ");
        System.out.println("*********************************************");
        System.out.println(" Description: ");
        System.out.println(" Nama Buah   : " + namaBuah);
        System.out.println(" Harga Barang  : Rp." + harga);
        System.out.println(" Jumlah Beli   : " + jumlahBeli + " buah");
        System.out.println(" Total Bayar   : Rp." + TotalBayar );
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Thank You");
    }
    
}