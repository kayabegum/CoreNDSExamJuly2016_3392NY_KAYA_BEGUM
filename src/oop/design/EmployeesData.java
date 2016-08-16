package oop.design;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by kayabegum on 8/14/2016.
 */
public abstract class EmployeesData implements Employee {
    Scanner input = new Scanner(System.in);
    private String name;
    private String city;
    private int id;

    private String DOB;
    private int commission;
    private int salary;
    private int experiance;

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {

        this.DOB = DOB;
    }
;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int[] employeeId(int array[]) {
        int[] list = array;


        return list;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int employeeId()

    {
        return employeeId();
    }

    public String employeeName() {
        return null;
    }

    @Override
    public void assignDepartment() {

    }

    @Override
    public int calculateSalary() {
        return 0;
    }

    public String employeeName(String name) {
        this.name = name;
        return employeeName();

    }


    //assignDepartment() will assign employee to departments
    public static void assignDepartment(int id) {

        if (id > 0 && id < 100) {
            System.out.println("Database Developer");

        } else if (id > 200 || id < 350) {
            System.out.println(" Video Game Designer");
        } else if (id > 350 || id < 400) {
            System.out.println(" Patent Agent");

        } else if (id > 400 || id < 500) {
            System.out.println(" Improvement Manager");

        }
        else{System.out.println("invalid Employee ID");}
    }
    public int calculateSalary(int id) {
        int salary=0;
        int total=salary+salary*commission;
        if (id >0||id <100) { salary=50000;
            total=salary+salary*commission;
        }
        else if (id > 200 || id < 350){
            salary=60000;
            total=salary+salary*commission;
        }
        else if (id > 350 || id < 400) {
            salary=80000;
            total=salary+salary*commission;

        }
        else if (id > 400 || id < 500) {
            salary=105000;
            total=salary+salary*commission;
        }
        else{System.out.println("invalid Employee ID");}
        System.out.println("the yearly salar:"+ total);
        return total;

    }



    //calculate employee salary


    public void Commission(int id) {
        int[] commission = new int[500];
        Random com = new Random(25);

        if (id <=500) {
            System.out.println("Employee's commission: " + com.nextInt(25) + "%");

        }
        else{System.out.println("invalid Employee ID");}
    }


    //employee benefit
    public void benefitLayout(){}

    @Override
    public String City() {
        return null;
    }

    public String City(int id) {

        Map<String, String> City = new LinkedHashMap<String, String>();
        City.put("Michigan","Hamtramck");
        City.put("New York","Brooklyn");
        City.put("Florida", "Orlando");
        City.put("Connecticut","New Heaven");
            if (id >0||id <100) {
                System.out.println("Michigan: "+City.get("Michigan"));

            }
            else if (id > 200 || id < 350){
                System.out.println("New York: "+City.get("New York"));
            }
            else if (id > 350 || id < 400) {
                System.out.println("Florida: "+City.get("Florida"));

            }
            else if (id > 400 || id < 500) {
                System.out.println("Connecticut: "+City.get("Connecticut"));
            }
            else{System.out.println("invalid Employee ID");}


          return City();
    }

    @Override
    public String DOB() {
        return null;
    }

    public String hireDate(int id ) {
        this.id = id;
        ArrayList<Object> hireDate = new ArrayList<Object>();

            hireDate.add("July,23,2011");
            hireDate.add("Aug,01,2013");
            hireDate.add("Sep,25,2015");

            if (id < 100) {
                System.out.println(hireDate.get(0));
            } else if (id > 200 || id < 350) {
                System.out.println(hireDate.get(1));
            } else if (id > 350 || id < 400) {
                System.out.println(hireDate.get(2));

            } else if (id > 400 || id < 500) {
                System.out.println(hireDate.get(3));
            }
            else{System.out.println("invalid Employee ID");}
        return  hireDate();
    }




    public void employeeAcademic(int id) {
        this.id=id;
        ArrayList<Object> Degree = new ArrayList<Object>();
        Degree.add("High School Diploma");
        Degree.add("Associates");
        Degree.add("Bachelors");
        Degree.add("Masters");
        if (id < 100) {
            System.out.println("Accademic backgriund: "+Degree.get(0));
        }
        else if (id > 200 || id < 350) {
            System.out.println("Accademic backgriund: "+Degree.get(1));
        }
        else if (id > 350 || id < 400) {
            System.out.println("Accademic backgriund: "+Degree.get(2));

        }
        else if (id > 400 || id < 500){
            System.out.println("Accademic backgriund: "+Degree.get(3));
        }
        else{System.out.println("invalid Employee ID");}
    }

    public void employeeCreditRecord() {

    }

    @Override
    public void emplyeeSkill() {

    }

    public String DOB(String DOB){
        this.DOB=DOB;
        return DOB;

    }

    @Override
    public String hireDate() {
        return null;
    }

    @Override
    public void employeeAcademic() {

    }


}

