public class product {
	
	int pcode , price;
	String pname;
	
	public  static void main(String [] args)
	{ //objects are created from product class
		product obj1 = new product();
		product obj2 = new product();
		product obj3 = new product();
		//values are given to the objects
		obj1.pcode = 1;
		obj1.pname = "HP";
		obj1.price = 20000;
		
		obj2.pcode = 2;
		obj2.pname = "Lenovo";
		obj2.price = 10000;
		
		obj3.pcode = 3;
		obj3.pname = "Asus";
		obj3.price = 50000;
		
		System.out.println("Details of product which has lowest price : ");
		
		if(obj1.price < obj2.price && obj1.price < obj3.price)
		{
			System.out.println("Product Code : "+ obj1.pcode+ "\n" + "Name : "+  obj1.pname+ "\n"  + "Price: " + obj1.price );
		}
		else if (obj2.price < obj1.price && obj2.price < obj3.price)
		{
			System.out.println("Product Code "+ obj2.pcode+ "\n" + "Name : "+ obj2.pname+ "\n"  + "Price: " + obj2.price );

		}
		else
		{
			System.out.println("Product Code : "+ obj3.pcode+ "\n" + "Name "+ obj3.pname+ "\n"  + "Price : " + obj3.price );

		}	
	}

}