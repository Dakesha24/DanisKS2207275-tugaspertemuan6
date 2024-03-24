package pkg2207275_daniskeysarasaputra_pbo6;

public class Main 
{
    public static void main(String[] args) 
    {
        //untuk segitiga 1 dengan nilai ATS = 1
        Segitiga segitiga1 = new Segitiga();
        System.out.println("== SEGITIGA 1 ==");
        System.out.println("Alas: " + segitiga1.alas );
        System.out.println("Tinggi: " + segitiga1.tinggi );
        System.out.println("Sisi: " + segitiga1.sisi );
        System.out.println("Luas: " + segitiga1.getLuas());
        System.out.println("Keliling: " + segitiga1.getKeliling());

        //untuk segitiga 2
        Segitiga segitiga2 = new Segitiga(30,10, 90);
        System.out.println("\n== SEGITIGA 2 ==");
        System.out.println("Alas: " + segitiga2.alas );
        System.out.println("Tinggi: " + segitiga2.tinggi );
        System.out.println("Sisi: " + segitiga2.sisi );
        System.out.println("Luas: " + segitiga2.getLuas());
        System.out.println("Keliling: " + segitiga2.getKeliling());
        
        //untuk segitiga 3
        Segitiga segitiga3 = new Segitiga(20,30, 60);
        System.out.println("\n== SEGITIGA 3 ==");
        System.out.println("Alas: " + segitiga3.alas );
        System.out.println("Tinggi: " + segitiga3.tinggi );
        System.out.println("Sisi: " + segitiga3.sisi );
        System.out.println("Luas: " + segitiga3.getLuas());
        System.out.println("Keliling: " + segitiga3.getKeliling());
    }
}


