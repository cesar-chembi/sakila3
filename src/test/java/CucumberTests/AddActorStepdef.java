package CucumberTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import sakila_api.sakila.Actor;
import sakila_api.sakila.ActorRepository;

public class AddActorStepdef {

    Actor newActor;
    ActorRepository actorRepository;

    @Given("a users desired actor")
    public void a_users_desired_actor() {
        // Write code here that turns the phrase above into concrete actions
        newActor = new Actor("firstname","lastname");
        throw new io.cucumber.java.PendingException();
    }
    @When("a user inputs the actor")
    public void a_user_inputs_the_actor() {
        // Write code here that turns the phrase above into concrete actions
        actorRepository.save(newActor);
        throw new io.cucumber.java.PendingException();
    }
    @Then("the actor should be added")
    public void the_actor_should_be_added() {
        // Write code here that turns the phrase above into concrete actions
        int id = newActor.getActorId();
        Assertions.assertTrue(actorRepository.findById(id).isPresent());
        throw new io.cucumber.java.PendingException();
    }

}
