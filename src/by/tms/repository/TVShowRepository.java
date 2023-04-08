package by.tms.repository;

import by.tms.models.Show;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public interface TVShowRepository {

    List<? extends Show> getDataFromFile(Path path) throws IOException;
}
