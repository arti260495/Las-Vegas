import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.annotation.Annotation;
public class Main {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Casino casino = new Casino();
        Method[] methods = casino.getClass().getMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof MyAnnotation) {
                    method.invoke(casino);
                }
            }
        }
    }
}
