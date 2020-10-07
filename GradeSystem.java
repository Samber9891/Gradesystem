/**
 * GradeSystem
 */
import java.util.Scanner;
public class GradeSystem {


    
    public static void main(String[] args) {
   
 
    Scanner input = new Scanner(System.in); 
    System.out.println("Please enter students grade score.");
 
    int gradeScore = input.nextInt(); 

 if (gradeScore >=90 && gradeScore <= 100) {     
     System.out.println("A");
 }
 else if (gradeScore >=80 && gradeScore < 90) {     
     System.out.println("B");
 }
 else if (gradeScore >=70 && gradeScore < 80) {     
     System.out.println("C");
 }
 else if (gradeScore >=60 && gradeScore < 70) {     
     System.out.println("D");
 }
 else if (gradeScore >=60 && gradeScore < 65) {     
     System.out.println("F");
     if (gradeScore >=0 && gradeScore < 65)
     System.out.println("Time for a review!");
 }
 else {
     System.out.println("Try an number between 1 and 100");
 }



 input.close();

}
}
