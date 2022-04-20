package Employees;

import java.sql.SQLOutput;

public class Employees_client {

    // Let us declare a main method

    public static void main(String[] args) {

    // Create a class  called Employees and add a new employee

        Employees employee1 = new Employees();

    // Add info through setters

      employee1.setAddress( " 18 Rue Antoine Bourdelle, 750 Paris, France");
      employee1.setAssociateID( 123453256);
      employee1.setAccountBalance( 123000);



     // print details of employee

        System.out.println( "1. Employee Address : " + employee1.getAddress());
        System.out.println("2. Associate ID " + employee1.getAssociateID());
        System.out.println( "3. Account Balance : £ " + employee1.getAccountBalance())   ;
















    }
}
