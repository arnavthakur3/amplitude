package com.trantor.amplitude.service.config;


import com.trantor.amplitude.utils.ResourceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;


@Service
public class UserConfigurationService {

    @Autowired
    ResourceUtils resourceUtils;

    @Value("classpath:/input/amplitudeUserConfig.json")
    Resource userConfigResource;

    public String getUserConfigurations() {
        return resourceUtils.getResourceData(userConfigResource) ;
    }
}



