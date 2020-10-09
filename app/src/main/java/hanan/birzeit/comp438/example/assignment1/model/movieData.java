package hanan.birzeit.comp438.example.assignment1.model;

import java.util.ArrayList;
import java.util.List;

public class movieData implements Imovie {
    private ArrayList<Movie> movies = new ArrayList<>();

    public movieData(){

        movies.add(new Movie ("xxxxxxx", 22 , "drama" ));
        movies.add(new Movie ("xxxxxxx2", 223 , "drama" ));
        movies.add(new Movie ("xxxxxxx3", 224 , "drama" ));
        movies.add(new Movie ("xxxxxxx4", 226, "drama" ));


    }




    @Override
    public List<Movie> getmovies(String tit) {
        ArrayList<Movie> data = new ArrayList<>();
        for(Movie mov :movies){
            if (mov.getTitle().equals(tit)){
                data.add(mov);
            }
        }
        return data;
        // here will be dataBase connection (sql or web service)
    }

    @Override
    public String[] getTitles() {
        String[] tits = new String[] {"xxxxxx","xxxxxx2" , "xxxxxx3"};
        return tits;
    }

}
