import java.util.Scanner;
public class Question5_2 {
   
        static Scanner number=new Scanner(System.in);
        public static void main(String[]args){
        myFoats();
    }
            public static void myFoats(){
            System.out.print("Enter value of a: ");
            double fn=number.nextDouble();
            System.out.println("The value of a before adding is "+fn);
            System.out.print("Enter value of b: ");
            double sn=number.nextDouble();
            double sum=fn+sn;
            System.out.print("The value of a after adding is "+sum);
            }

}