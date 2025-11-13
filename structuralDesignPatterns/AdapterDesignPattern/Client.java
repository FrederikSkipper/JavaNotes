package structuralDesignPatterns.AdapterDesignPattern;

public class Client {
    public static void askForRefreshRate(Monitor monitor) {
        monitor.refreshRate();
    }

    public static void main(String[] args) {
        MonitorAdapter adapter = new MonitorAdapter();
        askForRefreshRate(adapter);
    }
}
