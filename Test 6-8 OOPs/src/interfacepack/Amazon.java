package interfacepack;

import entity.Product;
import order.Order;

import java.util.ArrayList;

public class Amazon implements Searchable,CouponApplicable,Returnable{
    Order order;
    ArrayList<Product> products;
    double discount;

    public Amazon(ArrayList<Product> products) {
        this.products = products;
    }

    public void setOrder(Order order)
    {
        this.order=order;
    }

    @Override
    public void applyCoupon(String couponCode) {
        double totalAmount = order.getProduct().getPrice()* order.getQuantity();
        switch (couponCode) {
            case "SAVE10" -> {
                discount = totalAmount * 0.10;
                order.setDiscount(discount);
            }
            case "SAVE20" -> {
                discount =totalAmount * 0.20;
                order.setDiscount(discount);
            }
            case "FESTIVAL50" -> {
                discount = totalAmount * 0.50;
                order.setDiscount(discount);
            }
            default -> System.out.println("Coupon code is not valid.....");
        }
    }

    @Override
    public void returnProduct() {

    }

    @Override
    public Product searchProduct(String keyword) {
      for(Product product:products)
      {
          if(product.getProductName().equalsIgnoreCase(keyword))
          {
              System.out.println(product);
              return product;
          }
      }
        System.out.println("Product not found...");
      return null;
    }

    @Override
    public Product searchProduct(String name, String category) {
        return null;
    }

    @Override
    public Product searchProduct(double minPrice, double maxPrice) {
        return null;
    }
}
