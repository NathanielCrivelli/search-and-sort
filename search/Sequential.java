package search;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


/**
 * Write a description of class SequentialSearch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sequential
{
  
  /**
   * Returns the index of the target value, or -1 if not found
   */
  public static int search(int[] arr, int target) { /** pirate */
    // Your algorithm goes here!
    int psn = 0;
    Scanner input = new Scanner(System.in);
    int goal = System.in;
    while (psn > -1)
    {
      List[] result = new List[psn];
      psn += 1;
      System.out.println("SUCCESS! NUMBER IS AT POSITION " + psn +"!");
      if (System.in == goal)
      {
          
      }
    }
    return psn;
  }
  
  public static void main(String[] args) {
    int[] list = {53,85,93,25,39,27,42,5,24,45,33,51,5,80,4,7,91,
      31,66,71,32,19,79,58,61,82,89,63,7,4,50,10,48,24,75,19,22,
      73,54,51,25,33,20,52,79,97,70,54,63,49};
    int left, right, mid;
    
    printResult(82, search(list, 82) == 25);
    printResult(49, search(list, 49) == list.length-1);
    printResult(-4, search(list, -4) == -1);
  }
  
  public static void printResult(int target, boolean result) {
    System.out.println("Search for "+target+": "+((result) ? "CORRECT" : "INCORRECT"));
  }

}
