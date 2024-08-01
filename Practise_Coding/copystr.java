package Practise_Coding;

import java.util.Scanner;

public class copystr {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        System.out.println("please type something");
        String aa=st.nextLine();

        Scanner sp = new Scanner(System.in);
        System.out.println("please type something");
        String bb=sp.nextLine();
//        String aa = "i am sahil";
//        String bb = "you are unknown";%%%%%%%%%
        char cc[] = aa.toCharArray();
        char dd[] = bb.toCharArray();
        char ee[] = new char[cc.length + dd.length];
        for (int i = 0; i < cc.length; i++) {
            ee[i] = cc[i];
        }
        for (int i = 0; i < cc.length; i++) {
            ee[cc.length+i] = dd[i];
        }
        for (char f:ee) {
            System.out.print(f);
        }
    }
}
