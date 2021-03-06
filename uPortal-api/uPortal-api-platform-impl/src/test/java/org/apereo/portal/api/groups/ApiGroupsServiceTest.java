/**
 * Licensed to Apereo under one or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information regarding copyright ownership. Apereo
 * licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the License at the
 * following location:
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apereo.portal.api.groups;

import java.util.Set;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ApiGroupsServiceTest {

    ApiGroupsService apiGroupsService;

    @Before
    public void setup() {
        apiGroupsService = new ApiGroupsService();
    }

    @Test
    public void testGetGroupsForMemberNull() {
        Set<Entity> groups = apiGroupsService.getGroupsForMember(null);
        Assert.assertTrue(groups.isEmpty());
    }

    @Test
    public void testGetGroupsForMemberEmpty() {
        Set<Entity> groups = apiGroupsService.getGroupsForMember("");
        Assert.assertTrue(groups.isEmpty());
    }
}
