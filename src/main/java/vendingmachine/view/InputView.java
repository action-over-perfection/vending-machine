package vendingmachine.view;

import camp.nextstep.edu.missionutils.Console;
import vendingmachine.util.InputValidator;

public class InputView {
    public int readPurchaseMoney() {
        System.out.println("자판기에 투입할 금액을 입력해 주세요.");
        String money = Console.readLine();
        InputValidator.validateIsNumber(money);
        return Integer.parseInt(money);
    }

    public int readBeverageChoice() {
        System.out.println("구매할 음료의 번호를 입력해 주세요.");
        String choice = Console.readLine();
        InputValidator.validateIsNumber(choice);
        return Integer.parseInt(choice);
    }
}
