public class Homework12 {
        public static void main(String[] args) {
            new Descendant().hello();
            System.out.printf("%s\n", "------------");
            new Descendant().hello();
        }
    }

    class Ancestor {
        static {
            System.out.printf("%s - %s - %s\n", "ancestor", "static", "block");
        }
        {
            System.out.printf("%s - %s - %s\n", "ancestor", "instance", "block");
        }

        public Ancestor() {
            System.out.printf("%s - %s\n", "ancestor", "constructor");
        }

        public void hello() {
            System.out.printf("%s - %s\n", "ancestor", "method");
        }
    }

    class Descendant extends Ancestor {
        static {
            System.out.printf("%s - %s - %s\n", "descendant", "static", "block");
        }
        {
            System.out.printf("%s - %s - %s\n", "descendant", "instance", "block");
        }

        public Descendant() {
            System.out.printf("%s - %s\n", "descendant", "constructor");
        }
        @Override
        public void hello() {
            super.hello();
            System.out.printf("%s - %s\n", "descendant", "method");
        }
 }
