public class Manager {
    Hardworker hw = new Hardworker();
    Lazyworker lw = new Lazyworker();

    public Manager(Hardworker hw, Lazyworker lw){
        this.hw = hw;
        this.lw = lw;
    }

    public void managework(){
        hw.work();
        lw.work();
    }
}
