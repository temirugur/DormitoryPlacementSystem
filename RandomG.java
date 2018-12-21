import java.util.*;

public class RandomG{
	
	

	public String createRandomName() {
		String[] firstNames = { "Ali", "Ayse", "Ahmet", "Mehmet", "Mustafa", "Gizem", "Sibel", "Burak", "Bahar", "Yiğit", "Ekin", "Uğur", "Betül", "Önay", "Hasan", "Veli", "Burak Can", "Pelinsu", "Selin", "Kemal", "Ali", "Muratcan", "Kazım", "Fevzi", "Melisa", "Gül", "Barlas", "Sinan", "Selen", "Öyküm", "Ece", "Selim", "Hüsnü", "Aylin", "Kerim", "Kerem", "Damla", "Meriç", "Yasin", "Arda", "Bahar", "Volkan", "Burhan", "Simay", "Yağız", "Bengü", "Aslı", "Çağla", "Erkut", "Zeki", "Merthan", "Mesut", "Muharrem", "Oğuz", "İlayda", "Tarık", "Egecan", "Aytaç", "Deniz", "Sacit", "Ata", "Cem", "Fatih", "Cemil", "Cemal", "Arda", "Kamil", "Halil", "İbrahim", "Efe", "Kaan", "Okan" };
		String[] lastNames = { "Yılmaz", "Çalışkan", "Korkmaz", "Kaya", "Akar", "Sönmez", "Çelikoglu", "Soydan", "İnsel", "Temir", "Başıbüyük", "Çarşıbaşı", "Çakmak", "Nakkaş", "Çakır", "Bayramgürler", "İnönü", "Ecevit", "Ersoy", "Erbil", "Anadolu", "Kılıçdaroğlu", "İnce", "Akşener", "Gürses", "Ziyagil", "Nalbant", "Şahin", "Kartal", "Konuşkan", "Geyik", "Tilki", "Taş", "Altıntop", "Koçyiğit", "Ateş", "Toprak", "Işık", "Topatan", "Sözer", "Hışım", "Boyacı", "Aldemir", "Tunç", "Çoban", "Güneri", "Taşkın", "Uysal", "Sivaslı", "Tan", "Güneş", "Tatlıtuğ", "Yerlitaş", "Gürel", "Gülsoy", "Ergüçlü", "Ulusoy", "Dalkılıç", "Saat", "Çayoğlu", "Özpirinççi", "Boluğur", "Uzerli", "Sert", "Mola", "Evcen", "Erçel", "Esmersoy", "Sangu", "Hasoğlu", "Sarıkaya", "Özçivit", "Boz", "Akar", "Bakar", "Soluk", "Solak", "Köylü", "Topal", "İzmirli", "Toy", "Zorlu", "Koç", "Kral", "Aslan", "Geyikçi", "Gar", "Soysal", "Portakal" };

		Random random = new Random();

		String firstName = firstNames[random.nextInt(firstNames.length)];
		String lastName = lastNames[random.nextInt(lastNames.length)];
		String name = firstName + " " + lastName;

		return name;

	}
