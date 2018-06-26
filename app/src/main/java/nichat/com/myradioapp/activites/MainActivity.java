package nichat.com.myradioapp.activites;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nichat.com.myradioapp.R;
import nichat.com.myradioapp.fragments.DetailsFragment;
import nichat.com.myradioapp.fragments.MainFragment;
import nichat.com.myradioapp.fragments.StationFragment;
import nichat.com.myradioapp.models.Station;


public class MainActivity extends AppCompatActivity implements MainFragment.OnMainFragmentInteractionListener,StationFragment.OnStationFragmentInteractionListener,DetailsFragment.OnFragmentInteractionListener{

    private static MainActivity mainActivity;


    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    private static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MainActivity.setMainActivity(this);
        FragmentManager manager = getSupportFragmentManager();
        Fragment fragment = manager.findFragmentById(R.id.fragment_container);
        if(fragment == null){
            fragment = new MainFragment();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.fragment_container,fragment);
            transaction.commit();
        }
    }

    @Override
    public void onMainFragmentInteraction(Uri uri) {

    }

    @Override
    public void onStationFragmentInteraction(Uri uri) {

    }

    public void loadDetailsScreen(Station selectedStation){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new DetailsFragment()).addToBackStack(null).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {
        
    }
}
