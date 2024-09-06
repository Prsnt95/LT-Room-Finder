package com.example.prasantcsfair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.HashMap;
import java.util.Map;

public class FloorII extends AppCompatActivity {
    private Map<String, ImageView> roomImageViews = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_ii);

        // Initialize ImageViews and map them with room numbers
        initializeRoomImageViews();

        // Get roomFrom and roomTo from the Intent
        Intent myIntent = getIntent();
        String roomFrom = myIntent.getStringExtra("roomFrom");
        String roomTo = myIntent.getStringExtra("roomTo");

        // Set visibility of all ImageViews to INVISIBLE by default
        setAllInvisible();

        // If roomFrom or roomTo is not null, make the corresponding rooms visible
        if (roomFrom != null && roomImageViews.containsKey("i" + roomFrom)) {
            roomImageViews.get("i" + roomFrom).setVisibility(View.VISIBLE);
        }

        if (roomTo != null && roomImageViews.containsKey("i" + roomTo)) {
            roomImageViews.get("i" + roomTo).setVisibility(View.VISIBLE);
        }
    }

    // Initialize ImageViews and store them in the map
    private void initializeRoomImageViews() {
        roomImageViews.put("i212", findViewById(R.id.i212));
        roomImageViews.put("i213", findViewById(R.id.i213));
        roomImageViews.put("i210", findViewById(R.id.i210));
        roomImageViews.put("i205", findViewById(R.id.i205));
        roomImageViews.put("i206", findViewById(R.id.i206));
        roomImageViews.put("i202", findViewById(R.id.i202));
        roomImageViews.put("i207", findViewById(R.id.i207));
        roomImageViews.put("i211", findViewById(R.id.i211));
        roomImageViews.put("i215", findViewById(R.id.i215));
        roomImageViews.put("i223", findViewById(R.id.i223));
        roomImageViews.put("i229", findViewById(R.id.i229));
        roomImageViews.put("i231", findViewById(R.id.i231));
        roomImageViews.put("i233", findViewById(R.id.i233));
        roomImageViews.put("i228", findViewById(R.id.i228));
        roomImageViews.put("i226", findViewById(R.id.i226));
        roomImageViews.put("i224", findViewById(R.id.i224));
        roomImageViews.put("i220", findViewById(R.id.i220));
        roomImageViews.put("i214", findViewById(R.id.i214));
        roomImageViews.put("i218", findViewById(R.id.i218));
        roomImageViews.put("i222", findViewById(R.id.i222));
        roomImageViews.put("i236", findViewById(R.id.i236));
        roomImageViews.put("i238", findViewById(R.id.i238));
        roomImageViews.put("i242", findViewById(R.id.i242));
        roomImageViews.put("i256", findViewById(R.id.i256));
        roomImageViews.put("i260", findViewById(R.id.i260));
        roomImageViews.put("i258", findViewById(R.id.i258));
        roomImageViews.put("i254", findViewById(R.id.i254));
        roomImageViews.put("i252", findViewById(R.id.i252));
        roomImageViews.put("i250", findViewById(R.id.i250));
        roomImageViews.put("i248", findViewById(R.id.i248));
        roomImageViews.put("i246", findViewById(R.id.i246));
        roomImageViews.put("i244", findViewById(R.id.i244));
        roomImageViews.put("i240", findViewById(R.id.i240));
        roomImageViews.put("i234", findViewById(R.id.i234));
        roomImageViews.put("i232", findViewById(R.id.i232));
        roomImageViews.put("i230", findViewById(R.id.i230));
        roomImageViews.put("i235", findViewById(R.id.i235));
        roomImageViews.put("i239", findViewById(R.id.i239));
        roomImageViews.put("i243", findViewById(R.id.i243));
        roomImageViews.put("i247", findViewById(R.id.i247));
        roomImageViews.put("i249", findViewById(R.id.i249));
        roomImageViews.put("i217", findViewById(R.id.i217));
        roomImageViews.put("i219", findViewById(R.id.i219));
        roomImageViews.put("i225", findViewById(R.id.i225));
        roomImageViews.put("i241", findViewById(R.id.i241));
        roomImageViews.put("i245", findViewById(R.id.i245));
        roomImageViews.put("i257", findViewById(R.id.i257));
        roomImageViews.put("i261", findViewById(R.id.i261));
        roomImageViews.put("i259", findViewById(R.id.i259));
        roomImageViews.put("i255", findViewById(R.id.i255));
        roomImageViews.put("i253", findViewById(R.id.i253));
        roomImageViews.put("i251", findViewById(R.id.i251));
    }

    // Set all ImageViews to INVISIBLE
    private void setAllInvisible() {
        for (ImageView imageView : roomImageViews.values()) {
            imageView.setVisibility(View.INVISIBLE);
        }
    }
}
