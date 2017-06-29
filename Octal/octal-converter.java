import java.util.Scanner;
 
class Main {
  public static void main(String[] args)  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number in base 8:");
    int octal = scan.nextInt();
    int decimal, octal1;
    int digit8 = octal % 10;
    octal1 = (octal - digit8) / 10;
    int digit7 = octal1 % 10;
    octal1 = (octal1 - digit7) / 10;
    int digit6 = octal1 % 10;
    octal1 = (octal1 - digit6) / 10;
    int digit5 = octal1 % 10;
    octal1 = (octal1 - digit5) / 10;
    int digit4 = octal1 % 10;
    octal1 = (octal1 - digit4) / 10;
    int digit3 = octal1 % 10;
    octal1 = (octal1 - digit3) / 10;
    int digit2 = octal1 % 10;
    octal1 = (octal1 - digit2) / 10;
    int digit1 = octal1 % 10;
    decimal = (int) (digit1 * Math.pow(8,7) + digit2 * Math.pow(8,6) +  digit3 * Math.pow(8,5) +  digit4 * Math.pow(8,4) +  digit5 * Math.pow(8,3) +  digit6 * Math.pow(8,2) +  digit7 * Math.pow(8,1) + digit8 * Math.pow(8,0));
    if(digit1 >= 8 || digit2 >= 8 || digit3 >= 8 || digit4 >= 8 || digit5 >= 8 || digit6 >= 8 || digit7 >= 8 || digit8 >= 8) {
      System.out.print("ERROR: Incorrect Octal Format"); } else {
        System.out.print(decimal);
      }
  }
}
