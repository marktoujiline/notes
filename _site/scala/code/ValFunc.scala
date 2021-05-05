class ValFunc {
    val hi = () => "hello"
}

23:18:09.816 INFO  com.github.kwart.jd.cli.Main - Decompiling ValFunc.class
import java.lang.invoke.SerializedLambda;
import scala.Function0;
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\005\0052A\001B\003\001\021!)q\002\001C\001!!91\003\001b\001\n\003!\002B\002\021\001A\003%QCA\004WC24UO\\2\013\003\031\tq\001P3naRLhh\001\001\024\005\001I\001C\001\006\016\033\005Y!\"\001\007\002\013M\034\027\r\\1\n\0059Y!AB!osJ+g-\001\004=S:LGO\020\013\002#A\021!\003A\007\002\013\005\021\001.[\013\002+A\031!B\006\r\n\005]Y!!\003$v]\016$\030n\03481!\tIb$D\001\033\025\tYB$\001\003mC:<'\"A\017\002\t)\fg/Y\005\003?i\021aa\025;sS:<\027a\0015jA\001")
public class ValFunc {
  private final Function0<String> hi = ValFunc::$anonfun$hi$1;
  
  public Function0<String> hi() { return this.hi; }
}
