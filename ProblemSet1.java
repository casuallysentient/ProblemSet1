/**
 * Problem Set 1.
 *
 * It's time to put your skills to the test. This problem set focuses on using
 * primitive data types, variables, and basic operators and functions.
 *
 * The specifications for each exercise are outlined below. Your output is
 * expected to meet requirements set forth in this section (as well as the
 * Deliverables section).
 *
 * Work through these exercises on your own. Experiment, make mistakes, ask
 * questions, and fix your mistakes. It's the only way to get good at programming.
 */

public class ProblemSet1 {

  public static void main(String[] args) {

    /*
    * Exercise 1.
    *
    * What is the area (in square millimeters) of an 8.5-by-11-inch sheet of paper?
    */
    double width = 8.5;
    double length = 11;

    double millimetersInInch = 25.4;
    double widthInMillimeters = width * millimetersInInch;
    double lengthinMillimeters = length * millimetersInInch;
    double area = widthInMillimeters * lengthinMillimeters;
    System.out.printf("\n%,.2f square millimeters.\n", area);

    /*
    * Exercise 2.
    *
    * What is the perimeter (in centimeters) of an 8.5-by-11-inch sheet of paper?
    */
    double centimetersInInch = 2.54;
    double widthInCentimeters = width * centimetersInInch;
    double lengthInCentimeters = length * centimetersInInch;
    double perimeter = (widthInCentimeters * 2 + lengthInCentimeters * 2);
    System.out.printf("\n%,.2f centimeters.\n", perimeter);

    /*
    * Exercise 3.
    *
    * What is the length of the diagonal (in inches) between two corners on an 8.5-
    * by-11-inch sheet of paper?
    */
    double widthSquared = Math.pow(width, 2);
    double lengthSquared = Math.pow(length, 2);
    double diagonalLengthSquared = widthSquared + lengthSquared;
    double diagonalLength = Math.sqrt(diagonalLengthSquared);
    System.out.printf("\n%,.2f inches.\n", diagonalLength);

    /*
    * Exercise 4.
    *
    * Given the grading policy and the homework, quiz, and test grades I received,
    * what marking period grade will I get?
    */
    int homework1 = 88;
    int homework2 = 91;
    int homework3 = 0;
    int quiz1 = 84;
    int quiz2 = 89;
    int quiz3 = 93;
    int test1 = 74;
    int test2 = 87;
    int test3 = 82;

    double homeworkWeight = 0.15;
    double quizWeight = 0.35;
    double testWeight = 0.50;

    double averageHomeworkGrade = ((double) homework1 + (double) homework2 + (double) homework3) / 3;
    double averageQuizGrade = ((double) quiz1 + (double) quiz2 + (double) quiz3) / 3;
    double averageTestGrade = ((double) test1 + (double) test2 + (double) test3) / 3;

    double averageGrade = ((double) averageHomeworkGrade * homeworkWeight) + ((double) averageQuizGrade * quizWeight) + ((double) averageTestGrade * testWeight);

    System.out.printf("\n%,.2f%%.\n", averageGrade);


    /*
    * Exercise 5.
    *
    * I make $12.50/hour working as a cashier at a local supermarket. How much money
    * will I make this week?
    */
    double mondayHours = 7.5;
    double tuesdayHours = 8;
    double wednesdayHours = 10.5;
    double thursdayHours = 9.5;
    double fridayHours = 6;
    double saturdayHours = 11.5;
    double sundayHours = 0;
    double hourlyWage = 12.5;

    double totalHours = mondayHours + tuesdayHours + wednesdayHours + thursdayHours + fridayHours + saturdayHours + sundayHours;
    double totalPaycheck = totalHours * hourlyWage;

    System.out.printf("\n$%,.2f.\n",totalPaycheck);


    /*
    * Exercise 6.
    *
    * What is my take-home pay each check?
    */
    double salary = 117000;
    double weeklyPay = salary / 24;

    double retirementFund = 0.07 * weeklyPay;
    weeklyPay = weeklyPay - retirementFund;

    double federalTax = 0.24 * weeklyPay;
    weeklyPay = weeklyPay - federalTax;

    double stateTax = 0.0637 * weeklyPay;
    weeklyPay = weeklyPay - stateTax;

    System.out.printf("\n$%,.2f.\n",weeklyPay);

    /*
    * Exercise 7.
    *
    * I am planning a class trip next month. How many buses do I need, and how many
    * people will be on the last bus?
    */
    int numStudents = 273;
    int numTeachers = 28;
    int busCapacity = 54;

    int totalPassengers = numStudents + numTeachers;
    int numBuses = (int) (Math.ceil((double) totalPassengers / (double) busCapacity));
    int remainingPassengers = totalPassengers % busCapacity;

    System.out.println("\n" + numBuses + " buses are needed, with " + remainingPassengers + " passengers on the last bus.\n");

    /*
    * Exercise 8.
    *
    * What is the surface area of a standard Cornhole board?
    */
    double boardLength = 48;
    double boardWidth = 24;
    double holeDiameter = 6;

    double boardArea = boardLength * boardWidth;
    double holeArea = Math.pow(holeDiameter / 2, 2) * Math.PI;
    boardArea = boardArea - holeArea;

    System.out.printf("%,.2f square inches.\n", boardArea);

    /*
    * Exercise 9.
    *
    * Are the years 2020, 2100, and 2400 leap years?
    */



    /*
    * Exercise 10.
    *
    * What is the wind chill?
    */
    double temperature = 38;
    double windSpeed = 14;

    double windChill = 35.74 + (0.6215 * temperature) + ((0.4275 * temperature) - 35.75) * (Math.pow(windSpeed, 0.16));
    System.out.printf("\n%,.1f degrees.\n", windChill);
  }
}
