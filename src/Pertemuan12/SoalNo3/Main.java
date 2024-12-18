package Pertemuan12.SoalNo3;

// Interface Phone
interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
}

// Xiaomi Class
class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50; // Default volume
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("XIAOMI IS ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("XIAOMI IS OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume++;
                System.out.println("XIAOMI VOLUME : " + volume);
            } else {
                System.out.println("VOLUME IS AT MAX.");
            }
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume--;
                System.out.println("XIAOMI VOLUME : " + volume);
            } else {
                System.out.println("VOLUME IS AT MIN.");
            }
        }
    }
}

// iPhone Class
class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50; // Default volume
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("IPHONE IS ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("IPHONE IS OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume++;
                System.out.println("IPHONE VOLUME : " + volume);
            } else {
                System.out.println("VOLUME IS AT MAX.");
            }
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume--;
                System.out.println("IPHONE VOLUME : " + volume);
            } else {
                System.out.println("VOLUME IS AT MIN.");
            }
        }
    }
}

// Samsung Class
class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50; // Default volume
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("SAMSUNG IS ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("SAMSUNG IS OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume++;
                System.out.println("SAMSUNG VOLUME : " + volume);
            } else {
                System.out.println("VOLUME IS AT MAX.");
            }
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume--;
                System.out.println("SAMSUNG VOLUME : " + volume);
            } else {
                System.out.println("VOLUME IS AT.");
            }
        }
    }
}

// Oppo Class
class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Oppo() {
        this.volume = 50; // Default volume
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("OPPO IS ON.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("OPPO IS OFF.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume++;
                System.out.println("OPPO VOLUME : " + volume);
            } else {
                System.out.println("VOLUME IS AT MAX.");
            }
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume--;
                System.out.println("OPPO VOLUME : " + volume);
            } else {
                System.out.println("VOLUME IS AT MIN.");
            }
        }
    }
}

// PhoneUser Class
class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        phone.powerOn();
    }

    public void turnOffThePhone() {
        phone.powerOff();
    }

    public void makePhoneLouder() {
        phone.volumeUp();
    }

    public void makePhoneSilent() {
        phone.volumeDown();
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        System.out.print("\033[H\033[2J");

        Phone[] phones = {new Xiaomi(), new iPhone(), new Samsung(), new Oppo()};
        String[] brands = {"XIAOMI", "IPHONE", "SAMSUNG", "OPPO"};

        for (int i = 0; i < phones.length; i++) {
            System.out.println("\n==|| " + brands[i] + " ||==");
            PhoneUser user = new PhoneUser(phones[i]);

            user.turnOnThePhone();
            user.makePhoneLouder();
            user.makePhoneLouder();
            user.makePhoneSilent();
            user.turnOffThePhone();
        }
    }
}
