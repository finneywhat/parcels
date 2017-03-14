import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console console = System.console();

    System.out.println("Enter the length of your parcel (in feet)");
    Integer userLength = Integer.parseInt(console.readLine());
    System.out.println("Enter the width of your parcel (in feet)");
    Integer userWidth = Integer.parseInt(console.readLine());
    System.out.println("Enter the height of your parcel (in feet)");
    Integer userHeight = Integer.parseInt(console.readLine());
    System.out.println("How much does your parcel weigh (in lbs)?");
    Integer userWeight = Integer.parseInt(console.readLine());

    Parcels newParcel = new Parcels(userLength, userWidth, userHeight, userWeight);
    Integer parcelVolume = newParcel.calculateVolume();
    Integer parcelCost = newParcel.costToShip(parcelVolume);

    System.out.println("Your parcel is " + newParcel.calculateVolume() + " cubic feet and weighs " + userWeight + " pounds.");

    Boolean answered = false;
    while (!answered) {
      String userDeliverySpeed = console.readLine("How quickly do you need your parcel delivered?\nOvernight or regular?");
      if (userDeliverySpeed.equals("Overnight")) {
      System.out.println("Your parcel costs $" + parcelCost * 2 + ".00 to ship overnight.");
      answered = true;
    } else if (userDeliverySpeed.equals("regular")){
      System.out.println("Your parcel costs $" + parcelCost + ".00 to ship by ground.");
      answered = true;
    } else {
      System.out.println("Answer the goddamn question correctly");
    }}


    answered = false;
    while(!answered){
      String wrappingCost = console.readLine("\nWould you like to wrap your parcel?\nYes? No?");
      wrappingCost.toLowerCase();
      if(wrappingCost.equals("yes")){
        System.out.println(newParcel.surfaceArea(newParcel.mLength, newParcel.mHeight, newParcel.mWidth));
        answered = true;
      } else if(wrappingCost.equals("no")) {
        answered = true;
      } else {
        System.out.println("\nAnswer the goddamn question correctly\n");
      }
    }
    // System.out.println(parcelCost);

    // System.out.println(newParcel.costToShip());

  }
}
