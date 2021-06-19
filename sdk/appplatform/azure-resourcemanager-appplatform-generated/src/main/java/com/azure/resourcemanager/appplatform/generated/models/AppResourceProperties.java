// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** App resource properties payload. */
@Fluent
public final class AppResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppResourceProperties.class);

    /*
     * Indicates whether the App exposes public endpoint
     */
    @JsonProperty(value = "public")
    private Boolean publicProperty;

    /*
     * URL of the App
     */
    @JsonProperty(value = "url", access = JsonProperty.Access.WRITE_ONLY)
    private String url;

    /*
     * Collection of addons
     */
    @JsonProperty(value = "addonConfig")
    private Map<String, AddonProfile> addonConfig;

    /*
     * Provisioning state of the App
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AppResourceProvisioningState provisioningState;

    /*
     * Fully qualified dns Name.
     */
    @JsonProperty(value = "fqdn")
    private String fqdn;

    /*
     * Indicate if only https is allowed.
     */
    @JsonProperty(value = "httpsOnly")
    private Boolean httpsOnly;

    /*
     * Temporary disk settings
     */
    @JsonProperty(value = "temporaryDisk")
    private TemporaryDisk temporaryDisk;

    /*
     * Persistent disk settings
     */
    @JsonProperty(value = "persistentDisk")
    private PersistentDisk persistentDisk;

    /*
     * Indicate if end to end TLS is enabled.
     */
    @JsonProperty(value = "enableEndToEndTLS")
    private Boolean enableEndToEndTls;

    /**
     * Get the publicProperty property: Indicates whether the App exposes public endpoint.
     *
     * @return the publicProperty value.
     */
    public Boolean publicProperty() {
        return this.publicProperty;
    }

    /**
     * Set the publicProperty property: Indicates whether the App exposes public endpoint.
     *
     * @param publicProperty the publicProperty value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withPublicProperty(Boolean publicProperty) {
        this.publicProperty = publicProperty;
        return this;
    }

    /**
     * Get the url property: URL of the App.
     *
     * @return the url value.
     */
    public String url() {
        return this.url;
    }

    /**
     * Get the addonConfig property: Collection of addons.
     *
     * @return the addonConfig value.
     */
    public Map<String, AddonProfile> addonConfig() {
        return this.addonConfig;
    }

    /**
     * Set the addonConfig property: Collection of addons.
     *
     * @param addonConfig the addonConfig value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withAddonConfig(Map<String, AddonProfile> addonConfig) {
        this.addonConfig = addonConfig;
        return this;
    }

    /**
     * Get the provisioningState property: Provisioning state of the App.
     *
     * @return the provisioningState value.
     */
    public AppResourceProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the fqdn property: Fully qualified dns Name.
     *
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: Fully qualified dns Name.
     *
     * @param fqdn the fqdn value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the httpsOnly property: Indicate if only https is allowed.
     *
     * @return the httpsOnly value.
     */
    public Boolean httpsOnly() {
        return this.httpsOnly;
    }

    /**
     * Set the httpsOnly property: Indicate if only https is allowed.
     *
     * @param httpsOnly the httpsOnly value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withHttpsOnly(Boolean httpsOnly) {
        this.httpsOnly = httpsOnly;
        return this;
    }

    /**
     * Get the temporaryDisk property: Temporary disk settings.
     *
     * @return the temporaryDisk value.
     */
    public TemporaryDisk temporaryDisk() {
        return this.temporaryDisk;
    }

    /**
     * Set the temporaryDisk property: Temporary disk settings.
     *
     * @param temporaryDisk the temporaryDisk value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withTemporaryDisk(TemporaryDisk temporaryDisk) {
        this.temporaryDisk = temporaryDisk;
        return this;
    }

    /**
     * Get the persistentDisk property: Persistent disk settings.
     *
     * @return the persistentDisk value.
     */
    public PersistentDisk persistentDisk() {
        return this.persistentDisk;
    }

    /**
     * Set the persistentDisk property: Persistent disk settings.
     *
     * @param persistentDisk the persistentDisk value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withPersistentDisk(PersistentDisk persistentDisk) {
        this.persistentDisk = persistentDisk;
        return this;
    }

    /**
     * Get the enableEndToEndTls property: Indicate if end to end TLS is enabled.
     *
     * @return the enableEndToEndTls value.
     */
    public Boolean enableEndToEndTls() {
        return this.enableEndToEndTls;
    }

    /**
     * Set the enableEndToEndTls property: Indicate if end to end TLS is enabled.
     *
     * @param enableEndToEndTls the enableEndToEndTls value to set.
     * @return the AppResourceProperties object itself.
     */
    public AppResourceProperties withEnableEndToEndTls(Boolean enableEndToEndTls) {
        this.enableEndToEndTls = enableEndToEndTls;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (addonConfig() != null) {
            addonConfig()
                .values()
                .forEach(
                    e -> {
                        if (e != null) {
                            e.validate();
                        }
                    });
        }
        if (temporaryDisk() != null) {
            temporaryDisk().validate();
        }
        if (persistentDisk() != null) {
            persistentDisk().validate();
        }
    }
}
