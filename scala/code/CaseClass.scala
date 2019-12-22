case class CaseClass(name: String, age: Int)

00:28:15.745 INFO  com.github.kwart.jd.cli.Main - Decompiling CaseClass.class
import java.io.Serializable;
import scala.Function1;
import scala.Option;
import scala.Product;
import scala.Tuple2;
import scala.collection.Iterator;
import scala.reflect.ScalaSignature;
import scala.runtime.Statics;

@ScalaSignature(bytes = "\006\005\005Ec\001B\r\033\001vA\001b\r\001\003\026\004%\t\001\016\005\t{\001\021\t\022)A\005k!Aa\b\001BK\002\023\005q\b\003\005D\001\tE\t\025!\003A\021\025!\005\001\"\001F\021\035Q\005!!A\005\002-CqA\024\001\022\002\023\005q\nC\004[\001E\005I\021A.\t\017u\003\021\021!C!=\"9a\rAA\001\n\003y\004bB4\001\003\003%\t\001\033\005\b]\002\t\t\021\"\021p\021\0351\b!!A\005\002]Dq\001 \001\002\002\023\005S\020\003\005\000\001\005\005I\021IA\001\021%\t\031\001AA\001\n\003\n)\001C\005\002\b\001\t\t\021\"\021\002\n\035I\021Q\002\016\002\002#\005\021q\002\004\t3i\t\t\021#\001\002\022!1Ai\005C\001\003SA\021\"a\001\024\003\003%)%!\002\t\023\005-2#!A\005\002\0065\002\"CA\032'\005\005I\021QA\033\021%\t9eEA\001\n\023\tIEA\005DCN,7\t\\1tg*\t1$A\004=K6\004H/\037 \004\001M!\001A\b\023(!\ty\"%D\001!\025\005\t\023!B:dC2\f\027BA\022!\005\031\te.\037*fMB\021q$J\005\003M\001\022q\001\025:pIV\034G\017\005\002)a9\021\021F\f\b\003U5j\021a\013\006\003Yq\ta\001\020:p_Rt\024\"A\021\n\005=\002\023a\0029bG.\fw-Z\005\003cI\022AbU3sS\006d\027N_1cY\026T!a\f\021\002\t9\fW.Z\013\002kA\021aG\017\b\003oa\002\"A\013\021\n\005e\002\023A\002)sK\022,g-\003\002<y\t11\013\036:j]\036T!!\017\021\002\0139\fW.\032\021\002\007\005<W-F\001A!\ty\022)\003\002CA\t\031\021J\034;\002\t\005<W\rI\001\007y%t\027\016\036 \025\007\031C\025\n\005\002H\0015\t!\004C\0034\013\001\007Q\007C\003?\013\001\007\001)\001\003d_BLHc\001$M\033\"91G\002I\001\002\004)\004b\002 \007!\003\005\r\001Q\001\017G>\004\030\020\n3fM\006,H\016\036\0232+\005\001&FA\033RW\005\021\006CA*Y\033\005!&BA+W\003%)hn\0315fG.,GM\003\002XA\005Q\021M\0348pi\006$\030n\0348\n\005e#&!E;oG\",7m[3e-\006\024\030.\0318dK\006q1m\0349zI\021,g-Y;mi\022\022T#\001/+\005\001\013\026!\0049s_\022,8\r\036)sK\032L\0070F\001`!\t\001W-D\001b\025\t\0217-\001\003mC:<'\"\0013\002\t)\fg/Y\005\003w\005\fA\002\035:pIV\034G/\021:jif\fa\002\035:pIV\034G/\0227f[\026tG\017\006\002jYB\021qD[\005\003W\002\0221!\0218z\021\035i7\"!AA\002\001\0131\001\037\0232\003=\001(o\0343vGRLE/\032:bi>\024X#\0019\021\007E$\030.D\001s\025\t\031\b%\001\006d_2dWm\031;j_:L!!\036:\003\021%#XM]1u_J\f\001bY1o\013F,\030\r\034\013\003qn\004\"aH=\n\005i\004#a\002\"p_2,\027M\034\005\b[6\t\t\0211\001j\003I\001(o\0343vGR,E.Z7f]Rt\025-\\3\025\005}s\bbB7\017\003\003\005\r\001Q\001\tQ\006\034\bnQ8eKR\t\001)\001\005u_N#(/\0338h)\005y\026AB3rk\006d7\017F\002y\003\027Aq!\\\t\002\002\003\007\021.A\005DCN,7\t\\1tgB\021qiE\n\006'\005M\021q\004\t\b\003+\tY\"\016!G\033\t\t9BC\002\002\032\001\nqA];oi&lW-\003\003\002\036\005]!!E!cgR\024\030m\031;Gk:\034G/[8oeA!\021\021EA\024\033\t\t\031CC\002\002&\r\f!![8\n\007E\n\031\003\006\002\002\020\005)\021\r\0359msR)a)a\f\0022!)1G\006a\001k!)aH\006a\001\001\0069QO\\1qa2LH\003BA\034\003\007\002RaHA\035\003{I1!a\017!\005\031y\005\017^5p]B)q$a\0206\001&\031\021\021\t\021\003\rQ+\b\017\\33\021!\t)eFA\001\002\0041\025a\001=%a\005aqO]5uKJ+\007\017\\1dKR\021\0211\n\t\004A\0065\023bAA(C\n1qJ\0316fGR\004")
public class CaseClass implements Product, Serializable {
  private final String name;
  
  private final int age;
  
  public static Option<Tuple2<String, Object>> unapply(CaseClass paramCaseClass) { // Byte code:
    //   0: getstatic CaseClass$.MODULE$ : LCaseClass$;
    //   3: aload_0
    //   4: invokevirtual unapply : (LCaseClass;)Lscala/Option;
    //   7: areturn }
  
  public static CaseClass apply(String paramString, int paramInt) { // Byte code:
    //   0: getstatic CaseClass$.MODULE$ : LCaseClass$;
    //   3: aload_0
    //   4: iload_1
    //   5: invokevirtual apply : (Ljava/lang/String;I)LCaseClass;
    //   8: areturn }
  
  public static Function1<Tuple2<String, Object>, CaseClass> tupled() { // Byte code:
    //   0: getstatic CaseClass$.MODULE$ : LCaseClass$;
    //   3: invokevirtual tupled : ()Lscala/Function1;
    //   6: areturn }
  
  public static Function1<String, Function1<Object, CaseClass>> curried() { // Byte code:
    //   0: getstatic CaseClass$.MODULE$ : LCaseClass$;
    //   3: invokevirtual curried : ()Lscala/Function1;
    //   6: areturn }
  
  public Iterator<String> productElementNames() { return Product.productElementNames$(this); }
  
  public String name() { return this.name; }
  
  public int age() { return this.age; }
  
  public CaseClass copy(String name, int age) { return new CaseClass(name, age); }
  
  public String copy$default$1() { return name(); }
  
  public int copy$default$2() { return age(); }
  
  public String productPrefix() { return "CaseClass"; }
  
  public int productArity() { return 2; }
  
  public Object productElement(int x$1) {
    int i = x$1;
    switch (i) {
      case 0:
      
      case 1:
      
    } 
  }
  
  public Iterator<Object> productIterator() { // Byte code:
    //   0: getstatic scala/runtime/ScalaRunTime$.MODULE$ : Lscala/runtime/ScalaRunTime$;
    //   3: aload_0
    //   4: invokevirtual typedProductIterator : (Lscala/Product;)Lscala/collection/Iterator;
    //   7: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 0
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	8	0	this	LCaseClass; }
  
  public boolean canEqual(Object x$1) { return x$1 instanceof CaseClass; }
  
  public String productElementName(int x$1) {
    int i = x$1;
    switch (i) {
      case 0:
      
      case 1:
      
    } 
  }
  
  public int hashCode() {
    int i = -889275714;
    i = Statics.mix(i, productPrefix().hashCode());
    i = Statics.mix(i, Statics.anyHash(name()));
    i = Statics.mix(i, age());
    return Statics.finalizeHash(i, 2);
  }
  
  public String toString() { // Byte code:
    //   0: getstatic scala/runtime/ScalaRunTime$.MODULE$ : Lscala/runtime/ScalaRunTime$;
    //   3: aload_0
    //   4: invokevirtual _toString : (Lscala/Product;)Ljava/lang/String;
    //   7: areturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 0
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	8	0	this	LCaseClass; }
  
  public boolean equals(Object x$1) { // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: if_acmpeq -> 98
    //   5: aload_1
    //   6: astore_3
    //   7: aload_3
    //   8: instanceof CaseClass
    //   11: ifeq -> 19
    //   14: iconst_1
    //   15: istore_2
    //   16: goto -> 27
    //   19: goto -> 22
    //   22: iconst_0
    //   23: istore_2
    //   24: goto -> 27
    //   27: iload_2
    //   28: ifeq -> 102
    //   31: aload_1
    //   32: checkcast CaseClass
    //   35: astore #4
    //   37: aload_0
    //   38: invokevirtual age : ()I
    //   41: aload #4
    //   43: invokevirtual age : ()I
    //   46: if_icmpne -> 94
    //   49: aload_0
    //   50: invokevirtual name : ()Ljava/lang/String;
    //   53: aload #4
    //   55: invokevirtual name : ()Ljava/lang/String;
    //   58: astore #5
    //   60: dup
    //   61: ifnonnull -> 73
    //   64: pop
    //   65: aload #5
    //   67: ifnull -> 81
    //   70: goto -> 94
    //   73: aload #5
    //   75: invokevirtual equals : (Ljava/lang/Object;)Z
    //   78: ifeq -> 94
    //   81: aload #4
    //   83: aload_0
    //   84: invokevirtual canEqual : (Ljava/lang/Object;)Z
    //   87: ifeq -> 94
    //   90: iconst_1
    //   91: goto -> 95
    //   94: iconst_0
    //   95: ifeq -> 102
    //   98: iconst_1
    //   99: goto -> 103
    //   102: iconst_0
    //   103: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 0
    // Local variable table:
    //   start	length	slot	name	descriptor
    //   0	104	0	this	LCaseClass;
    //   0	104	1	x$1	Ljava/lang/Object; }
  
  public CaseClass(String name, int age) { Product.$init$(this); }
}
