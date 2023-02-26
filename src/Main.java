public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();

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
    public static void task4 () {
        System.out.println("Задача 4");
        byte manufacturedBottles = 16;
        byte taktTime = 2;
        byte twentyMinutes = 20;
        short dayMinutes = 1440;
        short threeDaysminutes = 4320;
        int oneMonthminutes = 43200;
        int producedTwentyminutes = twentyMinutes / taktTime * manufacturedBottles;
        int producedDayminutes = dayMinutes / taktTime * manufacturedBottles;
        int producedThreedaysMinutes = threeDaysminutes / taktTime * manufacturedBottles;
        int producedOnemonthMinutes = oneMonthminutes / taktTime * manufacturedBottles;
        System.out.println("За 20 минут машина произвела " + producedTwentyminutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + producedDayminutes + " штук бутылок.");
        System.out.println("За три дня машина произвела " + producedThreedaysMinutes + " штук бутылок.");
        System.out.println("За месяц машина произвела " + producedOnemonthMinutes + " штук бутылок.");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalPaintcans = 120;
        byte whitePaintcansOnclass = 2;
        byte brownPaintcansOnclass = 4;
        int totalNumberclass = (totalPaintcans) / (whitePaintcansOnclass + brownPaintcansOnclass);
        int totalWhitepaintCans = totalNumberclass * whitePaintcansOnclass;
        int totalBrownpaintCans = totalNumberclass * brownPaintcansOnclass;
        System.out.println("В школе, где " + totalNumberclass + " классов, нужно " + totalWhitepaintCans + " банок белой краски и " + totalBrownpaintCans + " банок коричневой краски.");
    }
}