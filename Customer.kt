<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FFFFFF">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="120dp"
            android:background="#E65100"
            android:gravity="center_vertical"
            android:paddingHorizontal="20dp">
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="vertical">
                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Shop Details"
                    android:textSize="22sp"
                    android:textStyle="bold"
                    android:textColor="#FFFFFF"/>
                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="Step 2 of 2 — Store information"
                    android:textColor="#FFE0B2"
                    android:textSize="13sp"/>
                <TextView
                    android:id="@+id/tvPhone"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:textColor="#FFCC80"
                    android:textSize="12sp"/>
            </LinearLayout>
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:padding="24dp">

            <com.google.android.material.textfield.TextInputLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Store / Shop Name"
                style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox">
                <com.google.android.material.textfield.TextInputEditText
                    android:id="@+id/etStoreName"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:inputType="textCapWords"/>
            </com.google.android.material.textfield.TextInputLayout>

            <com.google.android.material.textfield.TextInputLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Place / City / Village"
                android:layout_marginTop="14dp"
                style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox">
                <com.google.android.material.textfield.TextInputEditText
                    android:id="@+id/etStorePlace"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:inputType="textCapWords"/>
            </com.google.android.material.textfield.TextInputLayout>

            <Button
                android:id="@+id/btnRegister"
                android:layout_width="match_parent"
                android:layout_height="52dp"
                android:layout_marginTop="28dp"
                android:text="COMPLETE REGISTRATION"
                android:textSize="14sp"
                android:textStyle="bold"
                android:backgroundTint="#E65100"
                android:textColor="#FFFFFF"/>
        </LinearLayout>
    </LinearLayout>
</ScrollView>
