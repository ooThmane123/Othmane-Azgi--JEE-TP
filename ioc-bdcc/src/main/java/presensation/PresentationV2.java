package presensation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassname = scanner.nextLine();
            Class cDao = Class.forName(daoClassname);
            IDao dao=(IDao) cDao.getConstructor().newInstance();

            String metierClassname = scanner.nextLine();
            Class Cmetier = Class.forName(metierClassname);
            IMetier metier=(IMetier) Cmetier.getConstructor(IDao.class).newInstance(dao);

            Method method=Cmetier.getMethod("setDao",IDao.class);

            method.invoke(metier,dao);

            System.out.println("Resultat = "+metier.calcul());
//            System.out.println(metier.calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
