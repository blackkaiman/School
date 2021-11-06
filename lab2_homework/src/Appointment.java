import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Appointment  implements Comparable<Appointment> {
    Patient consultedPatient;
    Date dateOfAppointment;
    String treatment;
    boolean compensated;

    public Appointment() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1960);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR,12);
        cal.set(Calendar.MINUTE,00);
        Date dateRepresentation = cal.getTime();
        this.consultedPatient = new Patient();
        this.dateOfAppointment = dateRepresentation;
        this.treatment = "unknown";
        compensated = false;
    }

    public Appointment(Patient consultedPatient, Date dateOfAppointment, String treatment, boolean comp){
        this.consultedPatient = consultedPatient;
        this.dateOfAppointment = dateOfAppointment;
        this.treatment = treatment;
        compensated = comp;
    }

    public Patient getConsultedPatient() {

        return consultedPatient;
    }

    public void setConsultedPatient(Patient consultedPatient) {

        this.consultedPatient = consultedPatient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appointment that = (Appointment) o;
        return Objects.equals(consultedPatient, that.consultedPatient) && Objects.equals(dateOfAppointment, that.dateOfAppointment) && Objects.equals(treatment, that.treatment);
    }


    public Date getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(Date dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }


    public boolean isCompensated() {
        return compensated;
    }

    public void setCompensated(boolean compensated) {
        this.compensated = compensated;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "consultedPatient=" + consultedPatient +
                ", dateOfAppointment=" + dateOfAppointment +
                ", treatment='" + treatment + '\'' +
                ", compensated=" + compensated +
                '}';
    }

    @Override
    public int compareTo(Appointment o) {
        if (getDateOfAppointment() == null || o.getDateOfAppointment() == null){
            return 0;
        }
        return getDateOfAppointment().compareTo(o.getDateOfAppointment());
    }
}
