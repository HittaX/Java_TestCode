/**
 * Created by ${SongZhiPing} on 07/21/2015.
 */
public class FunctionalInterfaceTest {

    @FunctionalInterface
    interface Converter<F, T> {
        T convert(F from);
    }

    public static void main(String args[])
    {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);    // 123
    }

}
