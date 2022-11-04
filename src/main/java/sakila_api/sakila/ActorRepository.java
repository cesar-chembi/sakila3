package sakila_api.sakila;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor, Integer> {

    @Query(nativeQuery = true,
            value = "select * " +
                    "from actor " +
                    "where actor_id " +
                    "in (select actor_id " +
                    "from film_actor " +
                    "where film_id = ?1)")
    List<Actor> getActorsByFilm(int id);

    @Query(nativeQuery = true,
    value = "select * " +
            "from actor " +
            "where actor_id " +
            "in(select actor_id " +
            "from film_actor " +
            "where film_id " +
            "in (select film_id " +
            "from film_actor " +
            "where actor_id = ?1))")
    List<Actor> getActorsByActor(int id);


}
