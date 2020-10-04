package InfraStructure;

import SlideShow;

public interface Accessor {

    void loadFile(SlideShow presentation, String filename);

    void saveFile(SlideShow presentation, String filename);
}
