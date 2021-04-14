// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ARM resource for a static site when patching. */
@JsonFlatten
@Fluent
public class StaticSitePatchResource extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StaticSitePatchResource.class);

    /*
     * The default autogenerated hostname for the static site.
     */
    @JsonProperty(value = "properties.defaultHostname", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultHostname;

    /*
     * URL for the repository of the static site.
     */
    @JsonProperty(value = "properties.repositoryUrl")
    private String repositoryUrl;

    /*
     * The target branch in the repository.
     */
    @JsonProperty(value = "properties.branch")
    private String branch;

    /*
     * The provider that submitted the last deployment to the primary
     * environment of the static site.
     */
    @JsonProperty(value = "properties.provider", access = JsonProperty.Access.WRITE_ONLY)
    private String provider;

    /*
     * The custom domains associated with this static site.
     */
    @JsonProperty(value = "properties.customDomains", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> customDomains;

    /*
     * A user's github repository token. This is used to setup the Github
     * Actions workflow file and API secrets.
     */
    @JsonProperty(value = "properties.repositoryToken")
    private String repositoryToken;

    /*
     * Build properties to configure on the repository.
     */
    @JsonProperty(value = "properties.buildProperties")
    private StaticSiteBuildProperties buildProperties;

    /*
     * Template options for generating a new repository.
     */
    @JsonProperty(value = "properties.templateProperties")
    private StaticSiteTemplateOptions templateProperties;

    /*
     * Private endpoint connections
     */
    @JsonProperty(value = "properties.privateEndpointConnections", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResponseMessageEnvelopeRemotePrivateEndpointConnection> privateEndpointConnections;

    /*
     * The content distribution endpoint for the static site.
     */
    @JsonProperty(value = "properties.contentDistributionEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String contentDistributionEndpoint;

    /*
     * Identity to use for Key Vault Reference authentication.
     */
    @JsonProperty(value = "properties.keyVaultReferenceIdentity", access = JsonProperty.Access.WRITE_ONLY)
    private String keyVaultReferenceIdentity;

    /*
     * User provided function apps registered with the static site
     */
    @JsonProperty(value = "properties.userProvidedFunctionApps", access = JsonProperty.Access.WRITE_ONLY)
    private List<StaticSiteUserProvidedFunctionApp> userProvidedFunctionApps;

    /*
     * State indicating whether staging environments are allowed or not allowed
     * for a static web app.
     */
    @JsonProperty(value = "properties.stagingEnvironmentPolicy")
    private StagingEnvironmentPolicy stagingEnvironmentPolicy;

    /*
     * <code>false</code> if config file is locked for this static web app;
     * otherwise, <code>true</code>.
     */
    @JsonProperty(value = "properties.allowConfigFileUpdates")
    private Boolean allowConfigFileUpdates;

    /**
     * Get the defaultHostname property: The default autogenerated hostname for the static site.
     *
     * @return the defaultHostname value.
     */
    public String defaultHostname() {
        return this.defaultHostname;
    }

    /**
     * Get the repositoryUrl property: URL for the repository of the static site.
     *
     * @return the repositoryUrl value.
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * Set the repositoryUrl property: URL for the repository of the static site.
     *
     * @param repositoryUrl the repositoryUrl value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get the branch property: The target branch in the repository.
     *
     * @return the branch value.
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the branch property: The target branch in the repository.
     *
     * @param branch the branch value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the provider property: The provider that submitted the last deployment to the primary environment of the
     * static site.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Get the customDomains property: The custom domains associated with this static site.
     *
     * @return the customDomains value.
     */
    public List<String> customDomains() {
        return this.customDomains;
    }

    /**
     * Get the repositoryToken property: A user's github repository token. This is used to setup the Github Actions
     * workflow file and API secrets.
     *
     * @return the repositoryToken value.
     */
    public String repositoryToken() {
        return this.repositoryToken;
    }

    /**
     * Set the repositoryToken property: A user's github repository token. This is used to setup the Github Actions
     * workflow file and API secrets.
     *
     * @param repositoryToken the repositoryToken value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withRepositoryToken(String repositoryToken) {
        this.repositoryToken = repositoryToken;
        return this;
    }

    /**
     * Get the buildProperties property: Build properties to configure on the repository.
     *
     * @return the buildProperties value.
     */
    public StaticSiteBuildProperties buildProperties() {
        return this.buildProperties;
    }

    /**
     * Set the buildProperties property: Build properties to configure on the repository.
     *
     * @param buildProperties the buildProperties value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withBuildProperties(StaticSiteBuildProperties buildProperties) {
        this.buildProperties = buildProperties;
        return this;
    }

    /**
     * Get the templateProperties property: Template options for generating a new repository.
     *
     * @return the templateProperties value.
     */
    public StaticSiteTemplateOptions templateProperties() {
        return this.templateProperties;
    }

    /**
     * Set the templateProperties property: Template options for generating a new repository.
     *
     * @param templateProperties the templateProperties value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withTemplateProperties(StaticSiteTemplateOptions templateProperties) {
        this.templateProperties = templateProperties;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: Private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    public List<ResponseMessageEnvelopeRemotePrivateEndpointConnection> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Get the contentDistributionEndpoint property: The content distribution endpoint for the static site.
     *
     * @return the contentDistributionEndpoint value.
     */
    public String contentDistributionEndpoint() {
        return this.contentDistributionEndpoint;
    }

    /**
     * Get the keyVaultReferenceIdentity property: Identity to use for Key Vault Reference authentication.
     *
     * @return the keyVaultReferenceIdentity value.
     */
    public String keyVaultReferenceIdentity() {
        return this.keyVaultReferenceIdentity;
    }

    /**
     * Get the userProvidedFunctionApps property: User provided function apps registered with the static site.
     *
     * @return the userProvidedFunctionApps value.
     */
    public List<StaticSiteUserProvidedFunctionApp> userProvidedFunctionApps() {
        return this.userProvidedFunctionApps;
    }

    /**
     * Get the stagingEnvironmentPolicy property: State indicating whether staging environments are allowed or not
     * allowed for a static web app.
     *
     * @return the stagingEnvironmentPolicy value.
     */
    public StagingEnvironmentPolicy stagingEnvironmentPolicy() {
        return this.stagingEnvironmentPolicy;
    }

    /**
     * Set the stagingEnvironmentPolicy property: State indicating whether staging environments are allowed or not
     * allowed for a static web app.
     *
     * @param stagingEnvironmentPolicy the stagingEnvironmentPolicy value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withStagingEnvironmentPolicy(StagingEnvironmentPolicy stagingEnvironmentPolicy) {
        this.stagingEnvironmentPolicy = stagingEnvironmentPolicy;
        return this;
    }

    /**
     * Get the allowConfigFileUpdates property: &lt;code&gt;false&lt;/code&gt; if config file is locked for this static
     * web app; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @return the allowConfigFileUpdates value.
     */
    public Boolean allowConfigFileUpdates() {
        return this.allowConfigFileUpdates;
    }

    /**
     * Set the allowConfigFileUpdates property: &lt;code&gt;false&lt;/code&gt; if config file is locked for this static
     * web app; otherwise, &lt;code&gt;true&lt;/code&gt;.
     *
     * @param allowConfigFileUpdates the allowConfigFileUpdates value to set.
     * @return the StaticSitePatchResource object itself.
     */
    public StaticSitePatchResource withAllowConfigFileUpdates(Boolean allowConfigFileUpdates) {
        this.allowConfigFileUpdates = allowConfigFileUpdates;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public StaticSitePatchResource withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (buildProperties() != null) {
            buildProperties().validate();
        }
        if (templateProperties() != null) {
            templateProperties().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (userProvidedFunctionApps() != null) {
            userProvidedFunctionApps().forEach(e -> e.validate());
        }
    }
}
