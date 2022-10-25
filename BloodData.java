class BloodData {
private  String bloodType;
private String rhFactor;

public BloodData(){
bloodType = "O";
rhFactor = "+";
}

public BloodData(String bt, String rh){
bloodType = bt;
rhFactor = rh;
}

public void display(){
System.out.println(bloodType + rhFactor + " is added to the blood bank.");
}

public void setBloodType(String newType){
this.bloodType = newType;
}

public void setRhFactor(String rh){
	this.rhFactor = rh;
}
public String getBloodType(){
	return bloodType;
}

public String RhFactor(){
	return bloodType;
}

public String getRhFactor(){
	return rhFactor;
}
}

 

 

 

 