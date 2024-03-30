public class Program {
	public static void main(String[] args) {
		Room[] hotel1Rooms = {
				new Room(101, 1, true),
				new Room(102, 1, true),
				new Room(103, 2, true),
				new Room(104, 3, false),
				new Room(105, 3, false),
				new Room(106, 1, true),
				new Room(107, 2, true),
				new Room(108, 1, false),
				new Room(109, 1, true),
				new Room(110, 1, false),

		};
		Hotel hotel1 = new Hotel("Hotel 1", hotel1Rooms);

		Room[] hotel2Rooms = {
				new Room(1101, 1, true),
				new Room(1102, 2, true),
				new Room(1103, 2, true),
				new Room(1104, 3, false),
				new Room(1105, 3, false),
				new Room(1106, 1, true),
				new Room(1107, 1, true),
				new Room(1108, 1, false),
				new Room(1109, 1, true),
				new Room(1110, 1, true),

		};
		Hotel hotel2 = new Hotel("Hotel 2", hotel2Rooms);

		Hotel[] hotels = {hotel1, hotel2};

		System.out.println("Most profitable hotel: " + Hotel.mostProfitable(hotels));
	}
}

