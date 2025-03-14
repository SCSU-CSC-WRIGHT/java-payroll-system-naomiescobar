public class Manager extends Employee {
    private double bonus;
    public Manager(String name,  int employeeId, String department, double hourlyWage, double hoursWorked, double bonus){
        super(name, employeeId, department, hourlyWage, hoursWorked);
        this.bonus = bonus;
    }
    public String toString(){
        return "Manager{name'"+ getName() + "', employeeId =" + getEmployeeId() + 
        "', department='" + gteDepartment() + "', hourlyWage=" + getHourlyWage() + 
        "', hoursWorked='" + getHoursWorked() + "', bonus='" + bonus + 
        "', weeklySalary" + calculateSalary() +"}";
    }

    public double calculateSalary(){
        double baseSalary = super.calculateSalary();
        return baseSalary + bonus;
    }
}