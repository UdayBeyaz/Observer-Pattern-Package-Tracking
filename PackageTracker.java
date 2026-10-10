import java.util.ArrayList;
import java.util.List;

public class PackageTracker implements Subject {
    private List<Observer> observers;
    private String status;
    private String location;

    public PackageTracker() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(status, location);
        }
    }

    public void updateStatusAndLocation(String status, String location) {
        this.status = status;
        this.location = location;
        notifyObservers();
    }
}
