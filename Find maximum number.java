import java.util.Scanner;
class Main {
   
    public static void main(String[] args) {
    int A;
    int B;
    int C;
    int max;
    Scanner max_no=new Scanner(System.in);
    System.out.print("enter first number: ");
    A=max_no.nextInt();
    System.out.print("enter second number: ");
    B=max_no.nextInt();
    System.out.print("enter third number: ");
    C=max_no.nextInt();
    
    max=A;
    if(B>max){
        max=B;
    }
    if(C>max){
        max=C;
    }
    System.out.print("The max number between "+A+","+B+","+C+" is: "+max);
    }
}