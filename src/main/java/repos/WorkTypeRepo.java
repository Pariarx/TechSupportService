package repos;

import entityes.Employee;
import entityes.WorkType;

import java.util.ArrayList;
import java.util.List;

public class WorkTypeRepo {

    private List<WorkType> workTypes;

    public WorkTypeRepo() {
        workTypes=new ArrayList<>();
        workTypes.add(new WorkType(Resources.workTypes[0], 150));
        workTypes.add(new WorkType(Resources.workTypes[1], 100));
        workTypes.add(new WorkType(Resources.workTypes[2], 15));
        workTypes.add(new WorkType(Resources.workTypes[3], 20));
        workTypes.add(new WorkType(Resources.workTypes[4], 35));
        workTypes.add(new WorkType(Resources.workTypes[5], 30));
        workTypes.add(new WorkType(Resources.workTypes[6], 30));
        workTypes.add(new WorkType(Resources.workTypes[7], 65));
    }

    public List<WorkType> getWorkTypes() {
        return workTypes;
    }

    public void setWorkTypes(List<WorkType> workTypes) {
        this.workTypes = workTypes;
    }

    @Override
    public String toString() {
        StringBuilder s= new StringBuilder();
        int counter=1;
        for(WorkType workType:workTypes){
            s.append(counter++).append("- ").append(workType);
        }

        return s.toString();
    }
}
