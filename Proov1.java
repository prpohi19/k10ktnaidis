public class Proov1{
    public static void main(String[] arg){
        //MASS: Nimi, hind(sentides), erikaal(kg)
        Jook fanta = new Jook("Fanta", 50, 1);

        //HIND: jook, maht(grammides), tyyp, mass(grammides), taara hind(sentides)
        Joogipudel jp = new Joogipudel(fanta, 500, Joogipudel.pudelityyp.plast, 50, 10);

        System.out.println(jp.getMass() + " grammi");
        System.out.println(jp.getPrice() + " eurot");
    }
}