package DomainCore;

import DomainService.Slide;

abstract class BaseSlide implements Slide {

    protected MetaInformation baseInformation;

    public BaseSlide(MetaInformation info) {
        this.baseInformation = info;
    }

    @Override
    public abstract void add(Slide slide);

    @Override
    public abstract void remove(Slide slide);

    @Override
    public abstract int getSize();
}
