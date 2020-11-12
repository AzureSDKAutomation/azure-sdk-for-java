/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation.DatadogSingleSignOnResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.datadog.v2020_02_01_preview.implementation.DatadogManager;

/**
 * Type representing DatadogSingleSignOnResource.
 */
public interface DatadogSingleSignOnResource extends HasInner<DatadogSingleSignOnResourceInner>, Indexable, Refreshable<DatadogSingleSignOnResource>, Updatable<DatadogSingleSignOnResource.Update>, HasManager<DatadogManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    DatadogSingleSignOnProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the DatadogSingleSignOnResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithMonitor, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of DatadogSingleSignOnResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a DatadogSingleSignOnResource definition.
         */
        interface Blank extends WithMonitor {
        }

        /**
         * The stage of the datadogsinglesignonresource definition allowing to specify Monitor.
         */
        interface WithMonitor {
           /**
            * Specifies resourceGroupName, monitorName.
            * @param resourceGroupName The name of the resource group to which the Datadog resource belongs
            * @param monitorName Monitor resource name
            * @return the next definition stage
            */
            WithProperties withExistingMonitor(String resourceGroupName, String monitorName);
        }

        /**
         * The stage of the datadogsinglesignonresource definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties the properties parameter value
            * @return the next definition stage
            */
            WithCreate withProperties(DatadogSingleSignOnProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<DatadogSingleSignOnResource> {
        }
    }
    /**
     * The template for a DatadogSingleSignOnResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<DatadogSingleSignOnResource>, UpdateStages.WithProperties {
    }

    /**
     * Grouping of DatadogSingleSignOnResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the datadogsinglesignonresource update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties the properties parameter value
             * @return the next update stage
             */
            Update withProperties(DatadogSingleSignOnProperties properties);
        }

    }
}
