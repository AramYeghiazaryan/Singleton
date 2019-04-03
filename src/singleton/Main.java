package singleton;

public class Main {


    public static void main(String[] args) {
        OrdinarySingleton ordinarySingleton=OrdinarySingleton.getInstance();
        InnerClassSingleton innerClassSingleton=InnerClassSingleton.getInstance();
    }

}
