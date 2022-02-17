package io.quarkiverse.openapi.generator.deployment;

import org.jboss.jandex.ClassInfo;

import io.quarkus.builder.item.MultiBuildItem;

/**
 * {@link MultiBuildItem} produced for each Rest Client generated by the OpenApi Generator tool containing the generated class
 * information.
 */
public final class GeneratedOpenApiRestClientBuildItem extends GeneratedOpenApiFile {

    public GeneratedOpenApiRestClientBuildItem(final ClassInfo classInfo) {
        super(classInfo);
    }

}