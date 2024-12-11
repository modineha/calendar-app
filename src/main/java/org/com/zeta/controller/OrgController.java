package org.com.zeta.controller;

import org.com.zeta.model.Organization;
import org.com.zeta.service.OrgService;

public class OrgController {

    public OrgService orgService = new OrgService();

    public void AddOrg(String orgId, String orgName)
    {
        Organization organization = new Organization(orgId, orgName);
        orgService.AddOrganisation(organization);
    }
}
