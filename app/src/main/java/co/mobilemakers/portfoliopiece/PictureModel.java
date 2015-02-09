package co.mobilemakers.portfoliopiece;

/**
 * Model for the picture.
 *
 * It has information like names (original and local), author, or year(s).
 *
 * Created by ariel.cattaneo on 04/02/2015.
 */
public class PictureModel {
    private String name = "";
    private int imageId = -1;
    private int thumbnailId = -1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getThumbnailId() {
        return thumbnailId;
    }

    public void setThumbnailId(int thumbnailId) {
        this.thumbnailId = thumbnailId;
    }

}
