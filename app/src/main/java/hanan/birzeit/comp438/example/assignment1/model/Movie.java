package hanan.birzeit.comp438.example.assignment1.model;

public class Movie {
    private int year;
    private String title;
    private String genre;

    public Movie() {
    }

    public Movie(String title,int year , String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
