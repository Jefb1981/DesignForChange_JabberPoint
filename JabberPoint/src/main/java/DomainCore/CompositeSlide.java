
package DomainCore;

import java.util.ArrayList;
import java.util.List;

import DomainService.Slide;

public class CompositeSlide extends BaseSlide {

    private List<Slide> childSlides = new ArrayList<>();
    private int currentSlideNumber = 0;

    public CompositeSlide(MetaInformation info) {
        super(info);
    }
    // Ga naar de volgende slide tenzij je aan het einde van de presentatie bent.

    public void nextSlide() {
        if (currentSlideNumber < (childSlides.size() - 1)) {
            setSlideNumber(currentSlideNumber + 1);
        }
    }
    // geef het nummer van de huidige slide

    public int getSlideNumber() {
        return currentSlideNumber;
    }
// Geef een slide met een bepaald slidenummer

    public Slide getSlide(int number) {
        if (number < 0 || number >= getSize()) {
            return null;
        }
        return (Slide) childSlides.get(number);
    }

    // verander het huidige-slide-nummer en laat het aan het window weten.
    public void setSlideNumber(int number) {
        currentSlideNumber = number;
        //    if (slideViewComponent != null) {
        //        slideViewComponent.update(this, getCurrentSlide());
        //   }
    }
    // Geef de huidige Slide

    public Slide getCurrentSlide() {
        return getSlide(currentSlideNumber);
    }

    // ga naar de vorige slide tenzij je aan het begin van de presentatie bent
    public void prevSlide() {
        if (currentSlideNumber > 0) {
            setSlideNumber(currentSlideNumber - 1);
        }
    }
    // Verwijder de presentatie, om klaar te zijn voor de volgende

    void clear() {
        childSlides = new ArrayList<>();
        setSlideNumber(-1);
    }

    @Override
    public void add(Slide slide) {
        childSlides.add(slide);
    }

    @Override
    public void remove(Slide slide) {
        childSlides.remove(slide);
    }

    @Override
    public int getSize() {
        return childSlides.size();
    }
}
