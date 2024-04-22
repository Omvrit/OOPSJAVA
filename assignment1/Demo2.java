package test1;
class Employee{
	String name;
	int salary;
	int age;
	public Employee(String name, int salary,int age) {
		this.salary = salary;
		this.name = name;
		this.age =age;
	}
	public Employee(String name,int salary) {
		this.salary = salary;
		this.name = name;
		
	}
	public static int highestsSalary(Employee []employee) {
		int maxsal =0;
		int employeenumber = 1;
		for(int i =0;i<employee.length;i++) {
			if(employee[i].salary>maxsal) {
				maxsal = employee[i].salary;
				employeenumber = i+1;
			}
		}
		return maxsal;
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
	Employee e1 = new Employee("e1",68000);
	Employee e2 = new Employee("e1",67000);
	Employee e3 = new Employee("e1",61000);
	Employee e4 = new Employee("e1",69000);
	Employee e5 = new Employee("e1",62000);
	Employee e6 = new Employee("e1",65000);
	Employee e7 = new Employee("e1",63000);
	Employee e8 = new Employee("e1",60000);
	Employee e9 = new Employee("e1",61000);
	Employee e10 = new Employee("e1",79000);
	Employee []employee= {e1,e2,e3,e4,e5,e6,e7,e8,e9,e10};
	System.out.println(Employee.highestsSalary(employee));
		
	}

}
