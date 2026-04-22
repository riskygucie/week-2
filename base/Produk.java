package base;

public class Produk {
    private String nama;
    String kategori;
    protected double harga;
    public int stok;

    public  Produk (String nama, double harga, int stok, String kategori){
            this.nama = nama;
            this.harga = harga;
            this.stok = stok;
            this.kategori = kategori;
    }
    public void tampilinfo (){
        System.out.println("product     : " + nama);
        System.out.println("Kategori     : " + kategori);
        System.out.println("Harga     : Rp." + harga);
        System.out.println("Stock     : " + stok);
        System.out.println("----------");
    }
    }
