import java.util.Scanner;
 class Question6_2 {
    
    static Scanner number=new Scanner(System.in);
    public static void main(String[]args){
        
        System.out.print("Enter value of a: ");
        int fn=number.nextInt();
        System.out.print("Enter value of b: ");
        int sn=number.nextInt();
        int ans1=fn+sn;
        int ans2=fn-sn;
        int ans3=fn*sn;
        int ans4=fn/sn;
        System.out.println("The result of adding is  "+ans1);
        System.out.println("The result of subtracting is "+ans2);
        System.out.println("The result of multiplying is "+ans3);
        System.out.println("The result of dividing is "+ans4);
        






    }


    
}
