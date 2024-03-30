public class Hotel {
	private String name;
	private Room[] rooms;

	public Hotel(String name, Room[] rooms) {
		this.name = name;
		this.rooms = rooms;
	}

	public Room[] availableRoom(int type, int budget){
		int count = 0;
		for (int i = 0; i < rooms.length; i++) {
			if (this.rooms[i].isAvailable() &&
					this.rooms[i].getType() == type &&
					this.rooms[i].calculatePrice() <= budget){
				count++;
			}
		}
		Room[] availableRooms = new Room[count];
		int index = 0;
		for (int i = 0; i < rooms.length; i++) {
			if (this.rooms[i].isAvailable() &&
					this.rooms[i].getType() == type &&
					this.rooms[i].calculatePrice() <= budget){
				availableRooms[index] = rooms[i];
				index++;
			}
		}
		return availableRooms;
	}
	public int income(){
		int sum = 0;
		for (int i = 0; i < rooms.length; i++) {
			if (!rooms[i].isAvailable()){
				sum += rooms[i].calculatePrice();
			}
		}
		return sum;
	}

	public String getName() {
		return name;
	}
	public static String mostProfitable(Hotel[] hotels) {
		String mostProfitableHotel = null;
		int maxIncome = Integer.MIN_VALUE;
		for (Hotel hotel : hotels) {
			int income = hotel.income();
			if (income > maxIncome) {
				maxIncome = income;
				mostProfitableHotel = hotel.name;
			}
		}
		return mostProfitableHotel;
	}
}
