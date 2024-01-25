package model;

public class AdmittedIn {

    private int HOSPITAL_ID;
    private int ID;

    public AdmittedIn(int HOSPITAL_ID, int ID) {
        this.HOSPITAL_ID = HOSPITAL_ID;
        this.ID = ID;
    }

    public int getHOSPITAL_ID() {
        return HOSPITAL_ID;
    }

    public void setHOSPITAL_ID(int HOSPITAL_ID) {
        this.HOSPITAL_ID = HOSPITAL_ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

}
