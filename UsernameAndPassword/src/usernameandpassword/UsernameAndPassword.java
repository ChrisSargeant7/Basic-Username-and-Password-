/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usernameandpassword;
import java.util.*;

/**
 *
 * @author Christopher Sargeant
 */
public class UsernameAndPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s; // This is the string that is to be used for the program as my password this will be going through all the 
        int numbers = 0; // this is to represent the amount of numbers that go into the password
        String username;// this string is simply for the user to enter their username, once it's inputted it's added for making sure it's not the same as the password
        String pwd = "password"; // this string is to ensure that the word Password can not be used during the program
        Scanner input = new Scanner(System.in); // this is the scanner that will be used for all of this program as to enter the password
        System.out.println("-Please enter a username"); // this is where the program will actually begin as we ask the user for a username
        username = input.nextLine(); // this is the first input, this is to simply enter the username.
        
        System.out.println("Please Enter a password, The Password must"); // below to the first input are all the requirements that must be met for the password to be accepted
        System.out.println("-only have a mixture of numbers and letters");
        System.out.println("-at least 8 Characters");
        System.out.println("-a Minimum of 2 numbers");
        System.out.println("-not be the same as your username");
        System.out.println("-not be Password or any variation");
        s = input.nextLine(); // this is the input that will be use for my password
        while(true){
            if(s.length() < 8){ // this if statement is used to ensure that the password is not allowed if it has fewer than 8 characters in it
            System.out.println("-Password does not meet requirements");
            System.out.println("-Password must be at least 8 characters");
            System.out.println("-Please enter a password that meets the requirements");
            s = input.nextLine();// this is where the user is asked again to input their password as it rounds itself back to the beginning of the username portion
            continue;
        
            }  
        if(s.matches("^[a-zA-Z0-9]+$")){ // This section ensures that the password only conatins letters and numbers and rejects anything other than those 2
        }
        else{// this else statement is for what happens if they enter anything other than letters and numbers
            System.out.println("-Password must only have letters and digits");
            System.out.println("-Please enter a password that meets the requirements");
            s = input.nextLine();// as similar to the above continue the user enters their new password here as the program defaults back to the beginning of the requirements
            continue;        
            }
       if (s.contains(pwd)){ // this if statement makes it so that when the password enters is the same as the string that is password, it rejects the password and asks the user to enter a new one
                System.out.println("-you are not allowed to use Password or any variation as your password");
                System.out.println("-Please try again");
                 s = input.nextLine();  
                continue;
        }
       if (s.contains(username)){ // this one makes it so that if the password contains any words that are in the username it'll reject it and ask the user to input a new password instead
                System.out.println("-The password can not be the same as the username");
                System.out.println("-Please try again");
                s = input.nextLine();           
                continue;

       }
        int i; // This interger is required for when I decide to make it so that I set a minimum of numbers that the password requires to be accepted by the program
        for (i = 0; i < s.length(); i++){ // 
           if(Character.isDigit(s.charAt(i))){
            numbers++;
            }
            } 
        if(numbers < 2){ // this if statement makes it so that if their are not 2 numbers in the program it will reject the password and ask the user for another password that meets the requirements 
            System.out.println("-The password must contain at least 2 digits");
            System.out.println("-Please enter a Password that meets the requirements");
            s = input.nextLine();
            continue;
        }            
        
        break; // this is the end of the while true loop that is happening for the password
        }
        do{ // this is the beginning of the while loop that is required for final validation
            System.out.println("-Please reenter your password to see if it matches");
            String a = input.nextLine(); // this is the next string that is used here for entering the password again
            
            if(s.equals(a)){ // this if statement makes it so that it validates by comparing the entered strings by each other, if they are the same then the program ends here
                System.out.println("-The Password matches well done");
                 // this final break ends the loop but only if the if statement above is met
                break;          }
            else{ 
                System.out.println("-The Password does not match"); // this is the message the user will recieve if they do not enter the correct password, it will then loop and ask for the user to enter the correct password again.
                
            } }  while (0 == 0);
        
        }
    }
    


