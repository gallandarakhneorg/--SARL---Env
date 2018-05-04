package framework.env;

import framework.env.Perception;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Event;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * @author cd
 */
@SarlSpecification("0.7")
@SarlElementType(15)
@SuppressWarnings("all")
public class PerceptionEvent extends Event {
  public final List<Perception> perceptions;
  
  public PerceptionEvent(final List<Perception> perceptions) {
    this.perceptions = perceptions;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    return result;
  }
  
  /**
   * Returns a String representation of the PerceptionEvent event's attributes only.
   */
  @SyntheticMember
  @Pure
  protected void toString(final ToStringBuilder builder) {
    super.toString(builder);
    builder.add("perceptions", this.perceptions);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 4024026195L;
}
