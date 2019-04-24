import java.util.ArrayList;

public class Joogivaat {
    private double ruumala;
    private Jook sisu;
    private double hetkelJookiSees;
    public Joogivaat(double r, Jook jook, double paljuT2idetud){
        this.ruumala = r;
        this.sisu = jook;
        this.hetkelJookiSees = paljuT2idetud;
    }
    public boolean t2idapudel(Joogipudel j){
        if(j.getSisu() == null && j.getMaht() < this.hetkelJookiSees){
            j.setSisu(this.sisu);
            this.hetkelJookiSees-=j.getMaht();
            System.out.println("Pudelisse lisati "+j.getMaht()+" liitrit "+this.sisu.nimetus);
            return true;
        }
        return false;
    }
    public double t2idaPudelid(ArrayList<Joogipudel> pudel){
        for(Joogipudel j: pudel){
            if(j.getSisu() == null && j.getMaht() < this.hetkelJookiSees){
                j.setSisu(this.sisu);
                this.hetkelJookiSees-=j.getMaht();
                System.out.println("Pudelisse lisati "+j.getMaht()+" liitrit "+this.sisu.nimetus);
            }
        }
        return this.hetkelJookiSees;
    }
}
