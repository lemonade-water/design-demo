import operator.AIOperator;
import service.XiaomiAIService;

public class Main {
    public static void main(String[] args) {
        AIOperator aiOperator = new AIOperator(new XiaomiAIService());
        aiOperator.run();
    }
}