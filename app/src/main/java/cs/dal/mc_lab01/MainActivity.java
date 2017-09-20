package cs.dal.mc_lab01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button myButton;
    private TextView textView;
    float size;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button)findViewById(R.id.mybutton);
        textView = (TextView) findViewById(R.id.textView1);
        size = textView.getTextSize();
    }

    public void ToggleMessage(View view)
    {
        String mess ="Hello World!";
        if (textView.getText().length()==0)
        {
            textView.setText(mess);
        }
        else
        {
            textView.setText("");
        }
    }
}
