import mypackage.MyJavaClass;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@SuppressWarnings("all")
public class MyEntity extends MyJavaClass {
  public MyEntity() {
  }
  
  public MyEntity(final Procedure1<MyEntity> initializer) {
    initializer.apply(this);
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
