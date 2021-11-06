import java.util.ArrayList;
import java.util.Collections;
public class PatientsRepository implements Repository<Patient>{
    ArrayList<Patient> patients = new ArrayList<Patient>();

    public PatientsRepository() {
        this.patients = new ArrayList<Patient>();
    }

    public PatientsRepository(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public void addObject(Patient pt) {
        if(patients.contains(pt)){
            throw new RuntimeException("Patient already exists!");
        }
        else{
            patients.add(pt);
        }
    }

    @Override
    public void deleteObject(Patient pt) {
        if(patients.contains(pt)){
            patients.remove(pt);
        }
        else{
            throw new RuntimeException("Patient doesn't exist!");
        }
    }

    @Override
    public void sortObject() {
        if(patients.isEmpty()){
            throw new RuntimeException("Repository is empty!");
        }
        Collections.sort(patients);
    }

    @Override
    public void printReport() { //prints the oldest patient
        Patient oldest_patient = new Patient();
        for(int i = 0; i<patients.size();i++){
            if(patients.get(i).getAge() > oldest_patient.getAge()){
                oldest_patient = patients.get(i);
            }
        }
        System.out.println(oldest_patient.toString());
    }

    @Override
    public String toString() {
        String patientsString = "";
        for(int i = 0;i<patients.size();i++){
            patientsString += patients.get(i).toString() + "\n";
        }
        if(patientsString==""){
            return "There are no patients.\n";
        }
        return patientsString;
    }
}
