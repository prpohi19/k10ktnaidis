public class Main{
  public static void main(String[] args){
    Jook mountainDew = new Jook("Mountain Dew", 2.1, 2.0);
    Jook cola = new Jook("Coca-Cola", 1.4, 2.0);
    Joogipudel can = new Joogipudel(cola, 500, Joogipudel.Type.ALUMINIUM, 50, 1);
    Joogipudel glassBottle = new Joogipudel(mountainDew, 750, Joogipudel.Type.GLASS, 150, 1);

    System.out.println(can.showMass());
    System.out.println(can.showPrice());
    System.out.println(glassBottle.showMass());
    System.out.println(glassBottle.showPrice());
  }

}
