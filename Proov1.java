public class Proov1 {
  public static void main(String[] args) {
    Jook coca = new Jook("Coca" ,1.50f ,1.042f);
    Joogipudel cocapudel = new Joogipudel(Joogipudel.Tyyp.PLAST, 0.5f, 18, 0.10f);
    Joogivaat vaat = new Joogivaat(10.0f, 10.0f , coca);

    System.out.println("Tühja pudeli hind on "+ cocapudel.getPrice()+ " euro");
    cocapudel.jook = coca;
    System.out.println("Täis pudeli hind on "+ cocapudel.getPrice()+ " euro");
    System.out.println("Joogi kogus vaadis on "+ vaat.kogus);
    System.out.println("Tädian pudeli vaadist..");
    vaat.t2itmine(cocapudel);
    System.out.println("Uus joogi kogus vaadis on "+vaat.kogus);
  }
}
