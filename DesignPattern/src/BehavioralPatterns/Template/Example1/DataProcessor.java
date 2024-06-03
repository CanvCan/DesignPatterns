package BehavioralPatterns.Template.Example1;

public abstract class DataProcessor {
    // Template method
    public final void process() {
        readData();
        processData();
        saveData();
    }

    // Steps to be implemented by subclasses
    protected abstract void readData();
    protected abstract void processData();

    // Concrete method
    private void saveData() {
        System.out.println("Saving data to database.");
    }
}

