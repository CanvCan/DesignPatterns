package StructuralPatterns.Composite;

public class Application1 {
	
	public static void main(String[] args) {
		
        // Genel Müdürlük
		Management genelMudurluk = new Management("Genel Müdürlük");

        // Ege Bölge Müdürlüğü
		Management egeBolgeMudurlugu = new Management("Ege Bölge Müdürlüğü");
        egeBolgeMudurlugu.addEmployee(new Employee("Ayse", 4000));
        egeBolgeMudurlugu.addEmployee(new Employee("Can", 3000));
        egeBolgeMudurlugu.addEmployee(new Employee("Selim", 2000));
        egeBolgeMudurlugu.addEmployee(new Employee("Murat", 1500));

        // Akdeniz Bölge Müdürlüğü
        Management akdenizBolgeMudurlugu = new Management("Akdeniz Bölge Müdürlüğü");
        akdenizBolgeMudurlugu.addEmployee(new Employee("Emre", 3000));
        akdenizBolgeMudurlugu.addEmployee(new Employee("Ahmet", 4000));
        akdenizBolgeMudurlugu.addEmployee(new Employee("Bahar", 2500));
        akdenizBolgeMudurlugu.addEmployee(new Employee("Sedat", 1500));
        akdenizBolgeMudurlugu.addEmployee(new Employee("Vedat", 2500));

        // Ege Bölge Müdürlüğü'nü Genel Müdürlük'e ekle
        genelMudurluk.addEmployee(egeBolgeMudurlugu);

        // Akdeniz Bölge Müdürlüğü'nü Genel Müdürlük'e ekle
        genelMudurluk.addEmployee(akdenizBolgeMudurlugu);

        // Genel Müdürlük'ün kendi çalışanlarını ekle
        genelMudurluk.addEmployee(new Employee("Ali", 5000));
        genelMudurluk.addEmployee(new Employee("Veli", 6000));

        // Maliyetleri yazdır
        System.out.println(egeBolgeMudurlugu);
        System.out.println(akdenizBolgeMudurlugu);
        System.out.println(genelMudurluk);
		
		
	}

}
