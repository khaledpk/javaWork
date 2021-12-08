import java.util.Scanner;
class Question4{
    int age;
    String name;
 
    static Scanner tz = new Scanner(System.in);

    public static void main(String[]args){
     Question4 Obj=new Question4();
     Obj.Details();
     System.out.printf("Welcome "+Obj.name+" you are "+Obj.age+" years old");
    }
        public  void  Details(){
        System.out.print("Enter You name : ");
        name= tz.nextLine();
        System.out.print("Enter You age : ");
        age=tz.nextInt();
    }  


}
