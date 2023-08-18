package day26;

import java.util.Scanner;

class Employee {
    int empNo;
    String empName;
    String designation;
    double basicPay;
    // Constructor for Employee class
    public Employee(int empNo, String empName, String designation, double basicPay) {
        this.empNo = empNo;
        this.empName = empName;
        this.designation = designation;
        this.basicPay = basicPay;
    }
    // Method to calculate net pay
    public double calculateNetPay(double hra, double da, double pf) {
        return basicPay + hra + da - pf;
    }
    // Method to display employee details
    public void displayEmployeeDetails(double hra, double da, double pf) {
        double netPay = calculateNetPay(hra, da, pf);
        System.out.printf(empNo + "\t" + empName + "\t" + designation + "\t" + (int)basicPay + "\t" + (int)hra + "\t" + (int)da + "\t" + (int)pf + "\t" + (int)netPay);
    }
}
public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of employee:");
        int numEmployees = scanner.nextInt();
        // Create an array to hold employee objects
        Employee[] employees = new Employee[numEmployees];
        // Input employee details and create employee objects
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter the employee number:");
            int empNo = scanner.nextInt();
            System.out.println("Enter the employee name:");
            String empName = scanner.next();
            System.out.println("Enter the designation:");
            String designation = scanner.next();
            System.out.println("Enter the basic pay:");
            double basicPay = scanner.nextDouble();
            employees[i] = new Employee(empNo, empName, designation, basicPay);
        }
        // Input additional allowances for each employee
        double hra, da, pf;
        System.out.println("Enter the Humen Resource Allowance:");
        hra = scanner.nextDouble();
        System.out.println("Enter the Dearness Allowance :");
        da = scanner.nextDouble();
        System.out.println("Enter the Profitablity Fund:");
        pf = scanner.nextDouble();
        // Display the header
        System.out.println("e_no 	 e_name	 des 	 bp 	 hra 	 da 	 pf 	 np");
        // Display employee details along with the calculated net pay
        for (Employee emp : employees) {
            emp.displayEmployeeDetails(hra, da, pf);
        }
        scanner.close();
    }
}
