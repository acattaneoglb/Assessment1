package co.mobilemakers.portfoliopiece;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Model for the picture.
 *
 * It has information like names (original and local), author, or year(s).
 *
 * Created by ariel.cattaneo on 04/02/2015.
 */
public class PictureModel implements Parcelable {
    private String mName = "";
    private int mImageId = -1;
    private int mThumbnailId = -1;

    public static final Creator<PictureModel> CREATOR = new Creator<PictureModel>() {
        @Override
        public PictureModel createFromParcel(Parcel source) {
            return new PictureModel(source);
        }

        @Override
        public PictureModel[] newArray(int size) {
            return new PictureModel[size];
        }
    };

    PictureModel() {

    }

    PictureModel(Parcel source) {
        mName = source.readString();
        mImageId = source.readInt();
        mThumbnailId = source.readInt();
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public int getThumbnailId() {
        return mThumbnailId;
    }

    public void setThumbnailId(int thumbnailId) {
        this.mThumbnailId = thumbnailId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mName);
        dest.writeInt(mImageId);
        dest.writeInt(mThumbnailId);
    }
}
