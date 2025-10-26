
class Bank {
    String name;
    String acc_no;
    double Balance;
    Bank(String name, String acc_no, double Balance){
        this.name=name;
        this.acc_no=acc_no;
        this.Balance=Balance;
    }
    void deposit(double birr){
        Balance=birr+Balance;
         System.out.printf("Dear custumor you deposited: %.2f\n\n",birr);
        
    }
    void withdraw(double birr){
        if(birr<Balance && birr>=100){
        System.out.printf("Dear custumor you withdrew: %.2f\n\n",birr);
       Balance-=birr;
       
        }
        else{
            System.out.println("insufficient balance for withdraw\n");
        }
    }
    void display(){
        System.out.printf("Name: %s\n",name);
        System.out.printf("account number: %s\n",acc_no);
        System.out.printf("remaining amount: %.2f\n",Balance);
    }
    public static void main(String[] args) {
        Bank transaction=new Bank("Wendayew fkadu", "1000361486092", 300);
        transaction.deposit(100);
        transaction.display();
        
    }
}