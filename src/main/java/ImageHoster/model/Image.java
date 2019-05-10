package ImageHoster.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Image {

    private Integer id;
    private String title;
    private String imageFile;
    private String description;
    private Date date;
    //The attribute contains a list of all the tags of an image
    //Note that no column will be generated for this attribute in the database instead a new table will be created
    //Since the mapping is Many to Many, a new table will be generated containing the two columns both referencing to the primary key of both the tables ('images', 'tags')
   // @ManyToMany(fetch = FetchType.LAZY)
    private List<Tag> tags = new ArrayList<>();
    public Image() {
    }

    public Image(int id, String title, String imageFile, Date date) {
        this.id = id;
        this.title = title;
        this.imageFile = imageFile;
        this.date = date;
    }

    public Image(int id, String title, String imageFile, String description, Date date) {
        this.id = id;
        this.title = title;
        this.imageFile = imageFile;
        this.description = description;
        this.date = date;
    }


    //Write the constructor for all the attributes of the image

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageFile() {
        return imageFile;
    }

    public void setImageFile(String imageFile) {
        this.imageFile = imageFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
