public class kasir {
    private String namaKasir;
    public Kasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }
    public void tampilkIndentitas() {
        System.out.println("===== TOKO GARUDA =====");
        System.out.println("Nama Kasir: " + namaKasir);
    }
}
