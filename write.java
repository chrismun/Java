import java.io.PrintStream;
import java.io.IOException;
import java.io.File;

import java.util.Random;

/*
    Writes 100 random integers to randomInts.txt
*/

public class Write {
 public static void main(String[] args) {
  try {

   PrintStream writer = new PrintStream(new File("randomInts.txt"));
   Random random = new Random();
   final int LIMIT = 100;

   for (int i = 0; i < LIMIT; i++) {
    writer.println(random.nextInt());
   }
   writer.close();

  } catch (IOException e) {
   System.out.println("An error occured while writing to the file");
  }

 }
}
