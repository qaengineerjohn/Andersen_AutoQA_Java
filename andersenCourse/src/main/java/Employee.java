public class Employee {

    public static void main(String[] args ){
        // create Array with 5 employees
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Ivanov","Ivan","Ivanovich","QA engineer","ivanov@gmail.com","8882993931229",1500.0,77);
        employeesArray[1] = new Employee("Petrov","Petr","Nikolaevich","QA Automation engineer","petrov@gmail.com","8882934535931229",2000.0,45);
        employeesArray[2] = new Employee("Visiliev","Sergey","Petrovich","Team Lead","vasiliev@gmail.com","8882993868931229",1600.0,39);
        employeesArray[3] = new Employee("Miroslaskiy","Ivan","Ivanovich","PM","miroslayskiy@gmail.com","88829933423931229",2000.0,40);
        employeesArray[4] = new Employee("Ivanovskiya","Viktoriay","Ivanovich","QA engineer","ivanovskay@gmail.com","8882978893931229",900.0,22);

        //find employees with 'age>40' and print to console
        for (Employee employee : employeesArray)
            if (employee.getAge()>40)
                System.out.println(employee.employeeInfo());
    }

    String surname;
    String firstName;
    String patronymic;
    String post;
    String email;
    String phoneNumber;
    Double salaryUSD;
    int age;

    Employee(String surname,
             String firstName,
             String patronymic,
             String post,
             String email,
             String phoneNumber,
             Double salaryUSD,
             int age){
        this.surname = surname;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salaryUSD = salaryUSD;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String employeeInfo(){
       return("Фамилия: " + surname + "\n" +
              "Имя: " + firstName + "\n" +
              "Отчество: " + patronymic + "\n"+
              "Должность: " + post + "\n" +
              "Email: " + email + "\n" +
              "Телефон: " + phoneNumber + "\n" +
              "Зарплата: " + salaryUSD + "\n" +
              "Возраст: " + age + "\n" +
              "__________________________");
    }
} // ene class
