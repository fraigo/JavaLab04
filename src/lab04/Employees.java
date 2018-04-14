package lab04;

import java.util.ArrayList;
import java.util.Collections;

public class Employees {

	ArrayList<Employee> list;
	ArrayList<HockeyPlayer> hpList;
	ArrayList<Professor> profList;
	ArrayList<Parent> prntList;
	ArrayList<GasStationAttendant> gsaList;
	
	public Employees(){
		
		list=new ArrayList<Employee>();
				
		hpList=new ArrayList<HockeyPlayer>(); 
		hpList.add(new HockeyPlayer("Wayne Gretzky", 894));
		hpList.add(new HockeyPlayer("Who Ever", 0));
		hpList.add(new HockeyPlayer("Brent Gretzky", 1));
		hpList.add(new HockeyPlayer("Pavel Bure", 437));
		hpList.add(new HockeyPlayer("Jason Bourne", 0));

		profList=new ArrayList<Professor>();
		profList.add(new Professor("Albert Einstein", "Physics"));
		profList.add(new Professor("Alan Turing", "Computer Systems"));
		profList.add(new Professor("Richard Feynman", "Physics"));
		profList.add(new Professor("Tim Berners-Lee", "Computer Systems"));
		profList.add(new Professor("Kurt Godel", "Logic"));

		prntList=new ArrayList<Parent>();
		prntList.add(new Parent("Tiger Woods", 1));
		prntList.add(new Parent("Super Mom", 168));
		prntList.add(new Parent("Lazy Larry", 20));
		prntList.add(new Parent("Ex Hausted", 168));
		prntList.add(new Parent("Super Dad", 167));

		gsaList=new ArrayList<GasStationAttendant>();
		gsaList.add(new GasStationAttendant("Joe Smith", 10));
		gsaList.add(new GasStationAttendant("Tony Baloney", 100));

		gsaList.add(new GasStationAttendant("Benjamin Franklin", 100));

		gsaList.add(new GasStationAttendant("Mary Fairy", 101));

		list.add(new GasStationAttendant("Bee See", 1));
		
	}
	
	public void print(){
		for (int i = 0; i < hpList.size(); i++) {
			System.out.println(hpList.get(i).toString());
		}
		for (int i = 0; i < profList.size(); i++) {
			System.out.println(profList.get(i).toString());
		}
		for (int i = 0; i < prntList.size(); i++) {
			System.out.println(prntList .get(i).toString());
		}
		for (int i = 0; i < gsaList.size(); i++) {
			System.out.println(gsaList.get(i).toString());
		}
	}
	
	public void sort(){
		Collections.sort(hpList);
		Collections.sort(profList);
		Collections.sort(prntList);
		Collections.sort(gsaList);
	}

}
