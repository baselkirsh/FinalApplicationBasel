package basel.kersh.finalapplicationbasel;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import basel.kersh.finalapplicationbasel.data.AppDatabase;
import basel.kersh.finalapplicationbasel.data.mySubjectTable.MySubject;
import basel.kersh.finalapplicationbasel.data.mySubjectTable.MySubjectQuery;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        AppDatabase db=AppDatabase.getDB(getApplicationContext());
        MySubjectQuery subjectQuery = db.getMySubjectQuery();
        MySubject s1=new MySubject();
        s1.setTitle ("Math");
        MySubject s2=new MySubject();
        s2.title="Computers";
        subjectQuery.insert(s1);
        subjectQuery.insert(s2);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}