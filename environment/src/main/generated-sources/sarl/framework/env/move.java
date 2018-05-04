package framework.env;

import framework.env.Influence;
import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class move extends Influence {
  private float xPosition;
  
  private float yPosition;
  
  public move(final float xPosition, final float yPosition) {
    this.xPosition = xPosition;
    this.yPosition = yPosition;
  }
  
  @Pure
  public float getxPosition() {
    return this.xPosition;
  }
  
  @Pure
  public float getyPosition() {
    return this.yPosition;
  }
  
  @Override
  @Pure
  @SyntheticMember
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    move other = (move) obj;
    if (Float.floatToIntBits(other.xPosition) != Float.floatToIntBits(this.xPosition))
      return false;
    if (Float.floatToIntBits(other.yPosition) != Float.floatToIntBits(this.yPosition))
      return false;
    return super.equals(obj);
  }
  
  @Override
  @Pure
  @SyntheticMember
  public int hashCode() {
    int result = super.hashCode();
    final int prime = 31;
    result = prime * result + Float.floatToIntBits(this.xPosition);
    result = prime * result + Float.floatToIntBits(this.yPosition);
    return result;
  }
}
