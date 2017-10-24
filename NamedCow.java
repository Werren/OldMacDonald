class NamedCow implements Animal
{
  private String myType;     
  private String mySound;      
  private String myName;  
  public NamedCow(String type, String name, String sound) {         
    myType = type;  
    myName = name;
    mySound = sound;
  }     
  public NamedCow() {         
    myType = "unknown";         
    mySound = "unknown";
  }      
  public String getSound() {
    return mySound;
  }   
  public String getName() {
    return myName;
  } 
  public String getType() {
    return myType;
  }
}
