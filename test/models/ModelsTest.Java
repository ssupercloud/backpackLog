package test;

import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.libs.F.*;

import static play.test.Helpers.*;
import static org.fest.assertions.Assertions.*;

public class ModelsTests extends WithApplication {
    @Before
    public void setUp() {
        start(fakeApplication(inMemoryDatabase()));
    }

    @test
    public void createAndRetrieveRegistrants() {
        new Registrants("bSmith", "Bob", "Smith", "bob@gmail.com", "secret",).save();
        Registrants bob = Registrants.find.where().eq("email", "bob@gmail.com").findUnique();
        assertNotNull(bob);
        assertEquals("Bob", bob.name);
    }

	@Test
    public void tryAuthenticateRegistrants() {
        new Registrants("bob@gmail.com", "Bob", "secret").save();
        
        assertNotNull(Registrants.authenticate("bob@gmail.com", "secret"));
        assertNull(Registrants.authenticate("bob@gmail.com", "badpassword"));
        assertNull(Registrants.authenticate("tom@gmail.com", "secret"));
    }    
}