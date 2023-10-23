package Lab.Modul2;

public class Employee implements EmployeeInterface {
    private String employeeName;
    private int employeAge;
    private  double salary;
    private String jobDescription;
    public Employee(Employeeinfo employeeinfo){
        this.employeeName = employeeinfo.employeeName();
        this.employeAge = employeeinfo.employeAge();
        this.salary = employeeinfo.salary();
        this.jobDescription = employeeinfo.jobDescription();
    }
    @Override
    public void EmployeeInfo(){
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Age : " + employeAge);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Description : " + jobDescription);
    }
    @Override
    public double calcutateAnnusualSalary(){
        return salary*12;
    }
    @Override
    public void applyRaise(double raisePercentage){
        salary += (salary + raisePercentage / 100);
    }

    private static record Employeeinfo(String employeeName, int employeAge, double salary, String jobDescription) {
    }
}
