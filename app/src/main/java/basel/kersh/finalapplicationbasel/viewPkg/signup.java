package basel.kersh.finalapplicationbasel.viewPkg;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelProvider;

import basel.kersh.finalapplicationbasel.R;
import basel.kersh.finalapplicationbasel.data.MyUserTable.MyUser;
import basel.kersh.finalapplicationbasel.data.viewmodel.UserViewModel;

public class signup extends AppCompatActivity {
    private Button btnsignup;
    private EditText Usertext, signupGmail, signuppassw;
    private UserViewModel userViewModel;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnsignup = findViewById(R.id.btnsignup);
        signupGmail = findViewById(R.id.signupgmail);
        signuppassw = findViewById(R.id.signuppassword);
        btnsignup = findViewById(R.id.btnsignup);
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signupuser();
            }
        });
    }

    private void signupuser() {
        Intent r = new Intent(signup.this, activity_register.class);
        startActivity(r);
        userViewModel = new ViewModelProvider(this).get(UserViewModel.class);
        String SuGmail = signupGmail.getText().toString().trim();
        String SuPassw = signuppassw.getText().toString().trim();


        if (SuGmail.isEmpty()){
            signupGmail.setError("Email is required");
            signupGmail.requestFocus();
            return;
        }
        if (SuPassw.isEmpty()){
            signuppassw.setError("Password is required");
            signuppassw.requestFocus();
            return;
        }
        MyUser user = UserViewModel.signup(signupGmail,signuppassw);
        if (user != null)

        {
            Toast.makeText(this, "Welcome" + user.getFullName(), Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(signup.this, MainActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this,"Invalid email or password", Toast.LENGTH_SHORT).show();
        }

    }
}

