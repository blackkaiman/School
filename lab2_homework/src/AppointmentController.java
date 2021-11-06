public class AppointmentController {
    AppointmentsRepository repo;

    public AppointmentController() {
        this.repo = new AppointmentsRepository();
    }

    public AppointmentController(AppointmentsRepository repo) {
        this.repo = repo;
    }

    public AppointmentsRepository getRepo() {
        return repo;
    }

    public void setRepo(AppointmentsRepository repo) {
        this.repo = repo;
    }

    public void cntrlAdd(Appointment app){
        repo.addObject(app);
    }

    public void cntrlRemove(Appointment app){
        repo.deleteObject(app);
    }

    public void cntrlSort(){
        repo.sortObject();
    }
    public void cntrlPrint(){
        System.out.println(repo.toString());
    }
    public void cntrlReport(){repo.printReport();}
}
