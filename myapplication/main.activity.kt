<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@drawable/gradient_background">

    <!-- App Bar -->
    <TextView
        android:id="@+id/topBar"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:background="@android:color/black"
        android:text="WalletWise"
        android:textColor="@android:color/white"
        android:gravity="center"
        android:textSize="18sp" />

    <!-- Gradient Card -->
    <LinearLayout
        android:id="@+id/settingsContainer"
        android:layout_below="@id/topBar"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@drawable/gradient_settings_card"
        android:orientation="vertical"
        android:padding="24dp">

        <!-- Back Arrow and Title -->
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:gravity="center_vertical">

            <ImageView
                android:layout_width="24dp"
                android:layout_height="24dp"
                android:src="@android:drawable/ic_media_previous"
                android:tint="@android:color/white" />

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Settings"
                android:textSize="20sp"
                android:textColor="@android:color/white"
                android:layout_marginStart="16dp" />
        </LinearLayout>

        <!-- Settings Options -->
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:layout_marginTop="32dp">

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:padding="12dp"
                android:gravity="center_vertical">

                <ImageView
                    android:layout_width="24dp"
                    android:layout_height="24dp"
                    android:src="@android:drawable/ic_menu_manage"
                    android:tint="@android:color/white" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="PIN Security"
                    android:textColor="@android:color/white"
                    android:layout_marginStart="16dp"
                    android:textSize="16sp" />
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:padding="12dp"
                android:gravity="center_vertical">

                <ImageView
                    android:layout_width="24dp"
                    android:layout_height="24dp"
                    android:src="@android:drawable/ic_dialog_alert"
                    android:tint="#F44336" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Reminder"
                    android:textColor="@android:color/white"
                    android:layout_marginStart="16dp"
                    android:textSize="16sp" />
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:padding="12dp"
                android:gravity="center_vertical">

                <ImageView
                    android:layout_width="24dp"
                    android:layout_height="24dp"
                    android:src="@android:drawable/stat_sys_upload"
                    android:tint="@android:color/white" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Cloud Data"
                    android:textColor="@android:color/white"
                    android:layout_marginStart="16dp"
                    android:textSize="16sp" />
            </LinearLayout>

            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:padding="12dp"
                android:gravity="center_vertical">

                <ImageView
                    android:layout_width="24dp"
                    android:layout_height="24dp"
                    android:src="@android:drawable/ic_menu_gallery"
                    android:tint="@android:color/white" />

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Theme"
                    android:textColor="@android:color/white"
                    android:layout_marginStart="16dp"
                    android:textSize="16sp" />
            </LinearLayout>
        </LinearLayout>
    </LinearLayout>
</RelativeLayout>