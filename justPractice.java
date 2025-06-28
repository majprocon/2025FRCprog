public final class Main {

    public static void main(String... args) {
      
      double lenght = 25.7;
      double width = 25.7;
      double areaOfRectangle = (lenght * width);
      System.out.println("The area of the rectangule is " + areaOfRectangle);

      int time = 10;
      int distance = 100;
      int speed = (distance / time);
      System.out.println(speed + "mph");
      
      double precentage = 0.45;
      double calc = (100) * precentage;
      System.out.println("The battery precentage is " + calc);

      if (precentage == 100){
        System.out.println("FULL");
      } else if (precentage <= 50){
        System.out.println("NOT FULL YET");
      } else if (precentage < 10){
        System.out.println("NOT FULL");
      }

      int range = 10;
      if (range < 5){
        System.out.println("Not Close");
      } else if (range == 10){
        System.out.println("Close");
      }

      String mode = ("easy");
      if (mode == "hard"){
        System.out.println("This is Hard");
      } else if (mode == "medium"){
        System.out.println("This is Medium");
      } else if (mode == "easy"){
        System.out.println("This is Easy");
      }

      boolean seatbelt = true, airbag = true, doorClosed = true;
      if (seatbelt && airbag && doorClosed){
        System.out.println("You are good to go");
      } else {
        System.out.println("U R NOT SAFE!");
      }

    }
