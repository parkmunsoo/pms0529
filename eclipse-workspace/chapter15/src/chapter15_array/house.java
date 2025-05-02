package chapter15_array;


public class house {
	private int houseNum;
	private String name;
	
	house(int houseNum, String name){
		this.houseNum = houseNum;
		this.name = name;
	}
		public int getHouseNum() {
			return houseNum;
		}
		public String getName() {
			return name;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		house[] arr = new house[5];
		arr[0] = new house(101,"손오공");
		arr[1] = new house(102,"전우치");
		arr[2] = new house(103,"손오공");
		arr[3] = new house(104,"해리포터");
		arr[4] = new house(105,"멀린");
		for(house e : arr) {
			if(e.getHouseNum() == 102) {
				System.out.println(e.getName());
			}
		}
	}

}
