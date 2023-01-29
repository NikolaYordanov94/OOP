package WorkingWithAbstraction.HotelReservation_04;

public enum DiscountType {
    NONE("None", 0),
    SECONDVISIT("SecondVisit", 10),
    VIP("VIP", 20);

    private String name;
    private double percentage;

    DiscountType(String name, double percentage) {
        this.name = name;
        this.percentage = percentage;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}
