public class TrackingLogger implements Observer {
    @Override
    public void update(String status, String location) {
        System.out.println("LOG: Package changed -> [" + status + "] [" + location + "]");
    }
}
