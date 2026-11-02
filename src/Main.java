import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter exercise number (1-10): ");
        int exercise = scanner.nextInt();

        if (exercise == 1) {
            f1();
        } else if (exercise == 2){
            f2();
        } else if (exercise == 3){
            f3();
        } else if (exercise == 4){
            f4();
        } else if (exercise == 5){
            f5();
        } else if (exercise == 6){
            f6();
        } else if (exercise == 7){
            f7();
        } else if (exercise == 8){
            f8();
        } else if (exercise == 9){
            f9();
        } else if (exercise == 10){
            f10();
        } else {
            System.out.println("Invalid exercise number.");
        }
    }

    public static void f1() {
        String name;
        int age;
        float height;
        char lastNameInitial;

        System.out.print("enter name: ");
        name = scanner.next();
        System.out.print("enter age: ");
        age = scanner.nextInt();
        System.out.print("enter height: ");
        height = scanner.nextFloat();
        System.out.print("enter last name initial: ");
        lastNameInitial = scanner.next().charAt(0);

        System.out.println("\nName: " + name +
                "\nAge: " + age +
                "\nHeight: " + height +
                "\nLast name initial: " + lastNameInitial +
                "\nAge in 10 years: " + (age + 10));
    }

    public static void f2() {
        int seconds, minutes, hours;

        System.out.print("Enter seconds: ");
        seconds = scanner.nextInt();
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = seconds - (hours * 3600 + minutes * 60);

        System.out.println("Hours: "+ hours);
        System.out.println("Minutes: "+ minutes);
        System.out.println("Seconds: "+ seconds);
    }

    public static void f3() {
        float bill,tip ,total;
        int tipPercent, people;

        System.out.print("Bill: ");
        bill = scanner.nextFloat();
        System.out.print("Tip percentage: ");
        tipPercent = scanner.nextInt();
        System.out.print("People: ");
        people = scanner.nextInt();
        tip = bill * ((float)tipPercent / 100);
        total = bill + tip;

        System.out.println("Tip: " + tip +
                "\nTotal: " + total +
                "\nPer person: " + total/((float)people));

    }

    public static void f4() {
        float basePrice, discountTotal, total,
                itemPrice1, itemPrice2, itemPrice3;
        int itemSold1, itemSold2, itemSold3,
                discount1, discount2, discount3;

        System.out.print("\nEnter the price of a computer: ");
        itemPrice1 = scanner.nextFloat();
        System.out.print("\nEnter the discount: ");
        discount1 = scanner.nextInt();
        System.out.print("\nEnter the amount sold: ");
        itemSold1 = scanner.nextInt();

        System.out.print("\nEnter the price of a keyboard: ");
        itemPrice2 = scanner.nextFloat();
        System.out.print("\nEnter the discount: ");
        discount2 = scanner.nextInt();
        System.out.print("\nEnter the amount sold: ");
        itemSold2 = scanner.nextInt();

        System.out.print("\nEnter the price of a mouse: ");
        itemPrice3 = scanner.nextFloat();
        System.out.print("\nEnter the discount: ");
        discount3 = scanner.nextInt();
        System.out.print("\nEnter the amount sold: ");
        itemSold3 = scanner.nextInt();

        basePrice = itemPrice1 * itemSold1 +
                itemPrice2 * itemSold2 +
                itemPrice3 * itemSold3;
        discountTotal = discount1 / (float)100.0  * itemPrice1 * itemSold1 +
                discount2 / (float)100.0 * itemPrice2 * itemSold2 +
                discount3 / (float)100.0  * itemPrice3 * itemSold3;
        total = basePrice - discountTotal;

        System.out.println("\nThe total base price is: " + basePrice +
                "\nThe total discount is: " + discountTotal +
                "\nThe total is: " + total);

    }

    public static void f5() {
        int dist, time;
        float hours, avgSpeed;

        System.out.print("\nDistance: ");
        dist = scanner.nextInt();
        System.out.print("\nTime in minutes: ");
        time = scanner.nextInt();

        hours = (float)time / 60;
        avgSpeed = dist / hours;

        System.out.println("\n\nTime in hours: " + hours +
                "\nAverage speed: " + avgSpeed +
                " km/h\nDistance in one hour: " + avgSpeed + " km");
    }

    public static void f6() {
        int assignments, quiz, finalExam;
        float finalGrade;

        System.out.print("\nAssignments: ");
        assignments = scanner.nextInt();
        System.out.print("\nQuiz: ");
        quiz = scanner.nextInt();

        System.out.print("\nFinal Exam: ");
        finalExam = scanner.nextInt();

        finalGrade = assignments * (float)0.2 + quiz * (float)0.3  + finalExam * (float)0.5;

        if (finalGrade > 60.0){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public static void f7() {
        int a, b;

        System.out.print("\na: ");
        a = scanner.nextInt();
        System.out.print("b: ");
        b = scanner.nextInt();

        if (a > b){
            System.out.println("a is bigger than b");
        } else if (a < b){
            System.out.println("b is bigger than a");
        } else {
            System.out.println("a and b are equal");
        }

        if (a % 2 == 0) {
            System.out.println("a is even");
        } else {
            System.out.println("a is odd");
        }

        if (b % 5 == 0){
            System.out.println("b is devisable by 5");
        } else {
            System.out.println("b is nit devisable by 5");
        }

        if (a+b > 0){
            System.out.println("a+b is positive");
        } else if (a+b < 0){
            System.out.println("a+b is negative");
        } else {
            System.out.println("a+b equals 0");
        }
    }

    public static void f8() {
        int age;

        System.out.print("\nage: ");
        age = scanner.nextInt();

        if (age < 6 && age >= 0){
            System.out.println("\nThe ticket is free");
        } else if (age >= 6 && age <= 17){
            System.out.println("\nThe price is 30 shekels");
        } else if (age >= 18 && age <= 64){
            System.out.println("\nThe price is 45 shekels");
        } else if (age >= 65){
            System.out.println("\nThe price is 25 shekels");
        } else {
            System.out.println("\nInvalid age");
        }
    }

    public static void f9() {
        String word;

        System.out.print("Enter word: ");
        word = scanner.next();

        System.out.println("Uppercase: " + word.toUpperCase() +
                "\nLowercase: " + word.toLowerCase() +
                "\nFirst character: " + word.charAt(0) +
                "\nLast character: " + word.charAt(word.length() - 1));
    }

    public static void f10() {
        // אf
        int a1 = 7;
        int b1 = 2;

        System.out.println(a1 / b1); // 3
        System.out.println(a1 / 2.0); // 3.5
        // בהדפסה הראשונה שלם מתחלק בשלם לכן התשובה מחושבת כשלם
        // בהדפסה השניה a מחולק במספר float אז גם התשובה מחושבת כ-float

        // ב
        int num = 2147483647;

        System.out.println(num); // 2147483647
        System.out.println(num + 1); //-2147483648
        // 2147483647 הוא int בעל 32 סיביות החיובי הכי גדול
        // בגלל מבנה כל מספר מסומן, כאשר מוסיפים למספר הכי גדול מתקבל המספר השלילי הגדול ביותר

        // ג
        double a2 = 0.1;
        double b2 = 0.2;

        System.out.println(a2 + b2); // 0.30000000000000004
        System.out.println(a2 + b2 == 0.3); // false
        // בגלל מבנה המחשב, אי אפשר להציג את 0.1 בדרך מדויוקת, אז כאשר מוסיפים מספרים אילו, לא מתקבל 0.3 בדיוק

        // ד
        float smallPrecision = 100000000.0f;
        double highPrecision = 100000000.0;

        System.out.println(smallPrecision + 1); // 1.0E8
        System.out.println(highPrecision + 1); // 1.00000001E8
        // double  מדוייק יותר
    }

}