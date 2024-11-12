package enums;

public enum PhoneEnum {

    XIAOMI("XIAOMI"),

    HUAWEI("HUAWEI"),

    IPHONE("IPHONE"),

    ;

    PhoneEnum(String type) {
        this.type = type;
    }
    private String type;
}
