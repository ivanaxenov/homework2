public class Main {
    public static void main(String[] args) {
        double dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 2; // прибавил 2 для dog
        System.out.println(dog);
        dog = dog - 3.5; // отнял 3.5
        System.out.println(dog);
        cat = cat + 2; // прибавил 2 для cat
        System.out.println(cat);
        cat = (int) (cat - 1.6); // отнял 1.6
        System.out.println(cat);
        paper = paper + 2; // прибавил 2 для paper
        System.out.println(paper);
        paper = paper - 7639; // отнял 7693
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2; // прибавил 2
        System.out.println(friend);
        friend = friend / 7; // поделил на 7
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var WeightOfTheFirstBoxer = 78.2;
        var WeightOfTheSecondBoxer = 82.7;
        var TotalWeightOfBoxers = WeightOfTheFirstBoxer + WeightOfTheSecondBoxer;
        System.out.println(" Общий вес боксеров " + TotalWeightOfBoxers + " кг ");
        var WeightDifference= WeightOfTheSecondBoxer - WeightOfTheFirstBoxer;
        System.out.println(" Разница весов спорсменов " + WeightDifference + " кг ");
        var WeightRemaining = WeightOfTheSecondBoxer % WeightOfTheFirstBoxer;
        System.out.println(" Остаток в процентах " + WeightRemaining);











    }
}