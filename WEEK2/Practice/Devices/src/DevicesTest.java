
public class DevicesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device newDevice = new Device();
		newDevice.batteryPowerMessage();
		Phone newPhoneWhoDis = new Phone();
		newPhoneWhoDis.batteryPowerMessage();
		newPhoneWhoDis.makeCall();
		newPhoneWhoDis.playGame();
		newPhoneWhoDis.chargePhone();
//		all the makeCall method three times,
//		the playGame method twice,
//		and the charge method once.
		newPhoneWhoDis.makeCall();
		newPhoneWhoDis.makeCall();
		newPhoneWhoDis.makeCall();
		newPhoneWhoDis.playGame();
		newPhoneWhoDis.playGame();
		newPhoneWhoDis.chargePhone();
		newPhoneWhoDis.playGame();
		newPhoneWhoDis.playGame();
		newPhoneWhoDis.playGame();
		newPhoneWhoDis.playGame();
		newPhoneWhoDis.playGame();
		newPhoneWhoDis.makeCall();
		newPhoneWhoDis.makeCall();
		newPhoneWhoDis.makeCall();
		newPhoneWhoDis.makeCall();
	}
}
