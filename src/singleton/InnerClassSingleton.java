package singleton;

public class InnerClassSingleton {

    private InnerClassSingleton(){}

    private static class Holder{
        private static final InnerClassSingleton instance=new InnerClassSingleton();
    }
    public static InnerClassSingleton getInstance(){
        return  Holder.instance;
    }

}
