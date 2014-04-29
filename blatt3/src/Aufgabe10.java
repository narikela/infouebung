public class Aufgabe10 {
	public static void main(String[] argc){
		Hobby Malen = new Hobby("Malen",1);
		Hobby Schreiben = new Hobby("Schreiben",2);
		Hobby Lesen = new Hobby("Lesen",3);
		
		
		Person Anna=new Person("Anna",Malen);
		Anna.addHobbys(Schreiben);
		Anna.addHobbys(Lesen);
		
		Person Hans=new Person("Hans",Schreiben);
		
		System.out.println(Anna.getName()+" hat folgende Hobbys:");
		for (int i=0;i< Anna.getHobbys().size();i++){
			System.out.println(" -"+Anna.getHobbys().get(i).getBezeichnung()+" mit Priorität "+Anna.getHobbys().get(i).getPrioritaet());
		}
		System.out.println(Hans.getName()+" hat folgende Hobbys:");
		for (int i=0;i< Hans.getHobbys().size();i++){
			System.out.println(" -"+Hans.getHobbys().get(i).getBezeichnung()+" mit Priorität "+Hans.getHobbys().get(i).getPrioritaet());
		}
		
		Anna.removeHobbys(Schreiben);
		
		System.out.println(Anna.getName()+" hat folgende Hobbys:");
		for (int i=0;i< Anna.getHobbys().size();i++){
			System.out.println(" -"+Anna.getHobbys().get(i).getBezeichnung()+" mit Priorität "+Anna.getHobbys().get(i).getPrioritaet());
		}
		
		Hobby Laufen = new Hobby("Laufen",-1);
		Hans.addHobbys(Laufen);
		
		System.out.println(Hans.getName()+" hat folgende Hobbys:");
		for (int i=0;i< Hans.getHobbys().size();i++){
			System.out.println(" -"+Hans.getHobbys().get(i).getBezeichnung()+" mit Priorität "+Hans.getHobbys().get(i).getPrioritaet());
		}
	}
}
