<?xml version="1.0" encoding="utf-8"?>

<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/mainLayout"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:background="#FF6F00"
    android:padding="16dp"
    tools:context=".MainActivity">

    <!-- BUDGET Header -->
    <TextView
        android:id="@+id/budgetHeader"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:layout_marginBottom="8dp"
        android:background="#FFFFFF"
        android:padding="8dp"
        android:text="BUDGET"
        android:textColor="#FF6F00"
        android:textSize="24sp"
        android:textStyle="bold"
        tools:ignore="TextContrastCheck" />

    <!-- Account Balances -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:background="#FFFFFF"
        android:padding="12dp"
        android:layout_marginBottom="12dp">

        <TextView
            android:id="@+id/totalBalance"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Total balance: 60.28 RON"
            android:textColor="#000000" />

        <TextView
            android:id="@+id/fnbAccount"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="FNB account: 423.55"
            android:textColor="#0000FF" />

        <TextView
            android:id="@+id/capitecAccount"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="CAPITEC account: 577.45"
            android:textColor="#FF0000" />

        <TextView
            android:id="@+id/cash"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Cash: 0"
            android:textColor="#000000" />
    </LinearLayout>

    <!-- Tabs: Transactions | Expenses | Goals -->
    <LinearLayout
        android:id="@+id/tabs"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:gravity="center"
        android:background="#DDDDDD"
        android:layout_marginBottom="8dp">

        <Button
            android:id="@+id/btnTransactions"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content"
            android:text="Transactions"
            android:backgroundTint="#C62828"
            android:textColor="#FFFFFF" />

        <Button
            android:id="@+id/btnExpenses"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content"
            android:text="Expenses"
            android:backgroundTint="#FFFFFF"
            android:textColor="#000000" />

        <Button
            android:id="@+id/btnGoals"
            android:layout_width="0dp"
            android:layout_weight="1"
            android:layout_height="wrap_content"
            android:text="Goals"
            android:backgroundTint="#FFFFFF"
            android:textColor="#000000" />
    </LinearLayout>

    <!-- RecyclerView for transactions -->
    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/transactionList"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"
        android:background="#FFFFFF"
        android:padding="8dp" />

    <!-- See All Button -->
    <TextView
        android:id="@+id/seeAll"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="See all"
        android:textColor="#FFFFFF"
        android:layout_gravity="center_horizontal"
        android:layout_marginTop="8dp" />

</LinearLayout>
