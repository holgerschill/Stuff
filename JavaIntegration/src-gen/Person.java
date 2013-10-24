import java.util.Calendar;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@SuppressWarnings("all")
public class Person {
  public Person() {
  }
  
  public Person(final Procedure1<Person> initializer) {
    initializer.apply(this);
  }
  
  private String firstname;
  
  public String getFirstname() {
    return this.firstname;
  }
  
  public void setFirstname(final String firstname) {
    this.firstname = firstname;
  }
  
  private String lastname;
  
  public String getLastname() {
    return this.lastname;
  }
  
  public void setLastname(final String lastname) {
    this.lastname = lastname;
  }
  
  private int yearOfBirth;
  
  public int getYearOfBirth() {
    return this.yearOfBirth;
  }
  
  public void setYearOfBirth(final int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }
  
  public String fullName() {
    String _plus = (this.firstname + " ");
    String _plus_1 = (_plus + this.lastname);
    return _plus_1;
  }
  
  public int age() {
    Calendar _instance = Calendar.getInstance();
    int _get = _instance.get(Calendar.YEAR);
    int _minus = (_get - this.yearOfBirth);
    return _minus;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
