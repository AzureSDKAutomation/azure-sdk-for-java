/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Represents a StartMenuItem definition.
 */
@JsonFlatten
public class StartMenuItemInner extends ProxyResource {
    /**
     * Alias of StartMenuItem.
     */
    @JsonProperty(value = "properties.appAlias")
    private String appAlias;

    /**
     * Friendly name of StartMenuItem.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * Path to the file of StartMenuItem.
     */
    @JsonProperty(value = "properties.filePath")
    private String filePath;

    /**
     * Command line arguments for StartMenuItem.
     */
    @JsonProperty(value = "properties.commandLineArguments")
    private String commandLineArguments;

    /**
     * Path to the icon.
     */
    @JsonProperty(value = "properties.iconPath")
    private String iconPath;

    /**
     * Index of the icon.
     */
    @JsonProperty(value = "properties.iconIndex")
    private Integer iconIndex;

    /**
     * Get alias of StartMenuItem.
     *
     * @return the appAlias value
     */
    public String appAlias() {
        return this.appAlias;
    }

    /**
     * Set alias of StartMenuItem.
     *
     * @param appAlias the appAlias value to set
     * @return the StartMenuItemInner object itself.
     */
    public StartMenuItemInner withAppAlias(String appAlias) {
        this.appAlias = appAlias;
        return this;
    }

    /**
     * Get friendly name of StartMenuItem.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of StartMenuItem.
     *
     * @param friendlyName the friendlyName value to set
     * @return the StartMenuItemInner object itself.
     */
    public StartMenuItemInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get path to the file of StartMenuItem.
     *
     * @return the filePath value
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set path to the file of StartMenuItem.
     *
     * @param filePath the filePath value to set
     * @return the StartMenuItemInner object itself.
     */
    public StartMenuItemInner withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get command line arguments for StartMenuItem.
     *
     * @return the commandLineArguments value
     */
    public String commandLineArguments() {
        return this.commandLineArguments;
    }

    /**
     * Set command line arguments for StartMenuItem.
     *
     * @param commandLineArguments the commandLineArguments value to set
     * @return the StartMenuItemInner object itself.
     */
    public StartMenuItemInner withCommandLineArguments(String commandLineArguments) {
        this.commandLineArguments = commandLineArguments;
        return this;
    }

    /**
     * Get path to the icon.
     *
     * @return the iconPath value
     */
    public String iconPath() {
        return this.iconPath;
    }

    /**
     * Set path to the icon.
     *
     * @param iconPath the iconPath value to set
     * @return the StartMenuItemInner object itself.
     */
    public StartMenuItemInner withIconPath(String iconPath) {
        this.iconPath = iconPath;
        return this;
    }

    /**
     * Get index of the icon.
     *
     * @return the iconIndex value
     */
    public Integer iconIndex() {
        return this.iconIndex;
    }

    /**
     * Set index of the icon.
     *
     * @param iconIndex the iconIndex value to set
     * @return the StartMenuItemInner object itself.
     */
    public StartMenuItemInner withIconIndex(Integer iconIndex) {
        this.iconIndex = iconIndex;
        return this;
    }

}
