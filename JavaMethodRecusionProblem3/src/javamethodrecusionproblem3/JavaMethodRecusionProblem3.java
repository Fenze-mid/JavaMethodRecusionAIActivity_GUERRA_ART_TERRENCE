/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamethodrecusionproblem3;
import java.util.Scanner;
/**
 *
 * @author Art PC
 */
public class JavaMethodRecusionProblem3 {

    public static int factorial(int n) {
        if (n <= 1) {
            return 1; 
        }
        return n * factorial(n - 1); 
        
    }public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer to find factorial:");
        int n = scanner.nextInt();

        System.out.println("Factorial result:" + factorial(n));
    }
}
