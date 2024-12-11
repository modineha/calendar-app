package org.com.zeta.service;

import org.com.zeta.model.Organization;

import java.util.HashMap;
import java.util.Map;

public class OrgService {

    Map<String, Organization> organizationData = new HashMap<>();

    public void AddOrganisation(Organization organization)
    {
        if(organization == null)
        {
            System.out.println("Organization is null");
            return;
        }

        organizationData.put(organization.getId(), organization);
    }
}
