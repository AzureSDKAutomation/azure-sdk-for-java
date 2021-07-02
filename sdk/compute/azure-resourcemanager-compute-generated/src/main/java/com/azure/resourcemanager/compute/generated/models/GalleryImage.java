// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.management.Region;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageInner;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of GalleryImage. */
public interface GalleryImage {
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
     * Gets the description property: The description of this gallery image definition resource. This property is
     * updatable.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the eula property: The Eula agreement for the gallery image definition.
     *
     * @return the eula value.
     */
    String eula();

    /**
     * Gets the privacyStatementUri property: The privacy statement uri.
     *
     * @return the privacyStatementUri value.
     */
    String privacyStatementUri();

    /**
     * Gets the releaseNoteUri property: The release note uri.
     *
     * @return the releaseNoteUri value.
     */
    String releaseNoteUri();

    /**
     * Gets the osType property: This property allows you to specify the type of the OS that is included in the disk
     * when creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt;
     * **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
     *
     * @return the osType value.
     */
    OperatingSystemTypes osType();

    /**
     * Gets the osState property: This property allows the user to specify whether the virtual machines created under
     * this image are 'Generalized' or 'Specialized'.
     *
     * @return the osState value.
     */
    OperatingSystemStateTypes osState();

    /**
     * Gets the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to OS disks
     * only.
     *
     * @return the hyperVGeneration value.
     */
    HyperVGeneration hyperVGeneration();

    /**
     * Gets the endOfLifeDate property: The end of life date of the gallery image definition. This property can be used
     * for decommissioning purposes. This property is updatable.
     *
     * @return the endOfLifeDate value.
     */
    OffsetDateTime endOfLifeDate();

    /**
     * Gets the identifier property: This is the gallery image definition identifier.
     *
     * @return the identifier value.
     */
    GalleryImageIdentifier identifier();

    /**
     * Gets the recommended property: The properties describe the recommended machine configuration for this Image
     * Definition. These properties are updatable.
     *
     * @return the recommended value.
     */
    RecommendedMachineConfiguration recommended();

    /**
     * Gets the disallowed property: Describes the disallowed disk types.
     *
     * @return the disallowed value.
     */
    Disallowed disallowed();

    /**
     * Gets the purchasePlan property: Describes the gallery image definition purchase plan. This is used by marketplace
     * images.
     *
     * @return the purchasePlan value.
     */
    ImagePurchasePlan purchasePlan();

    /**
     * Gets the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    GalleryImagePropertiesProvisioningState provisioningState();

    /**
     * Gets the features property: A list of gallery image features.
     *
     * @return the features value.
     */
    List<GalleryImageFeature> features();

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
     * Gets the inner com.azure.resourcemanager.compute.generated.fluent.models.GalleryImageInner object.
     *
     * @return the inner object.
     */
    GalleryImageInner innerModel();

    /** The entirety of the GalleryImage definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithCreate {
    }
    /** The GalleryImage definition stages. */
    interface DefinitionStages {
        /** The first stage of the GalleryImage definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the GalleryImage definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithParentResource withRegion(String location);
        }
        /** The stage of the GalleryImage definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, galleryName.
             *
             * @param resourceGroupName The name of the resource group.
             * @param galleryName The name of the Shared Image Gallery in which the Image Definition is to be created.
             * @return the next definition stage.
             */
            WithCreate withExistingGallery(String resourceGroupName, String galleryName);
        }
        /**
         * The stage of the GalleryImage definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithDescription,
                DefinitionStages.WithEula,
                DefinitionStages.WithPrivacyStatementUri,
                DefinitionStages.WithReleaseNoteUri,
                DefinitionStages.WithOsType,
                DefinitionStages.WithOsState,
                DefinitionStages.WithHyperVGeneration,
                DefinitionStages.WithEndOfLifeDate,
                DefinitionStages.WithIdentifier,
                DefinitionStages.WithRecommended,
                DefinitionStages.WithDisallowed,
                DefinitionStages.WithPurchasePlan,
                DefinitionStages.WithFeatures {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            GalleryImage create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            GalleryImage create(Context context);
        }
        /** The stage of the GalleryImage definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the GalleryImage definition allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of this gallery image definition resource. This
             * property is updatable..
             *
             * @param description The description of this gallery image definition resource. This property is updatable.
             * @return the next definition stage.
             */
            WithCreate withDescription(String description);
        }
        /** The stage of the GalleryImage definition allowing to specify eula. */
        interface WithEula {
            /**
             * Specifies the eula property: The Eula agreement for the gallery image definition..
             *
             * @param eula The Eula agreement for the gallery image definition.
             * @return the next definition stage.
             */
            WithCreate withEula(String eula);
        }
        /** The stage of the GalleryImage definition allowing to specify privacyStatementUri. */
        interface WithPrivacyStatementUri {
            /**
             * Specifies the privacyStatementUri property: The privacy statement uri..
             *
             * @param privacyStatementUri The privacy statement uri.
             * @return the next definition stage.
             */
            WithCreate withPrivacyStatementUri(String privacyStatementUri);
        }
        /** The stage of the GalleryImage definition allowing to specify releaseNoteUri. */
        interface WithReleaseNoteUri {
            /**
             * Specifies the releaseNoteUri property: The release note uri..
             *
             * @param releaseNoteUri The release note uri.
             * @return the next definition stage.
             */
            WithCreate withReleaseNoteUri(String releaseNoteUri);
        }
        /** The stage of the GalleryImage definition allowing to specify osType. */
        interface WithOsType {
            /**
             * Specifies the osType property: This property allows you to specify the type of the OS that is included in
             * the disk when creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are:
             * &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
             *
             * @param osType This property allows you to specify the type of the OS that is included in the disk when
             *     creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt;
             *     **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
             * @return the next definition stage.
             */
            WithCreate withOsType(OperatingSystemTypes osType);
        }
        /** The stage of the GalleryImage definition allowing to specify osState. */
        interface WithOsState {
            /**
             * Specifies the osState property: This property allows the user to specify whether the virtual machines
             * created under this image are 'Generalized' or 'Specialized'..
             *
             * @param osState This property allows the user to specify whether the virtual machines created under this
             *     image are 'Generalized' or 'Specialized'.
             * @return the next definition stage.
             */
            WithCreate withOsState(OperatingSystemStateTypes osState);
        }
        /** The stage of the GalleryImage definition allowing to specify hyperVGeneration. */
        interface WithHyperVGeneration {
            /**
             * Specifies the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to
             * OS disks only..
             *
             * @param hyperVGeneration The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
             * @return the next definition stage.
             */
            WithCreate withHyperVGeneration(HyperVGeneration hyperVGeneration);
        }
        /** The stage of the GalleryImage definition allowing to specify endOfLifeDate. */
        interface WithEndOfLifeDate {
            /**
             * Specifies the endOfLifeDate property: The end of life date of the gallery image definition. This property
             * can be used for decommissioning purposes. This property is updatable..
             *
             * @param endOfLifeDate The end of life date of the gallery image definition. This property can be used for
             *     decommissioning purposes. This property is updatable.
             * @return the next definition stage.
             */
            WithCreate withEndOfLifeDate(OffsetDateTime endOfLifeDate);
        }
        /** The stage of the GalleryImage definition allowing to specify identifier. */
        interface WithIdentifier {
            /**
             * Specifies the identifier property: This is the gallery image definition identifier..
             *
             * @param identifier This is the gallery image definition identifier.
             * @return the next definition stage.
             */
            WithCreate withIdentifier(GalleryImageIdentifier identifier);
        }
        /** The stage of the GalleryImage definition allowing to specify recommended. */
        interface WithRecommended {
            /**
             * Specifies the recommended property: The properties describe the recommended machine configuration for
             * this Image Definition. These properties are updatable..
             *
             * @param recommended The properties describe the recommended machine configuration for this Image
             *     Definition. These properties are updatable.
             * @return the next definition stage.
             */
            WithCreate withRecommended(RecommendedMachineConfiguration recommended);
        }
        /** The stage of the GalleryImage definition allowing to specify disallowed. */
        interface WithDisallowed {
            /**
             * Specifies the disallowed property: Describes the disallowed disk types..
             *
             * @param disallowed Describes the disallowed disk types.
             * @return the next definition stage.
             */
            WithCreate withDisallowed(Disallowed disallowed);
        }
        /** The stage of the GalleryImage definition allowing to specify purchasePlan. */
        interface WithPurchasePlan {
            /**
             * Specifies the purchasePlan property: Describes the gallery image definition purchase plan. This is used
             * by marketplace images..
             *
             * @param purchasePlan Describes the gallery image definition purchase plan. This is used by marketplace
             *     images.
             * @return the next definition stage.
             */
            WithCreate withPurchasePlan(ImagePurchasePlan purchasePlan);
        }
        /** The stage of the GalleryImage definition allowing to specify features. */
        interface WithFeatures {
            /**
             * Specifies the features property: A list of gallery image features..
             *
             * @param features A list of gallery image features.
             * @return the next definition stage.
             */
            WithCreate withFeatures(List<GalleryImageFeature> features);
        }
    }
    /**
     * Begins update for the GalleryImage resource.
     *
     * @return the stage of resource update.
     */
    GalleryImage.Update update();

    /** The template for GalleryImage update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithDescription,
            UpdateStages.WithEula,
            UpdateStages.WithPrivacyStatementUri,
            UpdateStages.WithReleaseNoteUri,
            UpdateStages.WithOsType,
            UpdateStages.WithOsState,
            UpdateStages.WithHyperVGeneration,
            UpdateStages.WithEndOfLifeDate,
            UpdateStages.WithIdentifier,
            UpdateStages.WithRecommended,
            UpdateStages.WithDisallowed,
            UpdateStages.WithPurchasePlan,
            UpdateStages.WithFeatures {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        GalleryImage apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        GalleryImage apply(Context context);
    }
    /** The GalleryImage update stages. */
    interface UpdateStages {
        /** The stage of the GalleryImage update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags.
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the GalleryImage update allowing to specify description. */
        interface WithDescription {
            /**
             * Specifies the description property: The description of this gallery image definition resource. This
             * property is updatable..
             *
             * @param description The description of this gallery image definition resource. This property is updatable.
             * @return the next definition stage.
             */
            Update withDescription(String description);
        }
        /** The stage of the GalleryImage update allowing to specify eula. */
        interface WithEula {
            /**
             * Specifies the eula property: The Eula agreement for the gallery image definition..
             *
             * @param eula The Eula agreement for the gallery image definition.
             * @return the next definition stage.
             */
            Update withEula(String eula);
        }
        /** The stage of the GalleryImage update allowing to specify privacyStatementUri. */
        interface WithPrivacyStatementUri {
            /**
             * Specifies the privacyStatementUri property: The privacy statement uri..
             *
             * @param privacyStatementUri The privacy statement uri.
             * @return the next definition stage.
             */
            Update withPrivacyStatementUri(String privacyStatementUri);
        }
        /** The stage of the GalleryImage update allowing to specify releaseNoteUri. */
        interface WithReleaseNoteUri {
            /**
             * Specifies the releaseNoteUri property: The release note uri..
             *
             * @param releaseNoteUri The release note uri.
             * @return the next definition stage.
             */
            Update withReleaseNoteUri(String releaseNoteUri);
        }
        /** The stage of the GalleryImage update allowing to specify osType. */
        interface WithOsType {
            /**
             * Specifies the osType property: This property allows you to specify the type of the OS that is included in
             * the disk when creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are:
             * &lt;br&gt;&lt;br&gt; **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
             *
             * @param osType This property allows you to specify the type of the OS that is included in the disk when
             *     creating a VM from a managed image. &lt;br&gt;&lt;br&gt; Possible values are: &lt;br&gt;&lt;br&gt;
             *     **Windows** &lt;br&gt;&lt;br&gt; **Linux**.
             * @return the next definition stage.
             */
            Update withOsType(OperatingSystemTypes osType);
        }
        /** The stage of the GalleryImage update allowing to specify osState. */
        interface WithOsState {
            /**
             * Specifies the osState property: This property allows the user to specify whether the virtual machines
             * created under this image are 'Generalized' or 'Specialized'..
             *
             * @param osState This property allows the user to specify whether the virtual machines created under this
             *     image are 'Generalized' or 'Specialized'.
             * @return the next definition stage.
             */
            Update withOsState(OperatingSystemStateTypes osState);
        }
        /** The stage of the GalleryImage update allowing to specify hyperVGeneration. */
        interface WithHyperVGeneration {
            /**
             * Specifies the hyperVGeneration property: The hypervisor generation of the Virtual Machine. Applicable to
             * OS disks only..
             *
             * @param hyperVGeneration The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
             * @return the next definition stage.
             */
            Update withHyperVGeneration(HyperVGeneration hyperVGeneration);
        }
        /** The stage of the GalleryImage update allowing to specify endOfLifeDate. */
        interface WithEndOfLifeDate {
            /**
             * Specifies the endOfLifeDate property: The end of life date of the gallery image definition. This property
             * can be used for decommissioning purposes. This property is updatable..
             *
             * @param endOfLifeDate The end of life date of the gallery image definition. This property can be used for
             *     decommissioning purposes. This property is updatable.
             * @return the next definition stage.
             */
            Update withEndOfLifeDate(OffsetDateTime endOfLifeDate);
        }
        /** The stage of the GalleryImage update allowing to specify identifier. */
        interface WithIdentifier {
            /**
             * Specifies the identifier property: This is the gallery image definition identifier..
             *
             * @param identifier This is the gallery image definition identifier.
             * @return the next definition stage.
             */
            Update withIdentifier(GalleryImageIdentifier identifier);
        }
        /** The stage of the GalleryImage update allowing to specify recommended. */
        interface WithRecommended {
            /**
             * Specifies the recommended property: The properties describe the recommended machine configuration for
             * this Image Definition. These properties are updatable..
             *
             * @param recommended The properties describe the recommended machine configuration for this Image
             *     Definition. These properties are updatable.
             * @return the next definition stage.
             */
            Update withRecommended(RecommendedMachineConfiguration recommended);
        }
        /** The stage of the GalleryImage update allowing to specify disallowed. */
        interface WithDisallowed {
            /**
             * Specifies the disallowed property: Describes the disallowed disk types..
             *
             * @param disallowed Describes the disallowed disk types.
             * @return the next definition stage.
             */
            Update withDisallowed(Disallowed disallowed);
        }
        /** The stage of the GalleryImage update allowing to specify purchasePlan. */
        interface WithPurchasePlan {
            /**
             * Specifies the purchasePlan property: Describes the gallery image definition purchase plan. This is used
             * by marketplace images..
             *
             * @param purchasePlan Describes the gallery image definition purchase plan. This is used by marketplace
             *     images.
             * @return the next definition stage.
             */
            Update withPurchasePlan(ImagePurchasePlan purchasePlan);
        }
        /** The stage of the GalleryImage update allowing to specify features. */
        interface WithFeatures {
            /**
             * Specifies the features property: A list of gallery image features..
             *
             * @param features A list of gallery image features.
             * @return the next definition stage.
             */
            Update withFeatures(List<GalleryImageFeature> features);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    GalleryImage refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    GalleryImage refresh(Context context);
}
