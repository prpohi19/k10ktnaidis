
public class Kt{
    public static void main(String[] arg){

        Jook Vesi = new Jook("Vesi", 1, 1000);
        Jook Piim = new Jook("Piim,", 3, 1400);
        // nimi, hind (€), kaal(g)

        Joogipudel first = new Joogipudel(Vesi, 0.5, Pudelityyp.KLAAS, 100, 10);
        Joogipudel second= new Joogipudel(Piim, 1, Pudelityyp.PLAST, 200, 10);
        // jook, maht(kg), tüüp, mass(g), taara
        System.out.println("Esimene jook koos pudeliga kaalub " +first.getMass() + " grammi");
        System.out.println("Joogi hind on " +first.getHind() + " eurot");
        System.out.println();
        System.out.println("Teine jook koos pudeliga kaalub " +second.getMass() + " grammi");
        System.out.println("Joogi hind on " +second.getHind() + " eurot");
    }

}

/*
OUTPUT
Esimene jook koos pudeliga kaalub 600.0 grammi
Joogi hind on 10.5 eurot

Teine jook koos pudeliga kaalub 1600.0 grammi
Joogi hind on 13.0 eurot
*/
