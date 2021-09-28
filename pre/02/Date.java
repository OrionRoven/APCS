public class Date{
      public static void main(String[] args){
          String day;
          int date;
          String month;
          int year;

          day="Monday";
          date=27;
          month="September";
          year=2021;

          System.out.println("American format:");
          System.out.println(day+", "+month+" "+date+", "+year);
          System.out.println("European format:");
          System.out.println(day+" "+date+" "+month+" "+year);
      }
}
