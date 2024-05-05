public class Main {

    public static void main(String[] args) {

        // Tạo giỏ hàng
        ShoppingCart shoppingCart = new ShoppingCart();

        // Thêm sản phẩm vào giỏ hàng
        Item item1 = new Item("123", 150);
        Item item2 = new Item("456", 80);
        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        // Thanh toán bằng Credit Card
        PaymentStrategy creditCardStrategy = new CreditCardStrategy("Khanh Quy", "1234567890123456", "123", "12/25");
        shoppingCart.checkout(creditCardStrategy);

        // Thanh toán qua PayPal
        PaymentStrategy paypalStrategy = new PaypalStrategy("khanhquy@email.com", "mypassword123");
        shoppingCart.checkout(paypalStrategy);

        // Thanh toán qua Bitcoin
        BitcoinStrategy bitcoinStrategy = new BitcoinStrategy("1Lbcfr7sAHTD9CgdQo3HTMTkV8LK4ZnX71");
        shoppingCart.checkout(bitcoinStrategy);

    }

}
