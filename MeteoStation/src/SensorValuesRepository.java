import java.util.LinkedList;
import java.util.List;

public class SensorValuesRepository implements ValuesRepository<Double> {

    private List<Double> repository;
    public SensorValuesRepository(){
        repository = new LinkedList<>();
    }

    @Override
    public int count() {
        return repository.size();
    }

    @Override
    public void addValue(Double value) {
        repository.add(value);
    }

    @Override
    public boolean removeValue(Double value) {
        return repository.remove(value);
    }

    @Override
    public Double getByIndex(int index) throws IndexOutOfBoundsException{
        return repository.get(index);
    }

    @Override
    public List<Double> getAll() {
        return repository;
    }

}
