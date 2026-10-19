package basel.kersh.finalapplicationbasel.repositories;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;


import basel.kersh.finalapplicationbasel.data.AppDatabase;
import basel.kersh.finalapplicationbasel.data.MyUserTable.MyUser;
import basel.kersh.finalapplicationbasel.data.MyUserTable.MyUserQuery;

public class UserRepository {
    private MyUserQuery userQuery;
    private LiveData<List<MyUser>> allUser;
    public UserRepository(Application application) {
        AppDatabase db = AppDatabase.getDB(application);
        userQuery = db.getMyUserQuery();
        allUser = userQuery.getAllUsers();
    }

    public LiveData<List<MyUser>> getAllUser() {
        return allUser;
    }
    public  LiveData<List<MyUser>>getUsersByUserId(long userId){
        return userQuery.getUsersByUserId(userId);

    }
    public LiveData<List<MyUser>> getUserByEmail(String myEmail){
        return userQuery.getUsersByEmail(myEmail);
    }
    public LiveData<List<MyUser>> getUserByPassw(String myPassw){
        return userQuery.getUsersByPassw(myPassw);
    }
       public LiveData<MyUser>getUserById(long userId) {
        return userQuery.getUserById(userId);

           }


    }






