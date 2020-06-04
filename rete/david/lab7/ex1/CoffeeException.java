package rete.david.lab7.ex1;

public class CoffeeException {
	public static void main(String[] args) {
		CofeeMaker mk = new CofeeMaker();
		CofeeDrinker d = new CofeeDrinker();

		for(int i = 0;i<15;i++){
			Cofee c;
			try {
				c = mk.makeCofee();
			} catch (TooMuchCoffeeException e) {
				System.out.println("Exception:"+e.getMessage()+" cupsmade:"+e.getCups());
				break ;
			}
			try {
				d.drinkCofee(c);
			} catch (TemperatureException e) {
				System.out.println("Exception:"+e.getMessage()+" temp="+e.getTemp());
			} catch (ConcentrationException e) {
				System.out.println("Exception:"+e.getMessage()+" conc="+e.getConc());
			}
		}
	}
}//.class

class CofeeMaker {
	Cofee makeCofee() throws TooMuchCoffeeException {
		System.out.println("Make a coffe");
		int t = (int)(Math.random()*100);
		int c = (int)(Math.random()*100);
		Cofee cofee = new Cofee(t,c);
		if (Cofee.getCups() >= 10)
			throw new TooMuchCoffeeException(Cofee.getCups(), "can not do");
		return cofee;
	}

}//.class

class Cofee{
	private static int n = 0;
	private int temp;
	private int conc;

	Cofee(int t,int c) {
		n++;
		temp = t;
		conc = c;
	}
	static int getCups() {
		return (n);
	}
	int getTemp(){return temp;}
	int getConc(){return conc;}
	public String toString(){return "[cofee temperature="+temp+":concentration="+conc+"]";}
}//.class

class CofeeDrinker{
	void drinkCofee(Cofee c) throws TemperatureException, ConcentrationException{
		if(c.getTemp()>60)
			throw new TemperatureException(c.getTemp(),"Cofee is too hot!");
		if(c.getConc()>50)
			throw new ConcentrationException(c.getConc(),"Cofee concentration too high!");
		System.out.println("YouCanDrinkTheCoffee:"+c);
	}
}//.class

class TemperatureException extends Exception{
	int t;
	public TemperatureException(int t,String msg) {
		super(msg);
		this.t = t;
	}

	int getTemp(){
		return t;
	}
}//.class

class ConcentrationException extends Exception{
	int c;
	public ConcentrationException(int c,String msg) {
		super(msg);
		this.c = c;
	}

	int getConc(){
		return c;
	}
}//.class

class TooMuchCoffeeException extends Exception {
	int n;

	public TooMuchCoffeeException(int n, String msg) {
		super(msg);
		this.n = n;
	}

	public int getCups() { return (this.n); }
}
