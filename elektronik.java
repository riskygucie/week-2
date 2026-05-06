public class elektronik extends Produk {
    private String merek;
    private int garansiTahun;
    private static final double PPN = 0.11;

    public elektronik(String nama, String merek, double harga, int stok, int garansiTahun) {
        super(nama, harga, stok);
        this.merek = merek;
        this.garansiTahun = garansiTahun;

    }

    public String getMerek() {
        return merek;
    }

    public int getGaransiTahun() {
        return garansiTahun;
    }
    
}
