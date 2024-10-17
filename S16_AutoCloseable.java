/*
 * I forget why I creat it, may be for Postgres autoclosabel connexion  
 */
public class S16_AutoCloseable implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("Closing");
    }

    public static void main(String... args) throws Exception{
        try (var a = new S16_AutoCloseable()) {

        }
    }

}
