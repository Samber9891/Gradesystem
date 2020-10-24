/**
 * GradeSystemSwitch
 */

import java.util.Scanner;

public class GradeSystemSwitch {

    public static void main(String[] args) {

       Scanner input = new Scanner(System.in); 
        System.out.println("Please enter students grade score.");  
        
        Integer gradeScore = input.nextInt();
        
        switch (gradeScore) {
        case 100,99,98,97,96,95,94,93,92,91,90 : 
            System.out.println("A");
        break;
        case 89,88,87,86,85,84,83,82,81,80: 
            System.out.println("B");
        break;
        case 79,78,76,75,74,73,72,71,70 :
            System.out.println("C");
            break;
        case 69,68,67,66,65,64,63,62,61,60:
            System.out.println("D");
            break; 
        default: 
    System.out.println("F");

input.close();
        }
    }
}

// In this case, the switch statement seems more labor intensive and confusing
// I would imagine a programmers prefering switch when the case options are clearly 
// defined and don't require any calculations. 