package sakila_api.sakila;
import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="film")

public class Film {

    //attributes
    @Id
    @Column(name="film_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int filmId;

    @Column(name = "title")
    String title;

    @Column(name = "description")
    String description;

    @Column(name = "release_year")
    int release_year;

    @Column(name = "language_id")
    int language_id;

    @Column(name = "rental_duration")
    int rental_duration;

    @Column(name = "rental_rate")
    double rental_rate;

    @Column(name = "length")
    int length;

    @Column(name = "replacement_cost")
    double replacement_cost;

    @Column(name = "rating")
    String rating;

    @Column(name = "special_features")
    String special_features;


    /* relations */
    @ManyToMany (mappedBy = "starredFilms")
    Set<Actor> actorsInMovie;

    //constructors

    public Film (
            String title,
            String description,
            int release_year,
            int language_id,
            int rental_duration,
            double rental_rate,
            int length,
            double replacement_cost,
            String rating,
            String special_features
            ){
        this.title=title;
        this.description=description;
        this.release_year=release_year;
        this.language_id=language_id;
        this.rental_rate=rental_rate;
        this.rental_duration=rental_duration;
        this.length=length;
        this.replacement_cost=replacement_cost;
        this.rating=rating;
        this.special_features=special_features;

    }

    public Film(){
    }

    //methods


    public int getFilmId() {return filmId;}

    public String getTitle(){return this.title;}

    public String getDescription(){return this.description;}

    public int getRelease_year(){return this.release_year;}

    public int getLanguage_id(){return this.language_id;}

    public int getRental_duration(){return this.rental_duration;}

    public double getRental_rate(){return this.rental_rate;}

    public int getLength(){return this.length;}

    public double getReplacement_cost(){return this.replacement_cost;}

    public String getRating(){return this.rating;}

    public String getSpecial_features(){return this.special_features;}

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public void setLanguage_id(int language_id) {
        this.language_id = language_id;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public void setRental_duration(int rental_duration) {
        this.rental_duration = rental_duration;
    }

    public void setRental_rate(double rental_rate) {
        this.rental_rate = rental_rate;
    }

    public void setReplacement_cost(double replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public void setSpecial_features(String special_features) {
        this.special_features = special_features;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
