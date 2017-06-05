import java.util.*;
class Main {

  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in); //scanner for system input in main

  ArrayList<Event> events = new ArrayList<Event>();   //all the events added here
  ArrayList<Event> thisHour = new ArrayList<Event>(); //used for printing events each hour
  String userInput = "";
  String userInput2;
  boolean anotherEvent = true;
  String name;
  int hour;
  int minute;
  String aHour;
  String aMinute;
  String ampm;
  String outAMPM;


  // Gets the events from the user
  do {
    System.out.println("Do you have any events? (yes/no)");
    userInput = scan.nextLine().trim().toLowerCase();
    while(!(userInput.equals("no") || userInput.equals("yes"))) {
    	System.out.println("Invalid input. Try again!");
        userInput = scan.nextLine().trim().toLowerCase();
    }
    anotherEvent = false;
    if(userInput.equals("yes")){
    	anotherEvent = true;
    }
    if(anotherEvent) {
      System.out.println("What would you like to name your event?");
      name = scan.nextLine();
      System.out.println("OK. What time is this event at? (ex. '1:45 pm')");
      userInput = scan.nextLine();
      if(userInput.length() == 7) {
        aHour = userInput.substring(0,1);
        aMinute = userInput.substring(2,4);
        ampm = userInput.substring(5);
      } else {
        aHour = userInput.substring(0,2);
        aMinute = userInput.substring(3,5);
        ampm = userInput.substring(6);
      }
      hour = Integer.parseInt(aHour);
      minute = Integer.parseInt(aMinute);
      events.add(new Event(hour, minute, ampm, name));
    }

  } while (anotherEvent);



  //prints schedule out
   for(int i = 0; i < 24; i++) {
     System.out.println(i + ":00 " + "--------------------------------------------------");
     for(Event e : events) {
       if( e.getMilitaryHour() == i) {
    	   thisHour.add(e);
       }
     }
     for(int j = 0; j < 60; j++) {
    	 for(int x = 0; x < thisHour.size(); x++) {
    		 if(Integer.parseInt(thisHour.get(x).getMinute()) < j) {
    			 System.out.println("     " + thisHour.get(x).getName() + " at " + thisHour.get(x).getHour() + ":" + thisHour.get(x).getMinute() + " " + thisHour.get(x).getAmPm());
    			 thisHour.remove(thisHour.get(x));
    			 x--;
    		 }
    	 }

     }
   }
  }
}
