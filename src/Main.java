public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] cash = {11_000, 7_500, 12_000, 11_500, 8_000};
        int sum = 0;
        for (int i = 0; i < cash.length; i++) {
            sum = sum + cash[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        System.out.println();
        System.out.println("Задание 2");
        int[] sumWeek = {1_200, 1_500, 2_000, 3_500, 1_000};
        int minSum = 1_000_000_000;
        int maxSum = -1_000_000_000;
        for (int i = 0; i < sumWeek.length; i++) {
            if (minSum > sumWeek[i]) { // если минимальная сумма больше
                minSum = sumWeek[i]; // то минимальная сумма равна элементу массива
            } else if (maxSum < sumWeek[i]) { // если максимальная сумма меньше элемента массива
                maxSum = sumWeek[i]; // то максимальная сумма будет равна элемету массива
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " +
                minSum + " рублей. Максимальная сумма трат за неделю составила " + maxSum + " рублей");
        System.out.println();
        System.out.println("Задание 3");
        double[] sumMonth = {10_000, 20_000, 100_000, 5_600, 16_760};
        double sumAverage = 0; // Переменная средней суммы
        for (int i = 0; i < sumMonth.length; i++) {
            sumAverage = (sumAverage + sumMonth[i]);
        }
        System.out.println("Средняя сумма трат за месяц составила " + sumAverage / 5 + " рублей");
        System.out.println();
        System.out.println("Задание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}