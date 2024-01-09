public class Buah extends Supplier{
    public String namaBuah;
    public Integer harga;

    public Buah(String nama, String alamat, String nomorTelpon, String namaBuah, Integer harga) {
        super(nama, alamat, nomorTelpon);
        this.namaBuah=namaBuah;
        this.harga=harga;
    }



    @Override
    public void cetakStruk() {
        
    }
    
}