package Practice.Introduction.Day_12_Date_and_Time;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        // The Calendar class is an abstract class
        // Get Instance of Calendar...
        Calendar cd = Calendar.getInstance();
        String dayName = "";

        // Sets the values for the calendar fields YEAR, MONTH, and DAY_OF_MONTH
        cd.set(Calendar.YEAR, year);
        cd.set(Calendar.MONTH, month-1);
        cd.set(Calendar.DAY_OF_MONTH, day);

        int dayNumber = cd.get(Calendar.DAY_OF_WEEK);

        switch (dayNumber){
            case 1: return dayName = "SUNDAY";
            case 2: return dayName = "MONDAY";
            case 3: return dayName = "TUESDAY";
            case 4: return dayName = "WEDNESDAY";
            case 5: return dayName = "THURSDAY";
            case 6: return dayName = "FRIDAY";
            case 7: return dayName = "SATURDAY";
        }

        return dayName;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

