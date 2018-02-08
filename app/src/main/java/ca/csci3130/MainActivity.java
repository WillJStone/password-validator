package ca.csci3130.cs3130_a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button submitBtn;
    private EditText password_editText;
    private TextView strengthIndicator;

    private String goodPass = "Strong Password";
    private String badPass  = "Try Another Password!";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submitBtn = findViewById(R.id.submitBtn);
        password_editText = findViewById(R.id.password_editText);
        strengthIndicator = findViewById(R.id.strengthIndicator);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Validator.validate(password_editText.getText().toString()) == 5){
                    strengthIndicator.setText(goodPass);
                }
                else{
                    strengthIndicator.setText(badPass);
                }
            }
        });
    }

}
