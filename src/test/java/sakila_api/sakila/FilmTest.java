package sakila_api.sakila;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class FilmTest {

    @Test
    public void testGetFilmId(){
        Film newFilm = new Film();
        Assertions.assertEquals(0, newFilm.getFilmId(), "film ID get not working");

    }

    @Test
    public void testSetFilmId(){
        Film newFilm = new Film();
        newFilm.setFilmId(2);
        Assertions.assertEquals(2, newFilm.getFilmId(), "film ID set not working");

    }

    @Test
    public void testGetTitle(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        Assertions.assertEquals("title", newFilm.getTitle(), "film ID get not working");

    }

    @Test
    public void testSetTitle(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        newFilm.setTitle("new_title");
        Assertions.assertEquals("new_title", newFilm.getTitle(), "film ID set not working");
    }

    @Test
    public void testGetDescription(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        Assertions.assertEquals("title", newFilm.getTitle(), "film ID get not working");

    }

    @Test
    public void testSetDescription(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        newFilm.setDescription("new_description");
        Assertions.assertEquals("new_description", newFilm.getDescription(), "film ID set not working");
    }

    @Test
    public void testGetReleaseYear(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        Assertions.assertEquals(2000, newFilm.getRelease_year(), "release year get not working");

    }

    @Test
    public void testSetReleaseYear(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        newFilm.setRelease_year(1);
        Assertions.assertEquals(1, newFilm.getRelease_year(), "release year set not working");
    }

    @Test
    public void testGetLanguageId(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        Assertions.assertEquals(1, newFilm.getLanguage_id(), "release year get not working");

    }

    @Test
    public void testSetLanguageId(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        newFilm.setLanguage_id(2);
        Assertions.assertEquals(2, newFilm.getLanguage_id(), "release year set not working");
    }

    @Test
    public void testGetRentalDuration(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        Assertions.assertEquals(1, newFilm.getRental_duration(), "rental duration get not working");

    }

    @Test
    public void testSetRentalDuration(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        newFilm.setRental_duration(2);
        Assertions.assertEquals(2, newFilm.getRental_duration(), "rental duration set not working");
    }

    @Test
    public void testGetRentalRate(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        Assertions.assertEquals(1.0, newFilm.getRental_rate(), "rental duration get not working");

    }

    @Test
    public void testSetRentalRate(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        newFilm.setRental_rate(2.0);
        Assertions.assertEquals(2.0, newFilm.getRental_rate(), "rental duration set not working");
    }

    @Test
    public void testGetLength(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        Assertions.assertEquals(1, newFilm.getLength(), "rental duration get not working");

    }

    @Test
    public void testSetLength(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        newFilm.setLength(2);
        Assertions.assertEquals(2, newFilm.getLength(), "rental duration set not working");
    }

    @Test
    public void testGetReplacementCost(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        Assertions.assertEquals(1.0, newFilm.getReplacement_cost(), "rental duration get not working");

    }

    @Test
    public void testSetReplacementCost(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        newFilm.setReplacement_cost(2.0);
        Assertions.assertEquals(2.0, newFilm.getReplacement_cost(), "rental duration set not working");
    }

    @Test
    public void testGetRating(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        Assertions.assertEquals("PG13", newFilm.getRating(), "rental duration get not working");

    }

    @Test
    public void testSetRating(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        newFilm.setRating("NC17");
        Assertions.assertEquals("NC17", newFilm.getRating(), "rental duration set not working");
    }

    @Test
    public void testGetSpecialFeatures(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        Assertions.assertEquals("special_features", newFilm.getSpecial_features(), "rental duration get not working");

    }

    @Test
    public void testSetSpecialFeatures(){
        Film newFilm = new Film("title",
                "description",
                2000,
                1,
                1,
                1.0,
                1,
                1.0,
                "PG13",
                "special_features");
        newFilm.setSpecial_features("none");
        Assertions.assertEquals("none", newFilm.getSpecial_features(), "rental duration set not working");
    }






}
