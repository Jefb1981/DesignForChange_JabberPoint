package UserInterface;
 import javax.swing.JOptionPane;

import java.io.IOException; 
import DomainCore.Presentation;
import DomainService.SlideViewerFrame;
import DomainService.Style;
import InfraStructure.Accessor;
import InfraStructure.XMLAccessor;
import java.io.IOException;

public class Jabberpoint {

	protected static final String IOERR = "IO Error: ";
	protected static final String JABERR = "Jabberpoint Error ";
	protected static final String JABVERSION = "Jabberpoint 1.6 - OU version";

    public static void main(String[] args) {
        Style.createStyles();
        Presentation presentation = new Presentation();
        new SlideViewerFrame(JABVERSION, presentation);
        try {
            if (args.length == 0) { // een demo presentatie
                Accessor.getDemoAccessor().loadFile(presentation, "");
            } else {
                new XMLAccessor().loadFile(presentation, args[0]);
            }
            presentation.setSlideNumber(0);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    IOERR + ex, JABERR,
                    JOptionPane.ERROR_MESSAGE);
        }

    }
}
