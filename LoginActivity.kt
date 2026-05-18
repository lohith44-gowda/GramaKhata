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

            <TextView
                android:id="@+id/tvShopName"
                android:layout_width="0dp"
                android:layout_height="wrap_content"
                android:layout_weight="1"
                android:text="Due Dashboard"
                android:textSize="18sp"
                android:textStyle="bold"
                android:textColor="#FFFFFF"
                android:layout_marginStart="4dp"/>
        </LinearLayout>

        <TextView
            android:id="@+id/tvTotalDue"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textSize="18sp"
            android:textStyle="bold"
            android:textColor="#FFFF00"
            android:layout_marginTop="4dp"
            android:layout_marginStart="44dp"/>

        <TextView
            android:id="@+id/tvCustomerCount"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:textColor="#FFE0B2"
            android:textSize="12sp"
            android:layout_marginStart="44dp"/>
    </LinearLayout>

    <!-- Section label -->
    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="CUSTOMERS WITH DUES"
        android:textSize="11sp"
        android:textStyle="bold"
        android:textColor="#AAAAAA"
        android:paddingHorizontal="12dp"
        android:paddingVertical="10dp"/>

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/rvDue"
        android:layout_width="match_parent"
        android:layout_height="0dp"
        android:layout_weight="1"/>

    <Button
        android:id="@+id/btnGenerateReport"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_margin="12dp"
        android:text="GENERATE DAILY REPORT"
        android:textSize="13sp"
        android:textStyle="bold"
        android:backgroundTint="#E65100"
        android:textColor="#FFFFFF"/>
</LinearLayout>
