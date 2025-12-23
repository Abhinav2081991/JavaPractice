package ImmutableClassPractice;

import ImmutableClassPractice.ImmutableClass;

public class TestImmutable {

    public static void main(String[] args) {
        ImmutableClass ic = new ImmutableClass(10);

        System.out.println(ic.getNumber());

        System.out.println(ic.getNumber() + 1);


        ImmutableClass ic1 = new ImmutableClass(11);

        System.out.println(ic1.getNumber() +1);

    }
}
