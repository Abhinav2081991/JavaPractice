package ImmutableClassPractice;

public final class ImmutableClass {


    // Instance Variable is Set as final
    final int number;

    //Only getter method, No Setter methods
    public int getNumber(){
        return number;
    }

    // Constructor to set the value of the instance variable once.
    public ImmutableClass(int number){
        this.number = number;
    }
}
