package enumTypes;

public enum PasswordStrengthEnum {

    LOW(10),
    MEDIUM(50),
    HIGH(100);

    private final int level;//field

    PasswordStrengthEnum(int level) {
        this.level = level;
    }
}
