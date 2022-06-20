package com.rakshita.driver;
import com.rakshita.modeler.*;
import com.rakshita.service.CredentialService;

import java.util.Scanner; 
public class Driver {
    public static void main(String[] args) {
        Employee emp=new Employee("Rakshita","Tripathi");
        //CredentialService cs=new CredentialService();
        //String generatedEmail;
        //char[] generatedPassword;

        System.out.println("Please choose one of the following departments:");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");

        try (Scanner sc = new Scanner(System.in)) {
            int option = sc.nextInt();

            CredentialService credentialService = new CredentialService();

            if(option==1){
                /* String generateDept = credentialService.generateDepartment(emp.getFirstName()); */ 
                credentialService.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"tech");
                credentialService.showCredentials(emp.getFirstName(),emp.getLastName(),"tech");
            }

            else if(option==2){
                credentialService.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"adm");
                credentialService.showCredentials(emp.getFirstName(),emp.getLastName(),"adm");
            }

            else if(option==3){
                credentialService.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"hr");
                credentialService.showCredentials(emp.getFirstName(),emp.getLastName(),"hr");
            }
   
            else if(option==4){
                credentialService.generateEmailAddress(emp.getFirstName(),emp.getLastName(),"leg");
                credentialService.showCredentials(emp.getFirstName(),emp.getLastName(),"leg");
            }

            else{
                System.out.println("Enter a valid");
            }
        }
    }

    
}
