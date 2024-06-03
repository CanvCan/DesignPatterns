package BehavioralPatterns.Template.Example2;

public class ToUniversity extends PetitionWriter {
	
    @Override
    protected void writeAssociationName() {
        System.out.println("EGE ÜNİVERSİTESİ MÜDÜRLÜĞÜNE");
        System.out.println();
    }

    @Override
    protected void writeMainTemplate() {
    	
        System.out.println("05190000111 numaralı Prof. Dr. Can Goatoğlu'nun ");
        System.out.println("böbrek nakli nedeniyle 04.06.2024 tarihindeki Artificial ");
        System.out.println("Intelligence dersine katılamayacağını beyan eder gereğinin ");
        System.out.println("yapılmasını arz ederim");
        System.out.println();
        System.out.println("Saygılarımla.");
        System.out.println();
    }

}
