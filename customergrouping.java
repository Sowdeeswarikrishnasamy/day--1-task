import java.util.Scanner;
public class customergrouping{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        int gen=sc.nextInt();
        if(age<25&&gen==1)
           System.out.println("Group 1");
          else if(age<25&&gen==2)
           System.out.println("Group 2");
       else if(age>=25&&age<=45&&gen==1)
           System.out.println("Group 3");
        else if(age>=25&&age<=45&&gen==2)
           System.out.println("Group 4");
        else if(age>45)
           System.out.println("Group 5");
           else
            System.out.println("invalid entry");

    }
}