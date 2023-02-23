package test04;

import java.util.Comparator;

public class NameComparator implements Comparator<Test3> {

	@Override
	public int compare(Test3 o1, Test3 o2) {
		return o1.name.compareTo(o2.name);
	}

}
