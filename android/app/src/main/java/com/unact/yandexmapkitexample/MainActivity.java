package com.unact.yandexmapkitexample;

import androidx.annotation.NonNull;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

import com.yandex.mapkit.MapKitFactory;

public class MainActivity extends FlutterActivity {
  @Override
  public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
    MapKitFactory.setLocale("YOUR_LOCALE");
    MapKitFactory.setApiKey("be551cee-886d-4e2f-9b08-96663b9045cf");
    super.configureFlutterEngine(flutterEngine);
  }
}
