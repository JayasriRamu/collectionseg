
class Myclass<T> {
    T obj;

    Myclass(T obj) {
        this.obj = obj;
    }

    T getObject() {
        return obj;
    }
}

class GenericTest {
    public static void main(String[] args) {
        Integer i = 20;

        Myclass<Integer> obj = new Myclass<Integer>(i);
        System.out.println("Stored value " + obj.getObject());
       Float j= (float)50.7688;
        Myclass<Float> obj1 = new Myclass<Float>(j);
        System.out.println("Stored value " + obj1.getObject());
        Myclass<String> obj2 = new Myclass<String>("Hi Generic");
        System.out.println("Stored value " + obj2.getObject());

    }

}