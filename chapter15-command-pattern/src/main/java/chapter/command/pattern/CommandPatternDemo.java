package chapter.command.pattern;

import chapter.command.pattern.broker.Broker;
import chapter.command.pattern.order.BuyStock;
import chapter.command.pattern.order.SellStock;
import chapter.command.pattern.request.Stock;

public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
