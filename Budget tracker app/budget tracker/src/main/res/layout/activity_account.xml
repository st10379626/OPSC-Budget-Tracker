<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="@android:color/white">

    <!-- Header -->
    <RelativeLayout
        android:layout_width="match_parent"
        android:layout_height="150dp"
        android:background="#1A3A5D"
        android:padding="16dp">

        <ImageView
            android:id="@+id/profile_image"
            android:layout_width="64dp"
            android:layout_height="64dp"
            android:layout_alignParentStart="true"
            android:src="@drawable/ic_profile_placeholder"
            android:scaleType="centerCrop"
            android:background="@drawable/circle_background" />

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:layout_toEndOf="@id/profile_image"
            android:layout_marginStart="16dp"
            android:layout_centerVertical="true">

            <TextView
                android:id="@+id/profile_name"
                android:text="Matthew Ratsela"
                android:textColor="@android:color/white"
                android:textSize="18sp"
                android:textStyle="bold"  android:layout_height="180dp"/>

            <TextView
                android:id="@+id/profile_email"
                android:text="mratsela@gmail.com"
                android:textColor="@android:color/white"
                android:textSize="14sp" />
        </LinearLayout>
    </RelativeLayout>

    <!-- Options -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="16dp"
        android:background="@android:color/transparent">

        <TextView android:text="Accounts" style="@style/MenuItem"/>
        <TextView android:text="My household" style="@style/MenuItem"/>
        <TextView android:text="Income" style="@style/MenuItem"/>
        <TextView android:text="Help" style="@style/MenuItem"/>
        <TextView android:text="Settings" style="@style/MenuItem"/>
    </LinearLayout>

    <!-- Bottom Navigation -->
    <com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/bottom_navigation"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_gravity="bottom"
        android:background="?android:attr/windowBackground"
        app:menu="@menu/bottom_nav_menu" />
</LinearLayout>
