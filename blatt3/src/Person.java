import java.util.ArrayList;

public class Person {
	String name;
	ArrayList<Hobby> hobbys;
	
	public void setName(String s){
		if (s.length()==0 ){return;}
		this.name=s;
	}
	public String getName(){return name;}
	
	public  void addHobbys(Hobby h){
		if (h.getPrioritaet()==0){return;}
		hobbys.add(h);
	}
	public void removeHobbys(Hobby h){
		hobbys.remove(h);
	}
	
	public ArrayList<Hobby> getHobbys(){
		return hobbys;
	}
	public Person(String name,Hobby hobby){
		this.name=new String("");
		this.hobbys=new ArrayList<Hobby>();
		
		setName(name);
		addHobbys(hobby);
	}
	
	
}
