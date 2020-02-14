<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/colorPrimaryDark"
    tools:context=".Main4Activity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="horizontal">

            <ImageView
                android:id="@+id/imageView26"
                android:layout_width="186dp"
                android:layout_height="match_parent"
                android:layout_weight="1"
                app:srcCompat="@drawable/mex" />

            <ImageView
                android:id="@+id/imageView27"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginRight="10dp"
                android:layout_weight="1"
                app:srcCompat="@android:drawable/bottom_bar" />

            <ImageView
                android:id="@+id/imageView28"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginRight="10dp"
                android:layout_weight="1"
                app:srcCompat="@android:drawable/bottom_bar" />
        </LinearLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:orientation="horizontal">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:orientation="vertical">

                <ImageView
                    android:id="@+id/imageView29"
                    android:layout_width="70dp"
                    android:layout_height="70dp"

                    app:srcCompat="@drawable/firewall" />

                <TextView
                    android:id="@+id/textView4"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:text="Firewall"
                    android:textAlignment="center"
                    app:fontFamily="sans-serif-black" />

                <ImageView
                    android:id="@+id/imageView30"
                    android:layout_width="match_parent"
                    android:layout_height="40dp"
                    app:srcCompat="@drawable/medio" />
            </LinearLayout>
        </LinearLayout>

        <LinearLayout
            android:layout_width="wrap_content"
            android:layout_height="match_parent"
            android:layout_gravity="center"
            android:layout_marginTop="10dp"
            android:orientation="horizontal">

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:gravity="center"
                android:orientation="vertical">

                <ImageView
                    android:id="@+id/imageView33"
                    android:layout_width="70dp"
                    android:layout_height="70dp"
                    app:srcCompat="@drawable/icono4" />

                <TextView
                    android:id="@+id/textView9"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:text="Youtube"
                    android:textAlignment="center"
                    app:fontFamily="sans-serif-black" />

                <ImageView
                    android:id="@+id/imageView34"
                    android:layout_width="match_parent"
                    android:layout_height="40dp"
                    app:srcCompat="@drawable/low" />

            </LinearLayout>

            <LinearLayout
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_marginLeft="30dp"
                android:orientation="vertical">

                <ImageView
                    android:id="@+id/imageView35"
                    android:layout_width="70dp"
                    android:layout_height="70dp"
                    app:srcCompat="@drawable/icono5" />

                <TextView
                    android:id="@+id/textView10"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:text="Facebook"
                    android:textAlignment="center"
                    app:fontFamily="sans-serif-black" />

                <ImageView
                    android:id="@+id/imageView36"
                    android:layout_width="match_parent"
                    android