package BehavioralPatterns.Template.Example1;

public class FileDataProcessor extends DataProcessor {
    @Override
    protected void readData() {
        System.out.println("Reading data from file.");
    }

    @Override
    protected void processData() {
        System.out.println("Processing file data.");
    }
}
