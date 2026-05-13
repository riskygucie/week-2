class elektronik extends Produk {
  private int masaGaransi;

    public Elektronik(String nama, double harga, int stok, int masaGaransi) {
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
    }
        @Override
    public double hitungHargaAkhir(int jmlhBeli) {
        System.out.println("Total Harga= " + hitungTotalHarga(jmlhBeli));
        return hitungTotalHarga(jmlhBeli) * 0.85;
    

    }
    }



