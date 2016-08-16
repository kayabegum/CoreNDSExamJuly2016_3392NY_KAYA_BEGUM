package oop.design;

import java.util.Scanner;

public class EmployeeInfo extends EmployeesData {


 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to CnnEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	Scanner scan = new Scanner(System.in);
	final int id = scan.nextInt();
	final String input = scan.nextLine();
	//	int employeeId=scan.nextInt();
	String name = scan.nextLine();
	final int calSal = scan.nextInt();
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */

	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo() {
	}

	public EmployeeInfo(int employeeId) {
		EmployeeInfo.assignDepartment(employeeId);


	}

	public EmployeeInfo(String name, int employeeId) {
		this.name = name;
		super.employeeName("Mysha");
		System.out.println(getName());
		EmployeeInfo.assignDepartment(employeeId);
		super.City();
		super.employeeAcademic();
		super.DOB("May 07,1995");
		System.out.println(getDOB());
		super.hireDate(employeeId);
		super.Commission(employeeId);
		super.calculateSalary(employeeId);


	}

	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static int calculateEmployeBonus(int salary, int Performance) {
		int total = 0;
		int best = 10;
		int avg = 8;
		int lessThanAvg = 3;
		double best2 = best;
		double avg2 = avg;
		double lessThanAvg2 = lessThanAvg;


		if (Performance == best2) {
			total = salary + salary * Performance;
		} else if (Performance == avg2) {
			total = salary + salary * Performance;
		} else if (Performance == lessThanAvg2) {
			total = salary + salary * Performance;
		}

		return total;
	}

	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public static double calculateEmployePension(int years, int salary) {

		double pension=5;
		pension = pension/100;
       double total=0;
		if(years>0 && years<50) {
			years++;
			pension=pension*2;

			total = salary * pension;
		}

			return total;}
	}





