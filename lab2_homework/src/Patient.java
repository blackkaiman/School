import java.util.Objects;

public class Patient implements Comparable<Patient>{
    String fName;
    String lName;
    int ssn;
    int age;

    public Patient() {
        this.fName = "unknown";
        this.lName = "unknown";
        this.ssn = -1;
        this.age = -1;
    }

    public Patient(String fName, String lName, int ssn,int age) {
        this.fName = fName;
        this.lName = lName;
        this.ssn = ssn;
        this.age = age;
    }

    public String getfName() {

        return fName;
    }

    public void setfName(String fName) {

        this.fName = fName;
    }

    public String getlName() {

        return lName;
    }

    public void setlName(String lName) {

        this.lName = lName;
    }

    public int getSsn() {

        return ssn;
    }

    public void setSsn(int ssn) {

        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", ssn=" + ssn +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Patient o) {
        if(this.getlName().compareTo(o.getlName()) > 0){
            return 1;
        }
        if(this.getlName().compareTo(o.getlName()) == 0){
            return 0;
        }
        if(this.getlName().compareTo(o.getlName()) < 0){
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return ssn == patient.ssn && age == patient.age && Objects.equals(fName, patient.fName) && Objects.equals(lName, patient.lName);
    }


}
