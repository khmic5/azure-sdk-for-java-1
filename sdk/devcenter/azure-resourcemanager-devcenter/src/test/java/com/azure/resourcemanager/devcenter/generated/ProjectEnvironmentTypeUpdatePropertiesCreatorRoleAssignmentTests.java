// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.EnvironmentRole;
import com.azure.resourcemanager.devcenter.models.ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment;
import java.util.HashMap;
import java.util.Map;

public final class ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignmentTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment model =
            BinaryData
                .fromString(
                    "{\"roles\":{\"azqugxywpmueefj\":{\"roleName\":\"ermclfplphoxuscr\",\"description\":\"bgyepsbj\"},\"tcc\":{\"roleName\":\"fqkquj\",\"description\":\"suyonobglaocq\"},\"hl\":{\"roleName\":\"yudxytlmoy\",\"description\":\"vwfudwpzntxhd\"},\"ca\":{\"roleName\":\"jbhckfrlhr\",\"description\":\"bkyvp\"}}}")
                .toObject(ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment model =
            new ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment()
                .withRoles(
                    mapOf(
                        "azqugxywpmueefj",
                        new EnvironmentRole(),
                        "tcc",
                        new EnvironmentRole(),
                        "hl",
                        new EnvironmentRole(),
                        "ca",
                        new EnvironmentRole()));
        model =
            BinaryData.fromObject(model).toObject(ProjectEnvironmentTypeUpdatePropertiesCreatorRoleAssignment.class);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
