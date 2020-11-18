/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties for creating a custom image from a VHD.
 */
public class CustomImagePropertiesCustom {
    /**
     * The image name.
     */
    @JsonProperty(value = "imageName")
    private String imageName;

    /**
     * Indicates whether sysprep has been run on the VHD.
     */
    @JsonProperty(value = "sysPrep")
    private Boolean sysPrep;

    /**
     * The OS type of the custom image (i.e. Windows, Linux). Possible values
     * include: 'Windows', 'Linux', 'None'.
     */
    @JsonProperty(value = "osType", required = true)
    private CustomImageOsType osType;

    /**
     * Get the image name.
     *
     * @return the imageName value
     */
    public String imageName() {
        return this.imageName;
    }

    /**
     * Set the image name.
     *
     * @param imageName the imageName value to set
     * @return the CustomImagePropertiesCustom object itself.
     */
    public CustomImagePropertiesCustom withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * Get indicates whether sysprep has been run on the VHD.
     *
     * @return the sysPrep value
     */
    public Boolean sysPrep() {
        return this.sysPrep;
    }

    /**
     * Set indicates whether sysprep has been run on the VHD.
     *
     * @param sysPrep the sysPrep value to set
     * @return the CustomImagePropertiesCustom object itself.
     */
    public CustomImagePropertiesCustom withSysPrep(Boolean sysPrep) {
        this.sysPrep = sysPrep;
        return this;
    }

    /**
     * Get the OS type of the custom image (i.e. Windows, Linux). Possible values include: 'Windows', 'Linux', 'None'.
     *
     * @return the osType value
     */
    public CustomImageOsType osType() {
        return this.osType;
    }

    /**
     * Set the OS type of the custom image (i.e. Windows, Linux). Possible values include: 'Windows', 'Linux', 'None'.
     *
     * @param osType the osType value to set
     * @return the CustomImagePropertiesCustom object itself.
     */
    public CustomImagePropertiesCustom withOsType(CustomImageOsType osType) {
        this.osType = osType;
        return this;
    }

}
