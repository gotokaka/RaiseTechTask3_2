import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main {
    /*例外処理を実行する為のコード*/
    public static void main(String[] args) {

        Map< String,String> creaturesMap = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        creaturesMap.put("哺乳類", "ゾウ");
        creaturesMap.put("鳥類", "カラス");
        creaturesMap.put("魚類", "マグロ");
        creaturesMap.put("両生類", "カエル");

        System.out.print("分類を入力：");
        String input = scanner.next();

        /*例外処理をする
          ・try-catch文とthrow文の組み合わせ
          ・Mapからキーと値の両方を取得し出力する**/
        try {
            String creature = creaturesMap.get(input);
            if(creaturesMap.get(input) ==  null) {
                throw new NullPointerException();
        }
            System.out.println(input + "の代表的生物は" + creature + "です");
        } catch (NullPointerException e) {
            System.out.println(input + "に該当する生物は未登録です");
        }
    }
}
