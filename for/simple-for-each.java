import java.util.*;
class ForEach{
  public static void main(String args[]){
   ArrayList<String> list = new ArrayList<String>();
   list.add("Print ");
   list.add("Every ");
   list.add("String");

  //enhanced for loop executes the code inside the loop once for each object in what you iterate over (list in this case)
  //The value of your iterator is equal to the object that the current iteration uses
  //this loop will print "Print Every String" with each word on a new line
   for(String s:list){
     System.out.println(s);
   }
 }
}
