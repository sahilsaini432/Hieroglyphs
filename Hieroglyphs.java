/**
* Program for coverting numbers into Egyptian hieroglyphs .
@author Sahil Saini
*/
import java.util.* ;
public class Hieroglyphs {
  public static void main(String[] args) {
    int num ;
    int sum = 0 , remainder =0 ;
    int counter =0 , check ;
    Scanner userIn = new Scanner(System.in) ;
    System.out.print("Please enter a number between 1 and 9999999: ") ;
    int number = userIn.nextInt() ;
    while((number<1)||(number>9999999)){
      System.out.println("Invalid input. You must enter a number between 1 and 9999999.");
      System.out.print("Please enter another number now: ") ;
      number = userIn.nextInt() ;
    }
    num = number ;
    System.out.println("\n" + number + " in Egyptian hieroglyphs is : ");
    while (num!=0) {
      remainder = num % 10;
      num = num/10;
      sum = sum*10 + remainder ;
      counter ++;
    }
    while (counter>0) {
      // int count  = counter ;
      remainder = sum % 10;
      if(counter==1) {
        switch (remainder) {
          case 1: case 2: case 3: case 5: case 6: case 9:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=3)) {
              System.out.print("|");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
          case 4: case 7: case 8:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=4)) {
              System.out.print("|");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
        }
      }
      else if(counter==2) {
        switch (remainder) {
          case 1: case 2: case 3: case 5: case 6: case 9:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=3)) {
              System.out.print("n");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
          case 4: case 7: case 8:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=4)) {
              System.out.print("n");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
        }
      }
      else if(counter==3) {
        switch (remainder) {
          case 1: case 2: case 3: case 5: case 6: case 9:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=3)) {
              System.out.print("@");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
          case 4: case 7: case 8:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=4)) {
              System.out.print("@");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
        }
      }
      else if(counter==4) {
        switch (remainder) {
          case 1: case 2: case 3: case 5: case 6: case 9:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=3)) {
              System.out.print("*");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
          case 4: case 7: case 8:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=4)) {
              System.out.print("*");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
        }
      }
      else if(counter==5) {
        switch (remainder) {
          case 1: case 2: case 3: case 5: case 6: case 9:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=3)) {
              System.out.print(")");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
          case 4: case 7: case 8:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=4)) {
              System.out.print(")");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
        }
      }
      else if(counter==6) {
        switch (remainder) {
          case 1: case 2: case 3: case 5: case 6: case 9:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(remainder<=3)) {
              System.out.print("&");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
          case 4: case 7: case 8:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=4)) {
              System.out.print("&");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
        }
      }
      else if(counter==7) {
        switch (remainder) {
          case 1: case 2: case 3: case 5: case 6: case 9:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=3)) {
              System.out.print("W");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
          case 4: case 7: case 8:
          while(remainder>0) {
            check = 1;
            while((remainder>0)&&(check<=4)) {
              System.out.print("W");
              remainder--;
              check++;
              }
            System.out.println("\n");
          }
          break;
        }
      }
    counter--;
    sum = sum/10;
    }
  }
}
