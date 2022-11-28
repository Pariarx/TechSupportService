package entityes;

import repos.Resources;

public class Employee {

    private String fio;

    private String phoneNumber;

    private boolean status;

    public Employee(String fio, String phoneNumber, boolean status) {
        this.fio = Resources.YELLOW+ fio+Resources.RESET;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        String s = null;
        if(status)
            s= Resources.GREEN+"свободна"+Resources.RESET;
        else
            s= Resources.RED+"занята"+Resources.RESET;
        return String.format("%s, %s\n",fio,s);
    }
}
