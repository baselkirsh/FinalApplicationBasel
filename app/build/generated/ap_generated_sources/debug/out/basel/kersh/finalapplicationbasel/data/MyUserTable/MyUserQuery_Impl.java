package basel.kersh.finalapplicationbasel.data.MyUserTable;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class MyUserQuery_Impl implements MyUserQuery {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<MyUser> __insertionAdapterOfMyUser;

  private final EntityDeletionOrUpdateAdapter<MyUser> __deletionAdapterOfMyUser;

  private final EntityDeletionOrUpdateAdapter<MyUser> __updateAdapterOfMyUser;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public MyUserQuery_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfMyUser = new EntityInsertionAdapter<MyUser>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `MyUser` (`keyid`,`full_Name`,`email`,`phone`,`passw`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final MyUser entity) {
        statement.bindLong(1, entity.keyid);
        if (entity.fullName == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.fullName);
        }
        if (entity.email == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.email);
        }
        if (entity.phone == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.phone);
        }
        if (entity.passw == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.passw);
        }
      }
    };
    this.__deletionAdapterOfMyUser = new EntityDeletionOrUpdateAdapter<MyUser>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `MyUser` WHERE `keyid` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final MyUser entity) {
        statement.bindLong(1, entity.keyid);
      }
    };
    this.__updateAdapterOfMyUser = new EntityDeletionOrUpdateAdapter<MyUser>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE OR ABORT `MyUser` SET `keyid` = ?,`full_Name` = ?,`email` = ?,`phone` = ?,`passw` = ? WHERE `keyid` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement, final MyUser entity) {
        statement.bindLong(1, entity.keyid);
        if (entity.fullName == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.fullName);
        }
        if (entity.email == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.email);
        }
        if (entity.phone == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.phone);
        }
        if (entity.passw == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.passw);
        }
        statement.bindLong(6, entity.keyid);
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "Delete From MyUser WHERE keyid=? ";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final MyUser... users) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMyUser.insert(users);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final MyUser myUser) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfMyUser.insert(myUser);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final MyUser user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfMyUser.handle(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final MyUser... values) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfMyUser.handleMultiple(values);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    try {
      __db.beginTransaction();
      try {
        _stmt.executeUpdateDelete();
        __db.setTransactionSuccessful();
      } finally {
        __db.endTransaction();
      }
    } finally {
      __preparedStmtOfDelete.release(_stmt);
    }
  }

  @Override
  public List<MyUser> getAll() {
    final String _sql = "SELECT * FROM MyUser";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfKeyid = CursorUtil.getColumnIndexOrThrow(_cursor, "keyid");
      final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_Name");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfPassw = CursorUtil.getColumnIndexOrThrow(_cursor, "passw");
      final List<MyUser> _result = new ArrayList<MyUser>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final MyUser _item;
        _item = new MyUser();
        _item.keyid = _cursor.getLong(_cursorIndexOfKeyid);
        if (_cursor.isNull(_cursorIndexOfFullName)) {
          _item.fullName = null;
        } else {
          _item.fullName = _cursor.getString(_cursorIndexOfFullName);
        }
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _item.email = null;
        } else {
          _item.email = _cursor.getString(_cursorIndexOfEmail);
        }
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _item.phone = null;
        } else {
          _item.phone = _cursor.getString(_cursorIndexOfPhone);
        }
        if (_cursor.isNull(_cursorIndexOfPassw)) {
          _item.passw = null;
        } else {
          _item.passw = _cursor.getString(_cursorIndexOfPassw);
        }
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<MyUser> loadAllByIds(final int[] userIds) {
    final StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM MyUser WHERE keyid IN (");
    final int _inputSize = userIds == null ? 1 : userIds.length;
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    if (userIds == null) {
      _statement.bindNull(_argIndex);
    } else {
      for (int _item : userIds) {
        _statement.bindLong(_argIndex, _item);
        _argIndex++;
      }
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfKeyid = CursorUtil.getColumnIndexOrThrow(_cursor, "keyid");
      final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_Name");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfPassw = CursorUtil.getColumnIndexOrThrow(_cursor, "passw");
      final List<MyUser> _result = new ArrayList<MyUser>(_cursor.getCount());
      while (_cursor.moveToNext()) {
        final MyUser _item_1;
        _item_1 = new MyUser();
        _item_1.keyid = _cursor.getLong(_cursorIndexOfKeyid);
        if (_cursor.isNull(_cursorIndexOfFullName)) {
          _item_1.fullName = null;
        } else {
          _item_1.fullName = _cursor.getString(_cursorIndexOfFullName);
        }
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _item_1.email = null;
        } else {
          _item_1.email = _cursor.getString(_cursorIndexOfEmail);
        }
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _item_1.phone = null;
        } else {
          _item_1.phone = _cursor.getString(_cursorIndexOfPhone);
        }
        if (_cursor.isNull(_cursorIndexOfPassw)) {
          _item_1.passw = null;
        } else {
          _item_1.passw = _cursor.getString(_cursorIndexOfPassw);
        }
        _result.add(_item_1);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public MyUser checkEmailPassw(final String myEmail, final String myPassw) {
    final String _sql = "SELECT * FROM MyUser WHERE email = ? AND passw = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (myEmail == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, myEmail);
    }
    _argIndex = 2;
    if (myPassw == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, myPassw);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfKeyid = CursorUtil.getColumnIndexOrThrow(_cursor, "keyid");
      final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_Name");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfPassw = CursorUtil.getColumnIndexOrThrow(_cursor, "passw");
      final MyUser _result;
      if (_cursor.moveToFirst()) {
        _result = new MyUser();
        _result.keyid = _cursor.getLong(_cursorIndexOfKeyid);
        if (_cursor.isNull(_cursorIndexOfFullName)) {
          _result.fullName = null;
        } else {
          _result.fullName = _cursor.getString(_cursorIndexOfFullName);
        }
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _result.email = null;
        } else {
          _result.email = _cursor.getString(_cursorIndexOfEmail);
        }
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _result.phone = null;
        } else {
          _result.phone = _cursor.getString(_cursorIndexOfPhone);
        }
        if (_cursor.isNull(_cursorIndexOfPassw)) {
          _result.passw = null;
        } else {
          _result.passw = _cursor.getString(_cursorIndexOfPassw);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public MyUser checkEmail(final String myEmail) {
    final String _sql = "SELECT * FROM MyUser WHERE email = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (myEmail == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, myEmail);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfKeyid = CursorUtil.getColumnIndexOrThrow(_cursor, "keyid");
      final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_Name");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfPassw = CursorUtil.getColumnIndexOrThrow(_cursor, "passw");
      final MyUser _result;
      if (_cursor.moveToFirst()) {
        _result = new MyUser();
        _result.keyid = _cursor.getLong(_cursorIndexOfKeyid);
        if (_cursor.isNull(_cursorIndexOfFullName)) {
          _result.fullName = null;
        } else {
          _result.fullName = _cursor.getString(_cursorIndexOfFullName);
        }
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _result.email = null;
        } else {
          _result.email = _cursor.getString(_cursorIndexOfEmail);
        }
        if (_cursor.isNull(_cursorIndexOfPhone)) {
          _result.phone = null;
        } else {
          _result.phone = _cursor.getString(_cursorIndexOfPhone);
        }
        if (_cursor.isNull(_cursorIndexOfPassw)) {
          _result.passw = null;
        } else {
          _result.passw = _cursor.getString(_cursorIndexOfPassw);
        }
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LiveData<List<MyUser>> getAllUsers() {
    final String _sql = "SELECT * FROM MyUser";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyUser"}, false, new Callable<List<MyUser>>() {
      @Override
      @Nullable
      public List<MyUser> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKeyid = CursorUtil.getColumnIndexOrThrow(_cursor, "keyid");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_Name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfPassw = CursorUtil.getColumnIndexOrThrow(_cursor, "passw");
          final List<MyUser> _result = new ArrayList<MyUser>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyUser _item;
            _item = new MyUser();
            _item.keyid = _cursor.getLong(_cursorIndexOfKeyid);
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _item.fullName = null;
            } else {
              _item.fullName = _cursor.getString(_cursorIndexOfFullName);
            }
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _item.email = null;
            } else {
              _item.email = _cursor.getString(_cursorIndexOfEmail);
            }
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _item.phone = null;
            } else {
              _item.phone = _cursor.getString(_cursorIndexOfPhone);
            }
            if (_cursor.isNull(_cursorIndexOfPassw)) {
              _item.passw = null;
            } else {
              _item.passw = _cursor.getString(_cursorIndexOfPassw);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<MyUser>> getUsersByUserId(final long userId) {
    final String _sql = "SELECT * FROM MyUser WHERE keyid = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyUser"}, false, new Callable<List<MyUser>>() {
      @Override
      @Nullable
      public List<MyUser> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKeyid = CursorUtil.getColumnIndexOrThrow(_cursor, "keyid");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_Name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfPassw = CursorUtil.getColumnIndexOrThrow(_cursor, "passw");
          final List<MyUser> _result = new ArrayList<MyUser>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyUser _item;
            _item = new MyUser();
            _item.keyid = _cursor.getLong(_cursorIndexOfKeyid);
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _item.fullName = null;
            } else {
              _item.fullName = _cursor.getString(_cursorIndexOfFullName);
            }
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _item.email = null;
            } else {
              _item.email = _cursor.getString(_cursorIndexOfEmail);
            }
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _item.phone = null;
            } else {
              _item.phone = _cursor.getString(_cursorIndexOfPhone);
            }
            if (_cursor.isNull(_cursorIndexOfPassw)) {
              _item.passw = null;
            } else {
              _item.passw = _cursor.getString(_cursorIndexOfPassw);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<MyUser>> getUsersByEmail(final String myEmail) {
    final String _sql = "SELECT * FROM MyUser WHERE email = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (myEmail == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, myEmail);
    }
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyUser"}, false, new Callable<List<MyUser>>() {
      @Override
      @Nullable
      public List<MyUser> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKeyid = CursorUtil.getColumnIndexOrThrow(_cursor, "keyid");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_Name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfPassw = CursorUtil.getColumnIndexOrThrow(_cursor, "passw");
          final List<MyUser> _result = new ArrayList<MyUser>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyUser _item;
            _item = new MyUser();
            _item.keyid = _cursor.getLong(_cursorIndexOfKeyid);
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _item.fullName = null;
            } else {
              _item.fullName = _cursor.getString(_cursorIndexOfFullName);
            }
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _item.email = null;
            } else {
              _item.email = _cursor.getString(_cursorIndexOfEmail);
            }
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _item.phone = null;
            } else {
              _item.phone = _cursor.getString(_cursorIndexOfPhone);
            }
            if (_cursor.isNull(_cursorIndexOfPassw)) {
              _item.passw = null;
            } else {
              _item.passw = _cursor.getString(_cursorIndexOfPassw);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<MyUser>> getUsersByPassw(final String myPassw) {
    final String _sql = "SELECT * FROM MyUser WHERE passw = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (myPassw == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, myPassw);
    }
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyUser"}, false, new Callable<List<MyUser>>() {
      @Override
      @Nullable
      public List<MyUser> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKeyid = CursorUtil.getColumnIndexOrThrow(_cursor, "keyid");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_Name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfPassw = CursorUtil.getColumnIndexOrThrow(_cursor, "passw");
          final List<MyUser> _result = new ArrayList<MyUser>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final MyUser _item;
            _item = new MyUser();
            _item.keyid = _cursor.getLong(_cursorIndexOfKeyid);
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _item.fullName = null;
            } else {
              _item.fullName = _cursor.getString(_cursorIndexOfFullName);
            }
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _item.email = null;
            } else {
              _item.email = _cursor.getString(_cursorIndexOfEmail);
            }
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _item.phone = null;
            } else {
              _item.phone = _cursor.getString(_cursorIndexOfPhone);
            }
            if (_cursor.isNull(_cursorIndexOfPassw)) {
              _item.passw = null;
            } else {
              _item.passw = _cursor.getString(_cursorIndexOfPassw);
            }
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<MyUser> getUserById(final long userId) {
    final String _sql = "SELECT * FROM MyUser WHERE keyid = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, userId);
    return __db.getInvalidationTracker().createLiveData(new String[] {"MyUser"}, false, new Callable<MyUser>() {
      @Override
      @Nullable
      public MyUser call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfKeyid = CursorUtil.getColumnIndexOrThrow(_cursor, "keyid");
          final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(_cursor, "full_Name");
          final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
          final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
          final int _cursorIndexOfPassw = CursorUtil.getColumnIndexOrThrow(_cursor, "passw");
          final MyUser _result;
          if (_cursor.moveToFirst()) {
            _result = new MyUser();
            _result.keyid = _cursor.getLong(_cursorIndexOfKeyid);
            if (_cursor.isNull(_cursorIndexOfFullName)) {
              _result.fullName = null;
            } else {
              _result.fullName = _cursor.getString(_cursorIndexOfFullName);
            }
            if (_cursor.isNull(_cursorIndexOfEmail)) {
              _result.email = null;
            } else {
              _result.email = _cursor.getString(_cursorIndexOfEmail);
            }
            if (_cursor.isNull(_cursorIndexOfPhone)) {
              _result.phone = null;
            } else {
              _result.phone = _cursor.getString(_cursorIndexOfPhone);
            }
            if (_cursor.isNull(_cursorIndexOfPassw)) {
              _result.passw = null;
            } else {
              _result.passw = _cursor.getString(_cursorIndexOfPassw);
            }
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
