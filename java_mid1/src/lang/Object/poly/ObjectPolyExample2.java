package lang.Object.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args){
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] objects = {dog, car, object};
        size(objects);
    }
    //메소드 오버라이딩
    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수는: "+ objects.length);
    }
}
