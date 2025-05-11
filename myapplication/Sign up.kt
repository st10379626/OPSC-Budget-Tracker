<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/textView3"
        android:layout_width="130dp"
        android:layout_height="40dp"
        android:layout_marginStart="32dp"
        android:layout_marginTop="76dp"
        android:text="@string/confirm_password"
        android:textSize="16sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView2" />

    <TextView
        android:id="@+id/textView5"
        android:layout_width="176dp"
        android:layout_height="52dp"
        android:layout_marginStart="112dp"
        android:layout_marginTop="60dp"
        android:fontFamily="cursive"
        android:text="@string/sign_up_page"
        android:textAlignment="textStart"
        android:textSize="34sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <EditText
        android:id="@+id/editUserText"
        android:layout_width="192dp"
        android:layout_height="41dp"
        android:layout_marginTop="40dp"
        android:layout_marginEnd="24dp"
        android:ems="10"
        android:inputType="text"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.797"
        app:layout_constraintStart_toEndOf="@+id/textView"
        app:layout_constraintTop_toBottomOf="@+id/textView5"
        tools:ignore="Autofill,LabelFor" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="32dp"
        android:layout_marginTop="40dp"
        android:text="@string/user_name"
        android:textSize="16sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView5" />

    <TextView
        android:id="@+id/textView2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="36dp"
        android:layout_marginTop="80dp"
        android:text="@string/password"
        android:textSize="16sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView" />

    <EditText
        android:id="@+id/editPassword"
        android:layout_width="202dp"
        android:layout_height="43dp"
        android:layout_marginTop="60dp"
        android:layout_marginEnd="24dp"
        android:ems="10"
        android:inputType="textPassword"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.857"
        app:layout_constraintStart_toEndOf="@+id/textView2"
        app:layout_constraintTop_toBottomOf="@+id/editUserText"
        tools:ignore="Autofill,LabelFor" />

    <TextView
        android:id="@+id/textView3"
        android:layout_width="130dp"
        android:layout_height="40dp"
        android:layout_marginStart="32dp"
        android:layout_marginTop="76dp"
        android:text="@string/confirm_password"
        android:textSize="16sp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView2" />

    <EditText
        android:id="@+id/editConfirmPassword2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="20dp"
        android:layout_marginTop="52dp"
        android:ems="10"
        android:inputType="textPassword"
        app:layout_constraintStart_toEndOf="@+id/textView3"
        app:layout_constraintTop_toBottomOf="@+id/editPassword"
        tools:ignore="Autofill,LabelFor" />

    <Button
        android:id="@+id/btnSubmit"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="48dp"
        android:layout_marginTop="80dp"
        android:onClick="OpenLogin"
        android:text="@string/submit"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editEmail" />

    <Button
        android:id="@+id/btnRest"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="136dp"
        android:layout_marginTop="184dp"
        android:text="@string/cancel"
        app:layout_constraintStart_toEndOf="@+id/btnSubmit"
        app:layout_constraintTop_toBottomOf="@+id/editConfirmPassword2" />

    <EditText
        android:id="@+id/editEmail"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="36dp"
        android:layout_marginTop="59dp"
        android:ems="10"
        android:inputType="text"
        android:text="Enter Email"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editConfirmPassword2" />

</androidx.constraintlayout.widget.ConstraintLayout>

