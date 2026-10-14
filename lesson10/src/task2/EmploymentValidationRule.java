package task2;


public class EmploymentValidationRule extends ValidationRule<Boolean> {

    public EmploymentValidationRule(Boolean value) {
        super(value, "ипотека выдается только трудоустроенным");
    }

    @Override
    public boolean isValid() {
        return value;
    }
}