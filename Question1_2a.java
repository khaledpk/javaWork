public class Question1_2a {
    public static  void main(String[]args){
        MaxMin();
    }
    public static void MaxMin(){
    int fn=200;
    int sn=500;
    int tn=150;
    
        if(fn>sn || fn>tn){
                System.out.printf("%d is larger than %d and %d",fn,sn,tn);
            }
        else if(tn>sn){
            System.out.printf("%d is larger than %d and %d",tn,sn,fn);
        }
        else{
            System.out.printf("%d is larger than %d and %d",sn,fn,tn);
        }
    }
}

