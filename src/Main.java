public class Main {
    public static void main(String[] args) {
//task 1
        int firstFriday = 1;
        for (int i = 0; i <= 31; i++) {
            if ((i-firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
//task 2
        int distance = 0;
        int marafonDistance = 42195;
        int interval = 500;
        do {int remainingDistance = marafonDistance - distance;
            System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
            distance += interval;
        } while (distance <= marafonDistance);
    int marafonDistance1 = 42195;
    int interval1 = 500;
        for (int distance1 = 0; distance1 <= marafonDistance1; distance1 += interval1) {
            int remainingDistance = marafonDistance1 - distance1;
        System.out.println("Держитесь! Осталось " + remainingDistance + " метров");
        }
    }
}

