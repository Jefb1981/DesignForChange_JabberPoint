package InfraStructure;

import slideshow.SlideShow;

public class GenericDemoPresentation extends BaseAccessor {

    @Override
    public void loadFile(SlideShow p, String fn){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void saveFile(SlideShow p, String fn){
        throw new IllegalStateException("Save As->Demo! aangeroepen");
    }

}
