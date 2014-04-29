public class Hobby {
	String bezeichnung;
	int prioritaet;
	
	public Hobby(String bezeichnung,int prioritaet) {
		//!?
		this.bezeichnung=new String("");
		
		setPrioritaet(prioritaet);
		setBezeichnung(bezeichnung);
	}
	
	public void setBezeichnung(String s){
		if (s.length()==0 ){return;}
		bezeichnung=s;
		
	}
	public String getBezeichnung(){return bezeichnung; }
	
	public  void setPrioritaet(int s){
		if (s<=0){return;}
		prioritaet=s;
	}
	public int getPrioritaet(){return prioritaet; }
	
	
	
}
