public class Proov {
    public static void main(String[] args){
        Jook siirup = new Jook("Siirup", 0.63, 1.12);
        Jook limonaad = new Jook("limonaad", 0.75, 0.88);
        Jook vesi = new Jook("vesi", 0.17, 0.75);
        Jook energiajook = new Jook("energiajook", 1.02, 0.92);
        Joogipudel pudel1 = new Joogipudel(0.75, "klaas", 0.25, 0.10, limonaad);
        Joogipudel pudel2 = new Joogipudel(1.5, "plastik", 0.17, 0.10,
                vesi);
        Joogipudel pudel3 = new Joogipudel(0.25, "purk", 0.07, 0.10,
                energiajook);
        Joogipudel pudel4 = new Joogipudel(0.75, "klaas", 0.25, 0.10, null);
        System.out.println(pudel1.leiaMass());
        System.out.println(pudel2.leiaMass());
        System.out.println(pudel3.leiaMass());
        System.out.println(pudel4.leiaMass());
        System.out.println(pudel1.leiaOmahind());
        System.out.println(pudel2.leiaOmahind());
        System.out.println(pudel3.leiaOmahind());
        System.out.println(pudel4.leiaOmahind());
    }
}
/*
0.91
1.295
0.30000000000000004
0.25
0.595
0.29125
0.3346
0.1
 */