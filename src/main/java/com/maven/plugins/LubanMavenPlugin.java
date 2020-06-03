package com.maven.plugins;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name="luban")
public class LubanMavenPlugin extends AbstractMojo {
    @Parameter
    private String name;
    @Parameter
    private int age ;
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(String.format("name=%s,age=%s",name,age));
    }
}
