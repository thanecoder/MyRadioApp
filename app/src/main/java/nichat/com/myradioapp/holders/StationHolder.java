package nichat.com.myradioapp.holders;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nichat.com.myradioapp.R;
import nichat.com.myradioapp.models.Station;

/**
 * Created by NICHAT on 12-06-2018 at 09:51.
 */
public class StationHolder extends RecyclerView.ViewHolder {

    ImageView card_image;
    TextView card_text;

    public StationHolder(View itemView) {
        super(itemView);
        card_image = (ImageView) itemView.findViewById(R.id.card_image);
        card_text = (TextView) itemView.findViewById(R.id.card_text);
    }

    public void updateUI(Station station){
        String uri = station.getImgUri();
        int resource = card_image.getResources().getIdentifier(uri,null,card_image.getContext().getPackageName());
        card_image.setImageResource(resource);
        card_text.setText(station.getStationTitle());
    }

}
