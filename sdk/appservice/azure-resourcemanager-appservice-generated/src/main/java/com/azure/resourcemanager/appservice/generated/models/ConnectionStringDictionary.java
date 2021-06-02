// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appservice.generated.fluent.models.ConnectionStringDictionaryInner;
import java.util.Map;

/** An immutable client-side representation of ConnectionStringDictionary. */
public interface ConnectionStringDictionary {
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
     * Gets the properties property: Connection strings.
     *
     * @return the properties value.
     */
    Map<String, ConnStringValueTypePair> properties();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.ConnectionStringDictionaryInner
     * object.
     *
     * @return the inner object.
     */
    ConnectionStringDictionaryInner innerModel();
}
