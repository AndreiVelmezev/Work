public class HomeVariavles {
    public static void main(String[] args) {
        //1.2 Переменные,Задача 1
        byte a = 10;
        short b = 100;
        int men = 19;
        long d = 12366544L;
        float e = 4.5F;
        double f = 1254.54656;
        char bar = 35;

        //1.2 Переменные,Задача 2
        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;
        System.out.println("Task 2");
        System.out.println("The total weight of two fighters: " + (boxerWeight1 + boxerWeight2) + " kilogram");
        System.out.println("The difference between the weights of the fighters: " + (boxerWeight2 - boxerWeight1) + " kilogram");

        //1.2 Переменные,Задача 3
        int numberBananas = 5;
        double bananaWeight = 80;
        int amountMilk = 200;
        double milkWeight = 105;
        int quantityIceCream = 2;
        double IceCreamWeight = 100;
        int numbeEggs = 4;
        double EggsWeight = 70;
        double TotalWeightGrams = (numberBananas * bananaWeight) + (amountMilk * milkWeight) + (quantityIceCream * IceCreamWeight) + (numbeEggs * EggsWeight);
        System.out.println("Task 3");
        System.out.println("The weight (number of grams) of the sports breakfast in grams is: " + TotalWeightGrams);
        System.out.println("The weight (number of kilograms) of the sports breakfast in kilograms is: " + (TotalWeightGrams / 1000));

        //1.2 Переменные,Задача 4
        double TotalWeightToLose = 7; // The total weight to lose in kilograms
        double TotalWeightToLose2 = TotalWeightToLose * 1000; // The total weight to be dropped in grams
        double WeightLoss1 = 250;// Weight loss scenario 1
        double WeightLoss2 = 500;// Weight loss scenario 2
        double NumberOfDays1 = TotalWeightToLose2 / WeightLoss1;
        double NumberOfDays2 = TotalWeightToLose2 / WeightLoss2;
        System.out.println("Task 4");
        System.out.println("The number of days for weight loss if an athlete loses 250 grams every day " + NumberOfDays1);
        System.out.println("The number of days for weight loss if an athlete loses 500 grams every day " + NumberOfDays2);
        System.out.println("Average number of days to lose weight " + ((NumberOfDays1 + NumberOfDays2) / 2));//Calculation of the arithmetic mean: I add all the numbers and divide their sum by the number of numbers that I have added.

        // 1.2 Переменные,Задача 5
        double SalaryMasha = 67760;
        double SalaryDenis = 83690;
        double SalaryKristina = 76230;
        double AnnualIncomeMasha = SalaryMasha * 12;
        double AnnualIncomeDenis = SalaryDenis * 12;
        double AnnualIncomeKristina = SalaryKristina * 12;
        double newSalaryMasha = SalaryMasha * 1.1;
        double newSalaryDenis = SalaryDenis * 1.1;
        double newSalaryKristina = SalaryKristina * 1.1;
        double newAnnualIncomeMasha = newSalaryMasha * 12;
        double newAnnualIncomeDenis = newSalaryDenis * 12;
        double newAnnualIncomeKristina = newSalaryKristina * 12;
        System.out.println("Task 5");
        System.out.println("The salary of an employee Masha, taking into account an increase of 10 percent = " + newSalaryMasha);
        System.out.println("The salary of an employee Denis, taking into account an increase of 10 percent = " + newSalaryDenis);
        System.out.println("The salary of an employee Kristina, taking into account an increase of 10 percent = " + newSalaryKristina);
        System.out.println("The difference between the annual income before and after the increase Masha = " + (newAnnualIncomeMasha - AnnualIncomeMasha));
        System.out.println("The difference between the annual income before and after the increase Denis = " + (newAnnualIncomeDenis - AnnualIncomeDenis));
        System.out.println("The difference between the annual income before and after the increase Kristina = " + (newAnnualIncomeKristina - AnnualIncomeKristina));
        System.out.println("Masha now receives " + newSalaryMasha + " rubles. Annual income increased by " + (newAnnualIncomeMasha - AnnualIncomeMasha) + " rubles");
        System.out.println("Denis now receives " + newSalaryDenis + " rubles. Annual income increased by " + (newAnnualIncomeDenis - AnnualIncomeDenis) + " rubles");
        System.out.println("Kristina now receives " + newSalaryKristina + " rubles. Annual income increased by " + (newAnnualIncomeKristina - AnnualIncomeKristina) + " rubles");
    }

}
