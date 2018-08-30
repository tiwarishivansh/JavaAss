import java.util.Scanner;


public class MyClass {
    public static void main(String args[]) {
        
        Emp e = new Emp();
        e.getData(1,Anna,Work,dept,101010,8/30/2018)
        e.displayData();
    }
}

public class Emp {
    int empno;
    String empname;
    String empDesignation;
    String dept;
    float salary;
    String doj;
    
    void getData(int empno, String empname, String empDesignation, String dept, float salary, String doj)
    {
        empno=empno;
        empname=empname;
        empDesignation=empDesignation;
        dept=dept;
        salary=salary;
        doj=doj;
    }
    void displayData()
    {
        System.out.println(empno);
        System.out.println(empname);
        System.out.println(empDesignation);
        System.out.println(dept);
        System.out.println(salary);
        System.out.println(doj);
    }
}
