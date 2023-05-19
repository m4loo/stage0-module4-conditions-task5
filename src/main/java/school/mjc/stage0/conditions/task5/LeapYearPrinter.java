package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        var result = "";
        if (year %4 == 0 && year % 100 != 0 || year % 400 == 0) {
            result = "leap";
        } else result = "not leap";
        System.out.println(result);
    }
}
