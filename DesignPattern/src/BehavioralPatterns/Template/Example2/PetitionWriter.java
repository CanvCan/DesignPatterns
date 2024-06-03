package BehavioralPatterns.Template.Example2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class PetitionWriter {	
    // Template method
    public final void process() {
    	writeAssociationName();
    	writeMainTemplate();
    	writeDate();
    	writeSignature();
    }

    // Steps to be implemented by subclasses
    protected abstract void writeAssociationName();
    protected abstract void writeMainTemplate();

    // Concrete method
    private void writeDate() {
    	LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = currentTime.format(formatter);
        System.out.println(formattedDateTime);
    }

    private void writeSignature() {
        System.out.println("Prof. Dr. Can Goatoğlu");
    }

}
