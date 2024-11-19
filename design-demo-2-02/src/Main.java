import color.BlueColor;
import service.JiheService;
import shap.CircleShap;

/**
 * 桥接模式 有点像 Spring 的注入
 */
public class Main {
    public static void main(String[] args) {
        JiheService jiheService = new JiheService(new BlueColor(),new CircleShap());
        jiheService.draw();
    }

}
