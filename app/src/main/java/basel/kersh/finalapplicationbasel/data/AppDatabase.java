package basel.kersh.finalapplicationbasel.data;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import basel.kersh.finalapplicationbasel.data.MyTaskTable.MyTask;
import basel.kersh.finalapplicationbasel.data.MyTaskTable.MyTaskQuery;
import basel.kersh.finalapplicationbasel.data.MyUserTable.MyUserQuery;
import basel.kersh.finalapplicationbasel.data.mySubjectTable.MySubjectQuery;


    /**
     * @Database(entities = {MyUser.class, MySubject.class, MyTask.class}, version = 1)


     */
    public abstract class AppDatabase extends RoomDatabase {

        /**
         * * التعامل مع قاعدة البيانات
         */

        private static AppDatabase db;

        /**
         * * إنشاء قاعدة البيانات
         * * @return
         */
        public abstract MyUserQuery getMyUserQuery();

        /**
         * * يوجد كائن لعمليات جدول الموضوع
         * * @return
         */
        public abstract MySubjectQuery getMySubjectQuery();

        /**
         * * يوجد كائن لعمليات جدول المهام
         * * @return
         */
        public abstract MyTaskQuery getMyTaskQuery();

        /**
         * * بناء قاعدة البيانات وعادةً يكون جزءًا منها
         * * @param context
         * @return
         */
        public static AppDatabase getDB(Context context){
            if(db==null)
            {
                db = Room.databaseBuilder(context,
                                AppDatabase.class,
                                "samihDatabase") // اسم قاعدة البيانات
                        .fallbackToDestructiveMigration()
                        .allowMainThreadQueries()
                        .build();
            }
            return db;
        }
        public MyTaskQuery MyTaskQuery() {
        }
    }

