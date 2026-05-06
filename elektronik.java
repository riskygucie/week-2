public class elektronik extends Produk {
    private int garansi;
    public elektronik(String nama, double harga, int stok, String kategori, int garansi){
        super(nama, harga, stok, kategori);
        this.garansi = garansi;        
    } 
    @Override
    public void tampilinfo(){
        super.tampilinfo();
        System.out.println("masa garansi: " + garansi + "hari");
    }
    public void setgaransi(int garansi){
        if (garansi <= 0){
            System.out.println("masa garansi tidak boleh negative");
        }else{
            this.garansi = garansi;
        }
    }

}
