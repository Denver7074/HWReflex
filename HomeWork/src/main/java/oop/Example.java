package oop;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

@Documented
@Target({TYPE,METHOD,PARAMETER,CONSTRUCTOR,FIELD,TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Example {
    String name();

}
