package day23;

import java.util.*;
class Main
{
  public static void main(String args[])
  {
    
    Scanner sc = new Scanner(System.in);
    int hrs1 = sc.nextInt();
    int minutes1 = sc.nextInt();
    int sec1 = sc.nextInt();
    
    int hrs2 = sc.nextInt();
    int minutes2 = sc.nextInt();
    int sec2 = sc.nextInt();
    
    int totalSec = 0;
    int totalMin = 0;
    int totalHr = 0;
    
    totalSec = (sec1 + sec2);
    
    if(totalSec > 60) {
      totalSec = (sec1 + sec2)-60;
      totalMin = (minutes1 + minutes2)+1;
    } else {
      totalMin = (minutes1 + minutes2);
    }
    
    
    if(totalMin > 60 ) {
      totalMin = totalMin - 60;
      totalHr = hrs1 + hrs2 + 1;
    } else {
    totalHr = hrs1 + hrs2;
    }
    
    System.out.println("Time after add:"+totalHr+":"+totalMin+":"+totalSec);
  }
}
