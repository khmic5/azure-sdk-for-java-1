// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of L3IsolationDomains. */
public interface L3IsolationDomains {
    /**
     * Gets a L3 Isolation Domain.
     *
     * <p>Retrieves details of this L3 Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L3IsolationDomain resource definition along with {@link Response}.
     */
    Response<L3IsolationDomain> getByResourceGroupWithResponse(
        String resourceGroupName, String l3IsolationDomainName, Context context);

    /**
     * Gets a L3 Isolation Domain.
     *
     * <p>Retrieves details of this L3 Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L3IsolationDomain resource definition.
     */
    L3IsolationDomain getByResourceGroup(String resourceGroupName, String l3IsolationDomainName);

    /**
     * Deletes a L3 Isolation Domain.
     *
     * <p>Deletes layer 3 connectivity between compute nodes by managed by named L3 Isolation name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByResourceGroup(String resourceGroupName, String l3IsolationDomainName);

    /**
     * Deletes a L3 Isolation Domain.
     *
     * <p>Deletes layer 3 connectivity between compute nodes by managed by named L3 Isolation name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3 Isolation Domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String l3IsolationDomainName, Context context);

    /**
     * List L3IsolationDomains by resource group.
     *
     * <p>Displays L3IsolationDomains list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of L3IsolationDomains as paginated response with {@link PagedIterable}.
     */
    PagedIterable<L3IsolationDomain> listByResourceGroup(String resourceGroupName);

    /**
     * List L3IsolationDomains by resource group.
     *
     * <p>Displays L3IsolationDomains list by resource group GET method.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of L3IsolationDomains as paginated response with {@link PagedIterable}.
     */
    PagedIterable<L3IsolationDomain> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * List L3IsolationDomains by subscription.
     *
     * <p>Displays L3IsolationDomains list by subscription GET method.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of L3IsolationDomains as paginated response with {@link PagedIterable}.
     */
    PagedIterable<L3IsolationDomain> list();

    /**
     * List L3IsolationDomains by subscription.
     *
     * <p>Displays L3IsolationDomains list by subscription GET method.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of L3IsolationDomains as paginated response with {@link PagedIterable}.
     */
    PagedIterable<L3IsolationDomain> list(Context context);

    /**
     * executes enable operation to the underlying resources.
     *
     * <p>Enables racks for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateAdministrativeState(
        String resourceGroupName, String l3IsolationDomainName, UpdateAdministrativeState body);

    /**
     * executes enable operation to the underlying resources.
     *
     * <p>Enables racks for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateAdministrativeState(
        String resourceGroupName, String l3IsolationDomainName, UpdateAdministrativeState body, Context context);

    /**
     * Update route targets on CE devices. List the CE network device ARM resource IDs in the request body payload.
     *
     * <p>Update administrative state of option B on CE devices.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateOptionBAdministrativeState(
        String resourceGroupName, String l3IsolationDomainName, UpdateAdministrativeState body);

    /**
     * Update route targets on CE devices. List the CE network device ARM resource IDs in the request body payload.
     *
     * <p>Update administrative state of option B on CE devices.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void updateOptionBAdministrativeState(
        String resourceGroupName, String l3IsolationDomainName, UpdateAdministrativeState body, Context context);

    /**
     * executes clear ARP operation to the underlying resources.
     *
     * <p>Clears ARP tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void clearArpTable(String resourceGroupName, String l3IsolationDomainName, EnableDisableOnResources body);

    /**
     * executes clear ARP operation to the underlying resources.
     *
     * <p>Clears ARP tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void clearArpTable(
        String resourceGroupName, String l3IsolationDomainName, EnableDisableOnResources body, Context context);

    /**
     * executes ipv6 clear neighbor tables operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbor tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void clearNeighborTable(String resourceGroupName, String l3IsolationDomainName, EnableDisableOnResources body);

    /**
     * executes ipv6 clear neighbor tables operation to the underlying resources.
     *
     * <p>Clears IPv6 neighbor tables for this Isolation Domain.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param l3IsolationDomainName Name of the L3IsolationDomain.
     * @param body Request payload.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void clearNeighborTable(
        String resourceGroupName, String l3IsolationDomainName, EnableDisableOnResources body, Context context);

    /**
     * Gets a L3 Isolation Domain.
     *
     * <p>Retrieves details of this L3 Isolation Domain.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L3IsolationDomain resource definition along with {@link Response}.
     */
    L3IsolationDomain getById(String id);

    /**
     * Gets a L3 Isolation Domain.
     *
     * <p>Retrieves details of this L3 Isolation Domain.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the L3IsolationDomain resource definition along with {@link Response}.
     */
    Response<L3IsolationDomain> getByIdWithResponse(String id, Context context);

    /**
     * Deletes a L3 Isolation Domain.
     *
     * <p>Deletes layer 3 connectivity between compute nodes by managed by named L3 Isolation name.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes a L3 Isolation Domain.
     *
     * <p>Deletes layer 3 connectivity between compute nodes by managed by named L3 Isolation name.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new L3IsolationDomain resource.
     *
     * @param name resource name.
     * @return the first stage of the new L3IsolationDomain definition.
     */
    L3IsolationDomain.DefinitionStages.Blank define(String name);
}
