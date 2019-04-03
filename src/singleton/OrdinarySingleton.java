package singleton;

public class OrdinarySingleton {

    private OrdinarySingleton(){}

    private static volatile OrdinarySingleton ordinarySingleton;

    public static OrdinarySingleton getInstance(){

        if(ordinarySingleton==null){
            //in static method we can't use this => OrdinarySingleton.class
            synchronized (OrdinarySingleton.class) {
                if (ordinarySingleton == null) {
                    ordinarySingleton = new OrdinarySingleton();
                }
            }
        }
        return ordinarySingleton;
    }

}


