class elektronik extends Produk {
    private String merek;
    private int garansiTahun;


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
     @Override
    public void tampilinfo() {
        System.out.println("[ELEKTRONIK]");
        System.out.println("Nama     : " + getnama());
        // super.tampilInfo(); 
        System.out.println("Merek    : " + merek);
        System.out.println("Garansi  : " + garansiTahun + " tahun");
        System.out.println("----------");
    }
        public double hitungDiskon(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) * PPN;
    }

    public double hitungDiskon(int jumlahBeli, double persenPajak) {
        return hitungTotalHarga(jumlahBeli) * (persenPajak / 100);
    }
    public double hitungHargaSetelahPajak(int jumlahBeli) {
        return hitungTotalHarga(jumlahBeli) + hitungPajak(jumlahBeli);
    }

    @Override
    public double hitungPajak(double harga) {
        return harga * 0.20;
    }
}


