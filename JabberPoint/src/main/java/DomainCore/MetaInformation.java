package DomainCore;

import java.util.Date;

public class MetaInformation {

    private String title;
    private String subtitle;
    private String nameOfPresenter;
    private Date presentationDate;

    // Default constructor
    public MetaInformation() {
    }

    // Constructor 
    public MetaInformation(String title, String subtitle, String name, Date date) {
        this.title = title;
        this.subtitle = subtitle;
        this.nameOfPresenter = name;
        this.presentationDate = date;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getTitle() {
        return title;
    }

    public String getNameofPresenter() {
        return nameOfPresenter;
    }

    public Date getPresentationDate() {
        return presentationDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public void setnameOfPresenter(String nameOfPresenter) {
        this.nameOfPresenter = nameOfPresenter;
    }

    public void setPresentationDate(Date presentationDate) {
        this.presentationDate = presentationDate;
    }
}
