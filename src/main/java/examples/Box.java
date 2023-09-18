package examples;

public class Box<T extends Comparable<T>> {
    
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }
}
