package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpliV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double t=1100;
        return t;
    }
}
