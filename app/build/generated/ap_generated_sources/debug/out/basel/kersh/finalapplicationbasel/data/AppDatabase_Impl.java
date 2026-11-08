package basel.kersh.finalapplicationbasel.data;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import basel.kersh.finalapplicationbasel.data.MyTaskTable.MyTaskQuery;
import basel.kersh.finalapplicationbasel.data.MyTaskTable.MyTaskQuery_Impl;
import basel.kersh.finalapplicationbasel.data.MyUserTable.MyUserQuery;
import basel.kersh.finalapplicationbasel.data.MyUserTable.MyUserQuery_Impl;
import basel.kersh.finalapplicationbasel.data.mySubjectTable.MySubjectQuery;
import basel.kersh.finalapplicationbasel.data.mySubjectTable.MySubjectQuery_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile MyUserQuery _myUserQuery;

  private volatile MySubjectQuery _mySubjectQuery;

  private volatile MyTaskQuery _myTaskQuery;

  @Override
  @NonNull
  protected SupportSQLiteOpenHelper createOpenHelper(@NonNull final DatabaseConfiguration config) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(config, new RoomOpenHelper.Delegate(2) {
      @Override
      public void createAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("CREATE TABLE IF NOT EXISTS `MyUser` (`keyid` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `full_Name` TEXT, `email` TEXT, `phone` TEXT, `passw` TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `MySubject` (`key_id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT)");
        db.execSQL("CREATE TABLE IF NOT EXISTS `MyTask` (`taskId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `title` TEXT, `description` TEXT, `priority` INTEGER NOT NULL, `keyId` INTEGER NOT NULL, `importance` INTEGER NOT NULL, `shortTile` TEXT, `text` TEXT, `time` INTEGER NOT NULL, `isCompleted` INTEGER NOT NULL, `subjId` INTEGER NOT NULL, `userId` INTEGER NOT NULL)");
        db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5ff9c7d4f159186a09fa899c340ecdd6')");
      }

      @Override
      public void dropAllTables(@NonNull final SupportSQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS `MyUser`");
        db.execSQL("DROP TABLE IF EXISTS `MySubject`");
        db.execSQL("DROP TABLE IF EXISTS `MyTask`");
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onDestructiveMigration(db);
          }
        }
      }

      @Override
      public void onCreate(@NonNull final SupportSQLiteDatabase db) {
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onCreate(db);
          }
        }
      }

      @Override
      public void onOpen(@NonNull final SupportSQLiteDatabase db) {
        mDatabase = db;
        internalInitInvalidationTracker(db);
        final List<? extends RoomDatabase.Callback> _callbacks = mCallbacks;
        if (_callbacks != null) {
          for (RoomDatabase.Callback _callback : _callbacks) {
            _callback.onOpen(db);
          }
        }
      }

      @Override
      public void onPreMigrate(@NonNull final SupportSQLiteDatabase db) {
        DBUtil.dropFtsSyncTriggers(db);
      }

      @Override
      public void onPostMigrate(@NonNull final SupportSQLiteDatabase db) {
      }

      @Override
      @NonNull
      public RoomOpenHelper.ValidationResult onValidateSchema(
          @NonNull final SupportSQLiteDatabase db) {
        final HashMap<String, TableInfo.Column> _columnsMyUser = new HashMap<String, TableInfo.Column>(5);
        _columnsMyUser.put("keyid", new TableInfo.Column("keyid", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyUser.put("full_Name", new TableInfo.Column("full_Name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyUser.put("email", new TableInfo.Column("email", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyUser.put("phone", new TableInfo.Column("phone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyUser.put("passw", new TableInfo.Column("passw", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMyUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMyUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMyUser = new TableInfo("MyUser", _columnsMyUser, _foreignKeysMyUser, _indicesMyUser);
        final TableInfo _existingMyUser = TableInfo.read(db, "MyUser");
        if (!_infoMyUser.equals(_existingMyUser)) {
          return new RoomOpenHelper.ValidationResult(false, "MyUser(basel.kersh.finalapplicationbasel.data.MyUserTable.MyUser).\n"
                  + " Expected:\n" + _infoMyUser + "\n"
                  + " Found:\n" + _existingMyUser);
        }
        final HashMap<String, TableInfo.Column> _columnsMySubject = new HashMap<String, TableInfo.Column>(2);
        _columnsMySubject.put("key_id", new TableInfo.Column("key_id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMySubject.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMySubject = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMySubject = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMySubject = new TableInfo("MySubject", _columnsMySubject, _foreignKeysMySubject, _indicesMySubject);
        final TableInfo _existingMySubject = TableInfo.read(db, "MySubject");
        if (!_infoMySubject.equals(_existingMySubject)) {
          return new RoomOpenHelper.ValidationResult(false, "MySubject(basel.kersh.finalapplicationbasel.data.mySubjectTable.MySubject).\n"
                  + " Expected:\n" + _infoMySubject + "\n"
                  + " Found:\n" + _existingMySubject);
        }
        final HashMap<String, TableInfo.Column> _columnsMyTask = new HashMap<String, TableInfo.Column>(12);
        _columnsMyTask.put("taskId", new TableInfo.Column("taskId", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyTask.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyTask.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyTask.put("priority", new TableInfo.Column("priority", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyTask.put("keyId", new TableInfo.Column("keyId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyTask.put("importance", new TableInfo.Column("importance", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyTask.put("shortTile", new TableInfo.Column("shortTile", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyTask.put("text", new TableInfo.Column("text", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyTask.put("time", new TableInfo.Column("time", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyTask.put("isCompleted", new TableInfo.Column("isCompleted", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyTask.put("subjId", new TableInfo.Column("subjId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsMyTask.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysMyTask = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesMyTask = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoMyTask = new TableInfo("MyTask", _columnsMyTask, _foreignKeysMyTask, _indicesMyTask);
        final TableInfo _existingMyTask = TableInfo.read(db, "MyTask");
        if (!_infoMyTask.equals(_existingMyTask)) {
          return new RoomOpenHelper.ValidationResult(false, "MyTask(basel.kersh.finalapplicationbasel.data.MyTaskTable.MyTask).\n"
                  + " Expected:\n" + _infoMyTask + "\n"
                  + " Found:\n" + _existingMyTask);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "5ff9c7d4f159186a09fa899c340ecdd6", "1356bfe1dcaead4baed0b8afd6723edd");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(_openCallback).build();
    final SupportSQLiteOpenHelper _helper = config.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  @NonNull
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    final HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "MyUser","MySubject","MyTask");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `MyUser`");
      _db.execSQL("DELETE FROM `MySubject`");
      _db.execSQL("DELETE FROM `MyTask`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  @NonNull
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(MyUserQuery.class, MyUserQuery_Impl.getRequiredConverters());
    _typeConvertersMap.put(MySubjectQuery.class, MySubjectQuery_Impl.getRequiredConverters());
    _typeConvertersMap.put(MyTaskQuery.class, MyTaskQuery_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  @NonNull
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  @NonNull
  public List<Migration> getAutoMigrations(
      @NonNull final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
    final List<Migration> _autoMigrations = new ArrayList<Migration>();
    return _autoMigrations;
  }

  @Override
  public MyUserQuery getMyUserQuery() {
    if (_myUserQuery != null) {
      return _myUserQuery;
    } else {
      synchronized(this) {
        if(_myUserQuery == null) {
          _myUserQuery = new MyUserQuery_Impl(this);
        }
        return _myUserQuery;
      }
    }
  }

  @Override
  public MySubjectQuery getMySubjectQuery() {
    if (_mySubjectQuery != null) {
      return _mySubjectQuery;
    } else {
      synchronized(this) {
        if(_mySubjectQuery == null) {
          _mySubjectQuery = new MySubjectQuery_Impl(this);
        }
        return _mySubjectQuery;
      }
    }
  }

  @Override
  public MyTaskQuery getMyTaskQuery() {
    if (_myTaskQuery != null) {
      return _myTaskQuery;
    } else {
      synchronized(this) {
        if(_myTaskQuery == null) {
          _myTaskQuery = new MyTaskQuery_Impl(this);
        }
        return _myTaskQuery;
      }
    }
  }
}
