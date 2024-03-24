package pkg2207275_daniskeysarasaputra_pbo6;

/*
Danis Keysara Saputra (2207275)
*/

public class Segitiga 
{
    double alas;
    double tinggi;
    double sisi;
    
    //konstruktor yg memberi nilai ATS = 1
    public Segitiga() 
    {
        alas = 1;
        tinggi = 1;
        sisi = 1;
    }

    //konstruktor dengan nilai radius spesifik
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) 
    {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }

    //mengembalikan nilai luas segitiga
    public double getLuas() 
    {
        return (alas*tinggi)/2;
    }

    //mengembalikan nilai keliling segitiga
    public double getKeliling() 
    {
        return alas+tinggi+sisi;
    }

    //mengatur nilai alas
    public void setAlas(double alasBaru) 
    {
        this.alas = alasBaru;
    }

    //mengatur nilai tinggi
    public void setTinggi(double tinggiBaru) 
    {
        this.tinggi = tinggiBaru;
    }

    //mengatur nilai sisi
    public void setSisi(double sisiBaru) 
    {
        this.sisi = sisiBaru;
    }
}
