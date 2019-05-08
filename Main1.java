public class Main1{
    public static void main(String[] arg){

        Jook Õunamahl = new Jook("Õunamahl", 1, 1000);
        Jook Sprite = new Jook("Sprite,", 5, 1200);
        // nimi, hind (€), erikaal(g)


        Joogipudel first = new Joogipudel(Õunamahl, 0.5, Pudelityyp.KLAAS, 100, 10);
        Joogipudel second= new Joogipudel(Sprite, 1, Pudelityyp.PLAST, 50, 10);
        // jook, maht(kg), tüüp, mass(g), taara
        System.out.println("Jook koos joogipudeliga kaalub " +first.getMass() + " grammi");
        System.out.println("Joogi hind on " +first.getHind() + " eurot");
        System.out.println();
        System.out.println("jook koos joogipudeliga kaalub " +second.getMass() + " grammi");
        System.out.println("Joogi hind on " +second.getHind() + " eurot");
    }

}
