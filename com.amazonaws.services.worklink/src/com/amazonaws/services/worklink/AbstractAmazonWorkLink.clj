(ns com.amazonaws.services.worklink.AbstractAmazonWorkLink
  "Abstract implementation of AmazonWorkLink. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.worklink AbstractAmazonWorkLink]))

(defn list-website-certificate-authorities
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesRequest`

  returns: Result of the ListWebsiteCertificateAuthorities operation returned by the service. - `com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesResult`"
  (^com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesRequest request]
    (-> this (.listWebsiteCertificateAuthorities request))))

(defn update-fleet-metadata
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.UpdateFleetMetadataRequest`

  returns: Result of the UpdateFleetMetadata operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateFleetMetadataResult`"
  (^com.amazonaws.services.worklink.model.UpdateFleetMetadataResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.UpdateFleetMetadataRequest request]
    (-> this (.updateFleetMetadata request))))

(defn describe-company-network-configuration
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationRequest`

  returns: Result of the DescribeCompanyNetworkConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationResult`"
  (^com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationRequest request]
    (-> this (.describeCompanyNetworkConfiguration request))))

(defn delete-fleet
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.DeleteFleetRequest`

  returns: Result of the DeleteFleet operation returned by the service. - `com.amazonaws.services.worklink.model.DeleteFleetResult`"
  (^com.amazonaws.services.worklink.model.DeleteFleetResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.DeleteFleetRequest request]
    (-> this (.deleteFleet request))))

(defn describe-website-certificate-authority
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityRequest`

  returns: Result of the DescribeWebsiteCertificateAuthority operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityResult`"
  (^com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityRequest request]
    (-> this (.describeWebsiteCertificateAuthority request))))

(defn describe-audit-stream-configuration
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationRequest`

  returns: Result of the DescribeAuditStreamConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationResult`"
  (^com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationRequest request]
    (-> this (.describeAuditStreamConfiguration request))))

(defn disassociate-website-certificate-authority
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityRequest`

  returns: Result of the DisassociateWebsiteCertificateAuthority operation returned by the service. - `com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityResult`"
  (^com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityRequest request]
    (-> this (.disassociateWebsiteCertificateAuthority request))))

(defn describe-device-policy-configuration
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationRequest`

  returns: Result of the DescribeDevicePolicyConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationResult`"
  (^com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationRequest request]
    (-> this (.describeDevicePolicyConfiguration request))))

(defn create-fleet
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.CreateFleetRequest`

  returns: Result of the CreateFleet operation returned by the service. - `com.amazonaws.services.worklink.model.CreateFleetResult`"
  (^com.amazonaws.services.worklink.model.CreateFleetResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.CreateFleetRequest request]
    (-> this (.createFleet request))))

(defn list-devices
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.ListDevicesRequest`

  returns: Result of the ListDevices operation returned by the service. - `com.amazonaws.services.worklink.model.ListDevicesResult`"
  (^com.amazonaws.services.worklink.model.ListDevicesResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.ListDevicesRequest request]
    (-> this (.listDevices request))))

(defn associate-website-authorization-provider
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderRequest`

  returns: Result of the AssociateWebsiteAuthorizationProvider operation returned by the service. - `com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderResult`"
  (^com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderRequest request]
    (-> this (.associateWebsiteAuthorizationProvider request))))

(defn disassociate-website-authorization-provider
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderRequest`

  returns: Result of the DisassociateWebsiteAuthorizationProvider operation returned by the service. - `com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderResult`"
  (^com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderRequest request]
    (-> this (.disassociateWebsiteAuthorizationProvider request))))

(defn update-domain-metadata
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.UpdateDomainMetadataRequest`

  returns: Result of the UpdateDomainMetadata operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateDomainMetadataResult`"
  (^com.amazonaws.services.worklink.model.UpdateDomainMetadataResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.UpdateDomainMetadataRequest request]
    (-> this (.updateDomainMetadata request))))

(defn describe-device
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.DescribeDeviceRequest`

  returns: Result of the DescribeDevice operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeDeviceResult`"
  (^com.amazonaws.services.worklink.model.DescribeDeviceResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeDeviceRequest request]
    (-> this (.describeDevice request))))

(defn restore-domain-access
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.RestoreDomainAccessRequest`

  returns: Result of the RestoreDomainAccess operation returned by the service. - `com.amazonaws.services.worklink.model.RestoreDomainAccessResult`"
  (^com.amazonaws.services.worklink.model.RestoreDomainAccessResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.RestoreDomainAccessRequest request]
    (-> this (.restoreDomainAccess request))))

(defn associate-domain
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.AssociateDomainRequest`

  returns: Result of the AssociateDomain operation returned by the service. - `com.amazonaws.services.worklink.model.AssociateDomainResult`"
  (^com.amazonaws.services.worklink.model.AssociateDomainResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.AssociateDomainRequest request]
    (-> this (.associateDomain request))))

(defn shutdown
  "Description copied from interface: AmazonWorkLink"
  ([^AbstractAmazonWorkLink this]
    (-> this (.shutdown))))

(defn update-audit-stream-configuration
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationRequest`

  returns: Result of the UpdateAuditStreamConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationResult`"
  (^com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationRequest request]
    (-> this (.updateAuditStreamConfiguration request))))

(defn update-identity-provider-configuration
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationRequest`

  returns: Result of the UpdateIdentityProviderConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationResult`"
  (^com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationRequest request]
    (-> this (.updateIdentityProviderConfiguration request))))

(defn list-domains
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.ListDomainsRequest`

  returns: Result of the ListDomains operation returned by the service. - `com.amazonaws.services.worklink.model.ListDomainsResult`"
  (^com.amazonaws.services.worklink.model.ListDomainsResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.ListDomainsRequest request]
    (-> this (.listDomains request))))

(defn update-company-network-configuration
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationRequest`

  returns: Result of the UpdateCompanyNetworkConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationResult`"
  (^com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationRequest request]
    (-> this (.updateCompanyNetworkConfiguration request))))

(defn disassociate-domain
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.DisassociateDomainRequest`

  returns: Result of the DisassociateDomain operation returned by the service. - `com.amazonaws.services.worklink.model.DisassociateDomainResult`"
  (^com.amazonaws.services.worklink.model.DisassociateDomainResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.DisassociateDomainRequest request]
    (-> this (.disassociateDomain request))))

(defn sign-out-user
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.SignOutUserRequest`

  returns: Result of the SignOutUser operation returned by the service. - `com.amazonaws.services.worklink.model.SignOutUserResult`"
  (^com.amazonaws.services.worklink.model.SignOutUserResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.SignOutUserRequest request]
    (-> this (.signOutUser request))))

(defn describe-domain
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.DescribeDomainRequest`

  returns: Result of the DescribeDomain operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeDomainResult`"
  (^com.amazonaws.services.worklink.model.DescribeDomainResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeDomainRequest request]
    (-> this (.describeDomain request))))

(defn describe-identity-provider-configuration
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationRequest`

  returns: Result of the DescribeIdentityProviderConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationResult`"
  (^com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationRequest request]
    (-> this (.describeIdentityProviderConfiguration request))))

(defn list-fleets
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.ListFleetsRequest`

  returns: Result of the ListFleets operation returned by the service. - `com.amazonaws.services.worklink.model.ListFleetsResult`"
  (^com.amazonaws.services.worklink.model.ListFleetsResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.ListFleetsRequest request]
    (-> this (.listFleets request))))

(defn update-device-policy-configuration
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationRequest`

  returns: Result of the UpdateDevicePolicyConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationResult`"
  (^com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationRequest request]
    (-> this (.updateDevicePolicyConfiguration request))))

(defn associate-website-certificate-authority
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityRequest`

  returns: Result of the AssociateWebsiteCertificateAuthority operation returned by the service. - `com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityResult`"
  (^com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityRequest request]
    (-> this (.associateWebsiteCertificateAuthority request))))

(defn describe-fleet-metadata
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.DescribeFleetMetadataRequest`

  returns: Result of the DescribeFleetMetadata operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeFleetMetadataResult`"
  (^com.amazonaws.services.worklink.model.DescribeFleetMetadataResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeFleetMetadataRequest request]
    (-> this (.describeFleetMetadata request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonWorkLink

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonWorkLink this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn revoke-domain-access
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.RevokeDomainAccessRequest`

  returns: Result of the RevokeDomainAccess operation returned by the service. - `com.amazonaws.services.worklink.model.RevokeDomainAccessResult`"
  (^com.amazonaws.services.worklink.model.RevokeDomainAccessResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.RevokeDomainAccessRequest request]
    (-> this (.revokeDomainAccess request))))

(defn list-website-authorization-providers
  "Description copied from interface: AmazonWorkLink

  request - `com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersRequest`

  returns: Result of the ListWebsiteAuthorizationProviders operation returned by the service. - `com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersResult`"
  (^com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersResult [^AbstractAmazonWorkLink this ^com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersRequest request]
    (-> this (.listWebsiteAuthorizationProviders request))))

