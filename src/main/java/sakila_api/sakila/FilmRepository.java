package sakila_api.sakila;

import org.hibernate.query.NativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query (nativeQuery = true,
    value = "select * from film where film_id in (select film_id from film_actor where actor_id = ?1)")
    List<Film> getFilmsByActor(int id);


}
