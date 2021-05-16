package za.ac.cput.untitled1;

public class Employer {

    private String workType;
    private String WorkId;
    private String EmployeeName;
    private String EmployeeSurname;
    private int licenseNumber;

    public Employer() {
    }

    public Employer(String workType, String workId, String EmployeeName, String EmployeeSurname, int licenseNumber) {
        this.workType = workType;
        this.WorkId = workId;
        this.EmployeeName = EmployeeName;
        this.EmployeeSurname=EmployeeSurname;
        this.licenseNumber = licenseNumber;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public void setEmployeeSurname(String employeeSurname) {
        EmployeeSurname = employeeSurname;
    }

    public void setWorkId(String workId) {
        WorkId = workId;
    }

    public void setLicenseNumber(int licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getWorkType() {
        return workType;
    }

    public String getWorkId() {
        return WorkId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public String getEmployeeSurname() {
        return EmployeeSurname;
    }

    public int getLicenseNumber() {
        return licenseNumber;
    }
    @Override
    public String toString() {
        return EmployeeName  + " " +EmployeeSurname  + " " + WorkId + " " + workType + " " +licenseNumber + "\n";
    }
}



