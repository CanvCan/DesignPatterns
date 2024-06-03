package BehavioralPatterns.Template.Example1;

public class Application1 {
    public static void main(String[] args) {
        DataProcessor fileProcessor = new FileDataProcessor();
        fileProcessor.process();

        System.out.println();

        DataProcessor dbProcessor = new DatabaseDataProcessor();
        dbProcessor.process();
    }
}
