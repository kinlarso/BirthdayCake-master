package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener{
    private CakeView view;
    private CakeModel model;

    //ctor
    public CakeController(CakeView v){
        view = v;
        model = view.getCakeModel();
    }

    public void onClick(View v){
        //Log.d("hello", "hello");
        model.candleLit = false;
        view.invalidate();
    }

    public void onCheckedChanged(CompoundButton cb, boolean b){
        if (!b) {
            model.hasCandles = false;
        }
        else {
            model.hasCandles = true;
        }
        view.invalidate();
    }

    public void onStartTrackingTouch(SeekBar sb){
        //idk
    }

    public void onStopTrackingTouch(SeekBar sb){
        //idk
    }

    public void onProgressChanged(SeekBar sb, int p, boolean fromUser){
        if (fromUser) {
            model.candleCount = p;
            view.invalidate();
        }
    }
}
