package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.util.InputValidator;

public class InputView {
    private final OutputView outputView;

    public InputView(OutputView outputView) {
        this.outputView = outputView;
    }

    public int readPurchaseMoney() {
        outputView.printMessage("자판기에 투입할 금액을 입력해 주세요.");
        String money = Console.readLine();
        InputValidator.validateIsNumber(money);
        return Integer.parseInt(money);
    }

    public int readBeverageChoice(int rangeEnd) {
        outputView.printMessage("구매할 음료의 번호를 입력해 주세요.");
        String choice = Console.readLine();
        InputValidator.validateIsNumber(choice);
        InputValidator.validateChoiceRange(choice, rangeEnd);
        return Integer.parseInt(choice);
    }
}
