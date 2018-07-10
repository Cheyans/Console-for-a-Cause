import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.components.ApplicationComponent;
import com.intellij.openapi.wm.impl.IdeBackgroundUtil;

public class ConsoleForACausePlugin implements ApplicationComponent {

    private final static String DEFAULT = "/Users/cheyans/Downloads/marvel-avengers-infinity-war-thanos-sixth-scale-figure-hot-toys-feature-903429-1.jpg";

    @Override
    public void initComponent() {
        PropertiesComponent prop = PropertiesComponent.getInstance();
        prop.setValue(IdeBackgroundUtil.FRAME_PROP, null);
        prop.setValue(IdeBackgroundUtil.EDITOR_PROP, DEFAULT);
        IdeBackgroundUtil.repaintAllWindows();
    }

    @Override
    public void disposeComponent() {
    }
}
