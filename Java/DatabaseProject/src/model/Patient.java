/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

public class Patient {

    private int Pat_ID;
    private String Pat_FN;
    private String Pat_LN;
    private int Pat_PhN;
    private String Pat_Addr;

    public Patient(int Pat_ID, String Pat_FN, String Pat_LN, int Pat_PhN, String Pat_Addr) {
        this.Pat_ID = Pat_ID;
        this.Pat_FN = Pat_FN;
        this.Pat_LN = Pat_LN;
        this.Pat_PhN = Pat_PhN;
        this.Pat_Addr = Pat_Addr;
    }

    public Patient(int Pat_ID) {
        this.Pat_ID = Pat_ID;
    }

    public Patient(String Pat_addr) {
        this.Pat_Addr = Pat_addr;
    }

    public int getID() {
        return Pat_ID;
    }

    public String getPat_FN() {
        return Pat_FN;
    }

    public String getPat_LN() {
        return Pat_LN;
    }

    public int getPat_PhN() {
        return Pat_PhN;
    }

    public String getPat_Addr() {
        return Pat_Addr;
    }

    public void setID(int ID) {
        this.Pat_ID = ID;
    }

    public void setPat_FN(String Pat_FN) {
        this.Pat_FN = Pat_FN;
    }

    public void setPat_LN(String Pat_LN) {
        this.Pat_LN = Pat_LN;
    }

    public void setPat_PhN(int Pat_PhN) {
        this.Pat_PhN = Pat_PhN;
    }

    public void setPat_Addr(String Pat_Addr) {
        this.Pat_Addr = Pat_Addr;
    }

}
