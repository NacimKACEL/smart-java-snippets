import java.util.Base64;

// get class from byte code

interface S97_CustomBase64ClassLoader {
    class BytesClassLoader extends ClassLoader {
        public Class<?> findClass(String name) {
            var clazz = ""; // enter the byte code 
            var b = Base64.getDecoder().decode(clazz);
            return defineClass(name, b, 0, b.length);
        }
    }

    static void main(String... args) throws Exception{
        new BytesClassLoader()
            .findClass("Duke")
            .getDeclaredConstructor()
            .newInstance();
    }

}
