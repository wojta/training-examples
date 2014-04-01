package cz.gopas.android.pocitacka;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class PocitackaActivity extends Activity {
    protected Button butCalc;
    protected Spinner spinOp;
    protected EditText edtNumA, edtNumB;
    protected TextView txtVysledek;
    private static final String[] operace = {"+", "-", "*", "/"};

    public final static String TAG = "Pocitacka";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Log.v(TAG, "onCreate()");
        butCalc = (Button) findViewById(R.id.butCalc);
        edtNumA = (EditText) findViewById(R.id.edtNumA);
        edtNumB = (EditText) findViewById(R.id.edtNumB);
        spinOp = (Spinner) findViewById(R.id.spinOp);
        txtVysledek = (TextView) findViewById(R.id.txtVysledek);

		/*ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,operace);
        spinOp.setAdapter(arrayAdapter);
		arrayAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
		*/

        butCalc.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String op = (String) spinOp.getSelectedItem();
                double a = Double.parseDouble(edtNumA.getText().toString());
                double b = Double.parseDouble(edtNumB.getText().toString());
                double c = 0;
                if (op.equals("+")) {
                    c = a + b;
                } else if (op.equals("-")) {
                    c = a - b;
                } else if (op.equals("*")) {
                    c = a * b;
                } else if (op.equals("/")) {
                    c = a / b;
                }
                txtVysledek.setText(getText(R.string.result) + ": " + c);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy()");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(TAG, "onRestart()");
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onStop()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume()");
    }


    @Override
    protected void onPause() {
        Log.v(TAG, "onPause()");
        super.onPause();
    }


}