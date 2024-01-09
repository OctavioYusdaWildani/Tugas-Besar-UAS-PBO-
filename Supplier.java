public class Supplier implements iFruity {
    public String nama;
    public String alamat;
    public String nomorTelepon;

    public Supplier(String nama, String alamat, String nomorTelpon){
        this.nama=nama;
        this.alamat=alamat;
        this.nomorTelepon=nomorTelpon;
    }
    @Override
    public void cetakStruk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cetakStruk'");
    }

    
}
