package Adapter;

public class PluginAdapter implements CnPlugInterface{
    //因为要实现英标充电方法，所以需要一个Enplugin, 注意这里的interface其实是一类Enplugin，本质含义更接近父类而不是接口。
    private EnPluginInterface enplugin;

    public void setEnplugin(EnPluginInterface enplugin) {
        this.enplugin = enplugin;
    }

    public PluginAdapter() {}

    public PluginAdapter(EnPluginInterface enplugin) {
        setEnplugin(enplugin);
    }

    //重点，让继承国标的适配器在国标充电方法中调用英标充电方法
    @Override
    public void chargeWith2Pins(){
        enplugin.chargeWith3Pins();
    }
}
