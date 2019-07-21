
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestPro {
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "TestPro [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public static void main(String args[]) {
		TestPro testpro=new TestPro();
		testpro.setId(1);
		testpro.setName("Amar");
		TestPro testpro1=new TestPro();
		testpro1.setId(2);
		testpro1.setName("Aman");
		List<TestPro> testProList=new ArrayList();
		testProList.add(testpro);
		testProList.add(testpro1);
		Map<Integer,String> hm=testProList.stream().collect(Collectors.toMap(TestPro :: getId,TestPro :: getName));
		System.out.println("Iterating List Here:::");
		hm.forEach((k,v)->{
			System.out.print("Id::"+k+" "+"value::"+v);
			System.out.println();
		});
		
		
	}
	
	

}
