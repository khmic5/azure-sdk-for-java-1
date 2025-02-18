// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.NetworkToNetworkInterconnectInner;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.EnabledDisabledState;
import com.azure.resourcemanager.managednetworkfabric.models.Layer2Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.Layer3Configuration;
import com.azure.resourcemanager.managednetworkfabric.models.NetworkToNetworkInterconnect;
import com.azure.resourcemanager.managednetworkfabric.models.NniType;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;

public final class NetworkToNetworkInterconnectImpl
    implements NetworkToNetworkInterconnect, NetworkToNetworkInterconnect.Definition {
    private NetworkToNetworkInterconnectInner innerObject;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    NetworkToNetworkInterconnectImpl(
        NetworkToNetworkInterconnectInner innerObject,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public NniType nniType() {
        return this.innerModel().nniType();
    }

    public EnabledDisabledState administrativeState() {
        return this.innerModel().administrativeState();
    }

    public BooleanEnumProperty isManagementType() {
        return this.innerModel().isManagementType();
    }

    public BooleanEnumProperty useOptionB() {
        return this.innerModel().useOptionB();
    }

    public Layer2Configuration layer2Configuration() {
        return this.innerModel().layer2Configuration();
    }

    public Layer3Configuration layer3Configuration() {
        return this.innerModel().layer3Configuration();
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public NetworkToNetworkInterconnectInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String networkFabricName;

    private String networkToNetworkInterconnectName;

    public NetworkToNetworkInterconnectImpl withExistingNetworkFabric(
        String resourceGroupName, String networkFabricName) {
        this.resourceGroupName = resourceGroupName;
        this.networkFabricName = networkFabricName;
        return this;
    }

    public NetworkToNetworkInterconnect create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkToNetworkInterconnects()
                .create(
                    resourceGroupName,
                    networkFabricName,
                    networkToNetworkInterconnectName,
                    this.innerModel(),
                    Context.NONE);
        return this;
    }

    public NetworkToNetworkInterconnect create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkToNetworkInterconnects()
                .create(
                    resourceGroupName, networkFabricName, networkToNetworkInterconnectName, this.innerModel(), context);
        return this;
    }

    NetworkToNetworkInterconnectImpl(
        String name, com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = new NetworkToNetworkInterconnectInner();
        this.serviceManager = serviceManager;
        this.networkToNetworkInterconnectName = name;
    }

    public NetworkToNetworkInterconnect refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkToNetworkInterconnects()
                .getWithResponse(resourceGroupName, networkFabricName, networkToNetworkInterconnectName, Context.NONE)
                .getValue();
        return this;
    }

    public NetworkToNetworkInterconnect refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getNetworkToNetworkInterconnects()
                .getWithResponse(resourceGroupName, networkFabricName, networkToNetworkInterconnectName, context)
                .getValue();
        return this;
    }

    public NetworkToNetworkInterconnectImpl withNniType(NniType nniType) {
        this.innerModel().withNniType(nniType);
        return this;
    }

    public NetworkToNetworkInterconnectImpl withIsManagementType(BooleanEnumProperty isManagementType) {
        this.innerModel().withIsManagementType(isManagementType);
        return this;
    }

    public NetworkToNetworkInterconnectImpl withUseOptionB(BooleanEnumProperty useOptionB) {
        this.innerModel().withUseOptionB(useOptionB);
        return this;
    }

    public NetworkToNetworkInterconnectImpl withLayer2Configuration(Layer2Configuration layer2Configuration) {
        this.innerModel().withLayer2Configuration(layer2Configuration);
        return this;
    }

    public NetworkToNetworkInterconnectImpl withLayer3Configuration(Layer3Configuration layer3Configuration) {
        this.innerModel().withLayer3Configuration(layer3Configuration);
        return this;
    }
}
