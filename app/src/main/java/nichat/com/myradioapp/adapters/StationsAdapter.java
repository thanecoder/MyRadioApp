package nichat.com.myradioapp.adapters;


import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import nichat.com.myradioapp.R;
import nichat.com.myradioapp.activites.MainActivity;
import nichat.com.myradioapp.holders.StationHolder;
import nichat.com.myradioapp.models.Station;

/**
 * Created by NICHAT on 12-06-2018 at 09:48.
 */
public class StationsAdapter extends RecyclerView.Adapter<StationHolder>{

    public ArrayList<Station> mStations;

    public StationsAdapter(ArrayList<Station> mStations) {
        this.mStations = mStations;
    }

    @NonNull
    @Override
    public StationHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View card_station = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_station,parent,false);
        return new StationHolder(card_station);
    }

    @Override
    public void onBindViewHolder(@NonNull StationHolder holder, int position) {
        final Station station = mStations.get(position);
        holder.updateUI(station);
        final int p = position;

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //we load the details screen from here.
                MainActivity.getMainActivity().loadDetailsScreen(station);
            }
        });


    }

    @Override
    public int getItemCount() {
        return mStations.size();
    }
}
