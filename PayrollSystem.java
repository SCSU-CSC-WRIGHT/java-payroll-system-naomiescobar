public class PayrollSystem{
    public static void main(String[] args){
        Employee employee1 = new Employee("John Doe", 101, "Engineering", 25.0, 45.0);
        Employee employee2 = new Employee("Jane Smith", 102, "Marketing", 30.0, 40.0);
        Employee employee3 = new Employee("Bob Johnson", 103, "HR", 20.0, 50.0);

        Manager manager1 = new Manager("Alice Brown", 104, "Sales", 40.0, 45.0, 500.0);
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(manager1);
    }
}