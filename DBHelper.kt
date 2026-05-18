<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:orientation="vertical"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#F7F7F7">

    <!-- Header -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical"
        android:background="#E65100"
        android:paddingHorizontal="16dp"
        android:paddingTop="10dp"
        android:paddingBottom="14dp">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal"
            android:gravity="center_vertical">

            <Button
                android:id="@+id/btnBack"
                android:layout_width="40dp"
                android:layout_height="40dp"
                android:text="&#8592;"
                android:textSize="18sp"
                android:backgroundTint="@android:color/transparent"
                android:textColor="#FFFFFF"
                android:padding="0dp"/>

            <LinearLayout
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:orientation="vertical"
                android:layout_marginStart="4dp">

                <TextView
                    android:id="@+id/tvName"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:textSize="18sp"
                    android:textStyle="bold"
                    android:textColor="#FFFFFF"/>

                <TextView
                    android:id="@+id/tvPhone"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:textColor="#FFE0B2"
                    android:textSize="12sp"/>
            </LinearLayout>
        </LinearLayout>

        <!-- Balance chip -->
        <TextView
            android:id="@+id/tvBalance"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="20sp"
            android:textStyle="bold"
            android:textColor="#FFFF00"
            android:layout_marginTop="8dp"
            android:layout_marginStart="44dp"/>
    </LinearLayout>

    <!-- Give / Take -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:padding="12dp"
        android:background="#FFFFFF">

        <Button
            android:id="@+id/btnGive"
            android:layout_width="0dp"
            android:layout_height="48dp"
            android:layout_weight="1"
            android:text="Give Credit"
            android:backgroundTint="#D32F2F"
            android:textColor="#FFFFFF"
            android:textSize="13sp"/>

        <Button
            android:id="@+id/btnTake"
            android:layout_width="0dp"
            android:layout_height="48dp"
            android:layout_weight="1"
            android:layout_marginStart="10dp"
            android:text="Receive Payment"
            android:backgroundTint="#388E3C"
            android:textColor="#FFFFFF"
            android:textSize="13sp"/>
    </LinearLayout>

    <!-- Action buttons -->
    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal"
        android:paddingHorizontal="12dp"
        android:paddingBottom="8dp"
        android:background="#FFFFFF">

        <Button
            android:id="@+id/btnWhatsApp"
            android:layout_width="0dp"
            android:layout_height="40dp"
            android:layout_weight="1"
            android:text="WhatsApp"
            android:backgroundTint="#25D366"
            android:textColor="#FFFFFF"
            android:textSize="12sp"/>

        <Button
            android:id="@+id/btnReport"
            android:layout_width="0dp"
            android:layout_height="40dp"
            android:layout_weight="1"
            android:layout_marginStart="10dp"
            android:text="Report"
            android:backgroundTint="#E65100"
            android:textColor="#FFFFFF"
            android:textSize="12sp"/>
    </LinearLayout>

    <!-- Divider + label -->
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="TRANSACTION HISTORY"
        android:textSize="11sp"
        android:textStyle="bold"
        android:textColor="#AAAAAA"
        android:background="#F7F7F7"
        android:paddingHorizontal="12dp"
        android:paddingVertical="8dp"/>

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/recyclerTransactions"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"/>

</LinearLayout>
