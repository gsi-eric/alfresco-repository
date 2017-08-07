/*
 * #%L
 * Alfresco Repository
 * %%
 * Copyright (C) 2005 - 2017 Alfresco Software Limited
 * %%
 * This file is part of the Alfresco software. 
 * If the software was purchased under a paid Alfresco license, the terms of 
 * the paid license agreement will prevail.  Otherwise, the software is 
 * provided under the following open source license terms:
 * 
 * Alfresco is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Alfresco is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with Alfresco. If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package org.alfresco;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AppContextExtra02TestSuite extends TestSuite
{
    public static Test suite()
    {
        TestSuite suite = new TestSuite();

        // any other order may lead to failing tests
        AllRepositoryTestsCatalogue.applicationContext_virtualizationTestContext(suite);
        AllRepositoryTestsCatalogue.applicationContext_testSubscriptionsContext(suite);
        AllRepositoryTestsCatalogue.applicationContext_openCmisContext(suite);
        AllRepositoryTestsCatalogue.applicationContext_cacheTestContext(suite);
        // TODO Uncomment the following line after REPO-2790 is implemented
        // AllRepositoryTestsCatalogue.applicationContext_mtAllContext(suite);

        return suite;
    }
}
