package fsm;

public class MemberState extends UserState{
    public MemberState(User user) {
        super(user);
    }

    @Override
    public void play4K() {
        System.out.println("不能播放4K,请开通VIP");
    }

    @Override
    public void play720P() {
        System.out.println("能播放720P，点击继续开始");
    }

    @Override
    public void play1080P() {
        System.out.println("不能播放1080P,请开通VIP");
    }
}
