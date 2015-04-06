package controllers;

import play.*;
import play.mvc.*;
import play.Logger;
import views.html.*;

public class Application extends Controller {

    public static Result index() {

        Logger.debug("Debugging point");
        int x = 100, y = 0;
        Logger.info("value of x = ",x," value of y = ",y);

        try {
            int z = x / y;
        }catch (Exception e){
            Logger.error("Exception occur ", e);
        }

        return ok(index.render("Your new application is ready to "));
    }

}
