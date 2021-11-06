import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class AppointmentsRepository implements Repository<Appointment>{
    ArrayList<Appointment> appointments;


    public AppointmentsRepository() {
        this.appointments = new ArrayList<Appointment>();
    }

    public AppointmentsRepository(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }

    @Override
    public void addObject(Appointment app) {
        if(appointments.contains(app)) {
            throw new RuntimeException("Appointment already exists");
        }
        else{
            appointments.add(app);
        }
    }

    @Override
    public void deleteObject(Appointment app) {
        if(appointments.contains(app)){
            appointments.remove(app);
        }
        else{
            throw new RuntimeException("Appointment doesn't exist");
        }
    }

    @Override
    public void sortObject() {
        Collections.sort(appointments);
    }

    @Override
    public void printReport() { //prints all the patients who have a compensated treatment
        for(int i = 0; i<appointments.size();i++){
            if(appointments.get(i).compensated==true){
                System.out.println(appointments.get(i).toString()+"\n");
            }
        }
    }

    @Override
    public String toString() {
        String appString = "";
        for(int i = 0;i<appointments.size();i++){
            appString += appointments.get(i).toString() + "\n";
        }
        if(appString == ""){
            return "There's no appointments.\n";
        }
        return appString;
    }
}
