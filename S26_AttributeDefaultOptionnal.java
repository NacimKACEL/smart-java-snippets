import static java.util.Optional.ofNullable;

interface S26_AttributeDefaultOptionnal {
    class Developper {
        private String name;
        private String language;

        public Developper(String name, String language) {
            this.name = ofNullable(name)
                .map(String::toUpperCase)
                .orElse("nacim");
            this.language = ofNullable(language)
                .map(String::toUpperCase)
                .orElse("java") ;
        }

        @Override
        public String toString() {
            return "Developper[name=" + name + ",language=" + language + "]";
        }
    }

    static void main(String... args) {
        var dev = new Developper(null, null);
        System.out.println(dev.toString());
    }

}
