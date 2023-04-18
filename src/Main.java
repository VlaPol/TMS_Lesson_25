import by.tms.models.Show;
import by.tms.repository.TVShowRepository;
import by.tms.repository.TVShowRepositoryImpl;


import java.util.List;

public class Main {
    public static void main(String[] args) {

        TVShowRepository tvShowRepository = new TVShowRepositoryImpl();
        List<? extends Show> list = tvShowRepository.getDataFromFile();
        for (Show itm : list) {
            System.out.println(itm.toString());
        }
    }
}