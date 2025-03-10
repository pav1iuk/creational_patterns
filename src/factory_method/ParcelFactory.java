package factory_method;

public class ParcelFactory {
    public static Parcel createParcel(String type) {
        return switch (type) {
            case "small" -> new SmallParcel();
            case "large" -> new LargeParcel();
            default -> throw new IllegalArgumentException("Невідомий тип посилки");
        };
    }
}
