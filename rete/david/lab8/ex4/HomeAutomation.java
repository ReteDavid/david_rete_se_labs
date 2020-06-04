package rete.david.lab8.ex4;
import java.util.Random;

public class HomeAutomation {
	 
    public static void main(String[] args){

        //test using an annonimous inner class 
        Home h = new Home(){
            protected void setValueInEnvironment(Event event){
               System.out.println("New event in environment "+event); 
            }
            protected void controllStep(){
                System.out.println("Control step executed");
            }
        };
        h.simulate();
    }
}

abstract class Home {
   private Random r = new Random();
   private final int SIMULATION_STEPS = 20;

   protected abstract void setValueInEnvironment(Event event);
   protected abstract void controllStep();

   private Event getHomeEvent(){
       //randomly generate a new event;            
       int k = r.nextInt(100);
       if(k<30)
           return new NoEvent();
       else if(k<60)
           return new FireEvent(r.nextBoolean());
       else
           return new TemperatureEvent(r.nextInt(50));              
   }   

   public void simulate(){
       int k = 0;
       while(k <SIMULATION_STEPS){
           Event event = this.getHomeEvent();
           setValueInEnvironment(event);
           controllStep();

           try {
               Thread.sleep(300);
           } catch (InterruptedException ex) {
              ex.printStackTrace();
           }

           k++;
       }
   }

}

abstract class Event {

   EventType type;

   Event(EventType type) {
       this.type = type;
   }

   EventType getType() {
       return type;
   }

}

class TemperatureEvent extends Event {

   private int vlaue;

   TemperatureEvent(int vlaue) {
       super(EventType.FIRE.TEMPERATURE);
       this.vlaue = vlaue;
   }

   int getVlaue() {
       return vlaue;
   }

   @Override
   public String toString() {
       return "TemperatureEvent{" + "vlaue=" + vlaue + '}';
   }        

}

class FireEvent extends Event {

   private boolean smoke;

   FireEvent(boolean smoke) {
       super(EventType.FIRE);
       this.smoke = smoke;
   }

   boolean isSmoke() {
       return smoke;
   }

   @Override
   public String toString() {
       return "FireEvent{" + "smoke=" + smoke + '}';
   }

}

class NoEvent extends Event{

   NoEvent() {
       super(EventType.NONE);
   }    

   @Override
   public String toString() {
       return "NoEvent{}";
   }   
}

enum EventType {
   TEMPERATURE, FIRE, NONE;
}