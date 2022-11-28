package repos;

import entityes.Employee;
import entityes.Master;

import java.util.ArrayList;
import java.util.List;

public class MasterRepo {

    private List<Master> masters;

    public MasterRepo() {
        masters=new ArrayList<>();
        masters.add(new Master(Resources.fioM[0],true ));
        masters.add(new Master(Resources.fioM[1],false ));
        masters.add(new Master(Resources.fioM[2],true ));
        masters.add(new Master(Resources.fioM[3],false ));
        masters.add(new Master(Resources.fioM[4],true ));
        masters.add(new Master(Resources.fioM[5],true ));
        masters.add(new Master(Resources.fioM[6],false ));
        masters.add(new Master(Resources.fioM[7],false ));
    }

    public List<Master> getMasters() {
        return masters;
    }

    public void setMasters(List<Master> masters) {
        this.masters = masters;
    }
}
