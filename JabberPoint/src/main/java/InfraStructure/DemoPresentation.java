package InfraStructure;

import DomainCore.Slide;
import DomainCore.Presentation;

/**
 * Een ingebouwde demo-presentatie
 *
 * @author Ian F. Darwin, ian@darwinsys.com, Gert Florijn, Sylvia Stuurman
 * @version 1.1 2002/12/17 Gert Florijn
 * @version 1.2 2003/11/19 Sylvia Stuurman
 * @version 1.3 2004/08/17 Sylvia Stuurman
 * @version 1.4 2007/07/16 Sylvia Stuurman
 * @version 1.5 2010/03/03 Sylvia Stuurman
 * @version 1.6 2014/05/16 Sylvia Stuurman
 */
public class DemoPresentation extends Accessor {

    public void loadFile(Presentation presentation, String unusedFilename) {
        presentation.setTitle("Demo Presentation");
        // Todo: through the factory create Slide object
        Slide slide1 = new Slide();
        slide1.setTitle("JabberPoint");
        slide1.append(1, "Het Java Presentatie Tool");
        slide1.append(2, "Copyright (c) 1996-2000: Ian Darwin");
        slide1.append(2, "Copyright (c) 2000-now:");
        slide1.append(2, "Gert Florijn en Sylvia Stuurman");
        slide1.append(4, "JabberPoint aanroepen zonder bestandsnaam");
        slide1.append(4, "laat deze presentatie zien");
        slide1.append(1, "Navigeren:");
        slide1.append(3, "Volgende slide: PgDn of Enter");
        slide1.append(3, "Vorige slide: PgUp of up-arrow");
        slide1.append(3, "Stoppen: q or Q");
        presentation.append(slide1);

        // Todo: through the factory create Slide object
        Slide slide2 = new Slide();
        slide2.setTitle("Demonstratie van levels en stijlen");
        slide2.append(1, "Level 1");
        slide2.append(2, "Level 2");
        slide2.append(1, "Nogmaals level 1");
        slide2.append(1, "Level 1 heeft stijl nummer 1");
        slide2.append(2, "Level 2 heeft stijl nummer 2");
        slide2.append(3, "Zo ziet level 3 er uit");
        slide2.append(4, "En dit is level 4");
        presentation.append(slide2);
        
        // Todo: through the factory create Slide object
        Slide slide3 = new Slide();
        slide3.setTitle("De derde slide");
        slide3.append(1, "Om een nieuwe presentatie te openen,");
        slide3.append(2, "gebruik File->Open uit het menu.");
        slide3.append(1, " ");
        slide3.append(1, "Dit is het einde van de presentatie.");
        presentation.append(slide3);
    }

    public void saveFile(Presentation presentation, String unusedFilename) {
        throw new IllegalStateException("Save As->Demo! aangeroepen");
    }
}
