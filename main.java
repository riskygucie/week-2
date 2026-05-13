;

public class main {
    public static void main(String[] args) {
        
        Produk p1 = new elektronik("Samsung", 100000, 5, 2);
        Produk p2 = new makanan("Bakso", 1000, 100, 3);
        Kasir kasir = new Kasir("Maman");

       p1.tampilInfo();
        kasir.tampilkIndentitas();
        kasir.prosesBelanja(p1, 3);

        System.out.println();
        System.out.println();
        p2.tampilInfo();
        kasir.tampilkIndentitas();
        kasir.prosesBelanja(p2, 11);
    }
}
