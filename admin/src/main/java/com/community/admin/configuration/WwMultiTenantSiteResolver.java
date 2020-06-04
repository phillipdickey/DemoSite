package com.community.admin.configuration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.broadleafcommerce.common.site.domain.Site;
import org.springframework.web.context.request.WebRequest;

import com.broadleafcommerce.tenant.web.resolver.MultiTenantSiteResolver;
import com.broadleafcommerce.tenant.web.resolver.SiteRequest;

public class WwMultiTenantSiteResolver extends MultiTenantSiteResolver {
	private static final Log logger = LogFactory.getLog(WwMultiTenantSiteResolver.class);

	@Override
	public SiteRequest getSiteRequest(WebRequest request) {
		logger.info("Getting site request from WW site resolver");
		return super.getSiteRequest(request);
	}

	@Override
	protected Site resolveSiteInternal(WebRequest request, boolean allowNullSite) {
		logger.info("Resolving site internally from WW site resolver");
		return super.resolveSiteInternal(request, allowNullSite);
	}
}
