package Chapter67.e12;

import Chapter67.e7.User;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Martin","loco@loco.com",30);
        Person p2 = new Person("John","loco@loco.com",30);
        Person p3 = new Person("Ray","loco@loco.com",30);
        Person p4 = new Person("Martin","loco@loco.com",30);

        System.out.println(p1.equals(p4));
        System.out.println(p1);

    }
}
