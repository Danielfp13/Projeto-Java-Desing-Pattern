package gof.strategy;

public class CommonBehavior implements Behavior {


    @Override
    public void toMove() {
        System.out.println("moving normally");
    }
}
