public class CustomerApp implements Observer {
    @Override
    public void update(String status, String location) {
        System.out.println("Customer App: Your package is now '" + status + "' at " + location + ".");
    }
}
