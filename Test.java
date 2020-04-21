public class Test {
    public static void main(String [] args){
        Hardworker hw = new Hardworker();
        Lazyworker lw = new Lazyworker();
        Manager mw = new Manager(hw, lw);
        mw.managework();


    }
}
