package cz.gopas.android.pocitacka;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class KonstantyActivity extends Activity {

    protected static final int RESULT_CONST = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.konstanty);
        KonstClickListener listener = new KonstClickListener();
        findViewById(R.id.butE).setOnClickListener(listener);
        findViewById(R.id.butPI).setOnClickListener(listener);


    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
    }

    private class KonstClickListener implements OnClickListener {

        @Override
        public void onClick(View v) {
            Double val = 0.0;
            if (v.getId() == R.id.butE) {
                val = Math.E;
            } else if (v.getId() == R.id.butPI) {
                val = Math.PI;
            }
            Intent intent = new Intent();
            intent.putExtra(PocitackaActivity.EXTRA_KONSTANTA, val);

            setResult(RESULT_CONST, intent);
            finish();
            Toast.makeText(getBaseContext(), val.toString(), Toast.LENGTH_SHORT).show();
        }

    }

}
