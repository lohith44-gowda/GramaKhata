<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:padding="20dp"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:background="#FFFFFF">

    <!-- Photo preview -->
    <ImageView
        android:id="@+id/ivCustomerPhoto"
        android:layout_width="80dp"
        android:layout_height="80dp"
        android:layout_gravity="center"
        android:scaleType="centerCrop"
        android:background="#EEEEEE"
        android:visibility="gone"/>

    <!-- Photo buttons -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:layout_marginTop="8dp"
        android:gravity="center">

        <Button
            android:id="@+id/btnCamera"
            android:layout_width="0dp"
            android:layout_height="38dp"
            android:layout_weight="1"
            android:text="Camera"
            android:textSize="12sp"
            android:backgroundTint="#E65100"
            android:textColor="#FFFFFF"/>

        <Button
            android:id="@+id/btnGallery"
            android:layout_width="0dp"
            android:layout_height="38dp"
            android:layout_weight="1"
            android:layout_marginStart="8dp"
            android:text="Gallery"
            android:textSize="12sp"
            android:backgroundTint="#757575"
            android:textColor="#FFFFFF"/>
    </LinearLayout>

    <com.google.android.material.textfield.TextInputLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Customer Name"
        android:layout_marginTop="16dp"
        style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox">
        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etName"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="textCapWords"/>
    </com.google.android.material.textfield.TextInputLayout>

    <com.google.android.material.textfield.TextInputLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:hint="Phone Number"
        android:layout_marginTop="12dp"
        style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox">
        <com.google.android.material.textfield.TextInputEditText
            android:id="@+id/etPhone"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:inputType="phone"
            android:maxLength="10"/>
    </com.google.android.material.textfield.TextInputLayout>
</LinearLayout>
