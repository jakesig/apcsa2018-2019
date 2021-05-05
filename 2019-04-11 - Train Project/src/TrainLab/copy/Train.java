package TrainLab.copy;
import java.awt.Color;
/**
 * This is code to help you with you Train project.
 * 
 * @author (C. Sarkar) 
 * @version (V1.0)
 */

public interface Train {
    public final Color DEFAULTCOLOR = Color.GREEN;
    public final Color WHEELCOLOR = Color.YELLOW;
    
    public void run(int pixels);
    public void changeColor(Color newColor);
}

