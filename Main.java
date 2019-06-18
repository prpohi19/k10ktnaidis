public class Main{
  public static void main(String[] args) {
    Jook nestea = new Jook("Nestea", 120, 330);// nimi, hind, kaal
    Joogipudel pudelka = new Joogipudel(Joogipudel.pudelityyp.plast, nestea, 330, 20, 10);
    System.out.println("Joogipudel koos joogiga kaalub " + pudelka.getMass() + "kg");

    System.out.println("\nJoogipudeli omahind on " + Math.floor(pudelka.getOmahind() * 100)/100 + "€");
  }
}
