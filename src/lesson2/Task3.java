package lesson2;

public class Task3 {
//    Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
//    А) минут + секунд,
//    В) часов + минут + секунд,
//    С) дней + часов + минут + секунд,
//    D) недель + дней + часов + минут + секунд.
//    по аналогии с примером выше.



    public static void main(String[] args) {

        int time = 1386128;
        int secondsInAMinute = 60;
        int secondsInAnHour = secondsInAMinute * 60;

        int secondsInADay = secondsInAnHour * 24;
        int secondsInAWeek = secondsInADay * 7;

        System.out.println(time + " seconds are:");
        System.out.println("A) " + (time / secondsInAMinute) + " minutes " + (time % secondsInAMinute) + " seconds");
        System.out.println("B) " + (time / secondsInAnHour) + " hours " + ((time % secondsInAnHour) / secondsInAMinute) + " minutes " + (time % secondsInAMinute) + " seconds");
        System.out.println("C) " + (time / secondsInADay) + " days " + ((time % secondsInADay) / secondsInAnHour) + " hours " + (((time % secondsInADay) % secondsInAnHour) / secondsInAMinute) + " minutes " + ((time % secondsInADay) % secondsInAMinute + " seconds"));
        System.out.println("D) " + (time / secondsInAWeek) + " weeks " + ((time % secondsInAWeek) / secondsInADay) + " days " + (((time % secondsInAWeek) % secondsInADay)/ secondsInAnHour) + " hours " + (((time % secondsInADay) % secondsInAnHour) / secondsInAMinute) + " minutes " + ((time % secondsInADay) % secondsInAMinute + " seconds"));

    }
}