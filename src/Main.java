public class Main {
    public static void main(String[] args) {
       //Первое занятие по переменным
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

        //Второе занятие по переменным
        System.out.println("Первое задание");
        int aPer = 20222022;
        System.out.println("Значение переменной aPer с типом int равно " + aPer );
        byte bPer = 122;
        System.out.println("Значение переменной bPer с типом byte равно " + bPer );
        short cPer = 32222;
        System.out.println("Значение переменной cPer с типом short равно " + cPer );
        long dPer = 929292929292929292L;
        System.out.println("Значение переменной dPer с типом long равно " + dPer );
        float ePer = 2.2929292F;
        System.out.println("Значение переменной ePer с типом float равно " + ePer );
        double fPer = 122.292929;
        System.out.println("Значение переменной fPer с типом double равно " + fPer );

        System.out.println("Второе задание");
        int aPer1 = -159;
        System.out.println(aPer1);
        byte bPer1 = 2;
        System.out.println(bPer1);
        short cPer1 = 569;
        System.out.println(cPer1);
        long dPer1 = 987678965549L;
        System.out.println(dPer1);
        float ePer1 = 27.12F;
        System.out.println(ePer1);
        double fPer1 = 67.;
        System.out.println(fPer1);
        char gPer1 = 27897 ;
        System.out.println(gPer1);
        boolean hPer1 = false;
        System.out.println(hPer1);

        System.out.println("Третье задание");
        byte ludPav = 23; //первый класс
        System.out.println("Первый класс состоит из " + ludPav + " человек.");
        byte annSer = 27; //второй класс
        System.out.println("Второй класс состоит из " + annSer + " человек.");
        byte ekaAnd = 30; //третий класс
        System.out.println("Третий класс состоит из " + ekaAnd + " человек.");
        int totalStud = ludPav + annSer + ekaAnd;
        System.out.println("Всего в классах " + totalStud + " человек.");
        short list = 480;
        System.out.println("Всего приобретено " + list + " листов бумаги.");
        int listPerStud = list / totalStud;
        System.out.println("На каждого ученика рассчитано " + listPerStud + " листов бумаги.");

        System.out.println("Четвертое задание");
        byte twoMinutesB = 16;
        System.out.println("За две минуты машина произвела " + twoMinutesB + " бутылок");
        byte oneMinuteB = 16 / 2;
        System.out.println("За одну минуту машина произвела " + oneMinuteB + " бутылок");
        byte minutesIsAnHour = 60;
        byte hoursADay = 24;
        byte daysPerMonth = 31;
        int twentyMinutesB = 20 * oneMinuteB;
        System.out.println("За двадцать минут машина произвела " + twentyMinutesB + " бутылок");
        int dayB = minutesIsAnHour * hoursADay * oneMinuteB;
        System.out.println("За сутки машина произвела " + dayB + " бутылок");
        int threeDaysB = 3 * minutesIsAnHour * hoursADay * oneMinuteB;
        System.out.println("За три дня машина произвела " + threeDaysB + " бутылок");
        int monthB = minutesIsAnHour * hoursADay * daysPerMonth * oneMinuteB;
        System.out.println("За месяц машина произвела " + monthB + " бутылок");

        System.out.println("Пятое задание");
        byte allKr = 120; //всего банок красок
        System.out.println("На ремонт школы нужно " + allKr + " краски двух цветов");
        byte whKrOneClass = 2;
        byte brKrOneClass = 4;
        System.out.println("На ремонт одного класса нужно " + whKrOneClass + " белой и " + brKrOneClass + " коричневой банки краски");
        byte whAndBrOneClass = (byte) (whKrOneClass + brKrOneClass);
        System.out.println("На ремонт одного класса нужно " + whAndBrOneClass + " банок краски");
        int totalClassesInTheSchool = allKr / whAndBrOneClass;
        System.out.println("Всего в школе " + totalClassesInTheSchool + " классов");
        int totalCansOfWhitePaint = totalClassesInTheSchool * whKrOneClass;
        int totalCansOfBrownPaint = totalClassesInTheSchool * brKrOneClass;
        System.out.println("В школе, где " + totalClassesInTheSchool + " классов, нужно " + totalCansOfWhitePaint + " банок белой краски и " + totalCansOfBrownPaint + " банок коричневой краски");

        System.out.println("Шестое задание");
        byte numberOfBananas = 5; // кол-во бананов
        byte weightOfOnBanana = 80; //вес одного банана
        int totalWeightOfBananas = numberOfBananas * weightOfOnBanana; //общий вес бананов
        System.out.println("Общий вес бананов для спорт-завтрака " + totalWeightOfBananas + " грамм");
        short milkWeight = 210; //вес молока
        System.out.println("Общий вес молока для спорт-завтрака " + milkWeight + " грамм");
        byte quantityOfIceCream = 2; //кол-во мороженого
        byte weightOfOneIceCream = 100; // вес одного мороженого
        int totalWeightOfIceCream = quantityOfIceCream * weightOfOneIceCream; //общий вес мороженого
        System.out.println("Общий вес мороженого для спорт-завтрака " + totalWeightOfIceCream + " грамм");
        byte numberOfEggs = 4; //кол-во яиц
        byte weightOfOneEgg = 70; //вес одного яйца
        int totalWeightOfEggs = numberOfEggs * weightOfOneEgg; //общий вес яиц
        System.out.println("Общий вес яиц для спорт-завтрака " + totalWeightOfEggs + " грамм");

        short oneKilogramInGrams = 1000;

        int totalWeightOfSportsBreakfast = totalWeightOfBananas + totalWeightOfEggs + totalWeightOfIceCream + milkWeight;
        System.out.println("Общий вес спорт-завтрака " + totalWeightOfSportsBreakfast + " грамм");
        float weightOfSportsBreakfastInKilograms = (float) totalWeightOfSportsBreakfast / oneKilogramInGrams;
        System.out.println("Общий вес спорт-завтрака " + weightOfSportsBreakfastInKilograms + " килограмм");

        System.out.println("Седьмое задание");
        byte justNeedToReset = 7;
        short weightLossIsOptionOne = 250;
        short weightLossIsOptionTwo = 500;
        int howMuchShouldILoseInGrams = justNeedToReset * oneKilogramInGrams;
        System.out.println( howMuchShouldILoseInGrams + " грамм нужно сбросить спортсмену");
        int theFirstWay = howMuchShouldILoseInGrams / weightLossIsOptionOne;
        System.out.println( theFirstWay + " дней потребуется спорстмену чтобы похудеть, скидывая 250 грамм в день");
        int theSecondWay = howMuchShouldILoseInGrams / weightLossIsOptionTwo;
        System.out.println( theSecondWay + " дней потребуется спорстмену чтобы похудеть, скидывая 500 грамм в день");
        int average = (theFirstWay + theSecondWay) / 2;
        System.out.println("В среднем потребуется " + average + " дней чтобы похудеть спортсмену, скидывая 250-500 грамм в день");

        System.out.println("Восьмое задание");

    }
}