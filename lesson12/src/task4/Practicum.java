package task4;

public class Practicum {

    public static void main(String[] args) {
        RentedFilm film1 = new RentedFilm(
                "tерминатор",
                new DateTime(20, 11, 2021, 10, 0, 0),
                new DateTime(27, 11, 2021, 23, 58, 58)
        );
        System.out.println("fильм Терминатор взят в аренду: " + film1.getTimeOfRent());
        System.out.println("fильм должен быть вернут до: " + film1.getTimeOfReturn());


        DateTime today = new DateTime(27, 11, 2021, 23, 58, 59);

        System.out.println("cегодняшнее число: " + today);

        DateTimeComparator comparator = new DateTimeComparator();
        boolean shouldAlreadyBeReturned = comparator.compare(today, film1.getTimeOfReturn()) > 0;

        System.out.println("nрошло ли время возврата? " + (shouldAlreadyBeReturned ? "Да!" : "Нет!"));
    }
}