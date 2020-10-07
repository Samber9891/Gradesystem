/**
 * GradeSystemSwitch
 */

import java.util.Scanner;

public class GradeSystemSwitch {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in); 
        System.out.println("Please enter students grade score.");  
        
        int gradeScore = input.nextInt(); 
        
    switch (true) {
        case (gradeScore >=90 && gradeScore <= 100) : 
            System.out.println("A");
        break;
        case (gradeScore >=80 && gradeScore < 90): 
            System.out.println("B");
        break;
        case (gradeScore >=70 && gradeScore < 80) :
            System.out.println("C");
        case (gradeScore >=60 && gradeScore < 70):
            System.out.println("D");
        case (gradeScore >=0 && gradeScore < 65):
            System.out.println("F");
        default: 
        System.out.println("Please enter between 1 and 100");

input.close();
        }
    }
}

// In this case, the switch statement seems more labor intensive and confusing
// I would imagine a programmers prefering switch when the case options are clearly 
// defined and don't require any calculations. 