package operator;

import adapter.AIAdapter;
import run.AIRun;
import service.AIService;

public class AIOperator implements AIRun {
    private AIAdapter aiAdapter;

    public AIOperator(AIService aiService) {
        this.aiAdapter = new AIAdapter(aiService);
    }

    public void run() {
        aiAdapter.run();
    }
}
