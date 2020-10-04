
package DomainCore;


public class Special extends BaseSlide {

    // Constructor
    public Special(MetaInformation info) {
        super(info);
    } 

    @Override
    public void add(Slide c) {
        System.out.println("Cannot add to a Slide");
    }

    @Override
    public void remove(Slide c) {
        System.out.println("Cannot remove to a Slide");
    }

    @Override
    public int getSize() {
        System.out.println("Cannot determine the number of slides");
        return 0;
    }

}
