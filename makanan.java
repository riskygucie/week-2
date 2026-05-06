public class makanan extends Produk {
    private int expired;
    public makanan(String nama, double harga, int stok, String kategori, int expired){
        super(nama, harga, stok, kategori);
        this.expired = expired;        
    } 
    @Override
    public void tampilinfo(){
        super.tampilinfo();
        System.out.println("masa expired: " + expired + "hari");
    }
    public void setexpired(int expired){
        if (expired < 0){
            System.out.println("masa expired tidak boleh negative");

        }else{
            this.expired = expired;
        }
    }

}
