import java.util.Scanner;
import java.util.Arrays;
class Grade{
    public double[] grade(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of subjects");
        int subjects = input.nextInt();
        double[] grade = new double[subjects];
        for(int i =0; i<subjects; i++){
            do {
                System.out.println("Enter subject " + (i + 1) + " grade");
                grade[i] = input.nextDouble();
                if(grade[i]>100){
                    System.out.println("Not possible");
                }
            }while(grade[i]>100);
        }
        double sum = 0;
        for(int i =0; i<subjects; i++){
            sum += grade[i];
        }
        double avg = sum/subjects;
        System.out.println("Courses grade: " + Arrays.toString(grade));
        System.out.println("Average : " +  sum/subjects);
        System.out.println("Grade : " + lettergrade(avg));



        return grade;
    }

    public static String lettergrade(double grade){
        if(grade>=90){
            return "A";
        }
        if(grade>=80&&grade<90)
        {
            return "B";
        }
        if(grade<80 && grade>=70)
        {
            return "C";
        }
        if(grade<70 && grade>=59)
        {
            return "D";
        }
        else{
            return "F";
        }
    }
}
