package entityes;

public class Master {

    private String fio;

    private boolean status;

    public Master(String fio, boolean status) {
        this.fio = fio;
        this.status = status;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
