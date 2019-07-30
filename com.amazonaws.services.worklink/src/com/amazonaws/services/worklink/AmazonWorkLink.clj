(ns com.amazonaws.services.worklink.AmazonWorkLink
  "Interface for accessing WorkLink.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonWorkLink instead.



  Amazon WorkLink is a cloud-based service that provides secure access to internal websites and web apps from iOS
  phones. In a single step, your users, such as employees, can access internal websites as efficiently as they access
  any other public website. They enter a URL in their web browser, or choose a link to an internal website in an email.
  Amazon WorkLink authenticates the user's access and securely renders authorized internal web content in a secure
  rendering service in the AWS cloud. Amazon WorkLink doesn't download or store any internal web content on mobile
  devices."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.worklink AmazonWorkLink]))

(defn list-website-certificate-authorities
  "Retrieves a list of certificate authorities added for the current account and Region.

  list-website-certificate-authorities-request - `com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesRequest`

  returns: Result of the ListWebsiteCertificateAuthorities operation returned by the service. - `com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesRequest list-website-certificate-authorities-request]
    (-> this (.listWebsiteCertificateAuthorities list-website-certificate-authorities-request))))

(defn update-fleet-metadata
  "Updates fleet metadata, such as DisplayName.

  update-fleet-metadata-request - `com.amazonaws.services.worklink.model.UpdateFleetMetadataRequest`

  returns: Result of the UpdateFleetMetadata operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateFleetMetadataResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.UpdateFleetMetadataResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.UpdateFleetMetadataRequest update-fleet-metadata-request]
    (-> this (.updateFleetMetadata update-fleet-metadata-request))))

(defn describe-company-network-configuration
  "Describes the networking configuration to access the internal websites associated with the specified fleet.

  describe-company-network-configuration-request - `com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationRequest`

  returns: Result of the DescribeCompanyNetworkConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationRequest describe-company-network-configuration-request]
    (-> this (.describeCompanyNetworkConfiguration describe-company-network-configuration-request))))

(defn delete-fleet
  "Deletes a fleet. Prevents users from accessing previously associated websites.

  delete-fleet-request - `com.amazonaws.services.worklink.model.DeleteFleetRequest`

  returns: Result of the DeleteFleet operation returned by the service. - `com.amazonaws.services.worklink.model.DeleteFleetResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DeleteFleetResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.DeleteFleetRequest delete-fleet-request]
    (-> this (.deleteFleet delete-fleet-request))))

(defn describe-website-certificate-authority
  "Provides information about the certificate authority.

  describe-website-certificate-authority-request - `com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityRequest`

  returns: Result of the DescribeWebsiteCertificateAuthority operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityRequest describe-website-certificate-authority-request]
    (-> this (.describeWebsiteCertificateAuthority describe-website-certificate-authority-request))))

(defn describe-audit-stream-configuration
  "Describes the configuration for delivering audit streams to the customer account.

  describe-audit-stream-configuration-request - `com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationRequest`

  returns: Result of the DescribeAuditStreamConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationRequest describe-audit-stream-configuration-request]
    (-> this (.describeAuditStreamConfiguration describe-audit-stream-configuration-request))))

(defn disassociate-website-certificate-authority
  "Removes a certificate authority (CA).

  disassociate-website-certificate-authority-request - `com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityRequest`

  returns: Result of the DisassociateWebsiteCertificateAuthority operation returned by the service. - `com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityRequest disassociate-website-certificate-authority-request]
    (-> this (.disassociateWebsiteCertificateAuthority disassociate-website-certificate-authority-request))))

(defn describe-device-policy-configuration
  "Describes the device policy configuration for the specified fleet.

  describe-device-policy-configuration-request - `com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationRequest`

  returns: Result of the DescribeDevicePolicyConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationRequest describe-device-policy-configuration-request]
    (-> this (.describeDevicePolicyConfiguration describe-device-policy-configuration-request))))

(defn create-fleet
  "Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to
   authorized users who download and set up the Amazon WorkLink app.

  create-fleet-request - `com.amazonaws.services.worklink.model.CreateFleetRequest`

  returns: Result of the CreateFleet operation returned by the service. - `com.amazonaws.services.worklink.model.CreateFleetResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.CreateFleetResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.CreateFleetRequest create-fleet-request]
    (-> this (.createFleet create-fleet-request))))

(defn list-devices
  "Retrieves a list of devices registered with the specified fleet.

  list-devices-request - `com.amazonaws.services.worklink.model.ListDevicesRequest`

  returns: Result of the ListDevices operation returned by the service. - `com.amazonaws.services.worklink.model.ListDevicesResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.ListDevicesResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.ListDevicesRequest list-devices-request]
    (-> this (.listDevices list-devices-request))))

(defn associate-website-authorization-provider
  "Associates a website authorization provider with a specified fleet. This is used to authorize users against
   associated websites in the company network.

  associate-website-authorization-provider-request - `com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderRequest`

  returns: Result of the AssociateWebsiteAuthorizationProvider operation returned by the service. - `com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderRequest associate-website-authorization-provider-request]
    (-> this (.associateWebsiteAuthorizationProvider associate-website-authorization-provider-request))))

(defn disassociate-website-authorization-provider
  "Disassociates a website authorization provider from a specified fleet. After the disassociation, users can't load
   any associated websites that require this authorization provider.

  disassociate-website-authorization-provider-request - `com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderRequest`

  returns: Result of the DisassociateWebsiteAuthorizationProvider operation returned by the service. - `com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderRequest disassociate-website-authorization-provider-request]
    (-> this (.disassociateWebsiteAuthorizationProvider disassociate-website-authorization-provider-request))))

(defn update-domain-metadata
  "Updates domain metadata, such as DisplayName.

  update-domain-metadata-request - `com.amazonaws.services.worklink.model.UpdateDomainMetadataRequest`

  returns: Result of the UpdateDomainMetadata operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateDomainMetadataResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.UpdateDomainMetadataResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.UpdateDomainMetadataRequest update-domain-metadata-request]
    (-> this (.updateDomainMetadata update-domain-metadata-request))))

(defn describe-device
  "Provides information about a user's device.

  describe-device-request - `com.amazonaws.services.worklink.model.DescribeDeviceRequest`

  returns: Result of the DescribeDevice operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeDeviceResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeDeviceResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeDeviceRequest describe-device-request]
    (-> this (.describeDevice describe-device-request))))

(defn restore-domain-access
  "Moves a domain to ACTIVE status if it was in the INACTIVE status.

  restore-domain-access-request - `com.amazonaws.services.worklink.model.RestoreDomainAccessRequest`

  returns: Result of the RestoreDomainAccess operation returned by the service. - `com.amazonaws.services.worklink.model.RestoreDomainAccessResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.RestoreDomainAccessResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.RestoreDomainAccessRequest restore-domain-access-request]
    (-> this (.restoreDomainAccess restore-domain-access-request))))

(defn associate-domain
  "Specifies a domain to be associated to Amazon WorkLink.

  associate-domain-request - `com.amazonaws.services.worklink.model.AssociateDomainRequest`

  returns: Result of the AssociateDomain operation returned by the service. - `com.amazonaws.services.worklink.model.AssociateDomainResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.AssociateDomainResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.AssociateDomainRequest associate-domain-request]
    (-> this (.associateDomain associate-domain-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonWorkLink this]
    (-> this (.shutdown))))

(defn update-audit-stream-configuration
  "Updates the audit stream configuration for the fleet.

  update-audit-stream-configuration-request - `com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationRequest`

  returns: Result of the UpdateAuditStreamConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationRequest update-audit-stream-configuration-request]
    (-> this (.updateAuditStreamConfiguration update-audit-stream-configuration-request))))

(defn update-identity-provider-configuration
  "Updates the identity provider configuration for the fleet.

  update-identity-provider-configuration-request - `com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationRequest`

  returns: Result of the UpdateIdentityProviderConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationRequest update-identity-provider-configuration-request]
    (-> this (.updateIdentityProviderConfiguration update-identity-provider-configuration-request))))

(defn list-domains
  "Retrieves a list of domains associated to a specified fleet.

  list-domains-request - `com.amazonaws.services.worklink.model.ListDomainsRequest`

  returns: Result of the ListDomains operation returned by the service. - `com.amazonaws.services.worklink.model.ListDomainsResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.ListDomainsResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.ListDomainsRequest list-domains-request]
    (-> this (.listDomains list-domains-request))))

(defn update-company-network-configuration
  "Updates the company network configuration for the fleet.

  update-company-network-configuration-request - `com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationRequest`

  returns: Result of the UpdateCompanyNetworkConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationRequest update-company-network-configuration-request]
    (-> this (.updateCompanyNetworkConfiguration update-company-network-configuration-request))))

(defn disassociate-domain
  "Disassociates a domain from Amazon WorkLink. End users lose the ability to access the domain with Amazon
   WorkLink.

  disassociate-domain-request - `com.amazonaws.services.worklink.model.DisassociateDomainRequest`

  returns: Result of the DisassociateDomain operation returned by the service. - `com.amazonaws.services.worklink.model.DisassociateDomainResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DisassociateDomainResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.DisassociateDomainRequest disassociate-domain-request]
    (-> this (.disassociateDomain disassociate-domain-request))))

(defn sign-out-user
  "Signs the user out from all of their devices. The user can sign in again if they have valid credentials.

  sign-out-user-request - `com.amazonaws.services.worklink.model.SignOutUserRequest`

  returns: Result of the SignOutUser operation returned by the service. - `com.amazonaws.services.worklink.model.SignOutUserResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.SignOutUserResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.SignOutUserRequest sign-out-user-request]
    (-> this (.signOutUser sign-out-user-request))))

(defn describe-domain
  "Provides information about the domain.

  describe-domain-request - `com.amazonaws.services.worklink.model.DescribeDomainRequest`

  returns: Result of the DescribeDomain operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeDomainResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeDomainResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeDomainRequest describe-domain-request]
    (-> this (.describeDomain describe-domain-request))))

(defn describe-identity-provider-configuration
  "Describes the identity provider configuration of the specified fleet.

  describe-identity-provider-configuration-request - `com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationRequest`

  returns: Result of the DescribeIdentityProviderConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationRequest describe-identity-provider-configuration-request]
    (-> this (.describeIdentityProviderConfiguration describe-identity-provider-configuration-request))))

(defn list-fleets
  "Retrieves a list of fleets for the current account and Region.

  list-fleets-request - `com.amazonaws.services.worklink.model.ListFleetsRequest`

  returns: Result of the ListFleets operation returned by the service. - `com.amazonaws.services.worklink.model.ListFleetsResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.ListFleetsResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.ListFleetsRequest list-fleets-request]
    (-> this (.listFleets list-fleets-request))))

(defn update-device-policy-configuration
  "Updates the device policy configuration for the fleet.

  update-device-policy-configuration-request - `com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationRequest`

  returns: Result of the UpdateDevicePolicyConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationRequest update-device-policy-configuration-request]
    (-> this (.updateDevicePolicyConfiguration update-device-policy-configuration-request))))

(defn associate-website-certificate-authority
  "Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated
   websites within the company network.

  associate-website-certificate-authority-request - `com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityRequest`

  returns: Result of the AssociateWebsiteCertificateAuthority operation returned by the service. - `com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityRequest associate-website-certificate-authority-request]
    (-> this (.associateWebsiteCertificateAuthority associate-website-certificate-authority-request))))

(defn describe-fleet-metadata
  "Provides basic information for the specified fleet, excluding identity provider, networking, and device
   configuration details.

  describe-fleet-metadata-request - `com.amazonaws.services.worklink.model.DescribeFleetMetadataRequest`

  returns: Result of the DescribeFleetMetadata operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeFleetMetadataResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeFleetMetadataResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.DescribeFleetMetadataRequest describe-fleet-metadata-request]
    (-> this (.describeFleetMetadata describe-fleet-metadata-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonWorkLink this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn revoke-domain-access
  "Moves a domain to INACTIVE status if it was in the ACTIVE status.

  revoke-domain-access-request - `com.amazonaws.services.worklink.model.RevokeDomainAccessRequest`

  returns: Result of the RevokeDomainAccess operation returned by the service. - `com.amazonaws.services.worklink.model.RevokeDomainAccessResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.RevokeDomainAccessResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.RevokeDomainAccessRequest revoke-domain-access-request]
    (-> this (.revokeDomainAccess revoke-domain-access-request))))

(defn list-website-authorization-providers
  "Retrieves a list of website authorization providers associated with a specified fleet.

  list-website-authorization-providers-request - `com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersRequest`

  returns: Result of the ListWebsiteAuthorizationProviders operation returned by the service. - `com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersResult [^AmazonWorkLink this ^com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersRequest list-website-authorization-providers-request]
    (-> this (.listWebsiteAuthorizationProviders list-website-authorization-providers-request))))

