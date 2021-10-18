package code;

class Cellphone {
    public void ring() {
        System.out.println("Ringing...");
    }

    public void vibrate() {
        System.out.println("Vibrating");
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();

        phone.ring();
        phone.vibrate();
    }
}
