package basel.kersh.finalapplicationbasel.data.viewmodel;

import android.app.Application;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import basel.kersh.finalapplicationbasel.data.MyUserTable.MyUser;
import basel.kersh.finalapplicationbasel.repositories.UserRepository;

public class UserViewModel extends AndroidViewModel {

    private final UserRepository repository;
    private final LiveData<List<MyUser>> allUser;

    public UserViewModel(@NonNull Application application) {
        super(application);
        repository = new UserRepository(application);
        allUser = repository.getAll();
    }

    public static MyUser signup(EditText signupGmail, EditText signuppassw) {
        return null;
    }

    public LiveData<List<MyUser>> getAllUser()
    {
        return getAllUser();
    }
    public MyUser checkEmailPassw(String myEmail,String myPassw)
    {
        return repository.checkEmailPassw(myEmail,myPassw);
    }
    public void insertUser (MyUser...myUsers)
    {
        repository.insertUser(myUsers);
    }
    public void update(MyUser... user)
    {
        repository.update(user);
    }
    public void deleteById(MyUser user)
    {
        repository.deleteUser(user);
    }

    public MyUser login(String email, String password) {
        return repository.checkEmailPassw(email,password);
    }
}