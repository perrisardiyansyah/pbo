package controllers;
import models.*;
import play.*;
import play.mvc.*;

import views.html.*;
import views_home.html.*;

public class Application extends Controller {

    public static Result index() {
    	persons person1, person2;
    	account akun1;
		person1 = new persons();
		person1.nama = "Ari Fadli";
		person1.noiden = 123456;
		
		akun1 = new account("PERRIS", 12);
        //return ok(views.html.index.render(person1, akun1));
		return ok(views_home.html.welcome.render(person1, akun1));
    }

}
