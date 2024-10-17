import java.lang.reflect.Field;

interface S64_ShortInterfaceFields {

    interface Configuration {
        int MESSAGE = 43;
    }

    static void main(String... args) throws Exception{
        var fields = Configuration.class
            .getDeclaredFields();
        for (Field field: fields) {
            System.out.println(field);
            System.out.println(field.get(null));
        }
    }

}
