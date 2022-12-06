import java.util.Objects;

public class Movie {
    String title; // название фильма
    int releaseYear; // год выхода на экраны

    public Movie(String title, int releaseYear) {
        this.title = title;
        this.releaseYear = releaseYear;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj.getClass()!=this.getClass()) return false;
        Movie movie = (Movie) obj;
        return Objects.equals(title,movie.title) && Objects.equals(releaseYear,movie.releaseYear);
    }
    @Override
    public int hashCode(){
        int hash = 17;
        if (title != null){
            hash+=title.hashCode();
        }
        hash*=31;
        return hash;
    }

    public String description() { // метод для вывода описания фильма
        return '"' + title + "\" (" + releaseYear + " год)";
    }
}