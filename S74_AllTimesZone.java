import java.time.ZoneId;

interface S74_AllTimesZone { 
    static void main(String... args) {
        ZoneId.getAvailableZoneIds()
            .forEach(System.out::println);
        System.out.println(ZoneId.getAvailableZoneIds().size());
    }
}
