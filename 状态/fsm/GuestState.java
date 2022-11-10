package fsm;

public class GuestState extends UserState{
    public GuestState(User user) {
        super(user);
    }

    @Override
    public void play4K() {
        System.out.println("游客不能播放4K,请登录注册");
    }

    @Override
    public void play720P() {
        System.out.println("游客不能播放720P,请登录注册");
    }

    @Override
    public void play1080P() {
        System.out.println("游客不能播放1080P,请登录注册");
    }
}
