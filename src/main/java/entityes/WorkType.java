package entityes;

import repos.Resources;

public class WorkType {

    private String workName;

    private int workTime;

    public WorkType(String workName, int workType) {
        this.workName = Resources.CYAN +workName+Resources.RESET;
        this.workTime = workType;
    }

    public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workType) {
        this.workTime = workType;
    }

    @Override
    public String toString() {
        return workName+"\n";
    }
}
