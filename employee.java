package oopsprogram;

public class employee {
	  String name = "";
	  int id = 0;
	  String work = "";
	  
	  public employee(String name, int id, String work) {
		  this.name = name;
		  this.id = id ;
		  this.work = work;
	  }  
		  void display() {
			  System.out.println("Name :"+name);
			  System.out.println("Id :"+id);
			  System.out.println("Work :"+work);
	  }
		 public static void main(String[] args) {
			employee s1 = new employee("Arun", 101, "Software developer");
			employee s2 = new employee("Kumar", 103, "Coolie");
			s1.display();
			s2.display();
		 }
}
