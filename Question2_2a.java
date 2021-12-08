import java.util.Scanner;
 class Question2_2a {
    static int quiz;
    static int midTerm;
    static int finalScore;
    static double average;
    static Scanner el=new Scanner(System.in);
 
    public static  void main(String[]args){
        Mygrade();
    }

    public static void Mygrade(){
      
        System.out.print("Quiz Score: ");
        quiz=el.nextInt();
        System.out.print("Mid-term Score: ");
        midTerm=el.nextInt();
        System.out.print("Final Score: ");
        finalScore=el.nextInt();
        average=(quiz+midTerm+finalScore)/3;
        if(average>=90){
            System.out.print("Your Grade is A ");
            if(average>=70 && average<90)
                System.out.print("Your Grade is B ");
        }
            if(average>=50 && average<70){
                 System.out.print("Your Grade is C");
            }
            else if(average<50){
            System.out.print("Your Grade is F");

        }


        }

           
    }
    
    

