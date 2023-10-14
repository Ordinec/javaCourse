package homework28;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Objects;

public class Validator implements ValidateEmail {

    public void validate(Object object) {
        checkIfSerializable(object);
        validateEmail(object);
    }

    private void checkIfSerializable(Object object) {
        if (Objects.isNull(object)) {
            throw new EmailException("Can't validate a null object");
        }

        Class<?> myClass = object.getClass();
        Field emailField;
        try {
            emailField = myClass.getField("email");
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
        if (!emailField.isAnnotationPresent(ValidateEmail.class)) {
            throw new EmailException("The class " + myClass.getSimpleName() + " is not annotated");
        }
    }

    private void validateEmail(Object object) {
        Class<?> clazz = object.getClass();
        Arrays.stream(clazz.getDeclaredFields()).forEach(
                field -> {
                    field.setAccessible(true);
                    if (field.isAnnotationPresent(ValidateEmail.class)) {
                        try {
                            String email = (String) field.get(object);
                            validateEmailData(email);
                        } catch (IllegalAccessException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
        );
    }

    private void validateEmailData(String email) {
        if(!email.contains("@")) {
            throw new EmailException("Email didn't contain @ symbol");
        } else if (!email.contains(".")){
            throw new EmailException("Email didn't contain . symbol");
        }
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
