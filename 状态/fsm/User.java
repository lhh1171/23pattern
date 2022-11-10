package fsm;

public class User {
    private UserState userState;

    private String uname;

    public User(String uname){
        this.uname=uname;
        this.userState=new GuestState(this);
        this.userState.setUser(this);
    }

    public String getUname() {
        return uname;
    }

    public void register(){
        this.userState=new MemberState(this);
        this.userState.setUser(this);
    }

    public void openVip(){
        this.userState=new VipState(this);
        this.userState.setUser(this);
    }

    public void play4K(){
        userState.play4K();
    }

    public  void play720P(){
        userState.play720P();;
    }

    public  void play1080P(){
        userState.play1080P();
    }
}
