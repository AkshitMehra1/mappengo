package io.github.project_travel_mate.destinations.description;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import org.osmdroid.tileprovider.cachemanager.CacheManager;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.project_travel_mate.R;
import objects.City;
import utils.Utils;

import static utils.Constants.EXTRA_MESSAGE_CITY_OBJECT;

public class CityMapActivity extends AppCompatActivity {
    ImageView Image;
    @BindView(R.id.mv_city_map)
    MapView cityMap;
    @BindView(R.id.fab_save_map)
    FloatingActionButton  saveMap;

    public static Intent getStartIntent(Context context, City city) {
        return new Intent(context, CityMapActivity.class)
                .putExtra(EXTRA_MESSAGE_CITY_OBJECT, city);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_map);
    }
}
