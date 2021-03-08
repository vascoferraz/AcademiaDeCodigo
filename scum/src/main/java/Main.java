
public class Main {

    public static void main(String[] args) {

        Machine machine = new Machine();

        System.out.println(machine.compute(6, (n1) -> n1 * n1));

        System.out.println(machine.compute(6, 6, (n1, n2) -> n1 + n1));

        System.out.println(machine.compute("Hello", "World", (n1, n2) -> n1 + n1));

    }
}
