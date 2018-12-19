import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Software {
	public static void main (String[] args) {
		List<Student> allStudents = new ArrayList<>();
		
		for (int i=0;i<500;i++) {
			Student student = new Student(createRandomName(), generateAge(), generateCity());
			allStudents.add(student);
		}
		List<Student> registeredList = new ArrayList<>();
		List<Student> reserveList = new ArrayList<>();
		List<Student> paymentList = new ArrayList<>();
		
		for(int i = 0; i<250; i++){
			registeredList.add(allStudents.get(i));
			
			//registeredList.get(i) = allStudents.get(i);
			registeredList.get(i).setPayment(randomPayment());
			
			paymentList = registeredList;
			paymentList.toString();
			}
		
		
		
		
		for(int i = 250; i<500; i++){
			reserveList.add(allStudents.get(i));
		}
		
	}
	
	private static String createRandomName() {
		String[] firstNames = { "Ali", "Ayse", "Ahmet", "Mehmet", "Mustafa", "Gizem", "Sibel", "Burak", "Bahar" };
		String[] lastNames = { "Yilmaz", "Caliskan", "Korkmaz", "Kaya", "Akar", "Sonmez", "Celikoglu" };

		Random random = new Random();

		String firstName = firstNames[random.nextInt(firstNames.length)];
		String lastName = lastNames[random.nextInt(lastNames.length)];
		String name = firstName + " " + lastName;

		return name;

	}
	private static String generateCity() {
		String[] cities = {"Istanbul", "Ankara", "Izmýr", "Antalya", "Bursa", "Edirne"};
		
		Random random = new Random();
		
		String city = cities[random.nextInt(cities.length)];
		
		return city;
	}
	
	private static int generateAge() {
		int[] ages = new int[5];
		ages[0] = 18;
		ages[1] = 19;
		ages[2] = 20;
		ages[3] = 21;
		ages[4] = 22;
										
		Random random = new Random();
		
		int age = ages[random.nextInt(ages.length)];
		
		return age;
	}
	
	private static boolean randomPayment(){
		boolean payment = false;
		
		Random random = new Random();
		payment = random.nextBoolean();
		return payment;
	}
}