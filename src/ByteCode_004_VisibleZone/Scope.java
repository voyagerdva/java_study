// Продемонстрировать область видимости блока кода
package ByteCode_004_VisibleZone;

public class Scope {
    public static void main(String args[]) {
        int х; // эта переменная доступна всему коду из метода main()
        х = 10;

        if (х == 10) {  // начало новой области действия, доступной только этому блоку кода
            int у = 20;  // обе переменные х и у доступны в этой области действия
            System.out.println("x и у: " + х + " " + у);
            х = у * 2;
        }
        // у= 100; //ОШИБКА! переменная у недоступна
        // в этой области действия, тогда как
        //переменная х доступна и здесь
        System.out.println("x равно " + х);
    }
}