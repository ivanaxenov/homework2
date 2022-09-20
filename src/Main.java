public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("Задача 2");
        dog = dog + 4; // прибавил 4 для dog
        System.out.println(dog);
        cat = cat + 4; // прибавил 4 для cat
        System.out.println(cat);
        paper = paper + 4; // прибавил 4 для paper
        System.out.println(paper);
        System.out.println("Задача 3");
        var dog1 = 8.0; // сделал double
        dog1 = dog1 - 3.5; // отнял 3.5
        System.out.println(dog1);
        cat = cat - 1.6; // отнял 1.6
        System.out.println(cat);
        paper = paper - 7639; // отнял 7693
        System.out.println(paper);
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2; // прибавил 2
        System.out.println(friend);
        friend = friend / 7; // поделил на 7
        System.out.println(friend);
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println("Задание 6 и 7");
        var weightOfTheFirstBoxer = 78.2;
        var weightOfTheSecondBoxer = 82.7;
        var totalWeightOfBoxers = weightOfTheFirstBoxer + weightOfTheSecondBoxer;
        System.out.println(" Общий вес боксеров " + totalWeightOfBoxers + " кг ");
        // Задание 6
        var weightDifference = weightOfTheSecondBoxer - weightOfTheFirstBoxer;
        System.out.println(" Разница весов спорсменов " + weightDifference + " кг ");
        // Задание 7
        var weightRemaining = weightOfTheSecondBoxer % weightOfTheFirstBoxer;
        System.out.println(" Остаток в процентах " + weightRemaining);
        System.out.println("Задача 8");
        System.out.println("1)");
        var totalTime = 640;
        var personalTime = 8;
        var employees = totalTime / personalTime;
        System.out.println(" Всего работников в компании - " + employees + " человек ");
        System.out.println("2)");
        employees = employees + 94; // +94 сотрудника
        System.out.println(employees);
        var totalTime2 = employees * personalTime;
        System.out.println(" Если в компании работает " + employees + " человек, то всего " + totalTime2 + " часа " +
                " работы может быть определено между сотрудниками ");













    }
}