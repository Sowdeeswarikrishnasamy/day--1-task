import java.util.Scanner;
class countoddandeven{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int []num=new int[size];
        for(int ind=0;ind<size;ind++){
            num[ind]=sc.nextInt();
        }
        int oddcount=0,evencount=0;
         for(int ind=0;ind<size;ind++){
            if(num[ind]%2==0)
               evencount++;
            else 
                oddcount++;
             
        }
        System.out.println("odd count:"+oddcount); 
        System.out.println("even count:"+evencount); 
    }
}