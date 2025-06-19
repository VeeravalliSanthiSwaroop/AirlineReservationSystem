import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("unused")
public class ExitListener extends WindowAdapter 
{
	public void windowClosing(WindowEvent event) 
	{
		System.exit(0);
	}
}