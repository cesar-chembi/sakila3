package sakila_api.sakila;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="actor")

public class Actor {

    //attributes
    @Id
    @Column(name="actor_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int actorId;

    @Column(name = "first_name")
    String actorFirstName;

    @Column(name = "last_name")
    String actorLastName;


    @ManyToMany
    @JoinTable(
            name = "course_like",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    Set<Film> starredFilms;

    //constructors
    public Actor (String actorFirstName, String actorLastName){
        this.actorFirstName = actorFirstName;
        this.actorLastName = actorLastName;
    }

    public Actor(){

    }

    //methods
    public String getActorFirstName(){
        return this.actorFirstName;
    }

    public void setActorFirstName(String name){
        this.actorFirstName = name;
    }

    public String getActorLastName() {
        return actorLastName;
    }

    public void setActorLastName(String name){
        this.actorLastName = name;
    }

    public int getActorId(){
        return this.actorId;
    }

    public void setActorId(int id){
        this.actorId = id;
    }


}
