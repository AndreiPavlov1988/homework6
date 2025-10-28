public class Main {
    public static void main(String[] args) {
//task 1
        int firstFriday = 1;
        for (int i = 0; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
//task 2
        int distance = 0;
        int marafonDistance = 42195;
        int interval = 500;
        do {
            int remainingDistance = marafonDistance - distance;
            System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
            distance += interval;
        } while (distance <= marafonDistance);
        int marafonDistance1 = 42195;
        int interval1 = 500;
        for (int distance1 = 0; distance1 <= marafonDistance1; distance1 += interval1) {
            int remainingDistance = marafonDistance1 - distance1;
            System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
        }
//task 3
        int budget = 1000;
        int dailyCost = 100;
        int currentDay = 0;
        int remainingBudget = budget;
        System.out.println("Бюджет: " + budget + " ₽");
        System.out.println("Расчет дней парковки...\n");
        while (remainingBudget >= dailyCost) {
            currentDay++;
            if (currentDay % 5 == 0) {
                System.out.println("День " + currentDay + ":  БЕСПЛАТНО (5-й день)");
                continue;
            }
            remainingBudget -= dailyCost;
            System.out.println("День " + currentDay + ": Оплачено 100 ₽ (осталось: " + remainingBudget + " ₽)");
        }
        System.out.println("\n ИТОГ:");
        System.out.println("На " + budget + " ₽ можно оставить автомобиль на " + currentDay + " дней");
        System.out.println("Оставшийся бюджет: " + remainingBudget + " ₽");
        int budget1 = 1000;
        int dailyCost1 = 100;
        int remainingBudget1 = budget;
        int maxDays1 = 0;
        for (int day = 1; remainingBudget1 >= dailyCost; day++) {
            if (day % 5 == 0) {
                System.out.println("День " + day + ":  БЕСПЛАТНО (5-й день)");
                maxDays1 = day;
                continue;
            }
            remainingBudget1 -= dailyCost1;
            maxDays1 = day;
            System.out.println("День " + day + ":  Оплачено 100 ₽ (осталось: " + remainingBudget1 + " ₽)");
        }
        System.out.println("\n ИТОГ:");
        System.out.println("На " + budget1 + " ₽ можно оставить автомобиль на " + maxDays1 + " дней");
        System.out.println("Оставшийся бюджет: " + remainingBudget1 + " ₽");
//task 4
        int month = 0;
        double total = 0.0;
        double MONTHLY_CONTRIBUTION = 15000.0;
        double TARGET_AMOUNT = 12000000.0;
        double INTEREST_RATE = 0.07;
        while (true) {
            month++;
            total += MONTHLY_CONTRIBUTION;
            if (month % 6 == 0) {
                double interest = total * INTEREST_RATE;
                total += interest;
                System.out.printf("Месяц %3d: %,.2f ₽ + проценты %,.2f ₽ = %,.2f ₽%n",
                        month, total - interest, interest, total);
            } else {
                System.out.printf("Месяц %3d: %,.2f ₽%n", month, total);
            }
            if (total >= TARGET_AMOUNT) {
                System.out.println("\n" + "=".repeat(50));
                System.out.println("ЦЕЛЬ ДОСТИГНУТА!");
                System.out.printf("Для накопления %,.2f ₽ потребовалось: %d месяцев%n",
                        TARGET_AMOUNT, month);
                System.out.printf("Итоговая сумма: %,.2f ₽%n", total);
                System.out.printf("Перевыполнение плана: %,.2f ₽%n", total - TARGET_AMOUNT);
                break; // завершение цикла при достижении цели
            }
        }
    }
}