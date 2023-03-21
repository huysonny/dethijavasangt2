package bai1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Vector;

public class main {
    public static void main(String[] args) {
        var sc=new Scanner(System.in);
        var s = sc.nextLine();
        // khong su dung collection
        Vector<String> res=new Vector<>();
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
            String result="kí tự "+c+" xuất hiện "+count;
            if(res.isEmpty()){
                res.add(result);
            }
            boolean check=true;
            for(int k=0;k<res.size();k++){
                if(res.get(k).equals(result)){
                    check=false;
                    break;
                }
            }
            if(check==true){
                res.add(result);
            }

        }
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
        // su dung collection
    Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
        if(map.get(s.charAt(i))==null){
            map.put(s.charAt(i),0);
        }
        map.put(s.charAt(i),map.get(s.charAt(i))+1);

    }
        for(Map.Entry m:map.entrySet())
    {
        System.out.println(m.getKey()+" "+m.getValue());
    }
    }
}
