package by.tms.repository;

import by.tms.models.Show;

import java.util.List;

public interface TVShowRepository {

    List<Show> getDataFromFile();
}
