// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.WebJobInner;
import java.util.Map;

/** An immutable client-side representation of WebJob. */
public interface WebJob {
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
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the runCommand property: Run command.
     *
     * @return the runCommand value.
     */
    String runCommand();

    /**
     * Gets the url property: Job URL.
     *
     * @return the url value.
     */
    String url();

    /**
     * Gets the extraInfoUrl property: Extra Info URL.
     *
     * @return the extraInfoUrl value.
     */
    String extraInfoUrl();

    /**
     * Gets the webJobType property: Job type.
     *
     * @return the webJobType value.
     */
    WebJobType webJobType();

    /**
     * Gets the error property: Error information.
     *
     * @return the error value.
     */
    String error();

    /**
     * Gets the usingSdk property: Using SDK?.
     *
     * @return the usingSdk value.
     */
    Boolean usingSdk();

    /**
     * Gets the settings property: Job settings.
     *
     * @return the settings value.
     */
    Map<String, Object> settings();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.WebJobInner object.
     *
     * @return the inner object.
     */
    WebJobInner innerModel();
}
