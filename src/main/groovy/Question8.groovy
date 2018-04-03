class Employee{
    def name
    def age
    def salary

    Employee(name, age, salary) {
        this.name = name
        this.age = age
        this.salary = salary
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name=" + name +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

class Question8{
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>()
        list.add(new Employee("HIMANSHI", 20, 30000))
        list.add(new Employee("POOJA", 21, 300))
        list.add(new Employee("AGRIMA", 21, 30))
        list.add(new Employee("NEHA", 36, 600000))
        list.add(new Employee("VIJAY", 48, 90000))
        list.add(new Employee("SHIVAM", 19, 45000))
        list.add(new Employee("SHUBHAM", 10, 30022))
        list.add(new Employee("GAURAV", 34, 60000))
        list.add(new Employee("NIHARIKA", 32, 80000))
        list.add(new Employee("MANOJ", 35, 26000))

        // list of employees who earn less than 5000
        list.findAll {it.salary<5000}.each {println(it.name)}

        //oldest age
        def max = list.max { it.age }
        println(max)

        //youngest age
        def min = list.min{ it.age }
        println(min)

        //maximun salary
        def maxSalary=list.max {it.salary}
        println(maxSalary)

        //list of names
        list.each {println(it.name)}
    }
}

