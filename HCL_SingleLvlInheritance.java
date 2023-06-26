class distance {
	int ChennaiToBanglore = 348;

	void toReachBanglore() {
		System.out.println("Distance between chennai to banglore by walk is :" + ChennaiToBanglore);
	}
}

class distanceByCAr extends distance {
	@Override
	void toReachBanglore() {
		System.out.println("Time consumsion between chennai to banglore by Car is :" + ChennaiToBanglore / 2);
	}
}

class distanceByTrain extends distance {
	@Override
	void toReachBanglore() {
		System.out.println("Time consumsion  between chennai to banglore by Train is :" + ChennaiToBanglore / 4);
	}
}

public class HCL_SingleLvlInheritance {

	public static void main(String[] args) {
		distance walk = new distance();
		walk.toReachBanglore();

		distanceByCAr byCar = new distanceByCAr();
		byCar.toReachBanglore();

		distanceByTrain byTrain = new distanceByTrain();
		byTrain.toReachBanglore();
	}
}
