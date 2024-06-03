package BehavioralPatterns.Template.Example2;

public class ToCouncil extends PetitionWriter {
	
    @Override
    protected void writeAssociationName() {
        System.out.println("YÜKSEK ÖĞRETİM KURUMU MÜDÜRLÜĞÜNE");
        System.out.println();
    }

    @Override
    protected void writeMainTemplate() {
    	
        System.out.println("100849100834 yöksis numaralı Prof. Dr. Can Goatoğlu'nun ");
        System.out.println("04.06.2024 tarihindeki Artificial Intelligence yüksek lisans tez sunumunun ");
        System.out.println("mücbir sebeplerle (COVID-19) 04.07.2024 tarihine ertelenmesini istiyorum. ");
        System.out.println("Gereğinin yapılmasını arz ederim.");
        System.out.println();
        System.out.println("Saygılarımla.");
        System.out.println();
    	
    }

}
