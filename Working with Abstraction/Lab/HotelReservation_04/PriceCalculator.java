package WorkingWithAbstraction.HotelReservation_04;

public class PriceCalculator {

    public static double calculateHolidayPrice(double pricePerDay, int days, Season season, DiscountType discountType){

        double priceFOrAllDays = pricePerDay * days;

        priceFOrAllDays = priceFOrAllDays * season.getMultiplyCoefficient();
        priceFOrAllDays = priceFOrAllDays - priceFOrAllDays * (discountType.getPercentage() / 100);

        return priceFOrAllDays;

    }
}
