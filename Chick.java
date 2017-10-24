class Chick implements Animal {   
  private String myType;     
  private String mySound;      
  public Chick(String type, String soundA, String soundB)     
  {         
    myType = type;  
    if (Math.random()<0.5)
      mySound = soundA; 
    else
      mySound= soundB;
  }     
  public Chick() {         
    myType = "unknown";         
    mySound = "unknown";
  }      
  public String getSound() {
    return mySound;
  }     
  public String getType() {
    return myType;
  }
}
