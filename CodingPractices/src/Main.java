public class Main {
    public static final int MAX_EMPLOYABLE_PERSONS = 10;
    public static void main(String[] args)
    {
        EmployeeManager employeeManager = new EmployeeManager();
        Person p = new Person("Example Exemplos","Home",10);
        if (employeeManager.hirePerson(p))
        {
            System.out.println("The person is hired! This is impossible!");
        }
        else
        {
            System.out.println("The person is not hired.");
        }
    }
}
