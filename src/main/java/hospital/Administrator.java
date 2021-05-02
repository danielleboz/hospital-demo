package hospital;

public abstract class Administrator extends HospitalEmployee {

    protected String department;

    public String getDepartment() {
        return department;
    }

    public Administrator(String employeeNumber, String name, String department) {
        super(employeeNumber, name);
        this.department = department;
    }

    public abstract int calculatePay();
}
