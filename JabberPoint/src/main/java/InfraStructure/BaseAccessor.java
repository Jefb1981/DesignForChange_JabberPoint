package InfraStructure;

import DomainService.Slide;

public abstract class BaseAccessor implements Accessor{

    public static final String DEMO_NAME = "Demonstratie presentatie";
    public static final String DEFAULT_EXTENSION = ".xml";

    public static BaseAccessor getDemoAccessor() {
        return new GenericDemoPresentation();
    }

    public BaseAccessor() {
    }
 
    abstract public void loadFile(Slide presentation, String filename);

    abstract public void saveFile(Slide presentation, String filename);
}
