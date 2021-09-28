public class Time{
      public static void main(String[] args){
          int hour;
          int minute;
          int second;
          int secsScince12;
          int newSecsScince12;
          int secsLeft;
          double percentDay;
          int elapsedTime;

          hour=19;
          minute=10;
          second=22;
          secsScince12=second+(60*minute)+(3600*hour);
          secsLeft=86400-secsScince12;
          percentDay=secsScince12/86400.0;

          System.out.println(secsScince12); //seconds since midnight
          System.out.println(secsLeft); //seconds left in day
          System.out.println((percentDay*100)+"%"); //% day passed

          hour=19;
          minute=58;
          second=44;
          newSecsScince12=second+(60*minute)+(3600*hour);
          elapsedTime=newSecsScince12-secsScince12;

          System.out.println(elapsedTime+" seconds elapsed");

      }
    }
