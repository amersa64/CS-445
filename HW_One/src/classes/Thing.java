package classes;

public class Thing {
	private String name;
	//default constructor
	public Thing(String name){
		this.name= name;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString(){
		String className = getClass().getSimpleName();
		if(className.equals("Thing")){
			return name;
		}
		return name +" "+ className;
	}
}
