package plugin.enemydown.deta;


import lombok.Getter;
import lombok.Setter;

/**
 * EnemyDownゲームの難易度を扱うオブジェクト。
 */
@Getter
@Setter
public class EnemyDifficulty {
  private String enemyDifficulty;

  public EnemyDifficulty(String enemyDifficulty){
    this.enemyDifficulty = enemyDifficulty;
  }
}
