package Toko;

import base.Produk;

class Pemasukan extends Produk {

    private double totalPemasukan;

    public Pemasukan(String nama, double harga, int stok, String kategori) {
        super(nama, harga, stok, kategori);
        this.totalPemasukan = 0;
    }

    void tambahanPemasukan(int jumlah) {
        if (jumlah <= stok) {
            totalPemasukan += jumlah * harga;
            stok += jumlah;
        } else if (stok == 0) {
            System.out.println("Stock Sedang Tidak Ada");
        } else {
            System.out.println("Stock Tidak Cukup");
        }
    }
}
