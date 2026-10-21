package basel.kersh.finalapplicationbasel.viewPkg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import basel.kersh.finalapplicationbasel.R;

public class activity_main extends AppCompatActivity {
private Button btnAddTaskScreen;
private Button btnRegisterScreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnAddTaskScreen = findViewById(R.id.btnAddTaskScreen);
        btnAddTaskScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
            Intent i=new Intent(activity_main.this, activity_register.class);

        });
        btnRegisterScreen = findViewById(R.id.btnRegisterScreen);
        btnRegisterScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent r=new Intent (activity_main.this,ActivityAddTask.class);
            startActivity(r);
            }

        });

    }
}