public class Proov{
  public static void main(String[] arg){

    Jook fanta = new Jook("Fanta", 1.7, 1.0);
    Joogipudel jp = new Joogipudel(fanta, 1.5, Joogipudel.pudelityyp.plastik, 0.1, 0.1);

    Jook sprite = new Jook("Sprite", 1.0, 0.01);
    Joogipudel jp2 = new Joogipudel(sprite, 0.05, Joogipudel.pudelityyp.klaas, 0.3, 0.10);

    System.out.println("Joogipudel koos joogiga kaalub " + jp.mass() + "kg.\n");
    System.out.println("Joogipudeli omahind on " + jp.omahind() + " €.\n");
    System.out.println("Joogipudel koos joogiga kaalub " + jp2.mass() + "kg.\n");
    System.out.println("Joogipudeli omahind on " + jp2.omahind() + " €.\n");



  }
}
