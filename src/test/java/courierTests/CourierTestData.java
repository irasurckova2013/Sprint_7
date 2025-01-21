package courierTests;

import org.example.Courier;

public class CourierTestData {

    public static Courier bodyPost() {
        return new Courier("IFesenko", "123456", "Irina");
    }

    public static Courier notCompleteBodyPost() {
        return new Courier("IFesenko", null, "Irina");
    }

    public static Courier bodyPostWithNonExistentData() {
        return new Courier("Irina", "123654789", "Irina");
    }

    public static Courier bodyPostWithExistingLogin() {
        return new Courier("IFesenko", "12345", "Irina");
    }

    public static Courier bodyPostWithIncorrectData() {
        return new Courier("0{}%!{-=-", "!{-=-0{}%", "Irina");
    }

    public static Courier notFullBodyPost() {
        return new Courier("IFesenko", "", "Irina");
    }
}