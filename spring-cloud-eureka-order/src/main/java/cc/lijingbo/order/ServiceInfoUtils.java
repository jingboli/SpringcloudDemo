package cc.lijingbo.order;


import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * 监听服务实例端口的工具类
 */

@Configuration
public class ServiceInfoUtils implements ApplicationListener<WebServerInitializedEvent> {
    private static WebServerInitializedEvent event;

    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        event = webServerInitializedEvent;
    }

    public static int getPort() {
        return event.getWebServer().getPort();
    }
}
