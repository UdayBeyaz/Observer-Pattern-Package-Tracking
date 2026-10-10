public class CourierDashboard implements Observer {
    @Override
    public void update(String status, String location) {
        System.out.println("Courier Dashboard: Package status = " + status + ", location = " + location);
    }
}
