public class Arvutused{
    public static void main(String[] arg){
        Jook coca= new Jook("coca", 90,1);
        Joogipudel kahene = new Joogipudel(coca,2000,Joogipudel.Tyyp.klaas,80,10);

        System.out.println(kahene.pudeliMassJoogiga()+" grammi");
        System.out.println(kahene.omaHind()+" eurot");


    }
}