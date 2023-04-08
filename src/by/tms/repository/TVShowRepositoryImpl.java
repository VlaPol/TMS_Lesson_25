package by.tms.repository;

import by.tms.models.Film;
import by.tms.models.Series;
import by.tms.models.Show;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TVShowRepositoryImpl implements TVShowRepository {
    @Override
    public List<? extends Show> getDataFromFile(Path path) throws IOException {

        List<Show> showList;

        switch (getFileName(path)) {
            case "films" -> showList = (List<Show>) filmsFileParser(path);
            case "series" -> showList = (List<Show>) seriesFileParser(path);
            default -> throw new FileNotFoundException("No such file");
        }


        return showList;
    }

    private static String getFileName(Path path) {
        String fullFileName = path.toString();
        return fullFileName.substring(fullFileName.lastIndexOf("\\") + 1, fullFileName.lastIndexOf("."));
    }

    private static List<? super Film> filmsFileParser(Path path) throws IOException {

        List<Film> filmsList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path.toString()));
        String line;

        while ((line = br.readLine()) != null) {
            String[] film = line.split(",");
            Film tmpFilm = new Film();
            tmpFilm.setShowTitle(film[0]);
            tmpFilm.setReleaseYear(film[1]);
            tmpFilm.setCountryCode(film[2]);
            tmpFilm.setRating(Double.parseDouble(film[3]));
            tmpFilm.setRatesCounter(Integer.parseInt(film[4]));
            filmsList.add(tmpFilm);
        }


        return filmsList;
    }

    private static List<? super Series> seriesFileParser(Path path) throws IOException {

        List<Show> filmsList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(path.toString()));
        String line;

        while ((line = br.readLine()) != null) {
            String[] series = line.split(",");
            Series tmpSeries = new Series();
            tmpSeries.setShowTitle(series[0]);
            tmpSeries.setReleaseYear(series[1]);
            tmpSeries.setLastEpisode(series[2]);
            tmpSeries.setCountryCode(series[3]);
            tmpSeries.setNumberOfSeasons(Integer.parseInt(series[4]));
            tmpSeries.setNumberOfEpisodes(Integer.parseInt(series[5]));
            tmpSeries.setRating(Double.parseDouble(series[6]));
            tmpSeries.setRatesCounter(Integer.parseInt(series[7]));
            filmsList.add(tmpSeries);
        }


        return filmsList;
    }
}
