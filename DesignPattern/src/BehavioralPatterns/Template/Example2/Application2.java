package BehavioralPatterns.Template.Example2;

public class Application2 {

	public static void main(String[] args) {
		
		PetitionWriter egeUniversity = new ToUniversity();
		egeUniversity.process();
		
		System.out.println();
		System.out.println("---------------------------------------------------------------");
        System.out.println();

        PetitionWriter yök = new ToCouncil();
        yök.process();

	}

}
