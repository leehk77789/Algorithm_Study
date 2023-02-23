package test04;

import java.util.Comparator;

public class AgeComparator implements Comparator<Test3> {

	@Override
	public int compare(Test3 o1, Test3 o2) {
		// TODO Auto-generated method stub
		return o1.age - o2.age;
	}

}
