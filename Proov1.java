public class Proov1{
    public static void main(String[] arg){
        //MASS: Nimi, hind(sentides), erikaal(kg)
        Jook kali = new Jook("Kali", 50, 1);

        //HIND: jook, maht(grammides), tyyp, mass(grammides), taara hind(sentides)
        Joogipudel jp = new Joogipudel(kali, 500, Joogipudel.pudelityyp.plast, 50, 10);
		System.out.println();
        System.out.println("* Joogipudel koos joogiga kaalub " + jp.getMass() + " grammi");
		System.out.println();
        System.out.println("* Jook koos taaraga maksab " + jp.getPrice() + " eurot");
		System.out.println();
    }
} 

/*
output:

* Joogipudel koos joogiga kaalub 550.0 grammi

* Jook koos taaraga maksab 0.35 eurot
*/