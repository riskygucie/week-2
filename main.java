;

public class main {
    public static void main(String[] args) {
    Produk p = new Produk("baju", 100000.0 , 6 ,"uniqlo"  );
        System.out.println(p.getnama());

        System.out.println(p.getharga());

        p.setharga(200000);
        System.out.println(p.getharga());

        System.out.println(p.getstok());

        p.setstok(10);
        System.out.println(p.getstok());

        System.out.println(p.getkategori());
        
    }
}
