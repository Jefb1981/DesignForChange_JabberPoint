package DomainCore;


abstract class BaseSlide extends Slide {

    protected MetaInformation baseInformation;

    public BaseSlide(MetaInformation info) {
        this.baseInformation = info;
    }

    public abstract void add(Slide slide);

    public abstract void remove(Slide slide);

    public abstract int getSize();
}
