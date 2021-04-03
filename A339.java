import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class A339 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        ArrayList<Integer>numbersList=new ArrayList<Integer>();
        int i=0;
        if(s.length()%2!=0){
            numbersList.add(Integer.parseInt(String.valueOf(s.charAt(0))));
            i++;
        }
        else i=0;
        for(i=i;i<s.length()-1;i++){
            String num=String.valueOf(s.charAt(i))+String.valueOf(s.charAt(++i));
            numbersList.add(Integer.parseInt(num));
        }
        Collections.sort(numbersList);
        String result="";
        for(int j=0;j<numbersList.size();j++){
            int val=numbersList.get(j);
            if(val>=0)result+="+"+Integer.toString(val);
            else result+=Integer.toString(val);
        }
        if(result.charAt(0)=='+')result=result.substring(1,result.length());
        System.out.println(result);



//        int i=0;
//        if(Integer.parseInt(String.valueOf(s.charAt(0)))>=0){
//            i=1;
//            System.out.println(true);
//            numbersList.add(Integer.parseInt(String.valueOf(s.charAt(0))));
//        }
//        for(i=i;i<s.length();i++){
//
////            if(s.charAt(0)=='-') {
//                String num=String.valueOf(s.charAt(0))+String.valueOf(s.charAt(1));
////                numbersList.add(Integer.parseInt(num));
////            }
////            else if(Integer.parseInt(String.valueOf(s.charAt(0)))>=0){
////                System.out.println(true);
////                numbersList.add(Integer.parseInt(String.valueOf(s.charAt(0))));
////            }
//        }
//        System.out.println(numbersList.size());
    }
}
