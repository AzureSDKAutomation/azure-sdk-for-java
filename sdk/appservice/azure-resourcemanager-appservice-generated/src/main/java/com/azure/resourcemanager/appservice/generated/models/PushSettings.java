// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.PushSettingsInner;

/** An immutable client-side representation of PushSettings. */
public interface PushSettings {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the isPushEnabled property: Gets or sets a flag indicating whether the Push endpoint is enabled.
     *
     * @return the isPushEnabled value.
     */
    Boolean isPushEnabled();

    /**
     * Gets the tagWhitelistJson property: Gets or sets a JSON string containing a list of tags that are whitelisted for
     * use by the push registration endpoint.
     *
     * @return the tagWhitelistJson value.
     */
    String tagWhitelistJson();

    /**
     * Gets the tagsRequiringAuth property: Gets or sets a JSON string containing a list of tags that require user
     * authentication to be used in the push registration endpoint. Tags can consist of alphanumeric characters and the
     * following: '_', '@', '#', '.', ':', '-'. Validation should be performed at the PushRequestHandler.
     *
     * @return the tagsRequiringAuth value.
     */
    String tagsRequiringAuth();

    /**
     * Gets the dynamicTagsJson property: Gets or sets a JSON string containing a list of dynamic tags that will be
     * evaluated from user claims in the push registration endpoint.
     *
     * @return the dynamicTagsJson value.
     */
    String dynamicTagsJson();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.PushSettingsInner object.
     *
     * @return the inner object.
     */
    PushSettingsInner innerModel();
}
