package JavaEight.inheritance;

public interface parent {
    default void print(){
        System.out.println("Hello parent");
    }
}

interface child {

    default void print(){
        System.out.println("Hello child");
    }
}

class A implements  parent, child {   // This will work if child interface extends parent interface

    public static void main(String[] args) {
        A a  = new A();
        a.print();
    }

    @Override
    public void print() {
        parent.super.print();
        //or
        child.super.print();
    }
}

// We cannot have to same default methods coming from two different interfaces which are not inheriting each other.
