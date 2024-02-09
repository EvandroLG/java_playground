package functional_programming;

import java.util.List;
import java.util.function.Supplier;

public class _Suplier {
    public static void main(String[] args) {
        System.out.println(getDbConnectionUrls.get());
    }

    static Supplier<List<String>> getDbConnectionUrls = () ->
            List.of("jdbc://localhost:9090/users", "jdbc://localhost:9090/products");
}
