import java.util.*;
public class SimpleCalculator {
    static void displayOptions(){
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("5-Modulo");
        System.out.println("6-Square Root");
        System.out.println("7-Factorial");
        System.out.println("8-Natural Log");
        System.out.println("9-Power");
        System.out.println("10-Exit");
        System.out.print("Enter choice:");
    }   
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        boolean exit=true;
        int ch =11,a=0,b=0;
        while(exit){
            displayOptions();
            try{
                ch = sc.nextInt();
            }catch(Exception e){
                ch=11;
            }
            try {
                switch(ch){
                case 1:
                System.out.print("Enter value 1:");
                a = sc.nextInt();
                System.out.print("Enter value 2:");
                b = sc.nextInt();
                System.out.println(a+b);
                break;
                case 2:
                System.out.print("Enter value 1:");
                a = sc.nextInt();
                System.out.print("Enter value 2:");
                b = sc.nextInt();
                System.out.println(a-b);
                break;
                case 3:
                System.out.print("Enter value 1:");
                a = sc.nextInt();
                System.out.print("Enter value 2:");
                b = sc.nextInt();
                System.out.println(a*b);
                break;
                case 4:
                System.out.print("Enter value 1:");
                a = sc.nextInt();
                System.out.print("Enter value 2:");
                b = sc.nextInt();
                System.out.println(a/b);
                break;
                case 5:
                System.out.print("Enter value 1:");
                a = sc.nextInt();
                System.out.print("Enter value 2:");
                b = sc.nextInt();
                System.out.println(a%b);
                break;
                case 6:
                System.out.print("Enter value:");
                a = sc.nextInt();
                System.out.println(Math.sqrt(a));
                break;
                case 7:
                System.out.print("Enter value:");
                a = sc.nextInt();
                int fact=1;
                while(a>1){
                    fact*=a--;
                }
                if(fact<1){
                    System.out.println("Invalid value");
                }else{
                    System.out.println(fact);
                }
                break;
                case 8:
                System.out.print("Enter value:");
                a = sc.nextInt();
                System.out.println(Math.log(a));
                break;
                case 9:
                System.out.print("Enter value:");
                a = sc.nextInt();
                System.out.print("Enter power:");
                b = sc.nextInt();
                System.out.println(Math.pow(a, b));
                break;
                case 10:
                exit=false;
                break;
                default:
                System.out.println("Option not found");
        }
        }catch(Exception e){
            System.out.println("Invalid value entry");
        }
    }
    sc.close();
  }
}
