package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);
        CakeView cake = findViewById(R.id.cakeview);
        CakeController controller = new CakeController(cake);
        Button blowOut = findViewById(R.id.blowout);
        blowOut.setOnClickListener(controller);
        CompoundButton candleButton = findViewById(R.id.candlebutton);
        candleButton.setOnCheckedChangeListener(controller);
        SeekBar candleBar = findViewById(R.id.seekBar);
        candleBar.setOnSeekBarChangeListener(controller);

        LinearLayout listener = findViewById(R.id.layout);
        listener.setOnTouchListener(controller);


    }

    public void goodbye(View button) {
        Log.i("button", "Goodbye");
        //finishAffinity();
    }
}
