package structuralDesignPatterns.AdapterDesignPattern;

public class MonitorAdapter implements Monitor {
    private LegacyMonitor legacyMonitor = new LegacyMonitor();

    @Override
    public void refreshRate() {
        legacyMonitor.hz();
    }

}
