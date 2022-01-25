package Adapter;

/**
 * CnHome就是具体需求的原因，因为cnhome只支持CnPlugin，所以里面会有CnPluginInterface 属性，但是没有EnPluginInterface属性。
 */
public class CnHome {
    private CnPlugInterface cnPlugin;

    public CnHome() { }

    public CnHome(CnPlugInterface cnPlugin) {
        this.cnPlugin = cnPlugin;
    }

    public void setPlugin(CnPlugInterface cnPlugin) {
        this.cnPlugin = cnPlugin;
    }

    //activity
    public void charge() {
        //charge with cn standard plugins
        cnPlugin.chargeWith2Pins();
    }
}
