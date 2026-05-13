;

public class main {
    public static void main(String[] args) {
        
        Produk p1 = new Elektronik("Samsung", 100000, 5, 2);
        Produk p2 = new Makanan("Bakso", 1000, 100, 3);
        Kasir kasir = new Kasir("Maman");
        
        System.out.println("==== DAFTAR PRODUK ====");
        laptop.tampilinfo(); 
        hp.tampilinfo();     
        indomie.tampilinfo();
        roti.tampilinfo();    

         System.out.println("\n==== RINCIAN PAJAK ELEKTRONIK ====");

        double pajakLaptop = laptop.hitungPajak(1);
        double totalLaptop = laptop.hitungHargaSetelahPajak(1);
        System.out.println("Laptop x1 (PPN standar 11%):");
        System.out.println("Subtotal : Rp" + laptop.hitungTotalHarga(1));
        System.out.println("Pajak    : Rp" + pajakLaptop);
        System.out.println("Total    : Rp" + totalLaptop);

           double pajakHpCustom = hp.hitungPajak(2.5);
        System.out.println("\nHP Samsung x2 (pajak custom 5%):");
        System.out.println("Subtotal : Rp" + hp.hitungTotalHarga(2));
        System.out.println("Pajak    : Rp" + pajakHpCustom);
        System.out.println("Total    : Rp" + (hp.hitungTotalHarga(2) + pajakHpCustom));

         System.out.println("\n==== RINCIAN DISKON MAKANAN ====");

          System.out.println("Indomie x10 (diskon otomatis):");
        System.out.println("Subtotal : Rp" + indomie.hitungTotalHarga(10));
        System.out.println("Diskon   : Rp" + indomie.hitungDiskon(10));
        System.out.println("Total    : Rp" + indomie.hitungHargaSetelahDiskon(10));

        System.out.println("\nRoti x5 (diskon custom 15%):");
        System.out.println("Subtotal : Rp" + roti.hitungTotalHarga(5));
        System.out.println("Diskon   : Rp" + roti.hitungDiskon(5, 15));
        System.out.println("Total    : Rp" + (roti.hitungTotalHarga(5) - roti.hitungDiskon(5, 15)));

        System.out.println("\n==== TRANSAKSI ====");
        laptop.beli(1);
        hp.beli(2);
        indomie.beli(10);
        roti.beli(5);

    }
}
