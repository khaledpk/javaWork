public class Question3_2a {
    public static void main(String[]args){
        myOdd();

    }
    public static void myOdd(){
        int range=10;

        
        for(int i=1; i<=1000; i+=2){
            int nu=range%i;
            if(nu >= 1 && nu!=0){
                System.out.println("Odd number :"+i);
            }


        }
    }
}
