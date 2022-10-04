// Преобразование массива байтов в строку в Java
package Exercise_002_StringToBytes;

import java.io.IOException;
import java.util.Arrays;

public class StringToBytes {
    public static void main(String[] args) throws IOException
    {
        byte[] bytes = "Techie Delight".getBytes();
        // System.out.println(Arrays.toString(bytes));

        // Создаем строку из массива байтов без указания
        // кодировка символов
        String string = new String(bytes);
        System.out.println(string);
    }
}