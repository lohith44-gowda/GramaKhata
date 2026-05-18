<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#FFF8E1">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:padding="24dp">

        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="🔐 Forgot Password"
            android:textSize="26sp"
            android:textStyle="bold"
            android:textColor="#E65100"/>

        <TextView
            android:id="@+id/tvStep"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="Step 1 of 3"
            android:textSize="13sp"
            android:textColor="#888888"
            android:layout_marginBottom="24dp"/>

        <!-- STEP 1: Phone Number -->
        <LinearLayout
            android:id="@+id/layoutPhone"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Enter your registered phone number.\nWe will send an OTP to verify your identity."
                android:textSize="14sp"
                android:textColor="#555555"
                android:layout_marginBottom="16dp"/>

            <com.google.android.material.textfield.TextInputLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="📞 Registered Phone Number"
                style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox">
                <com.google.android.material.textfield.TextInputEditText
                    android:id="@+id/etPhone"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:inputType="phone"
                    android:maxLength="10"/>
            </com.google.android.material.textfield.TextInputLayout>

            <Button
                android:id="@+id/btnSendOtp"
                android:layout_width="match_parent"
                android:layout_height="56dp"
                android:layout_marginTop="20dp"
                android:text="📨 SEND OTP"
                android:textStyle="bold"
                android:backgroundTint="#E65100"
                android:textColor="#FFFFFF"/>
        </LinearLayout>

        <!-- STEP 2: OTP Verification -->
        <LinearLayout
            android:id="@+id/layoutOtp"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:visibility="gone">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Enter the 6-digit OTP sent to your phone via WhatsApp/SMS."
                android:textSize="14sp"
                android:textColor="#555555"
                android:layout_marginBottom="16dp"/>

            <com.google.android.material.textfield.TextInputLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:hint="🔢 Enter 6-digit OTP"
                style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox">
                <com.google.android.material.textfield.TextInputEditText
                    android:id="@+id/etOtp"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:inputType="number"
                    android:maxLength="6"
                    android:letterSpacing="0.5"
                    android:textSize="22sp"
                    android:gravity="center"/>
            </com.google.android.material.textfield.TextInputLayout>

            <TextView
                android:id="@+id/tvOtpTimer"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginTop="8dp"
                android:text="OTP expires in 05:00"
                android:textColor="#E65100"
                android:textStyle="bold"/>

            <Button
                android:id="@+id/btnVerifyOtp"
                android:layout_width="match_parent"
                android:layout_height="56dp"
                android:layout_marginTop="16dp"
                android:text="✅ VERIFY OTP"
                android:textStyle="bold"
                android:backgroundTint="#E65100"
                android:textColor="#FFFFFF"/>

            <Button
                android:id="@+id/btnResendOtp"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginTop="8dp"
                android:text="🔄 Resend OTP"
                android:backgroundTint="#FF6F00"
                android:textColor="#FFFFFF"
                android:visibility="gone"/>
        </LinearLayout>

        <!-- STEP 3: New Password -->
        <LinearLayout
            android:id="@+id/layoutReset"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:visibility="gone">

            <TextView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:text="Create a strong new password:\n• Start with a Capital letter\n• Include a number (0-9)\n• Include a special character (!@#$)"
                android:textSize="13sp"
                android:textColor="#555555"
                android:background="#FFF3E0"
                android:padding="12dp"
                android:layout_marginBottom="16dp"/>

            <!-- New Password -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal">

                <com.google.android.material.textfield.TextInputLayout
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:hint="🔒 New Password"
                    style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox">
                    <com.google.android.material.textfield.TextInputEditText
                        android:id="@+id/etNewPassword"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:inputType="textPassword"/>
                </com.google.android.material.textfield.TextInputLayout>

                <Button
                    android:id="@+id/btnToggleNew"
                    android:layout_width="48dp"
                    android:layout_height="56dp"
                    android:text="👁️"
                    android:layout_marginStart="4dp"
                    android:layout_gravity="center_vertical"
                    android:backgroundTint="@android:color/transparent"
                    android:textSize="20sp"/>
            </LinearLayout>

            <!-- Confirm Password -->
            <LinearLayout
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:orientation="horizontal"
                android:layout_marginTop="12dp">

                <com.google.android.material.textfield.TextInputLayout
                    android:layout_width="0dp"
                    android:layout_height="wrap_content"
                    android:layout_weight="1"
                    android:hint="🔒 Confirm New Password"
                    style="@style/Widget.MaterialComponents.TextInputLayout.OutlinedBox">
                    <com.google.android.material.textfield.TextInputEditText
                        android:id="@+id/etConfirmNewPassword"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:inputType="textPassword"/>
                </com.google.android.material.textfield.TextInputLayout>

                <Button
                    android:id="@+id/btnToggleConfirm"
                    android:layout_width="48dp"
                    android:layout_height="56dp"
                    android:text="👁️"
                    android:layout_marginStart="4dp"
                    android:layout_gravity="center_vertical"
                    android:backgroundTint="@android:color/transparent"
                    android:textSize="20sp"/>
            </LinearLayout>

            <Button
                android:id="@+id/btnResetPassword"
                android:layout_width="match_parent"
                android:layout_height="56dp"
                android:layout_marginTop="20dp"
                android:text="🔐 RESET PASSWORD"
                android:textStyle="bold"
                android:backgroundTint="#E65100"
                android:textColor="#FFFFFF"/>
        </LinearLayout>

        <TextView
            android:id="@+id/tvBackToLogin"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="20dp"
            android:text="← Back to Login"
            android:textColor="#E65100"
            android:padding="8dp"/>

    </LinearLayout>
</ScrollView>
