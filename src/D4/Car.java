package D4;

public class Car {
    public static int count = 0;
    // name
    public String  name;
    // brand
    public String brand;
    // nhien lieu
    public int fuel;

    public static int countCars(){
     //   System.out.println(name);
        return count;
    }

    public void printCarinfo() {
        System.out.println(String.format("name: %s, brand: %s", name, brand));
    }
    /*public void addFuel (int moreFuel) {
        fuel += moreFuel;
    }*/

    public void addFuel(int moreFuel) {
        fuel += moreFuel;
    }

    public int drive(int kilos){
        fuel -= kilos / 10;
        return kilos / 10;
    }
    // addTwo: la ten
    // int: khi chay method nay thi kieu du lieu nao sex hien ra
    // (int a): 매개변수, 메서드를 사용할 때

    //return: 이 메서드의 결과로 반환된 값
    public int addTwo(int a) {
        System.out.println(a);
        a += 10;
        a *= 10;
        return a + 2;
    }

}
