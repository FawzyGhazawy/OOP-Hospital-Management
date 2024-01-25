package model;

public class MedicalRecord {

    private String problem;
    private String date;
    private int id;
    private int p_id;

    public MedicalRecord(int id, String problem, String date, int p_id) {
        this.id = id;
        this.p_id = p_id;
        this.date = date;
        this.problem = problem;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getP_id() {
        return p_id;
    }

    public void setP_id(int p_id) {
        this.p_id = p_id;
    }

}
