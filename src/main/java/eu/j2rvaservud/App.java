package eu.j2rvaservud;

import java.util.List;

import eu.j2rvaservud.Joogipudel.Tyyp;

public class App 
{
    public static void main( String[] args )
    {
        Jook jook = new Jook("Coca-cola", 150, 1.042f);
        Joogipudel pudel = new Joogipudel(Tyyp.PLAST, 0.5f, 18.0f, 10);
        Joogivaat joogivaat = new Joogivaat(jook, 10.0f);

        System.out.println("Tühja pudeli kaal: " + pudel.getTotalMass() + " g | hind: " + pudel.getHind()/100.0f + " €");
        System.out.println(String.format("Vaadis on %.2f liitrit jooki.", joogivaat.getKogus()));
        System.out.println("Täidan pudeli...");
        joogivaat.täidaJoogipudel(pudel);
        System.out.println(String.format("Vaadis on %.2f liitrit jooki.", joogivaat.getKogus()));
        System.out.println("Villin ülejäänud joogi pudelitesse...");
        List<Joogipudel> pudelid = joogivaat.villiPudelitesse(new Joogipudel(Tyyp.KLAAS, 0.75f, 22.0f, 10));
        System.out.println(String.format("Vaadis on %.2f liitrit jooki.", joogivaat.getKogus()));

        System.out.println("Täis pudeli kaal: " + pudel.getTotalMass() + " g | hind: " + pudel.getHind()/100.0f + " €");
    }
}
