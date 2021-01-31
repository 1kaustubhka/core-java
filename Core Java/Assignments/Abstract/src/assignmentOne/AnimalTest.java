package assignmentOne;

public class AnimalTest {
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		Animal lion = new Lion();
		
		System.out.println("Respire Animal method called");
		cat.respirate();
		dog.respirate();
		lion.respirate();
		
		System.out.println("Talk Animal method overriden");
		cat.talk();
		dog.talk();
		lion.talk();
	}
}
