public class Main {
    public static void main(String[] args) {
        System.out.println("Первое задание");
        double dog = 8;
        System.out.println(dog);
        dog = dog + 4;
        System.out.println(dog);
        dog = dog - 3.5;
        System.out.println(dog);

        System.out.println("Второе задание");
        var cat = 3.6;
        System.out.println(cat);
        cat = cat + 4;
        System.out.println(cat);
        cat = cat - 1.6;
        System.out.println(cat);

        System.out.println("Третье задание");
        var paper = 763789;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);

        System.out.println("Четвертое задание");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Пятое задание");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("Шестое задание");
        var weightBox1 = 78.2;
        var weightBox2 = 82.7;
        var commonWeight = weightBox1 + weightBox2;
        System.out.println("Общий вес боксеров составляет " + commonWeight + "кг" );
        var weightDifference = weightBox2 - weightBox1;
        System.out.println("Разница в весе составляет " + weightDifference + "кг" );

        System.out.println("Седьмое задание");
        var weightBox01 = 78.2;
        var weightBox02 = 82.7;
        var weightDifference1 = weightBox02 - weightBox01;
        System.out.println("Первая разница в весе через вычитание от бОльшего составляет " + weightDifference1 + "кг" );
        var weightDifference2 = weightBox02 % weightBox01;
        System.out.println("Вторая разница в весе через функцию остатка от деления составляет " + weightDifference2 + "кг" );

        System.out.println("Восьмое задание 01");
        var commonClock01 = 640;
        var clockForOneEmployee01 = 8;
        var wholeWorkers01 = commonClock01 / clockForOneEmployee01;
        System.out.println("Всего работников в компании – " + wholeWorkers01 + " человек");

        System.out.println("Восьмое задание 02");
        var commonClock02 = 640;
        var wholeWorkers02 = 94;
        var clockForOneEmployee02 =  commonClock02 / wholeWorkers02;
        System.out.println("Если в компании работает " + wholeWorkers02 + " человек, то всего " + clockForOneEmployee02 + " часов работы может быть поделено между сотрудниками" );

    }
}