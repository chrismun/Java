import java.util.Scanner;

public class Calculator {

public static int Multiply(int x, int y){
int product = x * y;
return product;
}

public static int Divide(int x, int y){
int quotient = x / y;
return quotient;
}

public static int Add(int x, int y){
int sum = x + y;
return sum;
}

public static int Subtract(int x, int y){
int difference = x - y;
return difference;
}

public static void main(String[]args){

Scanner scan = new Scanner(System.in);
System.out.println("Enter the first number");
int x = scan.nextInt();
System.out.println("Enter the second number");
int y = scan.nextInt();
System.out.println("Which operation would you like to do? (x*y x/y x+y x-y)");
System.out.println("1: Multiplication, 2: Division, 3: Addition, 4: Subtraction   (type 1 2 3 or 4");
int input = scan.nextInt().trim();
if(int input==1){
  System.out.println(x + " * " + y + "=" + Multiply(x,y));
}
else if (int input==2) {
  System.out.println((x + " / " + y + "=" + Divide(x,y));
}
else if (int input==3) {
  System.out.println((x + " + " + y + "=" + Add(x,y));
}
else if (int input==4) {
  System.out.println((x + " - " + y + "=" + Subtract(x,y));
}                 
}
}
