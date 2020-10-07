/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.databox.implementation.DataBoxManager;
import org.joda.time.DateTime;
import com.microsoft.rest.CloudError;
import com.microsoft.azure.management.databox.implementation.JobResourceInner;

/**
 * Type representing JobResource.
 */
public interface JobResource extends HasInner<JobResourceInner>, Resource, GroupableResourceCore<DataBoxManager, JobResourceInner>, HasResourceGroup, Refreshable<JobResource>, Updatable<JobResource.Update>, HasManager<DataBoxManager> {
    /**
     * @return the cancellationReason value.
     */
    String cancellationReason();

    /**
     * @return the deliveryInfo value.
     */
    JobDeliveryInfo deliveryInfo();

    /**
     * @return the deliveryType value.
     */
    JobDeliveryType deliveryType();

    /**
     * @return the details value.
     */
    JobDetails details();

    /**
     * @return the error value.
     */
    CloudError error();

    /**
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * @return the isCancellable value.
     */
    Boolean isCancellable();

    /**
     * @return the isCancellableWithoutFee value.
     */
    Boolean isCancellableWithoutFee();

    /**
     * @return the isDeletable value.
     */
    Boolean isDeletable();

    /**
     * @return the isPrepareToShipEnabled value.
     */
    Boolean isPrepareToShipEnabled();

    /**
     * @return the isShippingAddressEditable value.
     */
    Boolean isShippingAddressEditable();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the status value.
     */
    StageName status();

    /**
     * @return the transferType value.
     */
    TransferType transferType();

    /**
     * The entirety of the JobResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithSku, DefinitionStages.WithTransferType, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of JobResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a JobResource definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the JobResource definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithSku> {
        }

        /**
         * The stage of the jobresource definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            * @param sku The sku type
            * @return the next definition stage
*/
            WithTransferType withSku(Sku sku);
        }

        /**
         * The stage of the jobresource definition allowing to specify TransferType.
         */
        interface WithTransferType {
           /**
            * Specifies transferType.
            * @param transferType Type of the data transfer. Possible values include: 'ImportToAzure', 'ExportFromAzure'
            * @return the next definition stage
*/
            WithCreate withTransferType(TransferType transferType);
        }

        /**
         * The stage of the jobresource definition allowing to specify DeliveryInfo.
         */
        interface WithDeliveryInfo {
            /**
             * Specifies deliveryInfo.
             * @param deliveryInfo Delivery Info of Job
             * @return the next definition stage
             */
            WithCreate withDeliveryInfo(JobDeliveryInfo deliveryInfo);
        }

        /**
         * The stage of the jobresource definition allowing to specify DeliveryType.
         */
        interface WithDeliveryType {
            /**
             * Specifies deliveryType.
             * @param deliveryType Delivery type of Job. Possible values include: 'NonScheduled', 'Scheduled'
             * @return the next definition stage
             */
            WithCreate withDeliveryType(JobDeliveryType deliveryType);
        }

        /**
         * The stage of the jobresource definition allowing to specify Details.
         */
        interface WithDetails {
            /**
             * Specifies details.
             * @param details Details of a job run. This field will only be sent for expand details filter
             * @return the next definition stage
             */
            WithCreate withDetails(JobDetails details);
        }

        /**
         * The stage of the jobresource definition allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity Msi identity of the resource
             * @return the next definition stage
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<JobResource>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithDeliveryInfo, DefinitionStages.WithDeliveryType, DefinitionStages.WithDetails, DefinitionStages.WithIdentity {
        }
    }
    /**
     * The template for a JobResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<JobResource>, Resource.UpdateWithTags<Update>, UpdateStages.WithIfMatch, UpdateStages.WithDetails, UpdateStages.WithIdentity {
    }

    /**
     * Grouping of JobResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the jobresource update allowing to specify IfMatch.
         */
        interface WithIfMatch {
            /**
             * Specifies ifMatch.
             * @param ifMatch Defines the If-Match condition. The patch will be performed only if the ETag of the job on the server matches this value
             * @return the next update stage
             */
            Update withIfMatch(String ifMatch);
        }

        /**
         * The stage of the jobresource update allowing to specify Details.
         */
        interface WithDetails {
            /**
             * Specifies details.
             * @param details Details of a job to be updated
             * @return the next update stage
             */
            Update withDetails(UpdateJobDetails details);
        }

        /**
         * The stage of the jobresource update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             * @param identity Msi identity of the resource
             * @return the next update stage
             */
            Update withIdentity(ResourceIdentity identity);
        }

    }
}
