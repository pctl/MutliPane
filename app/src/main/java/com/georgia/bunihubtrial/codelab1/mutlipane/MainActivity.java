package com.georgia.bunihubtrial.codelab1.mutlipane;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int screenOrientation=getResources().getConfiguration().orientation;
        if (screenOrientation== Configuration.ORIENTATION_PORTRAIT){
            hideSidePanel();
        }

    }

    private void hideSidePanel() {
        View sidePane=findViewById(R.id.side_pane);
        if(sidePane.getVisibility()== View.VISIBLE){
            sidePane.setVisibility(View.GONE);
        }
    }


}
