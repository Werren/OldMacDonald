Farm [] a;
public void setup() {     
  Farm a = new Farm();
  a.animalSounds();
}
interface Animal {    
  public String getSound();        
  public String getType();
}  
