/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author 0610139866
 */
public class Main {
    static class userInfo {
    static String username;
    static String password;
    static float balance;
    static int accn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("Welcome to the Bank of Waste.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your username");
        System.out.print("> ");
        userInfo.username = scanner.nextLine();
        System.out.println("Please enter the password for the account associated with " + userInfo.username);
        System.out.print("> ");
        userInfo.password = scanner.nextLine();
        System.out.println("Hello " + userInfo.username);
        System.out.println("$" + userInfo.balance);
    }
    
}
