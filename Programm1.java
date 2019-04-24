import java.util.ArrayList;

public class Programm1 {
    public static void main(String[] args){
        ArrayList<Joogipudel> pudelid = new ArrayList<>();
        //Jook siirup = new Jook("Siirup", 0.63, 1.12);
        Jook limonaad = new Jook("limonaad", 0.75, 0.88);
        Jook vesi = new Jook("vesi", 0.17, 0.75);
        Jook energiajook = new Jook("energiajook", 1.02, 0.92);
        Joogipudel pudel1 = new Joogipudel(0.75, "klaas", 0.25, 0.10, limonaad);
        Joogipudel pudel2 = new Joogipudel(1.5, "plastik", 0.17, 0.10,
                vesi);
        Joogipudel pudel3 = new Joogipudel(0.25, "purk", 0.07, 0.10,
                energiajook);
        Joogipudel pudel4 = new Joogipudel(0.75, "klaas", 0.25, 0.10, null);
        pudelid.add(new Joogipudel(2.25, "plastik", 0.25, 0.10, null));
        pudelid.add(new Joogipudel(0.75, "klaas", 0.25, 0.10, null));
        pudelid.add(new Joogipudel(5.0, "plastik", 0.55, 0.10, null));
        Joogivaat vaat1 = new Joogivaat(100, limonaad, 30);
        pudelid.add(pudel1);
        pudelid.add(pudel2);
        pudelid.add(pudel3);
        pudelid.add(pudel4);
        vaat1.t2idapudel(pudel4);
        vaat1.t2idaPudelid(pudelid);


    }
}
/*
Pudelisse lisati 0.75 liitrit limonaad
Pudelisse lisati 2.25 liitrit limonaad
Pudelisse lisati 0.75 liitrit limonaad
Pudelisse lisati 5.0 liitrit limonaad
 */