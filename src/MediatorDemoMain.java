import colleagues.Button;
import colleagues.Fan;
import mediator.FanMediator;
import mediator.Mediator;

public class MediatorDemoMain {
    public static void main(String[] args) {
        Button button = new Button();
        Fan fan = new Fan();

        createMediator(button, fan);

        button.press(); // Ray presses once
        button.press(); // Ray presses again

    }

    private static FanMediator createMediator(Button button, Fan fan) {
        return new FanMediator(button, fan);
    }
}