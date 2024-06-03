package BehavioralPatterns.Template.Example1;

public class DatabaseDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading data from database.");
    }

    @Override
    protected void processData() {
        System.out.println("Processing database data.");
    }
}
