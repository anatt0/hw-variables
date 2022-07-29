public class Main {
    public static void main(String[] args) {
// Задача 1
// Объявите переменные всех типов, что мы изучили на уроке, и присвойте им любые значения (инициализируйте их).
        short sh = 1;
        byte by = 1;
        int i = 1;
        long l = 1L;
        float f = 1.0f;
        double d = 1.0;
        boolean boo = false;
        char ch = '!';

// Задача 2
// В боксе, перед каждым боем, спортсменов взвешивают – это делают для того, чтобы убедиться, что боксеры
// соответствуют своей весовой категории, и бой будет честным.
// Вес одного боксера – 78,2 кг
// Вес второго боксера – 82,7 кг
// Подсчитайте и выведите в консоль общий вес двух бойцов.
// Подсчитайте и выведите в консоль разницу между весами бойцов.
        System.out.println("Задача 2");
        double boxer1Weight = 78.2;
        System.out.println("Вес одного боксера: " + boxer1Weight);
        double boxer2Weight = 82.7;
        System.out.println("Вес второго боксера: " + boxer2Weight);
        double totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес двух бойцов: " + totalWeight + " кг");
        double weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Разница между весами бойцов: " + weightDifference + " кг");

// Задача 3
// Рецепт:
// – Бананы – 5 штук (1 банан - 80 грамм);
// – Молоко – 200 мл (100 мл = 105 грамм);
// – Мороженое пломбир – 2 брикета по 100 грамм;
// – Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
// Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
// Результат напечатайте в консоль.
        System.out.println();
        System.out.println("Задача 3");
        int bananas = 80 * 5;
        int milk = (105 / 100) * 2;
        int iceCream = 200 * 2;
        int eggs = 70 * 4;
        int totalWeightInGrams = bananas + milk + iceCream + eggs;
        double totalWeightInKilograms = totalWeightInGrams / 1000;
        System.out.println("Общий вес спорт-завтрака: " + totalWeightInKilograms + " кг");

// Задача 4
// Спортсмену нужно сбросить 7 кг, чтобы оставаться в своей весовой категории.
// Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
// Посчитайте, сколько дней уйдёт на похудение, если спортсмен будет терять каждый день по 250 грамм
// и сколько, если каждый день будет худеть на 500 грамм.
// Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
// Результаты подсчетов выведите в консоль.
        System.out.println();
        System.out.println("Задача 4");

        int goalInKg = 7;
        int dailyWeightLoss1InG = 250;
        int dailyWeightLoss2InG = 500;

        int goalInG = goalInKg * 1000;
        int time1 = goalInG / dailyWeightLoss1InG;
        int time2 = goalInG / dailyWeightLoss2InG;
        int timeOnAverage = (time1 + time2) / 2;

        System.out.println("Для похудения на 7 кг нужно:");
        System.out.println("- " + time1 + " дн., если терять по 250 грамм в день");
        System.out.println("- " + time2 + " дн., если терять по 500 грамм в день");
        System.out.println("- " + timeOnAverage + " дн., если терять в среднем от 250 до 500 грамм в день");

// Задача 5
// В компании есть правило, что чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
// Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
// Каждый год повышение составляет 10% от текущей зарплаты.
// К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
// Маша получает 67 760 рублей в месяц
// Денис получает 83 690 рублей в месяц
// Кристина получает 76 230 рублей в месяц
// Каждому нужно увеличить зарплату на 10% от текущей месячной.
// Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
// Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
// Выведите в консоль информацию по каждому сотруднику.
// Например, “Маша теперь получает **** рублей. Годовой доход вырос на **** рублей”.
        System.out.println();
        System.out.println("Задача 5");
        double amountOfSalaryIncrease = 0.1;

        int salaryForMasha = 67_760;
        int salaryForMashaYear = salaryForMasha * 12;
        int newSalaryForMasha = (int) (salaryForMasha * (amountOfSalaryIncrease + 1));
        int newSalaryForMashaYear = newSalaryForMasha * 12;
        int salaryDifferenceForMashaYear = newSalaryForMashaYear - salaryForMashaYear;

        System.out.println("Зарплата Маши");
        System.out.println("До повышения: " + salaryForMasha + " руб./месяц или " + salaryForMashaYear + " руб./год");
        System.out.println("После повышения: " + newSalaryForMasha + " руб./месяц или " + newSalaryForMashaYear + " руб./год");
        System.out.println("Годовой доход вырос на " + salaryDifferenceForMashaYear + " руб.");

        int salaryForDenis = 83_690;
        int salaryForDenisYear = salaryForDenis * 12;
        int newSalaryForDenis = (int) (salaryForDenis * (amountOfSalaryIncrease + 1));
        int newSalaryForDenisYear = newSalaryForDenis * 12;
        int salaryDifferenceForDenisYear = newSalaryForDenisYear - salaryForDenisYear;

        System.out.println();
        System.out.println("Зарплата Дениса");
        System.out.println("До повышения: " + salaryForDenis + " руб./месяц или " + salaryForDenisYear + " руб./год");
        System.out.println("После повышения: " + newSalaryForDenis + " руб./месяц или " + newSalaryForDenisYear + " руб./год");
        System.out.println("Годовой доход вырос на " + salaryDifferenceForDenisYear + " руб.");

        int salaryForKristina = 76_230;
        int salaryForKristinaYear = salaryForKristina * 12;
        int newSalaryForKristina = (int) (salaryForKristina * (amountOfSalaryIncrease + 1));
        int newSalaryForKristinaYear = newSalaryForKristina * 12;
        int salaryDifferenceForKristinaYear = newSalaryForKristinaYear - salaryForKristinaYear;

        System.out.println();
        System.out.println("Зарплата Кристины");
        System.out.println("До повышения: " + salaryForKristina + " руб./месяц или " + salaryForKristinaYear + " руб./год");
        System.out.println("После повышения: " + newSalaryForKristina + " руб./месяц или " + newSalaryForKristinaYear + " руб./год");
        System.out.println("Годовой доход вырос на " + salaryDifferenceForKristinaYear + " руб.");
    }
}