import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String args[]) {

        OfficeController cntrl = new OfficeController();
        cntrl.officePrintPatients();
        Patient p = new Patient();
        cntrl.officeAddPatient(p);
        cntrl.officePrintPatients();
        cntrl.officeRemovePatient(p);
        cntrl.officePrintPatients();
        Patient p1 = new Patient("B","A",123,6);
        Patient p2 = new Patient("D","C",234,10);
        Patient p3 = new Patient("F","E",556,23);
        cntrl.officeAddPatient(p2);
        cntrl.officeAddPatient(p3);
        cntrl.officeAddPatient(p1);
        cntrl.officePrintPatients();
        cntrl.officeSortPatients();
        cntrl.officePrintPatients();
        try{cntrl.officeAddPatient(p1);
        }
        catch (RuntimeException e){
            System.out.println(e.toString());
        }
        Patient p4 = new Patient("X","Y",23,55);
        try{
            cntrl.officeRemovePatient(p4);}
        catch (RuntimeException e){
            System.out.println(e.toString());
        }
        cntrl.officePatientsReport();
        cntrl.officePrintAppointments();
        Appointment ap = new Appointment();
        cntrl.officeAddAppointment(ap);
        cntrl.officePrintAppointments();
        cntrl.officeRemoveAppointment(ap);
        cntrl.officePrintAppointments();

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2021);
        cal.set(Calendar.MONTH, Calendar.APRIL);
        cal.set(Calendar.DAY_OF_MONTH, 2);
        cal.set(Calendar.HOUR,6);
        cal.set(Calendar.MINUTE,35);
        Date dateRepresentation = cal.getTime();

        Appointment ap1 = new Appointment(p1,dateRepresentation, "filling",true);
        cntrl.officeAddAppointment(ap1);

        cal.set(Calendar.DAY_OF_MONTH,5);
        dateRepresentation = cal.getTime();
        Appointment ap2 = new Appointment(p2,dateRepresentation,"root canal",false);
        cntrl.officeAddAppointment(ap2);

        cal.set(Calendar.DAY_OF_MONTH,1);
        dateRepresentation = cal.getTime();
        Appointment ap3 = new Appointment(p3,dateRepresentation,"extraction",true);
        cntrl.officeAddAppointment(ap3);
        cntrl.officeAppointmentsReport();


        cntrl.officeSortAppointments();
        cntrl.officePrintAppointments();

    }
}