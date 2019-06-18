public class Proov1{
    public static void main(String[] arg){

        Jook kali = new Jook("Kali", 50, 1);

        Joogipudel jp = new Joogipudel(kali, 1000, Joogipudel.pudelityyp.plast, 50, 10);
		System.out.println();
        System.out.println("* Joogipudel koos joogiga kaalub " + jp.getMass() + " grammi");
		System.out.println();
        System.out.println("* Jook koos taaraga maksab " + jp.getPrice() + " eurot");
		System.out.println();
    }
}
