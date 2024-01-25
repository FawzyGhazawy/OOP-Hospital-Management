package control;

import model.Doctor;
import model.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.AdmittedIn;
import model.Appointment;
import model.Hospital;
import model.MedicalRecord;

public class DBAccess {

    private Connection connection;
    private Statement statement;

    private SQLException connect() throws SQLException {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "");
            statement = (Statement) connection.createStatement();
        } catch (SQLException e) {
            return e;
        }
        return null;
    }

    private SQLException close() throws SQLException {
        try {
            statement.close();
            connection.close();
            return null;
        } catch (SQLException e) {
            return e;
        }
    }

    public void addPatient(Patient patient) {

        String query = "INSERT INTO patient (ID, FirstName, LastName, PhoneNb, Address) VALUES ("
                + patient.getID()
                + ",'" + patient.getPat_FN() + "','"
                + patient.getPat_LN() + "',"
                + patient.getPat_PhN() + ",'"
                + patient.getPat_Addr() + "');";

        try {
            connect();
            statement.executeUpdate(query);
            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /*public ArrayList<Integer> getallHospID() throws SQLException {
        String query = "select HOSPITAL_ID  from hospitals";
        ArrayList<Integer> IDList = new ArrayList();
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                IDList.add(rs.getInt("HOSPITAL_ID"));
            }
            close();

        } catch (SQLException e) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, e);
        }
        return IDList;
    }*/
    public ArrayList<Integer> getallDocID() throws SQLException {
        String query = "select DOCTOR_ID  from doctor";
        ArrayList<Integer> IDList = new ArrayList();
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                IDList.add(rs.getInt("DOCTOR_ID"));
            }
            close();

        } catch (SQLException e) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, e);
        }
        return IDList;
    }

    public ArrayList<String> getHospbyCity(String city) throws SQLException {
        String query = "select HOSPITAL_Name  from hospitals where City= '" + city + "' ;";
        ArrayList<String> CityList = new ArrayList();
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                CityList.add(rs.getString("HOSPITAL_Name"));
            }
            close();

        } catch (SQLException e) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, e);
        }
        return CityList;
    }

    public ArrayList<Integer> getDrIDfromHospID(int id) throws SQLException {
        String query = "select DOCTOR_ID  from doctor where H_ID = " + id;
        ArrayList<Integer> IDList = new ArrayList();
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                IDList.add(rs.getInt("DOCTOR_ID"));
            }
            close();

        } catch (SQLException e) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, e);
        }
        return IDList;
    }

    public Patient getPatientbyID(String id) {

        String query = "select * from patient where ID=" + id;
        Patient p = null;

        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                p = new Patient(Integer.parseInt(id), rs.getString("FirstName"), rs.getString("LastName"), Integer.parseInt(rs.getString("PhoneNb")), rs.getString("Address"));
            }
            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;

    }

    public Doctor getDoctorbyID(String id) {

        String query = "select * from doctor where DOCTOR_ID=" + id;
        Doctor d = null;

        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                d = new Doctor(Integer.parseInt(id), rs.getString("FirstName_DOCTOR"), rs.getString("LastName_DOCTOR"), rs.getString("Qualification"), rs.getString("ScheduleDoc"), Integer.parseInt(rs.getString("H_ID")));
            }
            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;

    }

    /*public String getPatientIDbyDocID(String id) {
        String query = "select P_ID from appointment where D_ID=" + id + ";";

        String idPat = "";
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                idPat = "" + rs.getInt("P_ID");
            }
            close();

        } catch (SQLException e) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, e);
        }
        return idPat;
    }*/
    public ArrayList<Integer> getPatientIDbyDocID(int id) throws SQLException {
        String query = "select P_ID from appointment where D_ID= " + id+";";
        ArrayList<Integer> IDList = new ArrayList();
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                IDList.add(rs.getInt("P_ID"));
            }
            close();

        } catch (SQLException e) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, e);
        }
        return IDList;
    }
    public ArrayList<Integer> getDoctorIDbyPatientID(int id) throws SQLException {
        String query = "select D_ID from appointment where P_ID= " + id+";";
        ArrayList<Integer> IDList = new ArrayList();
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                IDList.add(rs.getInt("D_ID"));
            }
            close();

        } catch (SQLException e) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, e);
        }
        return IDList;
    }
    

   /* public String getDoctorIDbyPatientID(String id) {
        String query = "SELECT D_ID from appointment where P_ID=" + id + ";";
        String idDoc = "";
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                idDoc = "" + rs.getInt("D_ID");
            }
            close();

        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idDoc;
    }*/

    /* public String getMRIDbyPatientID(String id){
            String query = "SELECT RecordID from medicalrecord where P_ID="+id +";";
            String idMR = "";
            try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                idMR = ""+rs.getInt("RecordID");
            }
            close();
            
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return idMR;
    }*/
    public ArrayList<Integer> getMRIDbyPatientID(int id) throws SQLException {
        String query = "SELECT RecordID from medicalrecord where P_ID=" + id + ";";
        ArrayList<Integer> IDList = new ArrayList();
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                IDList.add(rs.getInt("RecordID"));
            }
            close();

        } catch (SQLException e) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, e);
        }
        return IDList;
    }

    public ArrayList<Integer> getAppIDbyDocID(int id) throws SQLException {
        String query = "SELECT ID from appointment where D_ID=" + id + ";";
        ArrayList<Integer> IDList = new ArrayList();
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                IDList.add(rs.getInt("ID"));
            }
            close();

        } catch (SQLException e) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, e);
        }
        return IDList;
    }

    /*public String getAppIDbyDocID(String id) {
        String query = "select ID from appointment where D_ID=" + id;

        String app_id = "";
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                app_id = "" + rs.getInt("ID");
            }
            close();

        } catch (SQLException e) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, e);
        }
        return app_id;
    }*/

    public void UpdatePatientbyID(Patient p) {
        String query = "UPDATE patient SET FirstName= '"
                + p.getPat_FN()
                + "' , LastName= ' " + p.getPat_LN()
                + "' , PhoneNb = " + p.getPat_PhN()
                + " , Address = ' " + p.getPat_Addr()
                + " ' WHERE ID = " + p.getID() + " ;";
        try {
            connect();
            statement.executeUpdate(query);
            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void UpdateDocotrbyID(Doctor d) {
        String query = "UPDATE doctor SET FirstName_DOCTOR = ' "
                + d.getDoc_FN()
                + " ' , LastName_DOCTOR = ' " + d.getDoc_LN()
                + " ' ,Qualification = ' " + d.getDoc_Qual()
                + " ' , ScheduleDoc = ' " + d.getDoc_Sch()
                + "' , H_ID = " + d.getH_ID()
                + " WHERE DOCTOR_ID= " + d.getDoc_ID() + " ;";
        try {
            connect();
            statement.executeUpdate(query);
            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void DeletePatientbyID(Patient patient) {
        String query = "DELETE FROM `patient` WHERE `ID` =" + patient.getID() + ";";
        try {
            connect();
            statement.executeUpdate(query);
            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void DeleteAppbyID(Appointment app) {
        String query = "DELETE FROM `appointment` WHERE `ID` =  " + app.getId() + ";";
        try {
            connect();
            statement.executeUpdate(query);
            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void AddMR(MedicalRecord mr) {

        String query = "INSERT INTO medicalrecord "
                + "(RecordID, Problem, DateOfExamination, P_ID)  VALUES ("
                + mr.getId() + ", ' "
                + mr.getProblem() + "' , '"
                + mr.getDate() + "' , "
                + mr.getP_id() + ");";
        try {
            connect();
            statement.executeUpdate(query);
            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ArrayList<Integer> getAllHospitalID() {
        ArrayList<Integer> hospID = new ArrayList<>();
        String query = "SELECT HOSPITAL_ID FROM hospitals;";
        try {
            connect();
            ResultSet rs;
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int HOSPITAL_ID = rs.getInt("HOSPITAL_ID");
                hospID.add(HOSPITAL_ID);
            }
            rs.close();
            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hospID;
    }

    public ArrayList<Integer> getAllPatientID() {
        ArrayList<Integer> patID = new ArrayList<>();
        String query = "SELECT ID FROM patient;";
        try {
            connect();
            ResultSet rs;
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int ID = rs.getInt("ID");
                patID.add(ID);
            }
            rs.close();
            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patID;
    }

    public void addDoctor(Doctor doctor) {

        String query = "INSERT INTO doctor (DOCTOR_ID,"
                + " FirstName_DOCTOR, LastName_DOCTOR, Qualification, ScheduleDoc,  H_ID) VALUES ("
                + doctor.getDoc_ID() + ", '" + doctor.getDoc_FN()
                + "' , '" + doctor.getDoc_LN()
                + "' , '" + doctor.getDoc_Qual()
                + "' , '" + doctor.getDoc_Sch() + "' , "
                + doctor.getH_ID() + ");";
        try {
            connect();
            statement.executeUpdate(query);

            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Integer> patSameHospCity(Patient p) {
//SELECT ID FROM patient INNER JOIN hospitals ON ID=patient_id WHERE patient.Address = hospitals.City;
        ArrayList<Integer> patID = new ArrayList<>();
        String query = "SELECT ID FROM patient INNER JOIN hospitals ON ID=patient_id WHERE patient.Address = hospitals.City;";
        try {
            connect();
            ResultSet rs;
            rs = statement.executeQuery(query);
            while (rs.next()) {
                int ID = rs.getInt("ID");
                patID.add(ID);
            }
            rs.close();

            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patID;
    }

    public void addHospital(Hospital hospital) {
        String query1 = "SELECT * FROM hospitals WHERE HOSPITAL_ID = " + hospital.getId() + ";";
        try {
            connect();
            ResultSet rs = statement.executeQuery(query1);
            boolean val = rs.next();
            if (val == false) {
                String query = "INSERT INTO hospitals (HOSPITAL_ID,"
                        + " HOSPITAL_Name, HOSPITAL_Address, City, PATIENT_ID) VALUES ("
                        + hospital.getId() + ", '" + hospital.getName()
                        + "' , " + hospital.getAddress()
                        + " , '" + hospital.getCity()
                        + "' , " + hospital.getPat_id() + ");";
                try {
                    connect();
                    statement.executeUpdate(query);

                    close();
                } catch (SQLException ex) {
                    Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
                }
                DBAccess dba = new DBAccess();
                AdmittedIn ad = new AdmittedIn(hospital.getId(), hospital.getPat_id());
                dba.addhosp(ad);
            } else {
                DBAccess dba = new DBAccess();
                AdmittedIn ad = new AdmittedIn(hospital.getId(), hospital.getPat_id());
                dba.addhosp(ad);
            }
            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*  String query = "INSERT INTO hospitals (HOSPITAL_ID,"
                + " HOSPITAL_Name, HOSPITAL_Address, City, PATIENT_ID) VALUES ("
                + hospital.getId()+ ", '" + hospital.getName()
                + "' , " + hospital.getAddress()
                + " , '" + hospital.getCity()
                + "' , " + hospital.getPat_id() + ");";
        try {
            connect();
            statement.executeUpdate(query);

            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

    public void makeAppointment(Appointment appointment) {

        String query = "INSERT INTO appointment (ID,"
                + " APPOINTMENT_DATE, D_ID, P_ID) VALUES ("
                + appointment.getId() + ", '" + appointment.getDate()
                + "' , " + appointment.getD_id()
                + " , " + appointment.getP_id() + ");";
        try {
            connect();
            statement.executeUpdate(query);

            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int countDoc(String d) throws Exception {
        //SELECT COUNT(*) FROM doctor INNER JOIN hospitals ON hospital_id = h_id where City = 'Koura' 
        String query = "SELECT COUNT(*) FROM doctor INNER JOIN hospitals ON hospital_id = h_id"
                + " where City = '" + d + "';";
        int c = 0;
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                c = rs.getInt(1);
            }
            close();

        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;

    }

    public int countPat(String p) throws Exception {
        //SELECT COUNT(*) FROM admittedin INNER JOIN hospitals ON admittedin.HOSPITAL_ID = hospitals.HOSPITAL_ID WHERE city = 'koura';
        String query = "SELECT COUNT(*) FROM admittedin INNER JOIN hospitals ON "
                + "admittedin.HOSPITAL_ID = hospitals.HOSPITAL_ID WHERE city = '"
                + p + "';";
        int c = 0;
        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                c = rs.getInt(1);
            }
            close();

        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return c;

    }

    public Hospital getHospitalByID(String id) {

        String query = "select * from hospitals where HOSPITAL_ID=" + id;
        Hospital h = null;

        try {
            connect();
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                h = new Hospital(Integer.parseInt(id), rs.getString("HOSPITAL_Name"), Integer.parseInt(rs.getString("HOSPITAL_Address")), rs.getString("City"), Integer.parseInt(rs.getString("Patient_ID")));
            }
            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return h;

    }

    public void addhosp(AdmittedIn in) {
        //INSERT INTO admittedin (ID , HOSPITAL_ID) VALUES (52030655 , 789);
        String query = "INSERT INTO admittedin (ID , HOSPITAL_ID) VALUES ("
                + in.getID() + " , " + in.getHOSPITAL_ID() + ");";
        try {
            connect();
            statement.executeUpdate(query);

            close();
        } catch (SQLException ex) {
            Logger.getLogger(DBAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
