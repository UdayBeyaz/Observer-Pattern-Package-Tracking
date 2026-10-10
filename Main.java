public class Main {
    public static void main(String[] args) {
        System.out.println("==================== EXPECTED OUTPUT ====================");

        PackageTracker tracker = new PackageTracker();

        Observer customerApp = new CustomerApp();
        Observer courierDashboard = new CourierDashboard();
        Observer trackingLogger = new TrackingLogger();

        tracker.registerObserver(customerApp);
        tracker.registerObserver(courierDashboard);
        tracker.registerObserver(trackingLogger);


        tracker.updateStatusAndLocation("Arrived at Distribution Center", "Chicago");

        System.out.println("\n=== Removing Customer App from Observers List ===\n");

        tracker.removeObserver(customerApp);


        tracker.updateStatusAndLocation("Out for Delivery", "Brooklyn");

        System.out.println("==========================================================");
    }
}
