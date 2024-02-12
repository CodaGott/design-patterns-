package designpatterns.iterator;

public interface Iterator {
    boolean hasNext();
    Integer next();

    Integer get();
    boolean hasPrevious();
    Integer previous();
}
