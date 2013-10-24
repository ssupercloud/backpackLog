package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

//The @Entity annotation marks this class as a managed Ebean entity
@Entity
public class Registrant extends Model{

	@Id
	public Long id;

	@Constraints.Required
	public String email;
	@Constraints.Required
	public String firstName;
	@Constraints.Required
	public String lastName;
	@Constraints.Required
	public String password;
	@Constraints.Required
	public String gender;

	//@Formats.DateTime(pattern="dd/MM/yyyy")
	//public Date dateOfBirth = new Date();

	public Registrant(String email, String firstName, String lastName, String gender, String password) {
    	this.email = email;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.gender = gender;
    	this.password = password;
    }

	// A find static field, defining a Finder for an entity of type Registrant with a Long identifier
	public static Finder<Long,Registrant> find = new Finder<Long,Registrant>(
		Long.class, Registrant.class
		);

	//Although we could use the find object from anywhere in our code to create queries for users, 
	//it’s not good practice to spread that code all through our application. One such query that 
	//we need is a query that will authenticate users. In Registrant.java, add the authenticate() method:
    public static Registrant authenticate(String email, String password) {
        return find.where().eq("email", email)
            .eq("password", password).findUnique();
    }

	public static void create(Registrant registrant) {
		registrant.save();
	}

	public static void delete(Long id) {
		find.byId(id).delete();
	}

	public static Registrant retrieve(Long id) {
		return Registrant.find.byId(id);
	}

	public static List<Registrant> all() {
		return find.all();
	}

}