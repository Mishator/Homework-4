public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();

}
public static void task1 () {
    System.out.println("Задача 1");
    byte a = 100;
    int b = 567980;
    short c = 12780;
    long d = 1659345L;
    float e = 1.5678F;
    double f = 3.2537825679;
    System.out.println("byte a = " + a);
    System.out.println("int b = " + b);
    System.out.println("short c = " + c);
    System.out.println("long d = " + d);
    System.out.println("float e = " + e);
    System.out.println("double f = " + f);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte lyudmilaTeacher = 23;
        byte annaTeacher = 27;
        byte ekaterinaTeacher = 30;
        short purchasedSheets = 480;
        int totalStudents = lyudmilaTeacher + annaTeacher + ekaterinaTeacher;
        int sheetsPerstudent = purchasedSheets / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsPerstudent + " листов бумаги.");
    }
}