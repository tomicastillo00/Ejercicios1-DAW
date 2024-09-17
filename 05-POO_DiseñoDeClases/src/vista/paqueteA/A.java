package vista.paqueteA;

class A {
	//Como hemos puesto class sin ningun modificador, solo podremos acceder a esta clase a traves del mismo paquete o desde la clase
	//No desde un subpaquete

	String a;
	
	
	A(){
		a="Hola desde A";
	}
	
	void setA(String a) {
		this.a = a;
	}
	
	String getA() {return this.a;}
	
}
