import java.util.Scanner;
public class BankApp{
        public static void main(String args[]){
            Bank b = new Bank();
            Scanner sc = new Scanner(System.in);

        System.out.println("1.Create Account\n2.Deposit\n3.Withdraw\n4.Display\n5.EXIT");
        while (true) {
            System.out.println("Enter your choice: ");
            int ch = sc.nextInt();
            switch(ch){
                case 1:
                b.create_acc();
                break;
                case 2:
                b.deposit();
                break;
                case 3:
                b.withdraw();
                break;
                case 4:
                b. display();
                break;
                case 5:
                System.exit(0);
                break;
                default:
                System.out.println("INVALID CHOICE");
            }
        }

    }
}
class Bank{
    int ac_no = 0;
    double amt = 0.0;
    String name,address;
    Scanner sc = new Scanner(System.in);

    void create_acc(){
        ac_no = ac_no + 1;
        System.out.println("Enter your name: ");
        name = sc.next();
        System.out.println("Enter Initial amount: ");
        amt = sc.nextDouble();
        System.out.println("Enter your address: ");
        address = sc.next();
    }
    void deposit(){
        System.out.println("Enter the amount to be deposited: ");
        Double depAmt = sc.nextDouble();
        amt = amt + depAmt;
        System.out.println("Amount Deposited: " +depAmt);
        System.out.println("Current Balance: " +amt);
    }
    void withdraw(){
        System.out.println("Enter the amount to be withdrawm: ");
        double withAmt = sc.nextDouble();
        if(withAmt < amt){
            amt = amt - withAmt;
            System.out.println("Amount Withdrawn: " +withAmt);
            System.out.println("Current Balance: " +amt);
        }
        else{
            System.out.println("INSUFFICIENT BALANCE!");
        }
    }
    void display(){
        System.out.println("Account Number: " +ac_no);
        System.out.println("Name: " +name);
        System.out.println("Address: " +address);
        System.out.println("Current Balance: " +amt);
//        System.out.println("Total amount Credited: " +depAmt);
//        System.out.println("Total amount Debited: " +withAmt);
    }
}