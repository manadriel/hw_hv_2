public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //task5();
        //task6();
        //task7();
        //task8();
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
        System.out.println("За машина произвела … штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println("frog =" + frog);
        frog = frog * 10;
        System.out.println("frog * 10 =" + frog);
        frog = frog / 3.5;
        System.out.println("frog / 3.5 =" + frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxers = boxer1 + boxer2;
        System.out.println("Boxers =" + boxers);
        var differense = boxer1 - boxer2;
        System.out.println("Differense = " + differense);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var differense = boxer2 % boxer1;
        System.out.println("Differense = " + differense);
        differense = boxer2 - boxer1;
        System.out.println("Differense = " + differense);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        var hours = 680;
        var hoursPerWorker = 8;
        var workers = hours/hoursPerWorker ;
        System.out.println("Всего работников в компании — " + workers + " человек");
        workers = workers + 94;
        hours = hoursPerWorker * workers;
        System.out.println("Если в компании работает " + workers + " человек, то всего " + hours + " часов работы может быть поделено между сотрудниками");

    }

}