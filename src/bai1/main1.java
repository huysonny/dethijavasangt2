package bai1;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        var sc=new Scanner(System.in);
        String s=sc.nextLine();// bananas
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int j=0;
            int count=0;
            while(j<s.length()){
                if(s.charAt(j)==c){
                    count++;
                }
                j++;
            }
            System.out.println(" ki tu "+c+" xuat hien "+count);

        }
    }
}
