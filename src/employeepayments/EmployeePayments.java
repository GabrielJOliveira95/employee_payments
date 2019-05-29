
package employeepayments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayments {

   
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();
        
        System.out.print("Enter the number of employees: ");
        int n = keyboard.nextInt();
        
        for (int i = 1; i <= n; i ++){
            
         System.out.println("Employee " + i + " date: ");
         
         System.out.print("Outsourced (y/n)?: ");
         char employeeType = keyboard.next().charAt(0);
         
         System.out.print("Name: ");
         keyboard.nextLine();
         String name = keyboard.nextLine();
         
         System.out.print("Worked hours: ");
         int hours = keyboard.nextInt();
         
         System.out.print("Value per hour: ");
         Double valuePerHour = keyboard.nextDouble();
         
         if (employeeType == 'y'){
             
            System.out.print("Addcional charge: ");
            Double ac = keyboard.nextDouble();
            list.add(new OutSourceEmployee(name, hours, valuePerHour, ac));
         } else{
         
            list.add(new Employee(name, hours, valuePerHour));
         }
            
            
            
        }
        
        System.out.println("");
        System.out.println("PAYMENTS");
        
        for (Employee emp: list){
              
            System.out.println(emp.getName() + " " + " " + String.format("%.2f", emp.payments()) );
        
        }
                
                
        
    }
    
}
