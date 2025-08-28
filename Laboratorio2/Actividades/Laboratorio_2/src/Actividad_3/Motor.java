package Actividad_3;

public class Motor {
	private int numMotor;
	private int revPorMin;
	
	public Motor(int numMotor, int revPorMin) {
		this.numMotor = numMotor;
		this.revPorMin = revPorMin;
	}
	
	//Setters and Getters
	
	public void setNumMotor(int numMotor) {
		this.numMotor = numMotor;
	}
	
	public void setRevPorMin(int revPorMin) {
		this.revPorMin = revPorMin;
	}
	
	public int getNumMotor() {
		return this.numMotor;
	}
	
	public int getrRevPorMin() {
		return this.revPorMin;
	}
	
	public String toString() {
		return "Motor - numMotor: " + numMotor + " revPorMin: "+ revPorMin;
	}

}