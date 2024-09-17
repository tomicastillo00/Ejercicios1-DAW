package interfaces;

public class Animal {
private String especie;
private String habitat;

public Animal() {
	this.especie="por determinar";
	this.habitat="por determinar";
}

public Animal(String especie,String habitat) {
	this.especie=especie;
	this.habitat=habitat;
}

public String getEspecie() {
	return especie;
}

public void setEspecie(String especie) {
	this.especie = especie;
}

public String getHabitat() {
	return habitat;
}

public void setHabitat(String habitat) {
	this.habitat = habitat;
}

@Override
public String toString() {
	return "Animal [especie=" + especie + ", habitat=" + habitat + "]";
}

	
	
}
