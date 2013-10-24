//A controller is nothing more than a class extending play.mvc.Controller that groups several action methods.

package controllers;

import play.*;
import play.mvc.*;
import play.data.*;
import models.*;
import static play.data.Form.*;

import views.html.*;

public class Application extends Controller {

	public static Result welcome() {
		if (session().isEmpty()){
			return ok(
				index.render(form(Login.class), RegistrationForm)
			);
		}else{
		return redirect (
			routes.Application.terminus()
			);
		}	
	}

	@Security.Authenticated(Secured.class)
	public static Result terminus() {
		return ok(
			views.html.terminus.render(
				Registrant.all(), 
				Registrant.find.where().eq("email", request().username()).findUnique()
				)
			);
	}

	@Security.Authenticated(Secured.class)
	public static Result admin() {
		return ok(
			views.html.adminPanel.render(
				Registrant.all(), 
				Registrant.find.where().eq("email", request().username()).findUnique()
				)
			);
	}

	@Security.Authenticated(Secured.class)
	public static Result browse() {
		return ok(
			views.html.browse.render(
				Registrant.all(), 
				Registrant.find.where().eq("email", request().username()).findUnique()
				)
			);
	}

	//Login
    public static Result login() {
        return ok(
            login.render(form(Login.class), Registrant.find.where().eq("email", request().username()).findUnique())
        );
	}
	public static class Login {
    	public String email;
    	public String password;

    	public String validate() {
	    	if (Registrant.authenticate(email, password) == null) {
	      		return "Invalid user or password";
	    		}
	    	return null;
		}
	}

	public static Result authenticate() {
	    Form<Login> loginForm = form(Login.class).bindFromRequest();
	    if (loginForm.hasErrors()) {
	        return badRequest(index.render(loginForm, RegistrationForm));
	    } else {
	        session().clear();
	        session("email", loginForm.get().email);
	        return redirect(
	            routes.Application.terminus()
	        );
	    }
	}
	//Logout
	public static Result logout() {
	    session().clear();
	    flash("success", "You've been logged out");
	    return redirect(
	        routes.Application.login()
	    );
	}

	//The type of RegistrationForm is then Form<Registrant> since it is a form generating a basic Registrant
	static Form<Registrant> RegistrationForm = Form.form(Registrant.class);

	public static Result newRegistrant() {
		Form<Registrant> filledForm = RegistrationForm.bindFromRequest();
	  	if(filledForm.hasErrors()) {
	    	return badRequest(index.render(form(Login.class), filledForm)
	    );
	  	} else {
	    	Registrant.create(filledForm.get());
	    	session("email", filledForm.get().email);
	    	return redirect(routes.Application.displayProfile(session("email")));  
	  	}
	}

	public static Result editRegistrant(String id) {
		return TODO;
		/*Form<Registrant> filledForm = RegistrationForm.bindFromRequest();
	  	if(filledForm.hasErrors()) {
	    	return badRequest(
	    	views.html.editProfile.render(
	    		filledForm,
	    		Registrant.find.where().eq("email", request().username()).findUnique()
	    	)
	    );
	  	} else {
	  		Registrant.delete(id);
	    	Registrant.create(filledForm.get());
	    	return ok(
				views.html.browse.render(Registrant.all())
			);
	  	}*/
	}

	public static Result deleteRegistrant(String id) {
  		return TODO;
  		/*Registrant.delete(id);
  		return redirect(routes.Application.registrants());*/
	}

	public static Result editProfile(String id) {
		return TODO;
		/*Registrant registrantToModify = Registrant.retrieve(id);
		Form<Registrant> filledForm = Form.form(Registrant.class).fill(registrantToModify);
		return ok(
			views.html.editProfile.render(
				filledForm, 
				Registrant.find.where().eq("email", request().username()).findUnique())
			);
			*/
	}
	@Security.Authenticated(Secured.class)
	public static Result displayProfile(String email) {
		Registrant profile = Registrant.find.where().eq("email", email).findUnique();
		return ok(
			views.html.profile.render(profile,
				Registrant.find.where().eq("email", request().username()).findUnique())
		);
	}

}