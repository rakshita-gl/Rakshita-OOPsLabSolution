package com.rakshita.service;

import java.util.Random;
public class CredentialService {
    public String generateEmailAddress(String firstName, String lastName, String department){
        return (firstName+lastName+"@"+department+"."+"abc.com");
    }

    public char[] generatePassword(){{
        int length =8;
        String symbol =",.*&^#$@%!()_+-/<>";
        String upperCaseLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters="abcdefghijklmnopqrstuvwxyz";
        String numbers="0123456789";
        String finalString = upperCaseLetters+lowerCaseLetters+numbers+symbol;

        Random random = new Random();
        char[] password = new char[length];
        for(int i=0;i<length;i++){
            password[i]=finalString.charAt(random.nextInt(finalString.length()));}
        
        return password;

    }
    }

    public void showCredentials(String firstName, String lastName, String department){
        System.out.println("Dear" + firstName + ", your generated credentials are:");
        System.out.println("Email --> ");
        System.out.printf("Password --> ",generatePassword());

    }

}
