package test03;

public class Test3 implements Comparable<Test3> {
	public String name;
	public int age;

	public Test3(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Test3 [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Test3 o) {
		// 나이 순으로?
		// return this.age - o.age;

		// 이름 순으로?
		return this.name.compareTo(o.name);
	}
}
