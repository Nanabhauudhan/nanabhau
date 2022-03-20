
public class Product {
	String pname;
	int id;
	double pprice;

	@Override
	public String toString() {
		return "Product [pname=" + pname + ", id=" + id + ", pprice=" + pprice + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	public static void main(String[] args) {
		
	
	Product product=new Product();
	product.setId(10);
	product.setPname("tom");
	product.setPprice(12500);
	
	System.out.println(product.getId());
	System.out.println(product.getPname());
	System.out.println(product.getPprice());

	
	
	
	System.out.println(product);
	
	
	}

}
