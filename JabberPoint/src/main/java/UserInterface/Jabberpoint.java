package UserInterface;

import DomainService.Presentation;
import DomainService.SlideViewerFrame;
import DomainService.Style;
import InfraStructure.Accessor;
import java.io.IOException;

public class Jabberpoint {

    protected static final String JABVERSION = "Jabberpoint 1.6 - OU version";

    public static void main(String[] args) {
        Style.createStyles();
        Presentation presentation = new Presentation();
        new SlideViewerFrame(JABVERSION, presentation);
        try {
            Accessor.getDemoAccessor().loadFile(presentation, JABVERSION);
        } catch (IOException ex) {
            System.err.println(ex);
        }
        presentation.setSlideNumber(0);
    }
}
