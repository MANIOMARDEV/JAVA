public class BatTest {

	public static void main(String[] args) {
		
		Bat bat = new Bat(300);
		System.out.println(bat.energy);
		
        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        
        bat.eatHumans();
        bat.eatHumans();
        
        bat.fly();
        bat.fly();
         bat.displayEnergy();
	}

}
