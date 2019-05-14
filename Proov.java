public class Proov{
  public static void main(String[] arg){

    Jook sprite = new Jook("Sprite", 160, 1000.0); //nimetus, joogi hind sentides, joogi kaal grammides
    Joogipudel jp = new Joogipudel(sprite, 1500.0, Joogipudel.pudelityyp.klaas, 20.0, 20.0); //nimetus, maht ml,tyyp, mass g, maksumus s

    Joogivaat jv = new Joogivaat(10000, 9740, jp);//ruumala ml, kogus ml, Joogipudel pudel

    JoogipudeliteKast jk = new JoogipudeliteKast(110.0, 300.0, 20.0, jp, jv);//kastiHind s, double kastiMass g, pesade arv

    System.out.println("\nJoogipudel koos joogiga kaalub " + jp.mass() + "kg.\n");
    System.out.println("Joogipudeli omahind on " + jp.omahind() + " €.\n");

    System.out.println("Joogivaadis on " + jv.t2ida() + " liitrit jooki.\n");
    System.out.println("Joogivaat täidab " + jv.villi() + " pudelit.\n");

    System.out.println("Joogipudelite kasti mass koos pudelitega: " + jk.massKokku() + "kg.\n");
    System.out.println("Kasti ja pudelite omahind kokku on " + jk.omahindKokku() + "€.\n");




  }
}
