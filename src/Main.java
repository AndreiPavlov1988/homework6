public class Main {
    public static void main(String[] args) {
//task 1
        int firstFriday = 1;
        for (int i = 0; i <= 31; i++) {
            if ((i-firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
        }
    }
