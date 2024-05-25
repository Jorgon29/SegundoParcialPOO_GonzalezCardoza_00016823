package PaymentMethod;

public class PaymentWIthApi implements PaymentMethod{
    private String name;
    private PaymentMethod noApiPayment;

    //private connectionKey?

    public PaymentWIthApi(String name, PaymentMethod noApiPayment) {
        this.name = name;
        this.noApiPayment = noApiPayment;
    }

    private void receiveToken(String t){
        //sent token
    }

    @Override
    public void receiveUser(String u) {
        //Sent user
        receiveToken(u + ":" + name.toLowerCase());
    }



    @Override
    public void receivePassword(String p) {
        //Sent password
    }
}
