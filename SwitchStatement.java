class SwitchStatement {
 public static void main(String[] arggs){
  String day = "Friday";

  switch(day){
   case "Sunday":
    System.out.println("today is Sunday");
   break;

   case "Monday":
    System.out.println("today is Monday");
   break;

   case "Tuesday":
    System.out.println("Today is tuesday");
   break;

   case "Wednesday":
    System.out.println("today is Wednesday");
   break;

   case "Thusday":
    System.out.println("today is Thusday");
   break;

   case "Friday":
    System.out.println("today is Friday");
   break;

   case "Saturday":
    System.out.println("today is Saturday");
   break;

   default:
    System.out.println("enter the Right day");
  }
 }
}