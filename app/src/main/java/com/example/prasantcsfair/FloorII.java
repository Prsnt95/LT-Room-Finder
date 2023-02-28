package com.example.prasantcsfair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FloorII extends AppCompatActivity {
    ImageView i212;
    ImageView i213;
    ImageView i210;
    ImageView i205;
    ImageView i206;
    ImageView i202;
    ImageView i207;
    ImageView i211;
    ImageView i215;
    ImageView i223;
    ImageView i229;
    ImageView i231;
    ImageView i233;
    ImageView i228;
    ImageView i226;
    ImageView i224;
    ImageView i220;
    ImageView i214;
    ImageView i218;
    ImageView i222;
    ImageView i236;
    ImageView i238;
    ImageView i242;

    ImageView i256;
    ImageView i260;
    ImageView i258;
    ImageView i254;
    ImageView i252;
    ImageView i250;
    ImageView i248;
    ImageView i246;
    ImageView i244;
    ImageView i240;
    ImageView i234;


    ImageView i232;
    ImageView i230;
    ImageView i235;
    ImageView i239;
    ImageView i243;
    ImageView i247;
    ImageView i249;
    ImageView i217;
    ImageView i219;
    ImageView i225;
    ImageView i241;
    ImageView i245;
    ImageView i257;
    ImageView i261;
    ImageView i259;
    ImageView i255;
    ImageView i253;
    ImageView i251;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor_ii);
        i212 = findViewById(R.id.i212);
        i213 = findViewById(R.id.i213);
        i210 = findViewById(R.id.i210);
        i206 = findViewById(R.id.i206);
        i205 = findViewById(R.id.i205);
        i202 = findViewById(R.id.i202);
        i207 = findViewById(R.id.i207);
        i211 = findViewById(R.id.i211);
        i215 = findViewById(R.id.i215);
        i223 = findViewById(R.id.i223);
        i229 = findViewById(R.id.i229);
        i231 = findViewById(R.id.i231);
        i233 = findViewById(R.id.i233);
        i228 = findViewById(R.id.i228);
        i226 = findViewById(R.id.i226);
        i224 = findViewById(R.id.i224);
        i220 = findViewById(R.id.i220);
        i214 = findViewById(R.id.i214);
        i218 = findViewById(R.id.i218);
        i222 = findViewById(R.id.i222);
        i236 = findViewById(R.id.i236);
        i238 = findViewById(R.id.i238);
        i242 = findViewById(R.id.i242);

        i256 = findViewById(R.id.i256);
        i260 = findViewById(R.id.i260);
        i258 = findViewById(R.id.i258);
        i254 = findViewById(R.id.i254);
        i252 = findViewById(R.id.i252);
        i250 = findViewById(R.id.i250);
        i248 = findViewById(R.id.i248);
        i246 = findViewById(R.id.i246);
        i244 = findViewById(R.id.i244);
        i234 = findViewById(R.id.i234);
        i232 = findViewById(R.id.i232);
        i230 = findViewById(R.id.i230);

        i235 = findViewById(R.id.i235);
        i239 = findViewById(R.id.i239);
        i240 = findViewById(R.id.i240);

        i243 = findViewById(R.id.i243);
        i247 = findViewById(R.id.i247);
        i249 = findViewById(R.id.i249);
        i217 = findViewById(R.id.i217);
        i219 = findViewById(R.id.i219);
        i225 = findViewById(R.id.i225);
        i241 = findViewById(R.id.i241);
        i245 = findViewById(R.id.i245);
        i257 = findViewById(R.id.i257);
        i261 = findViewById(R.id.i261);

        i259 = findViewById(R.id.i259);
        i255 = findViewById(R.id.i255);
        i253 = findViewById(R.id.i253);
        i251 = findViewById(R.id.i251);


        //noice
        i212.setVisibility(View.INVISIBLE);
        i213.setVisibility(View.INVISIBLE);

        i210.setVisibility(View.INVISIBLE);

        i206.setVisibility(View.INVISIBLE);

        i202.setVisibility(View.INVISIBLE);

        i207.setVisibility(View.INVISIBLE);
        i205.setVisibility(View.INVISIBLE);


        i211.setVisibility(View.INVISIBLE);

        i215.setVisibility(View.INVISIBLE);
        
        i223.setVisibility(View.INVISIBLE);
        ;
        i229.setVisibility(View.INVISIBLE);
        ;
        i231.setVisibility(View.INVISIBLE);
        ;
        i233.setVisibility(View.INVISIBLE);
        ;
        i228.setVisibility(View.INVISIBLE);
        ;
        i226.setVisibility(View.INVISIBLE);
        ;
        i224.setVisibility(View.INVISIBLE);
        ;
        i220.setVisibility(View.INVISIBLE);
        ;
        i214.setVisibility(View.INVISIBLE);
        ;
        i218.setVisibility(View.INVISIBLE);
        ;
        i222.setVisibility(View.INVISIBLE);
        ;
        i236.setVisibility(View.INVISIBLE);
        i238.setVisibility(View.INVISIBLE);
        i242.setVisibility(View.INVISIBLE);

        i256.setVisibility(View.INVISIBLE);
        i260.setVisibility(View.INVISIBLE);
        i258.setVisibility(View.INVISIBLE);
        i254.setVisibility(View.INVISIBLE);
        i252.setVisibility(View.INVISIBLE);
        i250.setVisibility(View.INVISIBLE);
        i248.setVisibility(View.INVISIBLE);
        i246.setVisibility(View.INVISIBLE);
        i244.setVisibility(View.INVISIBLE);
        i240.setVisibility(View.INVISIBLE);
        i234.setVisibility(View.INVISIBLE);


        i232.setVisibility(View.INVISIBLE);
        i230.setVisibility(View.INVISIBLE);
        i235.setVisibility(View.INVISIBLE);
        i239.setVisibility(View.INVISIBLE);
        i243.setVisibility(View.INVISIBLE);
        i247.setVisibility(View.INVISIBLE);
        i249.setVisibility(View.INVISIBLE);
        i217.setVisibility(View.INVISIBLE);
        i219.setVisibility(View.INVISIBLE);
        i225.setVisibility(View.INVISIBLE);
        i241.setVisibility(View.INVISIBLE);
        i245.setVisibility(View.INVISIBLE);
        i257.setVisibility(View.INVISIBLE);
        i261.setVisibility(View.INVISIBLE);
        i259.setVisibility(View.INVISIBLE);
        i255.setVisibility(View.INVISIBLE);
        i253.setVisibility(View.INVISIBLE);
        i251.setVisibility(View.INVISIBLE);

        Intent myIntent = getIntent();
        String a = getIntent().getStringExtra("roomFrom");
        String b = getIntent().getStringExtra("roomTo");

        String roomfrom = "i" + a;
        String roomTo = "i" + b;

        if (roomfrom.equals("i212") | roomTo.equals("i212")) {
            i212.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i213") | roomTo.equals("i213")) {
            i213.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i210") | roomTo.equals("i210")) {
            i210.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i206") | roomTo.equals("i206")) {
            i206.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i202") | roomTo.equals("i202")) {
            i202.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i207") | roomTo.equals("i207")) {
            i207.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i211") | roomTo.equals("i211")) {
            i211.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i215") | roomTo.equals("i215")) {
            i215.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i223") | roomTo.equals("i223")) {
            i223.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i229") | roomTo.equals("i229")) {
            i229.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i231") | roomTo.equals("i231")) {
            i231.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i233") | roomTo.equals("i233")) {
            i233.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i228") | roomTo.equals("i228")) {
            i228.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i226") | roomTo.equals("i226")) {
            i226.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i224") | roomTo.equals("i224")) {
            i224.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i220") | roomTo.equals("i220")) {
            i220.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i214") | roomTo.equals("i214")) {
            i214.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i218") | roomTo.equals("i218")) {
            i218.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i222") | roomTo.equals("i222")) {
            i222.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i236") | roomTo.equals("i236")) {
            i236.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i238") | roomTo.equals("i238")) {
            i238.setVisibility(View.VISIBLE);
        }


        if (roomfrom.equals("i242") | roomTo.equals("i242")) {
            i242.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i256") | roomTo.equals("i256")) {
            i256.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i260") | roomTo.equals("i260")) {
            i260.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i258") | roomTo.equals("i258")) {
            i258.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i254") | roomTo.equals("i254")) {
            i254.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i252") | roomTo.equals("i252")) {
            i252.setVisibility(View.VISIBLE);
        }


        if (roomfrom.equals("i250") | roomTo.equals("i250")) {
            i250.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i248") | roomTo.equals("i248")) {
            i248.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i246") | roomTo.equals("i246")) {
            i246.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i244") | roomTo.equals("i244")) {
            i244.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i240") | roomTo.equals("i240")) {
            i240.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i234") | roomTo.equals("i234")) {
            i234.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i232") | roomTo.equals("i232")) {
            i232.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i230") | roomTo.equals("i230")) {
            i230.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i235") | roomTo.equals("i235")) {
            i235.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i239") | roomTo.equals("i239")) {
            i239.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i243") | roomTo.equals("i243")) {
            i243.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i247") | roomTo.equals("i247")) {
            i247.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i249") | roomTo.equals("i249")) {
            i249.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i217") | roomTo.equals("i217")) {
            i217.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i219") | roomTo.equals("i219")) {
            i219.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i225") | roomTo.equals("i225")) {
            i225.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i241") | roomTo.equals("i241")) {
            i241.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i245") | roomTo.equals("i245")) {
            i245.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i257") | roomTo.equals("i257")) {
            i257.setVisibility(View.VISIBLE);

        }
        if (roomfrom.equals("i261") | roomTo.equals("i261")) {
            i261.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i259") | roomTo.equals("i259")) {
            i259.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i255") | roomTo.equals("i255")) {
            i255.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i253") | roomTo.equals("i253")) {
            i253.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i251") | roomTo.equals("i251")) {
            i251.setVisibility(View.VISIBLE);
        }
    }
}