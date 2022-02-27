import java.util.*;
import java.io.*;

class Harry {
  public static void main(String[] args) throws Exception {
    File file = new File("harry.dat");
    Scanner scnr = new Scanner(file);
    int count = scnr.nextInt();
    scnr.nextLine();
    for (int i = 0; i < count; i++) {
      String line = scnr.nextLine();
      String[] strArr = line.split(" ");
      String[] strA = strArr[0].split("");
      String[] strB = strArr[1].split("");
      // System.out.println(Arrays.toString(strArr));
      for (int j = 0; j <= strArr[0].length(); j++) { // j = each letter
        if (Arrays.asList(strB).contains("g")) {

        }
        // System.out.println(Arrays.toString(strArr));
      }
    }
  }
}

class Diana {
  public static void main(String[] args) throws Exception {
    File file = new File("diana.dat");
    Scanner scnr = new Scanner(file);
    while(scnr.hasNext()) {
      double [] nums = new double[6];
      for (int j = 0; j < nums.length; j++) {
        String s = scnr.next();
        nums[j] = Double.parseDouble(s);
      }
      double distance = Math.sqrt(Math.pow((nums[3]-nums[0]),2)+Math.pow(nums[4]-nums[1],2)+Math.pow(nums[5]-nums[2],2));
      System.out.printf("%.2f\n", distance);
    }
  }
}

class Carolyn {
  public static void main(String[] args) throws Exception {
    File file = new File("carolyn.dat");
    Scanner scnr = new Scanner(file);
    int count = scnr.nextInt();
    scnr.nextLine();
    for (int i = 0; i < count; i++) { // i = line
      String line = scnr.nextLine();
      Integer diff = Math.abs(line.charAt(1) - line.charAt(0));
      if (line.charAt(0) <= line.charAt(1)) {
        // sequence in order
        // System.out.println(line + " is a correct sequence with a difference of " + diff);
        for (int j = 0; j <= diff; j++) { // j = actual letter
          char firstLetter = line.charAt(0);
          String letterString = "";
          for (int k = 1; k <= j + 1; k++ ) { // k = number of times to print letter
            letterString += (Character.toString(firstLetter + j));
          }
          System.out.println(letterString);
        }
      } else {
        // seq. not in order
        // System.out.println(line + " is not a correct sequence with a difference of " + diff);
        for (int j = 0; j <= diff; j++) { // j = actual letter
          char firstLetter = line.charAt(0);
          String letterString = "";
          for (int k = 1; k <= j + 1; k++ ) { // k = number of times to print letter
            letterString += (Character.toString(firstLetter - j));
          }
          System.out.println(letterString);
        }
      }
    }
  }
}

class Anastasia {
  public static void main(String[] args) throws Exception {
    for (int i = 0; i <= 20; i++) {
      int num = 20 - i;
      int numsq = num*num;
      System.out.println("The square root of " + numsq + " is " + num);
    }
  }
}

class DryRun {
  public static void main(String[] args) throws Exception {
    File file = new File("dryrun.dat");
    Scanner scnr = new Scanner(file);
    int count = scnr.nextInt();
    scnr.nextLine();
    for (int i = 0; i < count; i++) {
      String line = scnr.nextLine();
      System.out.printf("I like %s.\n", line);
    }
  }
}