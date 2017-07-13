import java.util.Scanner;
class Main {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What planet are you on?");
    String planet = scan.nextLine().toLowerCase();
    System.out.println("What is your mass on earth, in kilograms?");
    double mass = scan.nextInt();
    calculateMass(planet, mass);
  }
  
 public static void calculateMass(String planet, double mass) {
   String returnState = "";
   int flag = 0;
   double weight = mass;
   switch(planet) {
     case "mercury" :
       weight = mass * 3.59;
       break;
      case "venus" :
        weight = mass * 8.87;
        break;
      case "earth" : 
        weight = mass * 9.81;
        break;
      case "moon" : 
        weight = mass * 1.62;
        break;
      case "mars" : 
        weight = mass * 3.77;
        break;
      case "jupiter" : 
        weight = mass * 25.95;
        break;
      case "saturn" : 
        weight = mass * 11.08;
        break;
      case "uranus" : 
        weight = mass * 10.67;
        break;
      case "neptune" : 
        weight = mass * 14.07;
        break;
      case "pluto" : 
        weight = mass * 0.42;
        break;
      default : 
        returnState = "Error: Planet not found. Please try again.";
        flag = 1;
        break;
   }
      if(flag != 1) {
        returnState = "Your weight on " + planet + " is " + weight + "Newtons.";
      }
      System.out.print(returnState);
   }
 }


