public class Time{
      public static void main(String[] args){
          int hour;
          int minute;
          int second;
          int secsScince12;
          int secsLeft;
          double percentDay;

          hour=20;
          minute=31;
          second=22;
          secsScince12=second+(60*minute)+(3600*hour);
          secsLeft=86400-secsScince12;
          percentDay=secsScince12/86400;

          System.out.println(secsScince12); //seconds since midnight
          System.out.println(secsLeft); //seconds left in day
          System.out.println("Percentage of day passed: "+(percentDay*100)+"%"); //% day passed

      }
    }
