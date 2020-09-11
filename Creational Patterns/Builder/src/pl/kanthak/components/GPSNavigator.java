package pl.kanthak.components;

public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        this.route = "5, Grunwaldzka, Gdansk  to 23, Dluga, Gdynia";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
