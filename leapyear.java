import java.lang.*;
import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year;
        int count=0;
        year = s.nextInt();
        do{
            year++;
            if ((year % 400 == 0)|| (year % 4 == 0 && year % 100 != 0)){
                System.out.print(year + " ");
                count++;
            }
            
        }
        while(count!=20);
    }
}
