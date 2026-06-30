public class prac1 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println();

        int age = 20;
        double salary = 35000.75;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Rahul";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);
        System.out.println();

        int num1 = 50;
        double result = num1;

        System.out.println("Implicit");
        System.out.println("Integer: " + num1);
        System.out.println("Decimal: " + result);
        System.out.println();

        double res1 = 88.65;
        int number = (int) res1;

        System.out.println("Explicit");
        System.out.println("Decimal: " + res1);
        System.out.println("Integer: " + number);
    }
}