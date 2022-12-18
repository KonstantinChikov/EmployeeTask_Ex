import java.util.List;

public interface ValuesRepository<T> {

    int count();
    void addValue(T value);
    boolean removeValue(T value);
    T getByIndex(int index);
    List<T> getAll();

}
