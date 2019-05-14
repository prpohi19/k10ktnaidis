public class main{
    public static void main(String[] arg){
        Jook õlu = new Jook("Õlu", 50, 1);

        Joogipudel jp = new Joogipudel(500, "klaas", 0.5,0.1, õlu);
        System.out.println();
        System.out.println("Tegemist on " + õlu.nimetus + "-ga");
        System.out.println();
        System.out.println("Joogipudel koos joogiga kaalub " + jp.mass + " grammi");
        System.out.println();
        System.out.println("Jooki anum mahutab " + jp.maht + " ml");
        System.out.println();
    }
}