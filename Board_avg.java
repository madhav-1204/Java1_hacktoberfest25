import java.util.Scanner;

public class Board_avg {

        public static void main(String[] args){
            System.out.println("caluclating board percentage of a student by taking input from the user");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter social marks : ");
            int s = sc.nextInt();
            System.out.println("Enter math marks : ");
            int m = sc.nextInt();
            System.out.println("Enter science marks : ");
            int s1 = sc.nextInt();
            System.out.println("Enter english marks : ");
            int e = sc.nextInt();
            System.out.println("Enter IT marks :");
            int it = sc.nextInt();

            float total = s+m+s1+it+e;
            float percentage = total/500*100;

            System.out.println("the percentage is : ");
            System.out.println(percentage);




        }



}
