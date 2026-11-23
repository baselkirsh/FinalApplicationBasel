package basel.kersh.finalapplicationbasel.data.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.google.firebase.auth.FirebaseUser;

import basel.kersh.finalapplicationbasel.data.MyUserTable.MyUser;
import basel.kersh.finalapplicationbasel.repositories.UserRepository;

public class UserViewModel extends AndroidViewModel {

    private final UserRepository repository;

    public UserViewModel(@NonNull Application application) {
        super(application);
        repository = new UserRepository(application);
    }

    public LiveData<MyUser> login(String email, String password) {
        return repository.login(email, password);
    }

    public LiveData<MyUser> registerUser(MyUser user) {
        return repository.registerUser(user);
    }

    public FirebaseUser getCurrentUser() {
        return repository.getCurrentUser();
    }

    public void logout() {
        repository.logout();
    }
}
