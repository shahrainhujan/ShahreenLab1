package com.example.shah.shahreenlab1;

import android.support.annotation.StringDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button displayButton;
    private EditText etName;
    private TextView tvMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById (R.id.textView);
        displayButton = (Button) findViewById (R.id.button);
        etName = (EditText) findViewById (R.id.editText);
    }
    public void displayText (View view)
    {
        String text= etName.getText().toString();

        tvMessage.setText("Welcome  "  + text);
        Toast toast = Toast.makeText(this,"welcome"+text, Toast.LENGTH_SHORT);
        toast.show();

    }

    public void resetText (View view)
    {
        String text= etName.getText().toString();

        tvMessage.setText("Welcome  " );
        Toast toast = Toast.makeText(this,"Your name has been reset", Toast.LENGTH_SHORT);
        toast.show();

    }
}
