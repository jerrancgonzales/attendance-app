package com.example.jerrangonzales12;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    EditText username, password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(v -> {

            String user = username.getText().toString().trim();
            String pass = password.getText().toString();

            if (user.isEmpty() || pass.isEmpty()) {

                Toast.makeText(this,
                        "Please enter your username and password",
                        Toast.LENGTH_SHORT).show();

            } else if (user.equals("admin") &&
                    pass.equals("1234")) {

                Toast.makeText(this,
                        "Login Successful!",
                        Toast.LENGTH_SHORT).show();

            } else {

                Toast.makeText(this,
                        "Invalid username or password",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}