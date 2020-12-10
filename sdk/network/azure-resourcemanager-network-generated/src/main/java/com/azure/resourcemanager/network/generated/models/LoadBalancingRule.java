// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated.models;

import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.generated.fluent.models.LoadBalancingRuleInner;

/** An immutable client-side representation of LoadBalancingRule. */
public interface LoadBalancingRule {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource that is unique within the set of load balancing rules used by
     * the load balancer. This name can be used to access the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the type property: Type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the frontendIpConfiguration property: A reference to frontend IP addresses.
     *
     * @return the frontendIpConfiguration value.
     */
    SubResource frontendIpConfiguration();

    /**
     * Gets the backendAddressPool property: A reference to a pool of DIPs. Inbound traffic is randomly load balanced
     * across IPs in the backend IPs.
     *
     * @return the backendAddressPool value.
     */
    SubResource backendAddressPool();

    /**
     * Gets the probe property: The reference to the load balancer probe used by the load balancing rule.
     *
     * @return the probe value.
     */
    SubResource probe();

    /**
     * Gets the protocol property: The reference to the transport protocol used by the load balancing rule.
     *
     * @return the protocol value.
     */
    TransportProtocol protocol();

    /**
     * Gets the loadDistribution property: The load distribution policy for this rule.
     *
     * @return the loadDistribution value.
     */
    LoadDistribution loadDistribution();

    /**
     * Gets the frontendPort property: The port for the external endpoint. Port numbers for each rule must be unique
     * within the Load Balancer. Acceptable values are between 0 and 65534. Note that value 0 enables "Any Port".
     *
     * @return the frontendPort value.
     */
    Integer frontendPort();

    /**
     * Gets the backendPort property: The port used for internal connections on the endpoint. Acceptable values are
     * between 0 and 65535. Note that value 0 enables "Any Port".
     *
     * @return the backendPort value.
     */
    Integer backendPort();

    /**
     * Gets the idleTimeoutInMinutes property: The timeout for the TCP idle connection. The value can be set between 4
     * and 30 minutes. The default value is 4 minutes. This element is only used when the protocol is set to TCP.
     *
     * @return the idleTimeoutInMinutes value.
     */
    Integer idleTimeoutInMinutes();

    /**
     * Gets the enableFloatingIp property: Configures a virtual machine's endpoint for the floating IP capability
     * required to configure a SQL AlwaysOn Availability Group. This setting is required when using the SQL AlwaysOn
     * Availability Groups in SQL server. This setting can't be changed after you create the endpoint.
     *
     * @return the enableFloatingIp value.
     */
    Boolean enableFloatingIp();

    /**
     * Gets the enableTcpReset property: Receive bidirectional TCP Reset on TCP flow idle timeout or unexpected
     * connection termination. This element is only used when the protocol is set to TCP.
     *
     * @return the enableTcpReset value.
     */
    Boolean enableTcpReset();

    /**
     * Gets the disableOutboundSnat property: Configures SNAT for the VMs in the backend pool to use the publicIP
     * address specified in the frontend of the load balancing rule.
     *
     * @return the disableOutboundSnat value.
     */
    Boolean disableOutboundSnat();

    /**
     * Gets the provisioningState property: The provisioning state of the load balancing rule resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.network.generated.fluent.models.LoadBalancingRuleInner object.
     *
     * @return the inner object.
     */
    LoadBalancingRuleInner innerModel();
}
