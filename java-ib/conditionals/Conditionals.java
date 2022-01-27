import java.util.Scanner;

public class Conditionals {
  public static void runAllTasks() {
    Scanner scanner = new Scanner(System.in);

    task1(scanner);
    task2(scanner);
    task3(scanner);
    task4(scanner);
    task5(scanner);
    task6(scanner);
    task7(scanner);
    task8(scanner);
    task9(scanner);

    scanner.close();
  }

  private static void task1(Scanner scanner) {
    System.out.println("Task 1:");
    System.out.print("Input number: ");
    int number = scanner.nextInt();
    if (number > 0) {
      System.out.println("Number is positive");
    } else if (number < 0) {
      System.out.println("Number is negative");
    } else {
      System.out.println("Number is neither positive nor negative");
    }
  }

  private static void task2(Scanner scanner) {
    System.out.println("Task 2:");
    System.out.print("Input a: ");
    float a = scanner.nextFloat();
    System.out.print("Input b: ");
    float b = scanner.nextFloat();
    System.out.print("Input c: ");
    float c = scanner.nextFloat();

    double discriminant = b * b - 4 * a * c;

    if (discriminant > 0) {
      double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      System.out.println("The roots are " + root1 + " and " + root2);
    } else if (discriminant == 0) {
      double root = -b / (2 * a);
      System.out.println("The root is " + root);
    } else {
      System.out.println("No roots");
    }
  }

  private static void task3(Scanner scanner) {
    System.out.println("Task 3:");
    System.out.print("Input the 1st number: ");
    int num1 = scanner.nextInt();
    System.out.print("Input the 2nd number: ");
    int num2 = scanner.nextInt();
    System.out.print("Input the 3rd number: ");
    int num3 = scanner.nextInt();

    int greatest = Math.max(num1, Math.max(num2, num3));
    System.out.println("The greatest: " + greatest);
  }

  private static void task4(Scanner scanner) {
    System.out.println("Task 4:");
    System.out.print("Input a number: ");
    double num = scanner.nextDouble();

    if (num > 0) {
      System.out.println("positive");
    } else if (num < 0) {
      System.out.println("negative");
    } else {
      System.out.println("zero");
    }

    if (num < 1) {
      System.out.println("small");
    } else if (Math.abs(num) > 1000000) {
      System.out.println("large");
    }
  }

  private static void task5(Scanner scanner) {
    System.out.println("Task 5:");
    System.out.print("Input number: ");
    int day = scanner.nextInt();

    String dayName;
    if (day == 1) {
      dayName = "Monday";
    } else if (day == 2) {
      dayName = "Tuesday";
    } else if (day == 3) {
      dayName = "Wednesday";
    } else if (day == 4) {
      dayName = "Thursday";
    } else if (day == 5) {
      dayName = "Friday";
    } else if (day == 6) {
      dayName = "Saturday";
    } else if (day == 7) {
      dayName = "Sunday";
    } else {
      dayName = "Invalid day";
    }
    System.out.println(dayName);
  }

  private static void task6(Scanner scanner) {
    System.out.println("Task 6:");
    System.out.print("Input floating-point number: ");
    double num1 = scanner.nextDouble();
    System.out.print("Input floating-point another number: ");
    double num2 = scanner.nextDouble();
    float num1Parsed = ((float)(int)(num1 * 1000)) / 1000;
    float num2Parsed = ((float)(int)(num2 * 1000)) / 1000;

    if (num1Parsed == num2Parsed) {
      System.out.println("Numbers are the same");
    } else {
      System.out.println("Numbers are different");
    }
  }

  private static void task7(Scanner scanner) {
    System.out.println("Task 7:");
    System.out.print("Input a month number: ");
    int month = scanner.nextInt();
    System.out.print("Input a year: ");
    int year = scanner.nextInt();

    int days;
    String monthName;
    if (month == 1) {
      monthName = "January";
      days = 31;
    } else if (month == 2) {
      monthName = "February";
      if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
        days = 29;
      } else {
        days = 28;
      }
    } else if (month == 3) {
      monthName = "March";
      days = 31;
    } else if (month == 4) {
      monthName = "April";
      days = 30;
    } else if (month == 5) {
      monthName = "May";
      days = 31;
    } else if (month == 6) {
      monthName = "June";
      days = 30;
    } else if (month == 7) {
      monthName = "July";
      days = 31;
    } else if (month == 8) {
      monthName = "August";
      days = 31;
    } else if (month == 9) {
      monthName = "September";
      days = 30;
    } else if (month == 10) {
      monthName = "October";
      days = 31;
    } else if (month == 11) {
      monthName = "November";
      days = 30;
    } else if (month == 12) {
      monthName = "December";
      days = 31;
    } else {
      System.out.println("Invalid month");
      return;
    }

    System.out.println(monthName + " " + year + " has " + days + " days");
  }

  private static void task8(Scanner scanner) {
    System.out.println("Task 8:");
    System.out.print("Input an alphabet: ");
    String input = scanner.next();

    if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
      System.out.println("Invalid value: not a singular letter");
      return;
    }

    char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};
    char letter = Character.toLowerCase(input.charAt(0));
    boolean isVowel = false;

    for (int i = 0; i < VOWELS.length; i++) {
      if (letter == VOWELS[i]) {
        isVowel = true;
        break;
      }
    }

    if (isVowel) {
      System.out.println("Input letter is Vowel");
    } else {
      System.out.println("Input letter is Consonant");
    }
  }

  private static void task9(Scanner scanner) {
    System.out.println("Task 9:");
    System.out.print("Input the year: ");
    int year = scanner.nextInt();

    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
      System.out.println(year + " is a leap year");
    } else {
      System.out.println(year + " is not a leap year");
    }
  }
}
