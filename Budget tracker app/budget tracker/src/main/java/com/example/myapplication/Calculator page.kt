<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".Calculator">

    <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
        android:orientation="vertical"
        android:gravity="center"
        android:padding="16dp"
        android:layout_width="match_parent"
        android:layout_height="match_parent">

        <!-- Display -->
        <TextView
            android:id="@+id/tvDisplay"
            android:text="0"
            android:textSize="32sp"
            android:gravity="end"
            android:background="#EEEEEE"
            android:padding="16dp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content" />

        <!-- Buttons Grid -->
        <GridLayout
            android:id="@+id/gridLayout"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="24dp"
            android:columnCount="4"
            android:rowCount="5"
            android:alignmentMode="alignMargins"
            android:rowOrderPreserved="false"
            android:useDefaultMargins="true">

            <!-- Row 1 -->
            <Button android:id="@+id/btnClear" android:text="C"/>
            <Button android:id="@+id/btnDivide" android:text="÷"/>
            <Button android:id="@+id/btnMultiply" android:text="×"/>
            <Button android:id="@+id/btnDelete" android:text="⌫"/>

            <!-- Row 2 -->
            <Button android:id="@+id/btn7" android:text="7"/>
            <Button android:id="@+id/btn8" android:text="8"/>
            <Button android:id="@+id/btn9" android:text="9"/>
            <Button android:id="@+id/btnSubtract" android:text="-"/>

            <!-- Row 3 -->
            <Button android:id="@+id/btn4" android:text="4"/>
            <Button android:id="@+id/btn5" android:text="5"/>
            <Button android:id="@+id/btn6" android:text="6"/>
            <Button android:id="@+id/btnAdd" android:text="+"/>

            <!-- Row 4 -->
            <Button android:id="@+id/btn1" android:text="1"/>
            <Button android:id="@+id/btn2" android:text="2"/>
            <Button android:id="@+id/btn3" android:text="3"/>
            <Button android:id="@+id/btnEquals" android:text="="/>

            <!-- Row 5 -->
            <Button android:id="@+id/btn0" android:text="0"/>
            <Button android:id="@+id/btnDot" android:text="."/>
        </GridLayout>
    </LinearLayout>

