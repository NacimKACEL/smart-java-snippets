import static java.lang.System.*;
import java.beans.EventHandler;

//  intercepter la class app, c'est done alors notifeir duke
// built like Aspect

public class S61_MagicBeanEventHandler {

    public void notifyDuke() {
        out.println("run was called");
    }

    public static void main(String... args) {
        var app = new S61_MagicBeanEventHandler();
        var runnable = EventHandler.create(Runnable.class, app, "notifyDuke");
        runnable.run();  
    }


}
