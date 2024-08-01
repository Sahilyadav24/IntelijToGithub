package Practise_Coding;
public class star {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++)
        {
            for(int j=4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("*");
            }
            for(int l=2;l<=i;l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
//        int rows =5;
//        for (int i = 1; i <= rows; i++) {
//            for (int j = 1; j <= rows - i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= 2 * i - 1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}

//        int z=1;
//
//        for (int i=1;i<=5;i++){
//
//            for (int j=4; j>=i;j--){
//                System.out.printf(" ");
//            }
//            for (int k=z;k>=1;k--)
//            {
//                System.out.printf("%d",k);
//            }
//            z+=2;
//                System.out.printf("\n");
//        }


//        for(int i=1;i<=4;i++)
//        {
//        for(int j=1;j<=i;j++)
//        {
//        System.out.printf(" ");
//            }
//                    for (int k=4;k>=i;k--)
//        {
//        System.out.printf("%d",k);
//            }
//                    System.out.println();
//        }