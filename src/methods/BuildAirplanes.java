package methods;

public class BuildAirplanes {
    public static void main(String[] args) {

        System.out.println(buildAirplanes("Airlines", "Jet"));
        System.out.println(buildAirplanes("Airlines", "Jet", 134));
        System.out.println(buildAirplanes("Airlines", "Jet", 134, 66));

    }

    public static String buildAirplanes( String company, String type) {

        String places = "Компания: " + company + " изготавливает: " + type;
        return places;

    }
    public static String buildAirplanes( String company, String type, int economyClass) {

        String places = "Компания: " + company + " изготавливает: " + type + " с количеством мест для эконом класса: " + economyClass;
        return places;

    }
    public static String buildAirplanes( String company, String type, int economyClass, int businessClass) {

        String places = "Компания: " + company + " изготавливает: " + type + " с количеством мест для эконом класса: " + economyClass + ",  с количеством мест для эконом класса: " + businessClass;
        return places;

    }
}
