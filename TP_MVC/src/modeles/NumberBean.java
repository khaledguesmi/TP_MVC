package modeles;

public class NumberBean {
private double num;

public NumberBean(){
setNumber(0);	
}

public double getNember() {
	return (num);
}

public void setNumber(double number) {
	this.num = number;
}
public double getNum() {
	return num;
}

public void setNum(double num) {
	this.num = num;
}

public static double getrandom(int x){
	//System.out.println("in javabean"+Math.random()*x);
	return Math.random()*x;
	
}
}