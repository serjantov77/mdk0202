package task2;

class AgeValidationRule extends ValidationRule<Byte> {

    public AgeValidationRule(Byte age) {
        super(age, "возраст для подачи на ипотеку должен быть старше 18 лет");
    }

    @Override
    public boolean isValid() {
        return value >= 18;
    }
}