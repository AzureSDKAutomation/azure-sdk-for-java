/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The AppRegistration model.
 */
@JsonFlatten
public class AppRegistration extends ProxyOnlyResource {
    /**
     * The appId property.
     */
    @JsonProperty(value = "properties.appId")
    private String appId;

    /**
     * The appSecretSettingName property.
     */
    @JsonProperty(value = "properties.appSecretSettingName")
    private String appSecretSettingName;

    /**
     * Get the appId value.
     *
     * @return the appId value
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the appId value.
     *
     * @param appId the appId value to set
     * @return the AppRegistration object itself.
     */
    public AppRegistration withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the appSecretSettingName value.
     *
     * @return the appSecretSettingName value
     */
    public String appSecretSettingName() {
        return this.appSecretSettingName;
    }

    /**
     * Set the appSecretSettingName value.
     *
     * @param appSecretSettingName the appSecretSettingName value to set
     * @return the AppRegistration object itself.
     */
    public AppRegistration withAppSecretSettingName(String appSecretSettingName) {
        this.appSecretSettingName = appSecretSettingName;
        return this;
    }

}
