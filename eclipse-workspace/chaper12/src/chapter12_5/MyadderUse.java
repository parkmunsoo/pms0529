package chapter12_5;

interface AdderInterface {
    int add(int x, int y); 
    int add(int n);
}

class MyAdder implements AdderInterface {

    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int add(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}

public class MyadderUse {
    public static void main(String[] args) {
        MyAdder adder = new MyAdder();
        System.out.println(adder.add(5, 10)); // 15 출력[5+10]
        System.out.println(adder.add(5)); // 15 출력[1+2+3+4+5]
        System.out.println(adder.add(5, 10)); // 15 출력[5+10]
        System.out.println(adder.add(10));    // 55 출력[S10]



    }
}