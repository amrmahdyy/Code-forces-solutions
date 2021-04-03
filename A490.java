import java.util.ArrayList;
import java.util.Scanner;

public class A490 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []students=new int[n];
        int index=0;
        int studentsCounter[]=new int[4];
        while((n--)!=0)students[index++]=scanner.nextInt();
        for(int i=0;i<students.length;i++)studentsCounter[students[i]]++;
        int minNum=studentsCounter[1];
        for(int i=1;i<studentsCounter.length;i++)if(minNum>studentsCounter[i])minNum=studentsCounter[i];
        int maxTeams=minNum;
        ArrayList<ArrayList<Integer>>studentsIndex=new ArrayList<ArrayList<Integer>>();
        System.out.println(minNum);
        if(minNum==0)return;
       while((maxTeams--)!=0){
           ArrayList<Integer>team=new ArrayList<Integer>();
           int one=0;
           int two=0;
           int three=0;
           for(int i=0;i<students.length;i++){
               if(students[i]==1){
                   one=i;
               }
               if(students[i]==2){
                   two=i;
               }   if(students[i]==3){
                 three=i;
               }
           }
           students[one]=-1;
           students[two]=-1;
           students[three]=-1;
           team.add(one+1);
           team.add(two+1);
           team.add(three+1);
           studentsIndex.add(team);
       }
       for(int i=0;i<studentsIndex.size();i++){
           for(int j=0;j<studentsIndex.get(i).size();j++){
               System.out.print(studentsIndex.get(i).get(j)+" ");
           }
           System.out.println();
       }

    }
}
