public void setup() {     
    Cow c = new Cow("Cow", "moo");   
    System.out.println(c.getType() + " goes " + c.getSound()); 
      Chick a = new Chick("Chick","bawk");
    System.out.println(a.getType() + " goes " + a.getSound());   
         Pig b = new Pig("Pig","oink");
    System.out.println(b.getType() + " goes " + b.getSound());   
}
interface Animal {    
  public String getSound();        
  public String getType(); 
}  
