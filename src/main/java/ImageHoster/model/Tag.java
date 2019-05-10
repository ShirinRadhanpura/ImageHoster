package ImageHoster.model;

import java.util.List;

public class Tag {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    private String name;
	 private List<Image> images;

    public Tag() {
    }

    public Tag(String tagName) {
        this.name = tagName;
    }
}
