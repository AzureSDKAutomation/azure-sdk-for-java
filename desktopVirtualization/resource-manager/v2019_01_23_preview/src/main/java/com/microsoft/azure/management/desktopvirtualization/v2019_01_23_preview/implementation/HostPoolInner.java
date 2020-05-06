/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.implementation;

import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.HostPoolType;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.PersonalDesktopAssignmentType;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.LoadBalancerType;
import com.microsoft.azure.management.desktopvirtualization.v2019_01_23_preview.RegistrationInfo;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Represents a HostPool definition.
 */
@JsonFlatten
public class HostPoolInner extends Resource {
    /**
     * Friendly name of HostPool.
     */
    @JsonProperty(value = "properties.friendlyName")
    private String friendlyName;

    /**
     * Description of HostPool.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * HostPool type for desktop. Possible values include: 'Personal',
     * 'Pooled'.
     */
    @JsonProperty(value = "properties.hostPoolType")
    private HostPoolType hostPoolType;

    /**
     * PersonalDesktopAssignment type for HostPool. Possible values include:
     * 'Automatic', 'Direct'.
     */
    @JsonProperty(value = "properties.personalDesktopAssignmentType")
    private PersonalDesktopAssignmentType personalDesktopAssignmentType;

    /**
     * Custom rdp property of HostPool.
     */
    @JsonProperty(value = "properties.customRdpProperty")
    private String customRdpProperty;

    /**
     * The max session limit of HostPool.
     */
    @JsonProperty(value = "properties.maxSessionLimit")
    private Integer maxSessionLimit;

    /**
     * The type of the load balancer. Possible values include: 'BreadthFirst',
     * 'DepthFirst', 'Persistent'.
     */
    @JsonProperty(value = "properties.loadBalancerType")
    private LoadBalancerType loadBalancerType;

    /**
     * The ring number of HostPool.
     */
    @JsonProperty(value = "properties.ring")
    private Integer ring;

    /**
     * Is validation environment.
     */
    @JsonProperty(value = "properties.validationEnvironment")
    private Boolean validationEnvironment;

    /**
     * The registration info of HostPool.
     */
    @JsonProperty(value = "properties.registrationInfo")
    private RegistrationInfo registrationInfo;

    /**
     * VM template for sessionhosts configuration within hostpool.
     */
    @JsonProperty(value = "properties.vmTemplate")
    private String vmTemplate;

    /**
     * List of applicationGroup links.
     */
    @JsonProperty(value = "properties.applicationGroupReferences", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> applicationGroupReferences;

    /**
     * Path to keyvault containing ssoContext secret.
     */
    @JsonProperty(value = "properties.ssoContext")
    private String ssoContext;

    /**
     * Get friendly name of HostPool.
     *
     * @return the friendlyName value
     */
    public String friendlyName() {
        return this.friendlyName;
    }

    /**
     * Set friendly name of HostPool.
     *
     * @param friendlyName the friendlyName value to set
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * Get description of HostPool.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description of HostPool.
     *
     * @param description the description value to set
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get hostPool type for desktop. Possible values include: 'Personal', 'Pooled'.
     *
     * @return the hostPoolType value
     */
    public HostPoolType hostPoolType() {
        return this.hostPoolType;
    }

    /**
     * Set hostPool type for desktop. Possible values include: 'Personal', 'Pooled'.
     *
     * @param hostPoolType the hostPoolType value to set
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withHostPoolType(HostPoolType hostPoolType) {
        this.hostPoolType = hostPoolType;
        return this;
    }

    /**
     * Get personalDesktopAssignment type for HostPool. Possible values include: 'Automatic', 'Direct'.
     *
     * @return the personalDesktopAssignmentType value
     */
    public PersonalDesktopAssignmentType personalDesktopAssignmentType() {
        return this.personalDesktopAssignmentType;
    }

    /**
     * Set personalDesktopAssignment type for HostPool. Possible values include: 'Automatic', 'Direct'.
     *
     * @param personalDesktopAssignmentType the personalDesktopAssignmentType value to set
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withPersonalDesktopAssignmentType(PersonalDesktopAssignmentType personalDesktopAssignmentType) {
        this.personalDesktopAssignmentType = personalDesktopAssignmentType;
        return this;
    }

    /**
     * Get custom rdp property of HostPool.
     *
     * @return the customRdpProperty value
     */
    public String customRdpProperty() {
        return this.customRdpProperty;
    }

    /**
     * Set custom rdp property of HostPool.
     *
     * @param customRdpProperty the customRdpProperty value to set
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withCustomRdpProperty(String customRdpProperty) {
        this.customRdpProperty = customRdpProperty;
        return this;
    }

    /**
     * Get the max session limit of HostPool.
     *
     * @return the maxSessionLimit value
     */
    public Integer maxSessionLimit() {
        return this.maxSessionLimit;
    }

    /**
     * Set the max session limit of HostPool.
     *
     * @param maxSessionLimit the maxSessionLimit value to set
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withMaxSessionLimit(Integer maxSessionLimit) {
        this.maxSessionLimit = maxSessionLimit;
        return this;
    }

    /**
     * Get the type of the load balancer. Possible values include: 'BreadthFirst', 'DepthFirst', 'Persistent'.
     *
     * @return the loadBalancerType value
     */
    public LoadBalancerType loadBalancerType() {
        return this.loadBalancerType;
    }

    /**
     * Set the type of the load balancer. Possible values include: 'BreadthFirst', 'DepthFirst', 'Persistent'.
     *
     * @param loadBalancerType the loadBalancerType value to set
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withLoadBalancerType(LoadBalancerType loadBalancerType) {
        this.loadBalancerType = loadBalancerType;
        return this;
    }

    /**
     * Get the ring number of HostPool.
     *
     * @return the ring value
     */
    public Integer ring() {
        return this.ring;
    }

    /**
     * Set the ring number of HostPool.
     *
     * @param ring the ring value to set
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withRing(Integer ring) {
        this.ring = ring;
        return this;
    }

    /**
     * Get is validation environment.
     *
     * @return the validationEnvironment value
     */
    public Boolean validationEnvironment() {
        return this.validationEnvironment;
    }

    /**
     * Set is validation environment.
     *
     * @param validationEnvironment the validationEnvironment value to set
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withValidationEnvironment(Boolean validationEnvironment) {
        this.validationEnvironment = validationEnvironment;
        return this;
    }

    /**
     * Get the registration info of HostPool.
     *
     * @return the registrationInfo value
     */
    public RegistrationInfo registrationInfo() {
        return this.registrationInfo;
    }

    /**
     * Set the registration info of HostPool.
     *
     * @param registrationInfo the registrationInfo value to set
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withRegistrationInfo(RegistrationInfo registrationInfo) {
        this.registrationInfo = registrationInfo;
        return this;
    }

    /**
     * Get vM template for sessionhosts configuration within hostpool.
     *
     * @return the vmTemplate value
     */
    public String vmTemplate() {
        return this.vmTemplate;
    }

    /**
     * Set vM template for sessionhosts configuration within hostpool.
     *
     * @param vmTemplate the vmTemplate value to set
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withVmTemplate(String vmTemplate) {
        this.vmTemplate = vmTemplate;
        return this;
    }

    /**
     * Get list of applicationGroup links.
     *
     * @return the applicationGroupReferences value
     */
    public List<String> applicationGroupReferences() {
        return this.applicationGroupReferences;
    }

    /**
     * Get path to keyvault containing ssoContext secret.
     *
     * @return the ssoContext value
     */
    public String ssoContext() {
        return this.ssoContext;
    }

    /**
     * Set path to keyvault containing ssoContext secret.
     *
     * @param ssoContext the ssoContext value to set
     * @return the HostPoolInner object itself.
     */
    public HostPoolInner withSsoContext(String ssoContext) {
        this.ssoContext = ssoContext;
        return this;
    }

}
