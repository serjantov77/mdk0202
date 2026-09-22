package task3;

import java.util.ArrayList;
import java.util.HashMap;

public class Practicum {
    public static void main(String[] args) {
        HashMap<Actor, ArrayList<Movie>> filmography = new HashMap<>();
        HashMap<Movie, Double> ratings = new HashMap<>();

        Movie ivanVasilievichMovie = new Movie("Иван Васильевич меняет профессию", 1973);
        Movie gentlemenOfFortuneMovie = new Movie("Джентльмены удачи", 1971);
        Movie operationYMovie = new Movie("Операция «Ы» и другие приключения Шурика", 1965);
        ratings.put(ivanVasilievichMovie, 8.6);
        ratings.put(gentlemenOfFortuneMovie, 8.5);
        ratings.put(operationYMovie, 8.7);

        Actor aDemyanenko = new Actor("Александр", "Демьяненко");

        ArrayList<Movie> actorMovies = new ArrayList<>();
        actorMovies.add(ivanVasilievichMovie);
        actorMovies.add(operationYMovie);

        filmography.put(aDemyanenko, actorMovies);

        if (filmography.containsKey(new Actor("Александр", "Демьяненко"))) {
            ArrayList<Movie> foundMovies = filmography.get(new Actor("Александр", "Демьяненко"));
            System.out.println("в фильмографии актёра а. демьяненко найдены следующие фильмы: ");
            for (Movie movie : foundMovies) {
                if (ratings.containsKey(new Movie(movie.title, movie.releaseYear))) {
                    double rating = ratings.get(movie);
                    System.out.println("фильм " + movie.description() + " с рейтингом " + rating);
                } else {
                    System.out.println("что-то пошло не так... проверьте реализацию equals и hashCode в классе Movie.");
                }
            }
        } else {
            System.out.println("что-то пошло не так... проверьте реализацию equals и hashCode в классе Actor.");
        }
    }
}