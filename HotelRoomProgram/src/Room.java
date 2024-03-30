public class Room {
	private int numberRoom;
	private int type;
	private boolean available;

	public Room(int numberRoom,int type, boolean available){
		this.numberRoom = numberRoom;
		this.type = type;
		this.available = available;
	}

	public boolean isAvailable() {
		return available;
	}

	public int getType() {
		return type;
	}

	public int floor() {
		int floor = 0;
		if (this.numberRoom >= 100 && this.numberRoom <= 999){
			floor = numberRoom/100;
		}else if (numberRoom > 10 && numberRoom < 99){
			floor = numberRoom/10;
		}else if (numberRoom > 999 && numberRoom < 2000) {
			String res = String.valueOf(numberRoom);
			String temp = "";
			for (int i = 0; i < 2 ; i++) {
				temp += res.charAt(i);
			}
			floor = Integer.parseInt(temp);
		}
		return floor;
	}

	public int calculatePrice(){
		int enterPrice = 0;
		double temp = 0;
		if (this.floor() <= 10){
			enterPrice = 2000;
			if (this.distanceFromElevator() <= 5){
				enterPrice += 200;
			}
		} else {
			int floor = this.floor();
			int extra = (floor%10) * 100;
			enterPrice = 2000 + extra;
			if (this.distanceFromElevator() <= 5){
				enterPrice += 200;
			}
		}
		temp = enterPrice;
		if (this.type == 2){
			temp = temp * 1.5;
			enterPrice = (int)temp;
		} else if (type ==3) {
			temp = temp * 2.5;
			enterPrice = (int) temp;
		}
		return enterPrice;
	}

	public int distanceFromElevator(){
		int distance,once,tens;
		if (this.numberRoom >= 100 && numberRoom <= 2000){
			once = numberRoom% 10;
			tens = numberRoom/10%10;
			distance = tens + once;
		} else if (numberRoom >= 10 && numberRoom <= 99) {
			once = numberRoom % 10;
			distance = once;
		}else {
			distance = numberRoom;
		}
		return distance;
	}
}
