 class makanan extends Produk {
   private int kadaluarsa;

    public Makanan(String nama, double harga, int stok, int kadaluarsa) {
        super(nama, harga, stok);
        this.kadaluarsa = kadaluarsa;
    }
    @Override
    public double hitungHargaAkhir(int jmlhBeli) {
        System.out.println("Total Harga= " + hitungTotalHarga(jmlhBeli));
        return hitungTotalHarga(jmlhBeli) * 0.95;

    }

@Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Masa Kaduluarsa: " + kadaluarsa + " Hari");
    }
}
