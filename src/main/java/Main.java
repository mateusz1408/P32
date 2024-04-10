// import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj długość przyprostokątnej: ");
    int bok = scanner.nextInt();

    for(int i = 0; i < bok; i++) {
      for(int j = 0; j < bok; j++) {
        if(j == 0 || i == bok-1 || i == j){
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("   ");
      for(int j = 0; j < bok; j++) {
        if(j == bok-1 || i == bok-1 || i== bok - j -1) {
          System.out.print("*");
        } else {
          System.out.print(" ");
          }
        }
        System.out.println();
    }

  }
 
}