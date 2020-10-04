package InfraStructure;

import slideshow.SlideShow;

public abstract class BaseAccessor implements Accessor{

    public static final String DEMO_NAME = "Demonstratie presentatie";
    public static final String DEFAULT_EXTENSION = ".xml";

    public static BaseAccessor getDemoAccessor() {
        return new GenericDemoPresentation();
    }

    public BaseAccessor() {
    }
 
    abstract public void loadFile(SlideShow presentation, String filename);

    abstract public void saveFile(SlideShow presentation, String filename);
}
