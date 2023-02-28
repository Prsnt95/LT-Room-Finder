package com.example.prasantcsfair;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Map extends AppCompatActivity {
ImageView i104;
ImageView i106;
ImageView i107;
ImageView i110;
ImageView i111;
    ImageView i112;
    ImageView i113;
    ImageView i114;
    ImageView i115;
    ImageView i117;

    ImageView i118;
    ImageView i119;
    ImageView i120;
    ImageView i122;
    ImageView i123;
    ImageView i124;
    ImageView i125;
    ImageView i127;
    ImageView i128;
    ImageView i129;
    ImageView i130;
    ImageView i132;
    ImageView i133;

    ImageView i134;
    ImageView i135;
    ImageView i136;
    ImageView i137;
    ImageView i138;
    ImageView i139;
    ImageView i140;
    ImageView i141;
    ImageView i143;
    ImageView i144;
    ImageView i145;


    ImageView i146;
    ImageView i147;
    ImageView i148;
    ImageView i149;
    ImageView i150;
    ImageView i151;
    ImageView i153;
    ImageView i154;
    ImageView i155;
    ImageView i157;
    ImageView i161;
    ImageView iv;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        iv=findViewById(R.id.iv);
        i104=findViewById(R.id.i104);
        i106=findViewById(R.id.i106);
        i107=findViewById(R.id.i107);
        i110=findViewById(R.id.i110);
        i111=findViewById(R.id.i111);
        i112=findViewById(R.id.i112);
        i113=findViewById(R.id.i113);
        i114=findViewById(R.id.i114);
        i115=findViewById(R.id.i115);
        i117=findViewById(R.id.i117);

        i118=findViewById(R.id.i118);
        i119=findViewById(R.id.i119);
        i120=findViewById(R.id.i120);
        i122=findViewById(R.id.i122);
        i123=findViewById(R.id.i123);
        i124=findViewById(R.id.i124);
        i125=findViewById(R.id.i125);

        i127=findViewById(R.id.i127);
        i128=findViewById(R.id.i128);
        i129=findViewById(R.id.i129);
        i130=findViewById(R.id.i130);
        i132=findViewById(R.id.i132);
        i133=findViewById(R.id.i133);

         i134=findViewById(R.id.i134);
         i135=findViewById(R.id.i135);
         i136=findViewById(R.id.i136);
         i137=findViewById(R.id.i137);
         i138=findViewById(R.id.i138);
         i139=findViewById(R.id.i139);
         i140=findViewById(R.id.i140);
         i141=findViewById(R.id.i141);
         i143=findViewById(R.id.i143);
         i144=findViewById(R.id.i144);
         i145=findViewById(R.id.i145);


         i146=findViewById(R.id.i146);
         i147=findViewById(R.id.i147);
         i148=findViewById(R.id.i148);
         i149=findViewById(R.id.i149);
         i150=findViewById(R.id.i150);
         i151=findViewById(R.id.i151);
         i153=findViewById(R.id.i153);
         i154=findViewById(R.id.i154);
         i155=findViewById(R.id.i155);
         i157=findViewById(R.id.i157);
         i161=findViewById(R.id.i161);





        i104.setVisibility(View.INVISIBLE);
        i106.setVisibility(View.INVISIBLE);
        i107.setVisibility(View.INVISIBLE);
        i110.setVisibility(View.INVISIBLE);
        i111.setVisibility(View.INVISIBLE);
        i112.setVisibility(View.INVISIBLE);
        i113.setVisibility(View.INVISIBLE);
        i114.setVisibility(View.INVISIBLE);
        i115.setVisibility(View.INVISIBLE);
        i117.setVisibility(View.INVISIBLE);
        i118.setVisibility(View.INVISIBLE);
        i119.setVisibility(View.INVISIBLE);

        i120.setVisibility(View.INVISIBLE);
        i122.setVisibility(View.INVISIBLE);
        i123.setVisibility(View.INVISIBLE);
        i125.setVisibility(View.INVISIBLE);
        i124.setVisibility(View.INVISIBLE);
        i127.setVisibility(View.INVISIBLE);
        i128.setVisibility(View.INVISIBLE);
        i129.setVisibility(View.INVISIBLE);
        i130.setVisibility(View.INVISIBLE);
        i132.setVisibility(View.INVISIBLE);
        i133.setVisibility(View.INVISIBLE);
        i134.setVisibility(View.INVISIBLE);

        i135.setVisibility(View.INVISIBLE);
        i136.setVisibility(View.INVISIBLE);
        i137.setVisibility(View.INVISIBLE);
        i138.setVisibility(View.INVISIBLE);
        i139.setVisibility(View.INVISIBLE);
        i140.setVisibility(View.INVISIBLE);
        i141.setVisibility(View.INVISIBLE);
        i143.setVisibility(View.INVISIBLE);
        i144.setVisibility(View.INVISIBLE);
        i145.setVisibility(View.INVISIBLE);
        i146.setVisibility(View.INVISIBLE);
        i147.setVisibility(View.INVISIBLE);
        i148.setVisibility(View.INVISIBLE);
        i149.setVisibility(View.INVISIBLE);
        i150.setVisibility(View.INVISIBLE);
        i151.setVisibility(View.INVISIBLE);
        i153.setVisibility(View.INVISIBLE);
        i154.setVisibility(View.INVISIBLE);
        i155.setVisibility(View.INVISIBLE);
        i157.setVisibility(View.INVISIBLE);
        i161.setVisibility(View.INVISIBLE);








        Intent myIntent= getIntent();
        String a= getIntent().getStringExtra("roomFrom");
        String b= getIntent().getStringExtra("roomTo");

        String roomfrom="i"+a;
        String roomTo= "i"+b;

        if (roomfrom.equals("i104") | roomTo.equals("i104"))
        {
            i104.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i106") | roomTo.equals("i106"))
        {
            i106.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i107") | roomTo.equals("i107"))
        {
            i107.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i110") | roomTo.equals("i110"))
        {
            i110.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i111") | roomTo.equals("i111"))
        {
            i111.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i112") | roomTo.equals("i112"))
        {
            i112.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i113") | roomTo.equals("i113"))
        {
            i113.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i114") | roomTo.equals("i114"))
        {
            i114.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i115") | roomTo.equals("i115"))
        {
            i115.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i117") | roomTo.equals("i117"))
        {
            i117.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i118") | roomTo.equals("i118"))
        {
            i118.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i119") | roomTo.equals("i119"))
        {
            i119.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i120") | roomTo.equals("i120"))
        {
            i120.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i122") | roomTo.equals("i122"))
        {
            i122.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i123") | roomTo.equals("i123"))
        {
            i123.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i124") | roomTo.equals("i124"))
        {
            i124.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i125") | roomTo.equals("i125"))
        {
            i125.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i127") | roomTo.equals("i127"))
        {
            i127.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i128") | roomTo.equals("i128"))
        {
            i128.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i129") | roomTo.equals("i129"))
        {
            i129.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i133") | roomTo.equals("i133"))
        {
            i133.setVisibility(View.VISIBLE);
        }




        if (roomfrom.equals("i134") | roomTo.equals("i134"))
        {
            i134.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i135") | roomTo.equals("i135"))
        {
            i135.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i136") | roomTo.equals("i136"))
        {
            i136.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i137") | roomTo.equals("i137"))
        {
            i137.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i138") | roomTo.equals("i138"))
        {
            i138.setVisibility(View.VISIBLE);
        }
       if (roomfrom.equals("i139") | roomTo.equals("i139"))
        {
            i139.setVisibility(View.VISIBLE);
        }




        if (roomfrom.equals("i140") | roomTo.equals("i140"))
        {
            i140.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i141") | roomTo.equals("i141"))
        {
            i141.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i143") | roomTo.equals("i143"))
        {
            i143.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i144") | roomTo.equals("i144"))
        {
            i144.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i145") | roomTo.equals("i145"))
        {
            i145.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i146") | roomTo.equals("i146"))
        {
            i146.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i147") | roomTo.equals("i147"))
        {
            i147.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i148") | roomTo.equals("i148"))
        {
            i148.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i149") | roomTo.equals("i149"))
        {
            i149.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i150") | roomTo.equals("i150"))
        {
            i150.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i151") | roomTo.equals("i151"))
        {
            i151.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i153") | roomTo.equals("i153"))
        {
            i153.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i154") | roomTo.equals("i154"))
        {
            i154.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i155") | roomTo.equals("i155"))
        {
            i155.setVisibility(View.VISIBLE);
        }

        if (roomfrom.equals("i157") | roomTo.equals("i157"))
        {
            i157.setVisibility(View.VISIBLE);
        }
        if (roomfrom.equals("i161") | roomTo.equals("i161"))
        {
            i161.setVisibility(View.VISIBLE);
        }

























    }
}