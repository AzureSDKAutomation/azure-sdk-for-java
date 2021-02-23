// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.databox.fluent.models.JobResourceInner;
import java.time.OffsetDateTime;
import java.util.Map;

/** An immutable client-side representation of JobResource. */
public interface JobResource {
    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the name property: Name of the object.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the id property: Id of the object.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the type property: Type of the object.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the transferType property: Type of the data transfer.
     *
     * @return the transferType value.
     */
    TransferType transferType();

    /**
     * Gets the isCancellable property: Describes whether the job is cancellable or not.
     *
     * @return the isCancellable value.
     */
    Boolean isCancellable();

    /**
     * Gets the isDeletable property: Describes whether the job is deletable or not.
     *
     * @return the isDeletable value.
     */
    Boolean isDeletable();

    /**
     * Gets the isShippingAddressEditable property: Describes whether the shipping address is editable or not.
     *
     * @return the isShippingAddressEditable value.
     */
    Boolean isShippingAddressEditable();

    /**
     * Gets the isPrepareToShipEnabled property: Is Prepare To Ship Enabled on this job.
     *
     * @return the isPrepareToShipEnabled value.
     */
    Boolean isPrepareToShipEnabled();

    /**
     * Gets the status property: Name of the stage which is in progress.
     *
     * @return the status value.
     */
    StageName status();

    /**
     * Gets the startTime property: Time at which the job was started in UTC ISO 8601 format.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the error property: Top level error for the job.
     *
     * @return the error value.
     */
    CloudError error();

    /**
     * Gets the details property: Details of a job run. This field will only be sent for expand details filter.
     *
     * @return the details value.
     */
    JobDetails details();

    /**
     * Gets the cancellationReason property: Reason for cancellation.
     *
     * @return the cancellationReason value.
     */
    String cancellationReason();

    /**
     * Gets the deliveryType property: Delivery type of Job.
     *
     * @return the deliveryType value.
     */
    JobDeliveryType deliveryType();

    /**
     * Gets the deliveryInfo property: Delivery Info of Job.
     *
     * @return the deliveryInfo value.
     */
    JobDeliveryInfo deliveryInfo();

    /**
     * Gets the isCancellableWithoutFee property: Flag to indicate cancellation of scheduled job.
     *
     * @return the isCancellableWithoutFee value.
     */
    Boolean isCancellableWithoutFee();

    /**
     * Gets the sku property: The sku type.
     *
     * @return the sku value.
     */
    Sku sku();

    /**
     * Gets the identity property: Msi identity of the resource.
     *
     * @return the identity value.
     */
    ResourceIdentity identity();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the inner com.azure.resourcemanager.databox.fluent.models.JobResourceInner object.
     *
     * @return the inner object.
     */
    JobResourceInner innerModel();

    /** The entirety of the JobResource definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithTransferType,
            DefinitionStages.WithSku,
            DefinitionStages.WithCreate {
    }
    /** The JobResource definition stages. */
    interface DefinitionStages {
        /** The first stage of the JobResource definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the JobResource definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the JobResource definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The Resource Group Name.
             * @return the next definition stage.
             */
            WithTransferType withExistingResourceGroup(String resourceGroupName);
        }
        /** The stage of the JobResource definition allowing to specify transferType. */
        interface WithTransferType {
            /**
             * Specifies the transferType property: Type of the data transfer..
             *
             * @param transferType Type of the data transfer.
             * @return the next definition stage.
             */
            WithSku withTransferType(TransferType transferType);
        }
        /** The stage of the JobResource definition allowing to specify sku. */
        interface WithSku {
            /**
             * Specifies the sku property: The sku type..
             *
             * @param sku The sku type.
             * @return the next definition stage.
             */
            WithCreate withSku(Sku sku);
        }
        /**
         * The stage of the JobResource definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithDetails,
                DefinitionStages.WithDeliveryType,
                DefinitionStages.WithDeliveryInfo,
                DefinitionStages.WithIdentity {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            JobResource create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            JobResource create(Context context);
        }
        /** The stage of the JobResource definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the JobResource definition allowing to specify details. */
        interface WithDetails {
            /**
             * Specifies the details property: Details of a job run. This field will only be sent for expand details
             * filter..
             *
             * @param details Details of a job run. This field will only be sent for expand details filter.
             * @return the next definition stage.
             */
            WithCreate withDetails(JobDetails details);
        }
        /** The stage of the JobResource definition allowing to specify deliveryType. */
        interface WithDeliveryType {
            /**
             * Specifies the deliveryType property: Delivery type of Job..
             *
             * @param deliveryType Delivery type of Job.
             * @return the next definition stage.
             */
            WithCreate withDeliveryType(JobDeliveryType deliveryType);
        }
        /** The stage of the JobResource definition allowing to specify deliveryInfo. */
        interface WithDeliveryInfo {
            /**
             * Specifies the deliveryInfo property: Delivery Info of Job..
             *
             * @param deliveryInfo Delivery Info of Job.
             * @return the next definition stage.
             */
            WithCreate withDeliveryInfo(JobDeliveryInfo deliveryInfo);
        }
        /** The stage of the JobResource definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Msi identity of the resource.
             *
             * @param identity Msi identity of the resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ResourceIdentity identity);
        }
    }
    /**
     * Begins update for the JobResource resource.
     *
     * @return the stage of resource update.
     */
    JobResource.Update update();

    /** The template for JobResource update. */
    interface Update
        extends UpdateStages.WithTags, UpdateStages.WithIdentity, UpdateStages.WithDetails, UpdateStages.WithIfMatch {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        JobResource apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        JobResource apply(Context context);
    }
    /** The JobResource update stages. */
    interface UpdateStages {
        /** The stage of the JobResource update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: The list of key value pairs that describe the resource. These tags can be
             * used in viewing and grouping this resource (across resource groups)..
             *
             * @param tags The list of key value pairs that describe the resource. These tags can be used in viewing and
             *     grouping this resource (across resource groups).
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the JobResource update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Msi identity of the resource.
             *
             * @param identity Msi identity of the resource.
             * @return the next definition stage.
             */
            Update withIdentity(ResourceIdentity identity);
        }
        /** The stage of the JobResource update allowing to specify details. */
        interface WithDetails {
            /**
             * Specifies the details property: Details of a job to be updated..
             *
             * @param details Details of a job to be updated.
             * @return the next definition stage.
             */
            Update withDetails(UpdateJobDetails details);
        }
        /** The stage of the JobResource update allowing to specify ifMatch. */
        interface WithIfMatch {
            /**
             * Specifies the ifMatch property: Defines the If-Match condition. The patch will be performed only if the
             * ETag of the job on the server matches this value..
             *
             * @param ifMatch Defines the If-Match condition. The patch will be performed only if the ETag of the job on
             *     the server matches this value.
             * @return the next definition stage.
             */
            Update withIfMatch(String ifMatch);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    JobResource refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    JobResource refresh(Context context);

    /**
     * Book shipment pick up.
     *
     * @param shipmentPickUpRequest Details of shipment pick up request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shipment pick up response.
     */
    ShipmentPickUpResponse bookShipmentPickUp(ShipmentPickUpRequest shipmentPickUpRequest);

    /**
     * Book shipment pick up.
     *
     * @param shipmentPickUpRequest Details of shipment pick up request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shipment pick up response.
     */
    Response<ShipmentPickUpResponse> bookShipmentPickUpWithResponse(
        ShipmentPickUpRequest shipmentPickUpRequest, Context context);

    /**
     * CancelJob.
     *
     * @param cancellationReason Reason for cancellation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void cancel(CancellationReason cancellationReason);

    /**
     * CancelJob.
     *
     * @param cancellationReason Reason for cancellation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    Response<Void> cancelWithResponse(CancellationReason cancellationReason, Context context);

    /**
     * This method gets the unencrypted secrets related to the job.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of unencrypted credentials for accessing device.
     */
    PagedIterable<UnencryptedCredentials> listCredentials();

    /**
     * This method gets the unencrypted secrets related to the job.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of unencrypted credentials for accessing device.
     */
    PagedIterable<UnencryptedCredentials> listCredentials(Context context);
}
