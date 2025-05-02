package chapter14_1;
public class chapter14_1_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "AppleBananaOrange";
		System.out.println(str.indexOf("a")); // 6
		System.out.println(str.indexOf("Banana")); // 5
		System.out.println(str.indexOf("na")); // 7
		//indexOf("문자열",시작위치) : 시작문자부터 문자열을 찾아서 돌려주는 메서드
		System.out.println(str.indexOf("na",7)); // 7
		System.out.println(str.indexOf("na",8)); // 9
		if(str.indexOf("Berry")>0) {
			System.out.println("문자열에 Berry가 없습니다");
		}else {
			System.out.println("");
			System.out.println(str.substring(0,5)); // Apple
			System.out.println(str.substring(5)); // BananaOrange

			System.out.println(str.length());
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(1));
			System.out.println(str.charAt(3));
			double e = 2.718281;
			String se = String.valueOf(e);
			System.out.println(se);
			System.out.println(str.toLowerCase());
			System.out.println(str.toUpperCase());
			System.out.println("  trim  ".trim());
			System.out.println(str.concat("Berry"));
			System.out.println(str + "Melon");
		}
	}
}

