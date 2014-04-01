package cz.sazel.android.training.HelloToast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import cz.sazel.android.training.HelloWorld.R;

public class HelloToastActivity extends Activity {
    /**
     * Volá se při prvním vytvoření aktivity
     * <p/>
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //nastavuje UI layout / setting UI layout
        setContentView(R.layout.main);

        //získání instancí prvků UI / getting instances of views
        Button btToast = (Button) findViewById(R.id.btToast);
        final EditText edToast = (EditText) findViewById(R.id.edToast);

        //nastavení obsluhy kliknutí / setting click listner
        btToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = edToast.getText();
                Toast.makeText(HelloToastActivity.this, text, Toast.LENGTH_LONG).show();
            }
        });
    }
}
