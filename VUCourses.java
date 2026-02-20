

package kak.vucourses;

import java.util.Scanner;
public class VUCourses {
    

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        String moduleCode;
        String moduleName;
        int tuition;

        System.out.println("=====VUPay =====");
        System.out.print("Enter Module Code: ");
        moduleCode = input.nextLine().toUpperCase();

        switch (moduleCode) {

            case "BCE" -> {
                moduleName = "BSc. Computer Engineering";
                tuition = 900000;
            }

            case "BIT" -> {
                moduleName = "BSc. Information Technology";
                tuition = 750000;
            }

            case "BCS" -> {
                moduleName = "BSc. Computer Science";
                tuition = 800000;
            }

            case "BSF" -> {
                moduleName = "BSc. Software Engineering";
                tuition = 950000;
            }

            default -> {
                System.out.println("Wrong Module Code details");
                return;
            }
        }

        System.out.println("\nCourse Details:");
        System.out.println("Course Name: " + moduleName);
        System.out.println("Module Code: " + moduleCode);
        System.out.println("Tuition Fees: UGX " + tuition);
    }
}
        
      
 


