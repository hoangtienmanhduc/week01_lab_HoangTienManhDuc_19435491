package vn.edu.iuh.fit.week01_lab_hoangtienmanhduc_19435491.enums;

public enum GrantValue {
    ENABLE (1),
    DISABLE (0);
    private int value;

    GrantValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
