package model;

public class Appointment {

    private int id;
    private String date;
    private int d_id;
    private int p_id;

    public Appointment(int id, String date, int d_id, int p_id) {
        this.id = id;
        this.date = date;
        this.d_id = d_id;
        this.p_id = p_id;
    }

    public Appointment(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }
}
