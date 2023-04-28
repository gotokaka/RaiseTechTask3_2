import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    /*Mapクラスの作成*/
    public static void main(String[] args) {

        Map<String, String> creaturesMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        creaturesMap.put("哺乳類", "ゾウ");
        creaturesMap.put("鳥類", "カラス");
        creaturesMap.put("魚類", "マグロ");
        creaturesMap.put("両生類", "カエル");

        System.out.print("分類を入力：");
        String input = scanner.next();

        /*例外処理をする*/
        String creature = creaturesMap.get(input);

        if (Objects.isNull(creature)) {
            System.out.println("その分類は存在しません");
            return;
        }

        System.out.println(input + "の代表的生物は" + creature + "です");
    }
}
