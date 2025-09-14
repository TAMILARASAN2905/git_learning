package git_learning;

public class Cycle extends Owner {
    Cycle(int age) {
        super(age);
    }

    public static void main(String[] args) {
        Owner owner = new Owner(24);
        System.out.println("Start");
        System.out.println("running cycle class");
        System.out.println(owner.name());
        System.out.println(owner.rto());
        System.out.println(owner.age);
    }

    static double price() {
        return 152000.00;
    }
}
