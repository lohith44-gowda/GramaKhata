<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FFFFFF"
    android:fillViewport="true">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <!-- Top orange header block -->
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="240dp"
            android:orientation="vertical"
            android:gravity="center"
            android:background="#E65100">

            <!-- App Icon Box -->
            <LinearLayout
                android:layout_width="80dp"
                android:layout_height="80dp"
                android:background="#FFFFFF"
                android:gravity="center">
                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="GK"
                    android:textSize="30sp"
                    android:textStyle="bold"
                    android:textColor="#E65100"/>
            </LinearLayout>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Grama-Khata"
                android:textSize="26sp"
                android:textStyle="bold"
                android:textColor="#FFFFFF"
                android:layout_marginTop="12dp"/>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Digital Ledger for Village Shops"
                android:textSize="13sp"
                android:textColor="#FFE0B2"/>
        </LinearLayout>

        <!-- White card form -->
        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:padding="24dp"
            android:background="#FFFFFF">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Login to your account"
                android:textSize="18sp"
                android:textStyle="bold"
                android:textColor="#212121"
                android:layout_marginBottom="20dp"/>

            <!-- Phone -->
            <com.google.android.material.textfield.TextInputLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="Phone Number"
                style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox">
                <com.google.android.material.textfield.TextInputEditText
                    android:id="@+id/etPhone"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:inputType="phone"
                    android:maxLength="10"/>
            </com.google.android.material.textfield.TextInputLayout>

            <!-- Password row -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:layout_marginTop="14dp">

                <com.google.android.material.textfield.TextInputLayout
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:hint="Password"
                    style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox">
                    <com.google.android.material.textfield.TextInputEditText
                        android:id="@+id/etPassword"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:inputType="textPassword"/>
                </com.google.android.material.textfield.TextInputLayout>

                <Button
                    android:id="@+id/btnTogglePassword"
                    android:layout_width="64dp"
                    android:layout_height="56dp"
                    android:text="SHOW"
                    android:textSize="10sp"
                    android:layout_marginStart="6dp"
                    android:layout_gravity="center_vertical"
                    android:backgroundTint="#F5F5F5"
                    android:textColor="#E65100"/>
            </LinearLayout>

            <TextView
                android:id="@+id/tvForgotPassword"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_gravity="end"
                android:layout_marginTop="6dp"
                android:text="Forgot Password?"
                android:textColor="#E65100"
                android:textSize="13sp"
                android:padding="4dp"/>

            <Button
                android:id="@+id/btnLogin"
                android:layout_width="match_parent"
                android:layout_height="52dp"
                android:layout_marginTop="20dp"
                android:text="LOGIN"
                android:textSize="15sp"
                android:textStyle="bold"
                android:backgroundTint="#E65100"
                android:textColor="#FFFFFF"/>

            <!-- Divider -->
            <View
                android:layout_width="match_parent"
                android:layout_height="1dp"
                android:background="#E0E0E0"
                android:layout_marginVertical="20dp"/>

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Don't have an account?"
                android:textColor="#757575"
                android:textSize="13sp"
                android:layout_gravity="center"/>

            <Button
                android:id="@+id/tvRegister"
                android:layout_width="match_parent"
                android:layout_height="48dp"
                android:layout_marginTop="8dp"
                android:text="CREATE NEW ACCOUNT"
                android:textSize="13sp"
                android:textStyle="bold"
                android:backgroundTint="#FFFFFF"
                android:textColor="#E65100"
                android:strokeColor="#E65100"/>

        </LinearLayout>
    </LinearLayout>
</ScrollView>
