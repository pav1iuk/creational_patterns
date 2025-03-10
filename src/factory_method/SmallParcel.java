package factory_method;

public class SmallParcel implements Parcel {
    public void deliver() {
        System.out.println("Доставка малої посилки.");
    }
}
