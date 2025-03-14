public class Employee{
    private String name;
    private int employeeId;
    private String department;
    private double hourlyWage;
    private double hoursWorked;

    public Employee(String name, int employeeId, String department, double hourlyWage, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    public String getDepartament(){
        return department;
    }
    public void setDepartament(String department){
        this.department = department;
    }
    public double getHourlyWage(){
        return hourlyWage;
    }
    public double getHoursWorked(){
        return hoursWorked;
    }

    public double calculateSalary(){
        double weeklySalary = 0;
        if (hoursWorked <= 40) {
            weeklySalary = hourlyWage *hoursWorked;
        } else {
            double overtimeHrs = hoursWorked - 40;
            weeklySalary = (hourlyWage * 40) +(overtimeHrs * hourlyWage * 1.5);
        }
        return weeklySalary;
    }

    public String toString(){
        return "Employee{name '"+ name + "', employeeId =" + employeeId +
        "', department='" + department + "', hourlyWage=" + hourlyWage + 
        "', hoursWorked='" + hoursWorked + "', weeklySalary" + calculateSalary() +"}";
    }

}

