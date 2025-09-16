import java.util.Scanner;
class countposandneg{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []num=new int[size];
        for(int ind=0;ind<size;ind++){
            num[ind]=sc.nextInt();
        }
        int poscount=0,negcount=0;
         for(int ind=0;ind<size;ind++){
            if(num[ind]>=0)
               poscount++;
            else 
                negcount++;
             
        }
        System.out.println("pos count:"+poscount); 
        System.out.println("neg  count:"+negcount); 
    }
}