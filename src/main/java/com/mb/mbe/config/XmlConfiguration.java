package com.mb.mbe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath*:datasourceConfig.xml"})
public class XmlConfiguration {

}
