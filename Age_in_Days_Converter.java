```java
import java.util.Scanner;

public class AgeInDaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age in years: ");
        int ageInYears = scanner.nextInt();
        int ageInDays = ageInYears * 365;
        System.out.println("Your age in days is: " + ageInDays);
    }
}
```