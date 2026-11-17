/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamethodrecursionproblem1;
import java.util.Scanner;
/**
 *
 * @author GUERRA_CPE113
 */
public class JavaMethodRecursionProblem1 {
   public static double computeAverage(int total, int count) {
        if (count <= 0) {
            return 0.0; 
        }
        return (double) total/count;
        
    }public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Your total: ");
        int total = scanner.nextInt();
        
        System.out.print("Enter Your count: ");
        int count = scanner.nextInt();
        
        double result = computeAverage(total, count);
        System.out.println("Here is your Computed Average:" + result);
    }
}