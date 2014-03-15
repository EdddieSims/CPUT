/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Meena
 */
package app;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import services.crud.AppointmentsCrudService;
import services.crud.AssistantCrudService;
import services.crud.CleanerCrudService;
import services.crud.ClinicalDocumentsCrudService;
import services.crud.impl.AppointmentsCrudServiceImplements;
import services.crud.impl.AssistantCrudServiceImplements;
import services.crud.impl.CleanerCrudServiceImplements;
import services.crud.impl.ClinicalDocumentsCrudServiceImplements;

@Configurable
public class AppConfig {
    /*@Bean(name = "AppointmentsCrudService")
    public  AppointmentsCrudService getAppointmentsCrudService(){
        return new AppointmentsCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAssistantCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="CleanerCrudService")
    public CleanerCrudService getCleanerCrudService(){
        return new CleanerCrudServiceImplements();
    }
    @Bean(name="ClinicalDocumentsCrudService")
    public ClinicalDocumentsCrudService getClinicalDocumentsCrudService(){
        return new ClinicalDocumentsCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }
    @Bean(name="AssistantCrudService")
    public AssistantCrudService getAuthorCrudService(){
        return new AssistantCrudServiceImplements();
    }*/
}

