import java.util.Scanner;
class countzeroandone{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []num=new int[size];
        for(int ind=0;ind<size;ind++){
            num[ind]=sc.nextInt();
        }
        int zerocount=0,onecount=0;
         for(int ind=0;ind<size;ind++){
            if(num[ind]==0)
               zerocount++;
            else if(num[ind]==1)
                onecount++;
             
        }
        System.out.println("one count:"+onecount); 
        System.out.println("zero count:"+zerocount); 
    }
}