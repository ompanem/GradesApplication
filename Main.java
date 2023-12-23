import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name ");
        String name = input.nextLine();
        System.out.println("Enter your last name");
        String lastName = input.nextLine();
        String[]fullName = {name, lastName};
        System.out.println(Arrays.toString(fullName));


        while(true){
            System.out.println("Would you like to continue? y/n");
            String choice = input.nextLine();
            if(!choice.equalsIgnoreCase("y")){
                System.exit(0);
            }
            Grade grade = new Grade();
            grade.grade();



        }
    }
}



