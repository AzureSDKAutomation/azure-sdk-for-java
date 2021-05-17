// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.testbase.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Available OS resource. */
@JsonFlatten
@Fluent
public class AvailableOSResourceInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailableOSResourceInner.class);

    /*
     * The system metadata relating to this resource
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The Id of an Available OS of a Test Base Account.
     */
    @JsonProperty(value = "properties.osId")
    private String osId;

    /*
     * The name of an Available OS of a Test Base Account.
     */
    @JsonProperty(value = "properties.osName")
    private String osName;

    /*
     * The version of an Available OS of a Test Base Account.
     */
    @JsonProperty(value = "properties.osVersion")
    private String osVersion;

    /*
     * The insider channel of an Available OS of a Test Base Account.
     */
    @JsonProperty(value = "properties.insiderChannel")
    private String insiderChannel;

    /*
     * The OS update type of an Available OS of a Test Base Account.
     */
    @JsonProperty(value = "properties.osUpdateType")
    private String osUpdateType;

    /*
     * The Platform of an Available OS of a Test Base Account.
     */
    @JsonProperty(value = "properties.osPlatform")
    private String osPlatform;

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the osId property: The Id of an Available OS of a Test Base Account.
     *
     * @return the osId value.
     */
    public String osId() {
        return this.osId;
    }

    /**
     * Set the osId property: The Id of an Available OS of a Test Base Account.
     *
     * @param osId the osId value to set.
     * @return the AvailableOSResourceInner object itself.
     */
    public AvailableOSResourceInner withOsId(String osId) {
        this.osId = osId;
        return this;
    }

    /**
     * Get the osName property: The name of an Available OS of a Test Base Account.
     *
     * @return the osName value.
     */
    public String osName() {
        return this.osName;
    }

    /**
     * Set the osName property: The name of an Available OS of a Test Base Account.
     *
     * @param osName the osName value to set.
     * @return the AvailableOSResourceInner object itself.
     */
    public AvailableOSResourceInner withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * Get the osVersion property: The version of an Available OS of a Test Base Account.
     *
     * @return the osVersion value.
     */
    public String osVersion() {
        return this.osVersion;
    }

    /**
     * Set the osVersion property: The version of an Available OS of a Test Base Account.
     *
     * @param osVersion the osVersion value to set.
     * @return the AvailableOSResourceInner object itself.
     */
    public AvailableOSResourceInner withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * Get the insiderChannel property: The insider channel of an Available OS of a Test Base Account.
     *
     * @return the insiderChannel value.
     */
    public String insiderChannel() {
        return this.insiderChannel;
    }

    /**
     * Set the insiderChannel property: The insider channel of an Available OS of a Test Base Account.
     *
     * @param insiderChannel the insiderChannel value to set.
     * @return the AvailableOSResourceInner object itself.
     */
    public AvailableOSResourceInner withInsiderChannel(String insiderChannel) {
        this.insiderChannel = insiderChannel;
        return this;
    }

    /**
     * Get the osUpdateType property: The OS update type of an Available OS of a Test Base Account.
     *
     * @return the osUpdateType value.
     */
    public String osUpdateType() {
        return this.osUpdateType;
    }

    /**
     * Set the osUpdateType property: The OS update type of an Available OS of a Test Base Account.
     *
     * @param osUpdateType the osUpdateType value to set.
     * @return the AvailableOSResourceInner object itself.
     */
    public AvailableOSResourceInner withOsUpdateType(String osUpdateType) {
        this.osUpdateType = osUpdateType;
        return this;
    }

    /**
     * Get the osPlatform property: The Platform of an Available OS of a Test Base Account.
     *
     * @return the osPlatform value.
     */
    public String osPlatform() {
        return this.osPlatform;
    }

    /**
     * Set the osPlatform property: The Platform of an Available OS of a Test Base Account.
     *
     * @param osPlatform the osPlatform value to set.
     * @return the AvailableOSResourceInner object itself.
     */
    public AvailableOSResourceInner withOsPlatform(String osPlatform) {
        this.osPlatform = osPlatform;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
