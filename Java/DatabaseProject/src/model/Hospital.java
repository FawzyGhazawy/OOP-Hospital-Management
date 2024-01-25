package model;

public class Hospital {

    private String name;
    private int address; // address in mysql = char(1); 
    private int id;
    private String city;
    private int pat_id;

    public Hospital(int id, String name, int address, String city, int pat_id) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
        this.pat_id = pat_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPat_id() {
        return pat_id;
    }

    public void setPat_id(int pat_id) {
        this.pat_id = pat_id;
    }

}
