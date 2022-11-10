package fsm;

//可以通过添加方法进行状态转换
//比如添加退费，state就从vip--->member
//注销就可以，*------->guest
//当然游客不能再注册，状态间的转换也是有限制的


/*
*
* 无限状态机不知道是否正规的说法，从状态机上理解就是输出取决于输入与当前状态，
* 但是当前状态是无限的，不能确定其个数，比如人物的位置。
* ------------------------------------------
* 有限状态机可以确定状态的个数，比如人物的状态。
* */
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
