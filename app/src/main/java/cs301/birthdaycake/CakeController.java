package cs301.birthdaycake;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener, View.OnTouchListener {
    private CakeView var;
    private CakeModel var1;

    public CakeController(CakeView initCake) {
        var = initCake;
        var1 = var.getCake();
    }

    @Override
    public void onClick(View v) {
        Log.d("blowOut", "Blow Out");
        var1.litCandle = false;
        var.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked == true) {
            var1.candles = true;
        } else
            var1.candles = false;
        var.invalidate();
    }


    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        var1.numCandles = progress;
        var.invalidate();

    }

        @Override
        public void onStartTrackingTouch (SeekBar seekBar) {

        }

        @Override
        public void onStopTrackingTouch (SeekBar seekBar) {

        }

    @Override
    public boolean onTouch(View v, MotionEvent MotionEvent) {
        var1.xLocation = (float)MotionEvent.getX();
        var1.yLocation = (float)MotionEvent.getY();

        var.invalidate();

        return true;

    }
}


