package presensation;

import ext.DaoImpliV2;
import metier.MetierImpl;

public class PresentationV1 {
    public static void main(String[] args){
        DaoImpliV2 d = new DaoImpliV2();
        MetierImpl metier = new MetierImpl(d);
//        metier.setDao(d);
        System.out.println("Resultat : "+metier.calcul());
    }
}
