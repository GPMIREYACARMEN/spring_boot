package com.edu.spring_angular.config;

import javax.persistence.EntityListeners;
import javax.persistence.EntityManager;
import javax.persistence.metamodel.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

import com.edu.spring_angular.entity.Usuario;

@SuppressWarnings("deprecation")
@Configuration
public class Repositoryconfig extends RepositoryRestConfigurerAdapter{
	@Autowired
	private EntityManager entitiManager;
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(entitiManager.getMetamodel().getEntities().stream()
				.map(Type::getJavaType)
				.toArray(Class[]::new));
		config.exposeIdsFor(Usuario.class);
	} 
}
