package adapter;

import run.AIRun;
import service.AIService;
import service.HuaweiAIService;
import service.IPhoneAIService;
import service.XiaomiAIService;

public class AIAdapter implements AIRun{

    private AIService aiService;

    public AIAdapter(AIService aiService) {
        this.aiService = aiService;
    }

    @Override
    public void run() {
        if (aiService instanceof XiaomiAIService) {
            aiService.xiaoai();
        } else if (aiService instanceof HuaweiAIService) {
            aiService.xiaoyi();
        } else if (aiService instanceof IPhoneAIService) {
            aiService.siri();
        }
    }
}
