public class OfficeController {
    PatientController ptCntrl;
    AppointmentController appCntrl;

    public OfficeController() {
        this.ptCntrl = new PatientController();
        this.appCntrl = new AppointmentController();
    }

    public OfficeController(PatientController ptCntrl, AppointmentController appCntrl) {
        this.ptCntrl = ptCntrl;
        this.appCntrl = appCntrl;
    }

    public PatientController getPtCntrl() {
        return ptCntrl;
    }

    public void setPtCntrl(PatientController ptCntrl) {
        this.ptCntrl = ptCntrl;
    }

    public AppointmentController getAppCntrl() {
        return appCntrl;
    }

    public void setAppCntrl(AppointmentController appCntrl) {
        this.appCntrl = appCntrl;
    }

    public void officeAddPatient(Patient pt){
        ptCntrl.cntrlAdd(pt);
    }
    public void officeAddAppointment(Appointment app){
        appCntrl.cntrlAdd(app);
    }
    public void officeRemovePatient(Patient pt){
        ptCntrl.cntrlRemove(pt);
    }
    public void officeRemoveAppointment(Appointment app){
        appCntrl.cntrlRemove(app);
    }
    public void officeSortPatients(){
        ptCntrl.cntrlSort();
    }
    public  void officeSortAppointments(){
        appCntrl.cntrlSort();
    }
    public void officePrintAppointments(){
        appCntrl.cntrlPrint();
    }
    public void officePrintPatients(){
        ptCntrl.cntrlPrint();
    }
    public void officePatientsReport(){
        ptCntrl.cntrlReport();
    }
    public void officeAppointmentsReport(){
        appCntrl.cntrlReport();
    }
}

