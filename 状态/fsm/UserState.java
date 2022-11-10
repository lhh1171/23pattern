package fsm;

public abstract class UserState {
    protected User user;
    public UserState(User user){
        this.user=user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public abstract void play4K();

    public abstract void play720P();

    public abstract void play1080P();
}
