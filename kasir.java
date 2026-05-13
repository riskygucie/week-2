public class kasir {
    private String namaKasir;
    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }
    public void tampilkIndentitas() {
        System.out.println("===== TOKO GARUDA =====");
        System.out.println("Nama Kasir: " + namaKasir);
    }
    public void prosesBelanja(Produk p, int jmlhBeli) {

        if (p.getStok() < jmlhBeli) {
            System.out.println("Out of stok");
        }
        {
            double hargaAkhir = p.hitungHargaAkhir(jmlhBeli);
            System.out.println("Harga Akhir = " + hargaAkhir);
            p.setStok(jmlhBeli);
        }

        System.out.println("Stok terbaru= " + p.getStok());

    }
}
