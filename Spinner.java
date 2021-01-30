import java.util.Random;

public class Spinner {
	
	private int spinNumber = 5;
	
	private boolean status = false;
	private int fruitSymbols = 8;
	
	private String symbolPrint;
	
	Slotmachine slotmachine;
	
	public void makeRol() {
		
		Random r = new Random();
		int low = 1;
		int high = 5;
		int result = r.nextInt(high-low) + low;
		
		spinNumber = result;
		
		symbolPrint = "";  
		
		for(int i = spinNumber - 2; i <= spinNumber + 2; i++)
		if (i < 0)  
			symbolPrint = symbolPrint + String.valueOf(fruitSymbols + i) + "\n";  

		else if (i >= fruitSymbols)  
			symbolPrint = symbolPrint + "0" + "\n";  

		else 
			symbolPrint = symbolPrint + String.valueOf(i) + "\n";  

		this.symbolPrint = symbolPrint; 
	}
	
	public String getSymbolPrint() {
		return symbolPrint;
	}
	
	public boolean getStatus() 
	  {  
		return status;
	   }  

	public void setStatus(boolean s)   
	 {  
		status = s;
	  }  
	
	public int getSpinNumber() {
		return spinNumber;
	}
}
