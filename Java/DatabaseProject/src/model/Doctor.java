package model;

public class Doctor {

    private int Doc_ID;
    private String Doc_FN;
    private String Doc_LN;
    private String Doc_Qual;
    private String Doc_Sch;
    private int H_ID;

    public Doctor(int Doc_ID, String Doc_FN, String Doc_LN, String Doc_Qual, String Doc_Sch, int H_ID) {
        this.Doc_ID = Doc_ID;
        this.Doc_FN = Doc_FN;
        this.Doc_LN = Doc_LN;
        this.Doc_Qual = Doc_Qual;
        this.Doc_Sch = Doc_Sch;
        this.H_ID = H_ID;
    }

    public int getDoc_ID() {
        return Doc_ID;
    }

    public void setDoc_ID(int Doc_ID) {
        this.Doc_ID = Doc_ID;
    }

    public String getDoc_FN() {
        return Doc_FN;
    }

    public void setDoc_FN(String Doc_FN) {
        this.Doc_FN = Doc_FN;
    }

    public String getDoc_LN() {
        return Doc_LN;
    }

    public void setDoc_LN(String Doc_LN) {
        this.Doc_LN = Doc_LN;
    }

    public String getDoc_Qual() {
        return Doc_Qual;
    }

    public void setDoc_Qual(String Doc_Qual) {
        this.Doc_Qual = Doc_Qual;
    }

    public String getDoc_Sch() {
        return Doc_Sch;
    }

    public void setDoc_Sch(String Doc_Sch) {
        this.Doc_Sch = Doc_Sch;
    }

    public int getH_ID() {
        return H_ID;
    }

    public void setH_ID(int H_ID) {
        this.H_ID = H_ID;
    }

}
