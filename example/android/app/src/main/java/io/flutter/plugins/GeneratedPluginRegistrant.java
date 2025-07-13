package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import dev.flutter.plugins.integration_test.IntegrationTestPlugin;
import com.afonsoraposo.camera.CameraPlugin;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    IntegrationTestPlugin.registerWith(registry.registrarFor("dev.flutter.plugins.integration_test.IntegrationTestPlugin"));
    CameraPlugin.registerWith(registry.registrarFor("com.afonsoraposo.camera.CameraPlugin"));
    PathProviderPlugin.registerWith(registry.registrarFor("io.flutter.plugins.pathprovider.PathProviderPlugin"));
    VideoPlayerPlugin.registerWith(registry.registrarFor("io.flutter.plugins.videoplayer.VideoPlayerPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
