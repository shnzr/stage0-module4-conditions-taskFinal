package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year > 0) {
            switch (month) {
                case 2 -> System.out.println (year % 100 == 0 ? (year % 400 == 0 ? 29 : 28) : (year % 4 == 0 ? 29 : 28));
                case 4, 6, 9, 11 -> System.out.println(30);
                case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
                default -> System.out.println("invalid date");
            }
        }
    }
}
