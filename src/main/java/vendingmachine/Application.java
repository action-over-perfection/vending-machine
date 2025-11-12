package vendingmachine;

import vendingmachine.domain.model.Beverage;
import vendingmachine.view.InputView;
import vendingmachine.view.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView outputView = new OutputView();
        InputView inputView = new InputView(outputView);

        inputView.readPurchaseMoney();
        inputView.readBeverageChoice(Beverage.values().length);
        for (Beverage beverage: Beverage.values()) {
            outputView.printMessage(beverage.toString());
        }
    }
}