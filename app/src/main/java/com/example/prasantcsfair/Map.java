package com.example.prasantcsfair;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

public class Map extends AppCompatActivity {
    private Map<String, ImageView> roomImageViews = new HashMap<>();
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        // Initialize ImageViews and map them to room numbers
        iv = findViewById(R.id.iv);
        initializeRoomImageViews();

        // Set all ImageViews to INVISIBLE by default
        setAllInvisible();

        // Get the room numbers from Intent
        Intent myIntent = getIntent();
        String roomFrom = myIntent.getStringExtra("roomFrom");
        String roomTo = myIntent.getStringExtra("roomTo");

        // Show the selected rooms if they exist in the map
        if (roomFrom != null && roomImageViews.containsKey("i" + roomFrom)) {
            roomImageViews.get("i" + roomFrom).setVisibility(View.VISIBLE);
        }

        if (roomTo != null && roomImageViews.containsKey("i" + roomTo)) {
            roomImageViews.get("i" + roomTo).setVisibility(View.VISIBLE);
        }
    }

    // Initialize ImageViews and store them in the map
    private void initializeRoomImageViews() {
        roomImageViews.put("i104", findViewById(R.id.i104));
        roomImageViews.put("i106", findViewById(R.id.i106));
        roomImageViews.put("i107", findViewById(R.id.i107));
        roomImageViews.put("i110", findViewById(R.id.i110));
        roomImageViews.put("i111", findViewById(R.id.i111));
        roomImageViews.put("i112", findViewById(R.id.i112));
        roomImageViews.put("i113", findViewById(R.id.i113));
        roomImageViews.put("i114", findViewById(R.id.i114));
        roomImageViews.put("i115", findViewById(R.id.i115));
        roomImageViews.put("i117", findViewById(R.id.i117));

        roomImageViews.put("i118", findViewById(R.id.i118));
        roomImageViews.put("i119", findViewById(R.id.i119));
        roomImageViews.put("i120", findViewById(R.id.i120));
        roomImageViews.put("i122", findViewById(R.id.i122));
        roomImageViews.put("i123", findViewById(R.id.i123));
        roomImageViews.put("i124", findViewById(R.id.i124));
        roomImageViews.put("i125", findViewById(R.id.i125));
        roomImageViews.put("i127", findViewById(R.id.i127));
        roomImageViews.put("i128", findViewById(R.id.i128));
        roomImageViews.put("i129", findViewById(R.id.i129));
        roomImageViews.put("i130", findViewById(R.id.i130));

        roomImageViews.put("i132", findViewById(R.id.i132));
        roomImageViews.put("i133", findViewById(R.id.i133));
        roomImageViews.put("i134", findViewById(R.id.i134));
        roomImageViews.put("i135", findViewById(R.id.i135));
        roomImageViews.put("i136", findViewById(R.id.i136));
        roomImageViews.put("i137", findViewById(R.id.i137));
        roomImageViews.put("i138", findViewById(R.id.i138));
        roomImageViews.put("i139", findViewById(R.id.i139));
        roomImageViews.put("i140", findViewById(R.id.i140));
        roomImageViews.put("i141", findViewById(R.id.i141));

        roomImageViews.put("i143", findViewById(R.id.i143));
        roomImageViews.put("i144", findViewById(R.id.i144));
        roomImageViews.put("i145", findViewById(R.id.i145));
        roomImageViews.put("i146", findViewById(R.id.i146));
        roomImageViews.put("i147", findViewById(R.id.i147));
        roomImageViews.put("i148", findViewById(R.id.i148));
        roomImageViews.put("i149", findViewById(R.id.i149));
        roomImageViews.put("i150", findViewById(R.id.i150));
        roomImageViews.put("i151", findViewById(R.id.i151));

        roomImageViews.put("i153", findViewById(R.id.i153));
        roomImageViews.put("i154", findViewById(R.id.i154));
        roomImageViews.put("i155", findViewById(R.id.i155));
        roomImageViews.put("i157", findViewById(R.id.i157));
        roomImageViews.put("i161", findViewById(R.id.i161));
    }

    // Set all ImageViews to INVISIBLE
    private void setAllInvisible() {
        for (ImageView imageView : roomImageViews.values()) {
            imageView.setVisibility(View.INVISIBLE);
        }
    }
}
