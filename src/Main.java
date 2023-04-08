import by.tms.models.Show;
import by.tms.repository.TVShowRepository;
import by.tms.repository.TVShowRepositoryImpl;

import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        final String SERIES_FILE_NAME = "D:\\Work\\Programming\\@TMS\\TMS_Lesson_25\\TV_Show\\series.csv";
        final String FILMS_FILE_NAME = "D:\\Work\\Programming\\@TMS\\TMS_Lesson_25\\TV_Show\\films.csv";

        Path path = Path.of(FILMS_FILE_NAME);

        TVShowRepository tvShowRepository = new TVShowRepositoryImpl();
        try {
            List<? extends Show> list = tvShowRepository.getDataFromFile(path);
            if (path.toString().equals(SERIES_FILE_NAME)) {
                System.out.println("Сериалы:");
            }
            if (path.toString().equals(FILMS_FILE_NAME)) {
                System.out.println("Фильмы:");
            }
            for (Show itm : list) {
                System.out.println(itm.toString());
            }
        } catch (Exception e) {
            System.out.println("Ошибка при работе с файлом");
        }
    }
}