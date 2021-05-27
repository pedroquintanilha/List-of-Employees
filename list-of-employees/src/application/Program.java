package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner s=new Scanner(System.in);
		List<Employee> list= new ArrayList<>();
		Employee emp;
		System.out.print("How many employees will be registered? ");
		int quantity=s.nextInt();
		
		for (int i=0; i<quantity; i++) {
			System.out.println();
			System.out.printf("Employee #%d\n",i+1);
			System.out.print("Id: ");
			Integer id=s.nextInt();
			System.out.print("Name: ");
			s.nextLine();
			String name=s.nextLine();
			System.out.print("Salary: ");
			Double salary=s.nextDouble();
			emp=new Employee(id, name, salary);
			list.add(emp);
			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id=s.nextInt();
		
		emp = list.stream().filter(x->x.getId()==id).findFirst().orElse(null);
		
		if(emp==null) {
			System.out.print("This id does not exist!");
			System.out.println();
			
		}
		else {
		
			System.out.print("Enter the percentage: ");
			double percentage=s.nextDouble();
			emp.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		
		for (Employee x : list) {
	
			System.out.println(x);
			
		}
	
		s.close();
		
}

			 
}
	

	

