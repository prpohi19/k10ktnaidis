package joogid;

public class Main {


    public static void main(String[] args) {
        Jook siider = new Jook("Siider", 250, 800);
        Jook mahl = new Jook("Mahl", 270, 1100);
        Jook vesi = new Jook("Vesi", 100, 1000);
        Joogipudel siidripurk = new Joogipudel(1000, "plast", 2, 5, siider);
        Joogipudel mahlapakk = new Joogipudel(800, "plast", 3, 0);
        Joogipudel veepudel = new Joogipudel(1400, "plast", 1, 3);

        siidripurk.komplektOmahind();
    }


}
