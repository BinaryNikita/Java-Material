package Exception;
/*17  Write a program  for exception handling. Which will take 
 two command line arguments from the user if the user does not
 provide that  arguments it should throw exception */


 import java.util.*; 
 class CommandLineArgs {
  public static void main(String[] args) {
      try {
          if (args.length != 2) {
              throw new IllegalArgumentException("Please provide exactly two command-line arguments.");
          }

          String arg1 = args[0];
          String arg2 = args[1];

          System.out.println("Argument 1: " + arg1);
          System.out.println("Argument 2: " + arg2);

      } catch (IllegalArgumentException e) {
          System.out.println("Error: " + e.getMessage());
          System.out.println("Usage: java CommandLineArgs <arg1> <arg2>");
      }
  }
}