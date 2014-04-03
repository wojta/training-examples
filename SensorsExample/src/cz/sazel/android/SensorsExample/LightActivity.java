package cz.sazel.android.SensorsExample;

import android.app.Activity;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class LightActivity extends Activity {
    private RelativeLayout rlBackground;
    private TextView tvLightLevel;
    private SensorManager mSensorManager;
    private Sensor mSensor;
    private SensorEventListener mSensorListener;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        rlBackground = (RelativeLayout) findViewById(R.id.rlBackground);
        tvLightLevel = (TextView) findViewById(R.id.tvLightLevel);

        mSensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);
        mSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        mSensorListener = new SensorEventListener() {
            @Override
            public void onSensorChanged(SensorEvent sensorEvent) {
                float value = sensorEvent.values[0];
                int shade = Math.max(0, 255 - Math.min(255, (int) ((Math.log(value + 1) / 7) * 255)));
                tvLightLevel.setText(String.valueOf((int) value) + "lx");
                rlBackground.setBackgroundColor(Color.rgb(shade, shade, shade));
            }

            @Override
            public void onAccuracyChanged(Sensor sensor, int i) {

            }
        };

    }

    @Override
    protected void onStart() {
        super.onStart();

        mSensorManager.registerListener(mSensorListener, mSensor, SensorManager.SENSOR_DELAY_FASTEST);
    }

    @Override
    protected void onStop() {
        super.onStop();
        mSensorManager.unregisterListener(mSensorListener);
    }
}
