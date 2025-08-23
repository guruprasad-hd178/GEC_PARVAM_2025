package anonymous_inner_class;

class Person {
	public String name = "a";
	public int age = 1;
	
	public void isWalking()
	{
		System.out.println("person is walking");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
		Person person = new Person() {
			public String name = "mohan";
			public int age = 22;
//			{   // instance block
//				name = "guru";
//				age = 21;
//			}
			public void isWalking()
			{
				System.out.println("mohan is walking");
			}
			
			public String getName() {
				return name;
			}

			public int getAge() {
				return age;
			}
		};
		System.out.println(person.getName());
		System.out.println(person.getAge());
		person.isWalking();
		
		System.out.println(person.name);
		System.out.println(person.age);

	}
}
