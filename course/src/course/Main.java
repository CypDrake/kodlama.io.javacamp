package course;

public class Main {

	public static void main(String[] args) {

		Courses course1 = new Courses("Yazılım Geliştrici Yetişirme Kampı(c#, Angular)","Engin Demirog",9);
		
		Courses course2 = new Courses("Yazılım Geliştrici Kampı(JAVA, REACT)","Engin Demirog", 19);
		
		Courses course3 = new Courses("Yazılım Geliştrici Kampı(JavaScript)","Engin Demirog", 29);
		
		
	
			Courses [] courses = {course1,course2,course3};
			
			for	(Courses course : courses) {
				
				System.out.println(course.name +" "+ course.instructor +" Yüzde "+ course.progress+ " tamamlandı.");
				
			
				
				
				
			}
			
				 
		courseManager tabs1 = new courseManager("Kurslarım");
		courseManager tabs2 = new courseManager("Tüm Kurslar");
		courseManager tabs3 = new courseManager("Kampa Hazırlık");
		
		courseManager [] tabs = {tabs1,tabs2,tabs3};
		
		for	(courseManager tab: tabs) {
			
			
			System.out.println(tab.name);
			
			
			
		}
		
		
		
		
			 
		 
	
	}

}
