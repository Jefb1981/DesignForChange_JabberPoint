package InfraStructure;

import DomainService.Slide;

public interface Accessor {

    void loadFile(Slide presentation, String filename);

    void saveFile(Slide presentation, String filename);
}
