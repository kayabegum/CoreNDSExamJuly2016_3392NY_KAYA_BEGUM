package oop.design;

import java.util.Scanner;

public class CnnEmployee {

	/**
	 * CnnEmployee class has a main methods where you will be able to create Object from 
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("please enter the employee id 3 times until it works");
		int id = input.nextInt();
		String name=input.nextLine();
		EmployeeInfo employeesinfo = new EmployeeInfo();

		employeesinfo.employeeName("Mysha");
		System.out.println(employeesinfo.getName());
		employeesinfo.assignDepartment(id);
		employeesinfo.City(id);
		employeesinfo.DOB("May 07,1995");
		employeesinfo.employeeName(employeesinfo.getDOB());
		employeesinfo.employeeAcademic(id);
		employeesinfo.Commission(id);
		employeesinfo.calculateSalary(id);
		System.out.print("Date Hired: ");
		employeesinfo.hireDate(id);
		System.out.println("Employees Bonus:" +EmployeeInfo.calculateEmployeBonus(50000,10));
		System.out.println("Employees yearly pension: "+EmployeeInfo.calculateEmployePension(40,90000));
	}
}
