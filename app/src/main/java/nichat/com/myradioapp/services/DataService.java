package nichat.com.myradioapp.services;

import java.util.ArrayList;

import nichat.com.myradioapp.models.Station;

/**
 * Created by NICHAT on 12-06-2018 at 13:04.
 */
public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeaturedStations(){
        //Code for downloading the data from Internet comes here.
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan","flightplanmusic"));
        list.add(new Station("Two-Wheeling Bike Music","bicyclemusic"));
        list.add(new Station("Music for Children","kidsmusic"));
        return list;
    }
    public ArrayList<Station> getRecentStations(){
        //Code for downloading the data from Internet comes here.
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan","flightplanmusic"));
        list.add(new Station("Two-Wheeling Bike Music","bicyclemusic"));
        list.add(new Station("Music for Children","kidsmusic"));
        return list;
    }public ArrayList<Station> getPartyStations(){
        //Code for downloading the data from Internet comes here.
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan","flightplanmusic"));
        list.add(new Station("Two-Wheeling Bike Music","bicyclemusic"));
        list.add(new Station("Music for Children","kidsmusic"));
        return list;
    }

}
