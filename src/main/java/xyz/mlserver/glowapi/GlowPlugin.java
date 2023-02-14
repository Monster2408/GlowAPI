package xyz.mlserver.glowapi;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.mlserver.apimanager.APIManager;

public class GlowPlugin extends JavaPlugin {

    static GlowPlugin instance;
    GlowAPI glowAPI = new GlowAPI();

    @Override
    public void onLoad() {
        instance = this;
        //Register this API if the plugin got loaded
        APIManager.registerAPI(glowAPI, this);
    }

    @Override
    public void onEnable() {
//        new MetricsLite(this);

        //Initialize this API of the plugin got loaded
        APIManager.initAPI(GlowAPI.class);
    }

}