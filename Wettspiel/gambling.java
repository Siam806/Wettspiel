/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 12.03.2021
 * @author Siam
 */
  import java.util.Random;

public class gambling {


  public static void main(String[] args) {
    int money = 150;
    while (true) { 
      
      
      
      System.out.println("Willkommen im gambling paradise. Sie haben 150 Tokens zu beginn");
      System.out.println("1 = Flip    2 = Roulette    3 = Add Money   4 = Geld anzeigen");
      
      int menu = Terminal.readInt();
      if (menu == 1) {
        
        System.out.println("Willkommen in der Flip Zone");
        System.out.println("Geben Sie die Zahl ein, die Sie flippen wollen");
        int numberFlip = Terminal.readInt();
        if (money < numberFlip) {
          System.out.println("Leider nicht genug Geld");
          
        } // end of if
        else {
          int calcFlip = money - numberFlip;
          Random r = new Random();
          double randomValue = 1 + (100 - 1) * r.nextDouble();
          if (randomValue < 50 && randomValue > 0) {
            calcFlip = numberFlip *2; 
            money = money + calcFlip  ;
            System.out.println("Gewinn ! Jetzt haben Sie " + calcFlip +"Gewonnen");
            System.out.println("Ihr jetziger Kontostand ist: " + money);
          } // end of if
          else {
            System.out.println("Schade dieses Mal nicht");
          } // end of if-else
          
        } // end of if-else
        
        
      } // end of if
      
      
      else if (menu == 2) {
        System.out.println("Willkommen bei roulette");
        System.out.println("Tippen Sie red, black oder green ein");
        
        String roulette = Terminal.readString();
        System.out.println("Jetzt tippen Sie wieviel Sie wetten wollen ein");
        String colour;
        int rouletteWette = Terminal.readInt();
        money = money - rouletteWette;
       Random r = new Random();
       double randomValue = 1 + (100 - 1) * r.nextDouble();
       int randomNumber = (int) randomValue;

        if (randomNumber > 0 && randomNumber <= 45) {
          colour = "red";
          
          if (roulette.contains("red")) {
            System.out.println("win");
            System.out.println(colour + " " + money); 
          } // end of if
          else {
            System.out.println("lose");
          } // end of if-else
            System.out.println(randomNumber);
          System.out.println(roulette);
        } // end of if
        
        else if (randomNumber > 45 && randomNumber <= 90) {
          colour = "black";
          if (roulette.contains("black")) {
            System.out.println("win");
            System.out.println(colour + " " + money); 
          } // end of if
          else {
            System.out.println("lose");
          } // end of if-else
          System.out.println(randomNumber);
          System.out.println(roulette);
        }
        
        
        else if (randomNumber > 90 && randomNumber <= 100) {
          colour = "green";
          System.out.println("Test");
          if (roulette.contains("green")) {
            System.out.println("win");
            System.out.println(colour + "" + money); 
          } // end of if
            else {
            System.out.println("lose");
          } // end of if-else
             System.out.println(randomNumber);
          System.out.println(roulette);
        }
             
        
        
      }
      else if (menu == 3) {
        System.out.println("How much money you wanna add?");
        int moneyInput = Terminal.readInt();
        int moneyAdd = money + moneyInput;
        money = moneyAdd;
        System.out.println("Okay you added " + moneyInput +" to your account. Now you have " + money + " in your account"); 
        
        
      }
      else if (menu == 4) {
        System.out.println(money);
        
      }
      else if (menu == 5) {
        Random r = new Random();
        double randomValue = 1 + (100 - 1) * r.nextDouble();
        System.out.println(randomValue);
      }
      
      
      
      
    } // end of while
  } // end of main

} // end of class gambling

