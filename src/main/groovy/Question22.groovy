class Employee1 {
    String name
    int age
    String departmentName
    int employeeNumber
    int salary

    Employee1(String name, int age, String departmentName, int employeeNumber, int salary) {
        this.name = name
        this.age = age
        this.departmentName = departmentName
        this.employeeNumber = employeeNumber
        this.salary = salary
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", departmentName='" + departmentName + '\'' +
                ", employeeNumber=" + employeeNumber +
                ", salary=" + salary +
                '}';
    }


    static void main(String[] args) {
        Employee1 employee1 = new Employee1("Employee1", 20, "cse", 1, 3000)
        Employee1 employee11 = new Employee1("Employee2", 80, "ec", 2, 4000)
        Employee1 employee12 = new Employee1("Employee3", 50, "cse", 3, 5000)
        Employee1 employee13 = new Employee1("Employee4", 19, "cse", 4, 10000)
        Employee1 employee14 = new Employee1("Employee5", 60, "ec", 5, 50)





        List<Employee1> employeeList = [employee1, employee11, employee12, employee13, employee14]

//Grouping employee on basis of salary
        Map map = employeeList.groupBy {
            it.salary > 5000
        }

        println(map)

//Get the count of employee in each department

        Map<Integer, List> map1 = employeeList.groupBy {
            it.departmentName
        }

        map1.each {
            print("dept = " + it.getKey())
            println(" number of employee " + it.getValue().size())
        }

//Get the employee between 18 to 35

        List<Employee> age = []
        Map map3 = employeeList.groupBy {
            it.age > 18 && it.age < 35
        }.each {
            age.add(it.value)
        }
        println(age.name)

// Group the employees according to the alphabet with which their
// first name starts and display the number of employees in each group
// whose age is greater than

//        Map map4 = employeeList.groupBy {
// it.name.startsWith(0)
// }
//println(map4)

// Group employees according to department
        Map map5 = employeeList.groupBy {
            it.departmentName
        }

    }
}

