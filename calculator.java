import java.util.Scanner;
public class calculator{
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Calculator program");
        int c=1;
        int x,y;
        while(c>0){
            System.out.println("1.Addition ");
            System.out.println("2.Subtraction ");
            System.out.println("3.Multiplication ");
            System.out.println("4.Division ");
            System.out.println("Enter the 1st number :");
            x=myobj.nextInt();
            System.out.println("Enter the 2nd number :");
            y=myobj.nextInt();
            int n;
            System.out.println("Enter your choice :");
            n=myobj.nextInt();
            if(n==1){
                int a;
                a=x+y;
                System.out.println("Addition ="+a);
            }
            else if(n==2){
                int s;
                s=x-y;
                System.out.println("Subtraction ="+s);
            }
            else if(n==3){
                int m;
                m=x*y;
                System.out.println("Multiplication ="+m);
            }
            else{
                int d;
                d=x/y;
                System.out.println("Division ="+d);
            }
            int g;
            System.out.println("Do you want to continue if yes==1 or no==0 :");
            g=myobj.nextInt();
            c=g;
        }
        myobj.close();    
    }
}