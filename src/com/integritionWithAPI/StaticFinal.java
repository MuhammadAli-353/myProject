package com.integritionWithAPI;

public class StaticFinal {

    private String EmployeeName;
    private double EmployeeSalary;

    public final String myName="Hussain";

    public StaticFinal(String employeeName,double employeeSalary)
    {
        this.EmployeeName=employeeName;
        this.EmployeeSalary=employeeSalary;
    }

    public static String status = "This is static Attribute";


    public static void staticMethodOfClass(){
        System.out.println("This is Static method");
    }

    public void showEmployee()
    {
        System.out.println("Employee Name: "+EmployeeName);
        System.out.println("Employee Salary"+EmployeeSalary);

    }
}
