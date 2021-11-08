package actions;

import java.time.LocalDate;
import java.time.LocalDateTime;

import actions.views.EmployeeView;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * 日誌情報について画面の入力値・出力値を扱うViewモデル
 */

@Getter //全てのクラスフィールドについてgetterを自動生成する（Lomback）
@Setter //全てのクラスフィールドについてsetterを自動生成する（Lomback）
@NoArgsConstructor //引数なしコンストラクタを自動生成する（Lomback）
@AllArgsConstructor //全てのクラスフィールドを引数に持つ引数ありコンストラクタを自動生成する（Lomback）
public class ReportView {

    /*
     * id
     */
    private Integer id;

    /*
     * 日報を登録した従業員
     */
    private EmployeeView employee;

    /*
     * いつの日報化を示す日付
     */
    private LocalDate reportDate;

    /*
     * 日報のタイトル
     */
    private String title;

    /*
     * 日報の内容
     */
    private String content;

    /*
     * 登録日時
     */
    private LocalDateTime createdAt;

}
