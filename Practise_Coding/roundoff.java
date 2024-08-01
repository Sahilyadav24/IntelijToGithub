package Practise_Coding;

public class roundoff {

//   public int make(int a,int b){
////       return Math.round((float)a / b);
//
//    }


    public static void main(String[] args) {
        int a = 13, b=3;
//        roundoff ro = new roundoff();
//        int result = ro.make(a,b);
//        System.out.println(result);
        while(a%b!=0) {
            if (a % b != 0 && (a % b >= (b/2))) {
                a++;
            } else if (a % b != 0 && (a % b <= (b/2))) {
                a--;
            }
        }if(a%b==0){
            System.out.println(a);
        }
    }
}
