/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamethodrecusionproblem2;
import java.util.Scanner;
/**
 *
 * @author GUERRA_CPE113
 */
public class JavaMethodRecusionProblem2 {

    public static int countPassing(int[] grades, int passingMark) {
        int count = 0;
        for (int g : grades) {
            if (g >= passingMark) {
                count++;
            }
        }
        return count;
        
    }public static int countPassingRecursive(int[] grades, int passingMark, int index) {
        if (index >= grades.length) {
            return 0; 
        }
        int thisOne = (grades[index] >= passingMark) ? 1 : 0;
        return thisOne + countPassingRecursive(grades, passingMark, index + 1);
        
    }public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of grades:");
        int n = scanner.nextInt();
        int[] grades = new int[n];

        System.out.println("Pls enter Grade..."+ n);
        for (int i = 0; i < n; i++) {
            grades[i] = scanner.nextInt();
        }

        System.out.print("Enter passing mark:");
        int passingMark = scanner.nextInt();

        System.out.println("Loop Result: " + countPassing(grades, passingMark));
        System.out.println("Recursive Result: " + countPassingRecursive(grades, passingMark,0));
    }
}
