<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/chartsButton"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@android:color/darker_gray">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:background="@android:color/holo_orange_dark"
        android:orientation="vertical"
        android:padding="16dp">

        <!-- Top Bar -->
        <TextView
            android:id="@+id/appTitle"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:background="@android:color/black"
            android:gravity="center"
            android:padding="12dp"
            android:text="WalletWise"
            android:textColor="@android:color/white"
            android:textSize="20sp" />

        <!-- Budget Header -->
        <TextView
            android:id="@+id/budgetLabel"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_gravity="center"
            android:background="@android:color/darker_gray"
            android:padding="8dp"
            android:text="BUDGET"
            android:textColor="#4E342E"
            android:textSize="18sp" />

        <!-- Account Balances -->
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:background="@android:color/white"
            android:orientation="vertical"
            android:padding="12dp">

            <TextView android:text="Total balance: 66.28 ZAR" />

            <TextView
                android:text="FNB account: 423.55"
                android:textColor="@android:color/holo_red_dark" />

            <TextView
                android:text="CAPITEC account: 577.45"
                android:textColor="@android:color/holo_red_dark" />

            <TextView android:text="Cash: 0" />
        </LinearLayout>

        <!-- Tabs -->
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="12dp"
            android:orientation="horizontal"
            android:weightSum="3">

            <Button
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:text="Transactions" />

            <Button
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:background="@android:color/darker_gray"
                android:text="Expenses"
                android:textColor="#4E342E" />

            <Button
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:text="Goals" />
        </LinearLayout>

        <!-- Expenses List -->
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="12dp"
            android:text="To be paid"
            android:textStyle="bold" />

        <!-- Expense Items -->
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <TextView
                android:padding="4dp"
                android:text="✔ Total loans - 10000 rands" />

            <TextView
                android:padding="4dp"
                android:text="✔ Health - 1000 rands" />

            <TextView
                android:padding="4dp"
                android:text="✔ Education - 500 rands" />

            <TextView
                android:padding="4dp"
                android:text="✔ Bills - 550 rands" />

            <TextView
                android:padding="4dp"
                android:text="✔ Subscriptions - 50 rands" />
        </LinearLayout>

        <!-- View Charts Button -->
        <Button
            android:id="@+id/chartsButton"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="16dp"
            android:background="@android:color/black"
            android:text="View Charts"
            android:textColor="@android:color/white"
            tools:ignore="DuplicateIds,HardcodedText" />
    </LinearLayout>
</ScrollView>
