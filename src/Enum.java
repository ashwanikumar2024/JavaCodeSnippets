import java.util.*;
enum Days{MON, TUE, WED, THU, FRI, SAT, SUN;}

public class Enum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Days day = Days.WED;
        day = Days.TUE;

        //day = Days.valueOf(sc.next(). toUpperCase());

        System.out.println(day);
    }
}
