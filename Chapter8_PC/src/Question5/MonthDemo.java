package Question5;

public class MonthDemo {

	public static void main(String[] args) {
		
		Month demo1 = new Month(2);
		Month demo2 = new Month("March");
		
		System.out.println(demo1.equals(demo2));
		System.out.println(demo1.greaterThan(demo2));
		System.out.println(demo1.lessThan(demo2));

		
	}

}
