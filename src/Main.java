public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {   //just make diff var
        System.out.println("Задача 1");
        int almostMillion = 999999;
        byte nice = 69;
        short zombies = -10000;
        long flowers = 648541248L;
        float g = 0.45F;
        double pi = 3.14;
        System.out.println("Значение переменной almostMillion с типом int равно " + almostMillion);
        System.out.println("Значение переменной zombies с типом byte равно " + nice);
        System.out.println("Значение переменной nice с типом short равно " + zombies);
        System.out.println("Значение переменной flowers с типом long равно " + flowers);
        System.out.println("Значение переменной g с типом float равно " + g);
        System.out.println("Значение переменной pi с типом double равно " + pi);
        System.out.println();

    }
    public static void task2 () {   //choose var
        System.out.println("Задача 2");
        float first = 27.12F;
        long second = 987687965549L;
        float third = 2.786F;
        short forth = 569;
        short fifth = -159;
        short sixth = 27897;
        byte seventh = 67;
        System.out.println("Good choose!");
        System.out.println();

    }
    public static void task3 () { //task about teachers and papers
        System.out.println("Задача 3");
        var ludmila = 23;
        var anna = 27;
        var kate = 30;
        var papers = 480;
        var students = ludmila+kate+anna;
        var paperPerstudent = papers/students;
        System.out.println("На каждого ученика рассчитано " + paperPerstudent + " листов бумаги.");
        System.out.println();
    }
    public static void task4 () {
        System.out.println("Задача 4");
        short machineBotle = 16;
        short machineTime = 2;
        short twenty = 20;
        short botlePerTwentyMin = (short) (twenty / machineTime * machineBotle);
        int botlePerDay = ((24*3) * botlePerTwentyMin);
        int botlePerTreeDay = 3 * botlePerDay;
        int botlePerMonth = 10 * botlePerTreeDay;
        System.out.println("За 20 минут машина произвела " + botlePerTwentyMin + " штук бутылок");
        System.out.println("За день машина произвела " + botlePerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + botlePerTreeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + botlePerMonth + " штук бутылок");
        System.out.println();
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte canOfPaint = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        int paintPerClass = whitePaintPerClass + brownPaintPerClass;
        int classes = canOfPaint / paintPerClass;
        int whitePaint = classes * whitePaintPerClass;
        int brownPaint = classes * brownPaintPerClass;
        System.out.println( "В школе, где " + classes + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");
        System.out.println();
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte banana = 5;
        byte bananaWeight = 80;
        int bananasWeight = banana * bananaWeight;
        int milkMillilitres = 200;
        int milkWeightPerHundreMillilitres = 105;
        int milkMass = milkMillilitres / 100 * milkWeightPerHundreMillilitres;
        int iceCream = 2;
        int iceCreamWeight = iceCream * 100;
        byte eggs = 4;
        byte eggWeight = 80;
        int eggsWeight = eggs * eggWeight;
        double cocktailWeight = bananasWeight + milkMass + iceCreamWeight +eggsWeight;
        double coctailWeightKilo = cocktailWeight / 1000;
        System.out.println("Завтрак весит " + cocktailWeight + " грамм или " + coctailWeightKilo + " килограмм.");
        System.out.println();

    }
    public static void task7 () {
        System.out.println("Задача 7");
        float needLoseKg = 7;
        float minG = 250;
        float minKg = minG / 1000;
        float maxG = 500;
        float maxKg = maxG / 1000;
        float dayIfMinLose = needLoseKg / minKg;
        float dayIfMaxLose = needLoseKg / maxKg;
        float dayMidle = (dayIfMinLose + dayIfMaxLose) / 2;
        System.out.println(" Чтобы сбросить 7 килограмм, спортсмену надо " + dayIfMinLose + " дней, если минимально сбрасывать вес, " + dayIfMaxLose + " дней, если максимально сбрасывать вес. В среднем необходимо " + dayMidle + " дней.");
        System.out.println();
    }
    public static void task8 () {
        System.out.println("Задача 8");
        double salaryMary = 67760;
        double salaryDen = 83690;
        double salaryKris = 76230;
        double upSalaryK = 1.1;
        double salaryMaryUp = salaryMary * upSalaryK;
        double salaryDenUp = salaryDen * upSalaryK;
        double salaryKrisUp = salaryKris * upSalaryK;
        double yearInMonth = 12;
        double salaryMaryYear = salaryMary * yearInMonth;
        double salaryDenYear = salaryDen * yearInMonth;
        double salaryKrisYear = salaryKris * yearInMonth;
        double salaryYearMaryUp = salaryMaryYear * upSalaryK;
        double salaryYearDenUp = salaryDenYear * upSalaryK;
        double salaryYearKrisUp = salaryKrisYear * upSalaryK;
        double diffBtvMarySalary = salaryYearMaryUp - salaryMaryYear;
        double diffBtvDenSalary = salaryYearDenUp - salaryDenYear;
        double diffBtvKrisSalary = salaryYearKrisUp - salaryKrisYear;
        System.out.println("Маша теперь получает " +  salaryMaryUp + " рублей. Годовой доход вырос на " + diffBtvMarySalary + " рублей");
        System.out.println("Денис теперь получает " +  salaryDenUp + " рублей. Годовой доход вырос на " + diffBtvDenSalary + " рублей");
        System.out.println("Кристина теперь получает " +  salaryKrisUp + " рублей. Годовой доход вырос на " + diffBtvKrisSalary + " рублей");

    }

}