// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Schema for MSIX Package Application properties. */
@Fluent
public final class MsixPackageApplications {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MsixPackageApplications.class);

    /*
     * Package Application Id, found in appxmanifest.xml.
     */
    @JsonProperty(value = "appId")
    private String appId;

    /*
     * Description of Package Application.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * Used to activate Package Application. Consists of Package Name and
     * ApplicationID. Found in appxmanifest.xml.
     */
    @JsonProperty(value = "appUserModelID")
    private String appUserModelId;

    /*
     * User friendly name.
     */
    @JsonProperty(value = "friendlyName")
    private String friendlyName;

    /*
     * User friendly name.
     */
    @JsonProperty(value = "iconImageName")
    private String iconImageName;

    /*
     * the icon a 64 bit string as a byte array.
     */
    @JsonProperty(value = "rawIcon")
    private byte[] rawIcon;

    /*
     * the icon a 64 bit string as a byte array.
     */
    @JsonProperty(value = "rawPng")
    private byte[] rawPng;

    /**
     * Get the appId property: Package Application Id, found in appxmanifest.xml.
     *
     * @return the appId value.
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the appId property: Package Application Id, found in appxmanifest.xml.
     *
     * @param appId the appId value to set.
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the description property: Description of Package Application.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of Package Application.
     *
     * @param description the description value to set.
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the appUserModelId property: Used to activate Package Application. Consists of Package Name and
     * ApplicationID. Found in appxmanifest.xml.
     *
     * @return the appUserModelId value.
     */
    public String appUserModelId() {
        return this.appUserModelId;
    }

    /**
     * Set the appUserModelId property: Used to activate Package Application. Consists of Package Name and
     * ApplicationID. Found in appxmanifest.xml.
     *
     * @param appUserModelId the appUserModelId value to set.
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withAppUserModelId(String appUserModelId) {
        this.appUserModelId = appUserModelId;
        return this;
    }

    /**
     * Get the friendlyName property: User friendly name.
     *
     * @return the friendlyName value.
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set the friendlyName property: User friendly name.
     *
     * @param friendlyName the friendlyName value to set.
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get the iconImageName property: User friendly name.
     *
     * @return the iconImageName value.
     */
    public String iconImageName() {
        return this.iconImageName;
    }

    /**
     * Set the iconImageName property: User friendly name.
     *
     * @param iconImageName the iconImageName value to set.
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withIconImageName(String iconImageName) {
        this.iconImageName = iconImageName;
        return this;
    }

    /**
     * Get the rawIcon property: the icon a 64 bit string as a byte array.
     *
     * @return the rawIcon value.
     */
    public byte[] rawIcon() {
        return CoreUtils.clone(this.rawIcon);
    }

    /**
     * Set the rawIcon property: the icon a 64 bit string as a byte array.
     *
     * @param rawIcon the rawIcon value to set.
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withRawIcon(byte[] rawIcon) {
        this.rawIcon = CoreUtils.clone(rawIcon);
        return this;
    }

    /**
     * Get the rawPng property: the icon a 64 bit string as a byte array.
     *
     * @return the rawPng value.
     */
    public byte[] rawPng() {
        return CoreUtils.clone(this.rawPng);
    }

    /**
     * Set the rawPng property: the icon a 64 bit string as a byte array.
     *
     * @param rawPng the rawPng value to set.
     * @return the MsixPackageApplications object itself.
     */
    public MsixPackageApplications withRawPng(byte[] rawPng) {
        this.rawPng = CoreUtils.clone(rawPng);
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
