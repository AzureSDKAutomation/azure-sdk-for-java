/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_12_10_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Application properties that can be patched.
 */
@JsonFlatten
public class ApplicationPatch {
    /**
     * tags to be updated.
     */
    @JsonProperty(value = "tags")
    private Object tags;

    /**
     * Description of Application.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Friendly name of Application.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * Specifies a path for the executable file for the application.
     */
    @JsonProperty(value = "properties.filePath")
    private String filePath;

    /**
     * Specifies whether this published application can be launched with
     * command line arguments provided by the client, command line arguments
     * specified at publish time, or no command line arguments at all. Possible
     * values include: 'DoNotAllow', 'Allow', 'Require'.
     */
    @JsonProperty(value = "properties.commandLineSetting")
    private CommandLineSetting commandLineSetting;

    /**
     * Command Line Arguments for Application.
     */
    @JsonProperty(value = "properties.commandLineArguments")
    private String commandLineArguments;

    /**
     * Specifies whether to show the RemoteApp program in the RD Web Access
     * server.
     */
    @JsonProperty(value = "properties.showInPortal")
    private Boolean showInPortal;

    /**
     * Path to icon.
     */
    @JsonProperty(value = "properties.iconPath")
    private String iconPath;

    /**
     * Index of the icon.
     */
    @JsonProperty(value = "properties.iconIndex")
    private Integer iconIndex;

    /**
     * Get tags to be updated.
     *
     * @return the tags value
     */
    public Object tags() {
        return this.tags;
    }

    /**
     * Set tags to be updated.
     *
     * @param tags the tags value to set
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get description of Application.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of Application.
     *
     * @param description the description value to set
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get friendly name of Application.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of Application.
     *
     * @param friendlyName the friendlyName value to set
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get specifies a path for the executable file for the application.
     *
     * @return the filePath value
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set specifies a path for the executable file for the application.
     *
     * @param filePath the filePath value to set
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Get specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all. Possible values include: 'DoNotAllow', 'Allow', 'Require'.
     *
     * @return the commandLineSetting value
     */
    public CommandLineSetting commandLineSetting() {
        return this.commandLineSetting;
    }

    /**
     * Set specifies whether this published application can be launched with command line arguments provided by the client, command line arguments specified at publish time, or no command line arguments at all. Possible values include: 'DoNotAllow', 'Allow', 'Require'.
     *
     * @param commandLineSetting the commandLineSetting value to set
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withCommandLineSetting(CommandLineSetting commandLineSetting) {
        this.commandLineSetting = commandLineSetting;
        return this;
    }

    /**
     * Get command Line Arguments for Application.
     *
     * @return the commandLineArguments value
     */
    public String commandLineArguments() {
        return this.commandLineArguments;
    }

    /**
     * Set command Line Arguments for Application.
     *
     * @param commandLineArguments the commandLineArguments value to set
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withCommandLineArguments(String commandLineArguments) {
        this.commandLineArguments = commandLineArguments;
        return this;
    }

    /**
     * Get specifies whether to show the RemoteApp program in the RD Web Access server.
     *
     * @return the showInPortal value
     */
    public Boolean showInPortal() {
        return this.showInPortal;
    }

    /**
     * Set specifies whether to show the RemoteApp program in the RD Web Access server.
     *
     * @param showInPortal the showInPortal value to set
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withShowInPortal(Boolean showInPortal) {
        this.showInPortal = showInPortal;
        return this;
    }

    /**
     * Get path to icon.
     *
     * @return the iconPath value
     */
    public String iconPath() {
        return this.iconPath;
    }

    /**
     * Set path to icon.
     *
     * @param iconPath the iconPath value to set
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withIconPath(String iconPath) {
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
     * @return the ApplicationPatch object itself.
     */
    public ApplicationPatch withIconIndex(Integer iconIndex) {
        this.iconIndex = iconIndex;
        return this;
    }

}
