package framework.env;

import io.sarl.lang.annotation.SarlElementType;
import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author cd
 */
@SarlSpecification("0.7")
@SarlElementType(10)
@SuppressWarnings("all")
public class Body {
  private float xPosition;
  
  private float yPosition;
  
  public Body(final float xPosition, final float yPosition) {
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
  
  public float setxPosition(final float xPosition) {
    return this.xPosition = xPosition;
  }
  
  public float setyPosition(final float yPosition) {
    return this.yPosition = yPosition;
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
    Body other = (Body) obj;
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
