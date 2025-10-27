package jikosyoukai_program;

public class Main {
	
	public static void main(String[] args) {
		    Person person1 = new Person("鈴木太郎", 20, 1.7, 60.0);
		   
		    System.out.println(person1.name);
		    System.out.println(person1.age);
		    System.out.println(person1.height);
		    
		    
		    
		 // printメソッドで出力（問題8・9）
		    person1.print();
		   
		    // 合計人数を出力（問題10）
		    Person.printCount();
		  }
		}


