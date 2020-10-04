package InfraStructure;

import DomainService.Presentation;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class XMLAccessor extends BaseAccessor {

    protected static final String DEFAULT_API_TO_USE = "dom";

    protected static final String SHOWTITLE = "showtitle";
    protected static final String SLIDETITLE = "title";
    protected static final String SLIDE = "slide";
    protected static final String ITEM = "item";
    protected static final String LEVEL = "level";
    protected static final String KIND = "kind";
    protected static final String TEXT = "text";
    protected static final String IMAGE = "image";

    private String getTitle(Element element, String tagName) {
        NodeList titles = element.getElementsByTagName(tagName);
        return titles.item(0).getTextContent();
    }

    @Override
    public void loadFile(Presentation presentation, String filename) {
        // Todo: Load file from a location and give some event to the UI with some information 
        // Think here about a dispatcher to inform the UI
        int slideNumber, itemNumber, max = 0, maxItems = 0;
        //try {
             //DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            //Document document = builder.parse(new File(filename)); // maak een JDOM document
            //Element doc = document.getDocumentElement();
            //presentation.setTitle(getTitle(doc, SHOWTITLE));

            //NodeList slides = doc.getElementsByTagName(SLIDE);
            //max = slides.getLength();
            for (slideNumber = 0; slideNumber < max; slideNumber++) {
               // Element xmlSlide = (Element) slides.item(slideNumber);
//                Slide slide = new Slide();
//                slide.setTitle(getTitle(xmlSlide, SLIDETITLE));
//                presentation.append(slide);
//                NodeList slideItems = xmlSlide.getElementsByTagName(ITEM);
//                maxItems = slideItems.getLength();
                for (itemNumber = 0; itemNumber < maxItems; itemNumber++) {
                  //  Element item = (Element) slideItems.item(itemNumber);
                 //   loadSlideItem(slide, item);
                }
            }
        //} catch (IOException iox) {
        //    System.err.println(iox.toString());
        //} catch (SAXException ex) {
        //    Logger.getLogger(XMLAccessor.class.getName()).log(Level.SEVERE, null, ex);
        //}
    }

    @Override
    public void saveFile(Presentation presentation, String fn) {
        // Todo: Save to a location and give some event to the gui with some information 
        throw new UnsupportedOperationException("Not supported yet.");
    }


}
