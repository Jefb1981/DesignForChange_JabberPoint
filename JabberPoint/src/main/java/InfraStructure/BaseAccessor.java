package InfraStructure;

import DomainService.Presentation;

public abstract class BaseAccessor extends Accessor{

    public static final String DEMO_NAME = "Demonstratie presentatie";
    public static final String DEFAULT_EXTENSION = ".xml";

    public static BaseAccessor getDemoAccessor() {
        return new GenericDemoPresentation();
    }

    public BaseAccessor() {
    }
 
    abstract public void loadFile(Presentation presentation, String filename);

    abstract public void saveFile(Presentation presentation, String filename);
}
