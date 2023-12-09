public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object2 = new SingleObject();
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
