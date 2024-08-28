package de.contacts.springcrm;

import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.theme.Theme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Theme(value = "CRM")
@PWA(
        name = "CRM",
        shortName = "CRM",
        offlinePath= "META-INF/resources/icons/offline.html",
        offlineResources = { "images/offline.png" }
)
public class SpringCRMApplication implements AppShellConfigurator {

    public static void main(String[] args) {
        SpringApplication.run(SpringCRMApplication.class, args);
    }

}
