public class PatientController {
    PatientsRepository repo;

    public PatientController() {
        this.repo = new PatientsRepository();
    }

    public PatientController(PatientsRepository repo) {
        this.repo = repo;
    }

    public PatientsRepository getRepo() {
        return repo;
    }

    public void setRepo(PatientsRepository repo) {
        this.repo = repo;
    }

    public void cntrlAdd(Patient pt){
        repo.addObject(pt);
    }

    public void cntrlRemove(Patient pt){
        repo.deleteObject(pt);
    }

    public void cntrlSort(){
        repo.sortObject();
    }
    public void cntrlReport(){
        repo.printReport();
    }
    public void cntrlPrint(){
        System.out.println(repo.toString());
    }
}
