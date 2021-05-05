class DefFunc {
    def hi() = "hello"
}

23:16:39.688 INFO  com.github.kwart.jd.cli.Main - Decompiling DefFunc.class
import scala.reflect.ScalaSignature;

@ScalaSignature(bytes = "\006\005q1Aa\001\003\001\017!)a\002\001C\001\037!)!\003\001C\001'\t9A)\0324Gk:\034'\"A\003\002\017q*W\016\035;z}\r\0011C\001\001\t!\tIA\"D\001\013\025\005Y\021!B:dC2\f\027BA\007\013\005\031\te.\037*fM\0061A(\0338jiz\"\022\001\005\t\003#\001i\021\001B\001\003Q&$\022\001\006\t\003+ii\021A\006\006\003/a\tA\001\\1oO*\t\021$\001\003kCZ\f\027BA\016\027\005\031\031FO]5oO\002")
public class DefFunc {
  public String hi() { return "hello"; }
}
