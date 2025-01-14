// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.implementation;

import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.RoutePolicyInner;
import com.azure.resourcemanager.managednetworkfabric.models.ProvisioningState;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicyPatch;
import com.azure.resourcemanager.managednetworkfabric.models.RoutePolicyStatementProperties;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class RoutePolicyImpl implements RoutePolicy, RoutePolicy.Definition, RoutePolicy.Update {
    private RoutePolicyInner innerObject;

    private final com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public String location() {
        return this.innerModel().location();
    }

    public Map<String, String> tags() {
        Map<String, String> inner = this.innerModel().tags();
        if (inner != null) {
            return Collections.unmodifiableMap(inner);
        } else {
            return Collections.emptyMap();
        }
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public List<RoutePolicyStatementProperties> statements() {
        List<RoutePolicyStatementProperties> inner = this.innerModel().statements();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ProvisioningState provisioningState() {
        return this.innerModel().provisioningState();
    }

    public String annotation() {
        return this.innerModel().annotation();
    }

    public Region region() {
        return Region.fromName(this.regionName());
    }

    public String regionName() {
        return this.location();
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public RoutePolicyInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String routePolicyName;

    private RoutePolicyPatch updateBody;

    public RoutePolicyImpl withExistingResourceGroup(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    public RoutePolicy create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoutePolicies()
                .create(resourceGroupName, routePolicyName, this.innerModel(), Context.NONE);
        return this;
    }

    public RoutePolicy create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoutePolicies()
                .create(resourceGroupName, routePolicyName, this.innerModel(), context);
        return this;
    }

    RoutePolicyImpl(
        String name, com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = new RoutePolicyInner();
        this.serviceManager = serviceManager;
        this.routePolicyName = name;
    }

    public RoutePolicyImpl update() {
        this.updateBody = new RoutePolicyPatch();
        return this;
    }

    public RoutePolicy apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoutePolicies()
                .update(resourceGroupName, routePolicyName, updateBody, Context.NONE);
        return this;
    }

    public RoutePolicy apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoutePolicies()
                .update(resourceGroupName, routePolicyName, updateBody, context);
        return this;
    }

    RoutePolicyImpl(
        RoutePolicyInner innerObject,
        com.azure.resourcemanager.managednetworkfabric.ManagedNetworkFabricManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.routePolicyName = Utils.getValueFromIdByName(innerObject.id(), "routePolicies");
    }

    public RoutePolicy refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoutePolicies()
                .getByResourceGroupWithResponse(resourceGroupName, routePolicyName, Context.NONE)
                .getValue();
        return this;
    }

    public RoutePolicy refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getRoutePolicies()
                .getByResourceGroupWithResponse(resourceGroupName, routePolicyName, context)
                .getValue();
        return this;
    }

    public RoutePolicyImpl withRegion(Region location) {
        this.innerModel().withLocation(location.toString());
        return this;
    }

    public RoutePolicyImpl withRegion(String location) {
        this.innerModel().withLocation(location);
        return this;
    }

    public RoutePolicyImpl withStatements(List<RoutePolicyStatementProperties> statements) {
        this.innerModel().withStatements(statements);
        return this;
    }

    public RoutePolicyImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.innerModel().withTags(tags);
            return this;
        } else {
            this.updateBody.withTags(tags);
            return this;
        }
    }

    public RoutePolicyImpl withAnnotation(String annotation) {
        this.innerModel().withAnnotation(annotation);
        return this;
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
