package nichat.com.myradioapp.models;

/**
 * Created by NICHAT on 12-06-2018 at 12:47.
 */
public class Station {

    final String DRAWABLE = "drawable/";
    private String stationTitle;
    private String imgUri;

    public Station(String stationTitle, String imgUri) {
        this.stationTitle=stationTitle;
        this.imgUri=imgUri;
    }


    public String getStationTitle() {
        return stationTitle;
    }

    public String getImgUri() {
        return DRAWABLE + imgUri;
    }

}
