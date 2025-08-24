import java.util.Scanner;

public class Grade{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
               System.out.print("Enter marks : ");
        int marks = sc.nextInt();
                if(marks>=1&&marks<=100){
            if(marks>=40&&marks<55){
               System.out.println("E");
            }
            else if(marks>=55&&marks<70){
                System.out.println("D");
            }
            else if(marks>=70&&marks<80){
                System.out.println("C");
            }
            else if(marks>=80&&marks<90){
                System.out.println("B");
            }
            else if(marks>=90&&marks<100){
                System.out.println("A");
            }
            else{
                System.out.println("FAIL");
            }
        }
        else{
            System.out.println("!Enter 1 to 100 numbers only");
        }
    }
}