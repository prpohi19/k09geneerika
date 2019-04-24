class Generic 
{ 

	String genericName;

	public Generic(String name){
		this.genericName = name;
	}
	
	public String toString(){
		return "actually an object";
	}

  static <T> void identify (T element){ 
        System.out.println(element.getClass().getName() + " = " + element); 
  } 
  
  public static void main(String[] args) { 
	
  Generic test = new Generic("Juku");
		
  identify(test);
  identify("string");    
  identify('c');
  identify(11); 
  identify(1.0);
  identify(true);
  } 
}

/*
Generic = actually an object
java.lang.String = string
java.lang.Character = c
java.lang.Integer = 11
java.lang.Double = 1.0
java.lang.Boolean = true
*/
