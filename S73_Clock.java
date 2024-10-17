import java.time.Clock;
//Usefull for unit tests
interface S73_Clock {
    static void main(String... args) {
        var clock = Clock.systemUTC();
        var instant = clock.instant();
        System.out.println(instant);
        var millis = clock.millis();
        System.out.println(millis);
    }

}
