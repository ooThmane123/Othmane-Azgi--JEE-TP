package metier;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{

    private IDao dao;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    public MetierImpl() {
    }

    @Override
    public double calcul(){
        double t = dao.getData();
        double res = t*44/Math.cos(t*Math.PI);
        return res;
    }

    public void setDao(IDao dao){
        this.dao = dao;
    }

}
