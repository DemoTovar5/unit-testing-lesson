public class carUtils {

    public static String getCarDetails(Car car) {

        String make = car.getMake();
        String model = car.getModel();
        String year = car.getYear();
        String color = car.getColor();

        if (make == null || model == null || year == null || color == null) {
            return "Not able to provide details";
        }

        return color + " " + year + " " + make + " " + model;

    }

    public static void addToMileage(Car car, double mileageToAdd) {

        car.setMileage(car.getMileage() + mileageToAdd);

    }

    public static void convertToElectric(Car car, String engineType){




    }




}
