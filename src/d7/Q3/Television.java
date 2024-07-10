package d7.Q3;

public class Television implements Switchable{
  /*  public void on(){
        System.out.println("ti vi chào bạn");

    }
    public void off(){
        System.out.println("nhớ quay lại xem ti vi nha");

    }*/
    private boolean onOff;

    public void hitSwitch(){
        onOff = !onOff;
    }


}
