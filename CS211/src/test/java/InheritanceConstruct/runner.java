package InheritanceConstruct;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee A = new Employee("Yellow", 340.52);
		System.out.println("HOURS: "+A.getHours());
		System.out.println("SALARY: "+A.getSalary());
		System.out.println("VACATIONDAYS: "+A.getVacationDays());
		System.out.println("VACATIONFORM: "+A.getVacationForm());
		System.out.println(A);
		Janitor B = new Janitor("Blue",100,true);
		System.out.println("HOURS: "+B.getHours());
		System.out.println("SALARY: "+B.getSalary());
		System.out.println("VACATIONDAYS: "+B.getVacationDays());
		System.out.println("VACATIONFORM: "+B.getVacationForm());
		System.out.println("ToString: "+B);
		System.out.println("Cleaning: ");
		B.clean();
		NovinceJanitor C = new NovinceJanitor("Blue",25);
		System.out.println("HOURS: "+C.getHours());
		System.out.println("SALARY: "+C.getSalary());
		System.out.println("VACATIONDAYS: "+C.getVacationDays());
		System.out.println("VACATIONFORM: "+C.getVacationForm());
		System.out.println("ToString: "+C);
		System.out.println("Cleaning: ");
		C.clean();

		/**********************
		 * Car inheritance (part 2)
		 */
		Car c = new Car();
		System.out.println( "Call to Car's m1(): " );
		c.m1();
		System.out.println( "\nCall to Car's m2(): " );
		c.m2();
		System.out.println( "\nCall to print Car's toString(): " );
		System.out.println( c ); // calls toString()
		Truck t = new Truck();
		System.out.println( "\n\nCall to Truck's m1(): " );
		t.m1();
		System.out.println( "\nCall to Truck's m2(): " );
		t.m2();
		System.out.println( "\nCall to print Truck's toString(): " );
		System.out.println( t ); // calls toString()
		MonsterTruck mt = new MonsterTruck();
		System.out.println( "\n\nCall to MonsterTruck's m1(): " );
		mt.m1();
		System.out.println( "\nCall to MonsterTruck's m2(): " );
		mt.m2();
		System.out.println( "\nCall to print MonsterTruck's toString(): " );
		System.out.println( mt ); // calls toString()
	}
}
//System.out.println(
//		"I work "+a.getHours()+" weekly, make "
//+a.getSalary()+", have "
//+a.getVacationDays()+" vacation days, and fill out a "
//+a.getVacationForm()+" vacation form.");