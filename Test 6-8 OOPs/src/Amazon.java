public class Amazon implements Searchable,CouponApplicable,Returnable{
    Order order;
    Product product;
    Collections collections;
    double discount;
    @Override
    public void applyCoupon(String couponCode) {
        switch (couponCode) {
            case "SAVE10" -> {
                discount = order.getTotalAmount() * 0.10;
                order.setDiscount(discount);
            }
            case "SAVE20" -> {
                discount = order.getTotalAmount() * 0.20;
                order.setDiscount(discount);
            }
            case "FESTIVAL50" -> {
                discount = order.getTotalAmount() * 0.50;
                order.setDiscount(discount);
            }
            default -> System.out.println("Coupon code is not valid.....");
        }
    }

    @Override
    public void returnProduct() {

    }

    @Override
    public void searchProduct(String keyword) {
        for(Product product:)
    }
}
