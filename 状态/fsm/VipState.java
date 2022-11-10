package fsm;

public class VipState extends UserState{
    public VipState(User user) {
        super(user);
    }

    @Override
    public void play4K() {
        System.out.println("能播放4K,点击继续开始");
    }

    @Override
    public void play720P() {
        System.out.println("能播放720P，点击继续开始");
    }

    @Override
    public void play1080P() {
        System.out.println("能播放1080P,点击继续开始");
    }
}
