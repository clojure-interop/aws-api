(ns com.amazonaws.services.worklink.AmazonWorkLinkClient
  "Client for accessing WorkLink. All service calls made using this client are blocking, and will not return until the
  service call completes.


  Amazon WorkLink is a cloud-based service that provides secure access to internal websites and web apps from iOS
  phones. In a single step, your users, such as employees, can access internal websites as efficiently as they access
  any other public website. They enter a URL in their web browser, or choose a link to an internal website in an email.
  Amazon WorkLink authenticates the user's access and securely renders authorized internal web content in a secure
  rendering service in the AWS cloud. Amazon WorkLink doesn't download or store any internal web content on mobile
  devices."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.worklink AmazonWorkLinkClient]))

(defn *builder
  "returns: `com.amazonaws.services.worklink.AmazonWorkLinkClientBuilder`"
  (^com.amazonaws.services.worklink.AmazonWorkLinkClientBuilder []
    (AmazonWorkLinkClient/builder )))

(defn list-website-certificate-authorities
  "Retrieves a list of certificate authorities added for the current account and Region.

  request - `com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesRequest`

  returns: Result of the ListWebsiteCertificateAuthorities operation returned by the service. - `com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesRequest request]
    (-> this (.listWebsiteCertificateAuthorities request))))

(defn update-fleet-metadata
  "Updates fleet metadata, such as DisplayName.

  request - `com.amazonaws.services.worklink.model.UpdateFleetMetadataRequest`

  returns: Result of the UpdateFleetMetadata operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateFleetMetadataResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.UpdateFleetMetadataResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.UpdateFleetMetadataRequest request]
    (-> this (.updateFleetMetadata request))))

(defn describe-company-network-configuration
  "Describes the networking configuration to access the internal websites associated with the specified fleet.

  request - `com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationRequest`

  returns: Result of the DescribeCompanyNetworkConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationRequest request]
    (-> this (.describeCompanyNetworkConfiguration request))))

(defn delete-fleet
  "Deletes a fleet. Prevents users from accessing previously associated websites.

  request - `com.amazonaws.services.worklink.model.DeleteFleetRequest`

  returns: Result of the DeleteFleet operation returned by the service. - `com.amazonaws.services.worklink.model.DeleteFleetResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DeleteFleetResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.DeleteFleetRequest request]
    (-> this (.deleteFleet request))))

(defn describe-website-certificate-authority
  "Provides information about the certificate authority.

  request - `com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityRequest`

  returns: Result of the DescribeWebsiteCertificateAuthority operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityRequest request]
    (-> this (.describeWebsiteCertificateAuthority request))))

(defn describe-audit-stream-configuration
  "Describes the configuration for delivering audit streams to the customer account.

  request - `com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationRequest`

  returns: Result of the DescribeAuditStreamConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationRequest request]
    (-> this (.describeAuditStreamConfiguration request))))

(defn disassociate-website-certificate-authority
  "Removes a certificate authority (CA).

  request - `com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityRequest`

  returns: Result of the DisassociateWebsiteCertificateAuthority operation returned by the service. - `com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityRequest request]
    (-> this (.disassociateWebsiteCertificateAuthority request))))

(defn describe-device-policy-configuration
  "Describes the device policy configuration for the specified fleet.

  request - `com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationRequest`

  returns: Result of the DescribeDevicePolicyConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationRequest request]
    (-> this (.describeDevicePolicyConfiguration request))))

(defn create-fleet
  "Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to
   authorized users who download and set up the Amazon WorkLink app.

  request - `com.amazonaws.services.worklink.model.CreateFleetRequest`

  returns: Result of the CreateFleet operation returned by the service. - `com.amazonaws.services.worklink.model.CreateFleetResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.CreateFleetResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.CreateFleetRequest request]
    (-> this (.createFleet request))))

(defn list-devices
  "Retrieves a list of devices registered with the specified fleet.

  request - `com.amazonaws.services.worklink.model.ListDevicesRequest`

  returns: Result of the ListDevices operation returned by the service. - `com.amazonaws.services.worklink.model.ListDevicesResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.ListDevicesResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.ListDevicesRequest request]
    (-> this (.listDevices request))))

(defn associate-website-authorization-provider
  "Associates a website authorization provider with a specified fleet. This is used to authorize users against
   associated websites in the company network.

  request - `com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderRequest`

  returns: Result of the AssociateWebsiteAuthorizationProvider operation returned by the service. - `com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderRequest request]
    (-> this (.associateWebsiteAuthorizationProvider request))))

(defn disassociate-website-authorization-provider
  "Disassociates a website authorization provider from a specified fleet. After the disassociation, users can't load
   any associated websites that require this authorization provider.

  request - `com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderRequest`

  returns: Result of the DisassociateWebsiteAuthorizationProvider operation returned by the service. - `com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderRequest request]
    (-> this (.disassociateWebsiteAuthorizationProvider request))))

(defn update-domain-metadata
  "Updates domain metadata, such as DisplayName.

  request - `com.amazonaws.services.worklink.model.UpdateDomainMetadataRequest`

  returns: Result of the UpdateDomainMetadata operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateDomainMetadataResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.UpdateDomainMetadataResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.UpdateDomainMetadataRequest request]
    (-> this (.updateDomainMetadata request))))

(defn describe-device
  "Provides information about a user's device.

  request - `com.amazonaws.services.worklink.model.DescribeDeviceRequest`

  returns: Result of the DescribeDevice operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeDeviceResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeDeviceResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.DescribeDeviceRequest request]
    (-> this (.describeDevice request))))

(defn restore-domain-access
  "Moves a domain to ACTIVE status if it was in the INACTIVE status.

  request - `com.amazonaws.services.worklink.model.RestoreDomainAccessRequest`

  returns: Result of the RestoreDomainAccess operation returned by the service. - `com.amazonaws.services.worklink.model.RestoreDomainAccessResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.RestoreDomainAccessResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.RestoreDomainAccessRequest request]
    (-> this (.restoreDomainAccess request))))

(defn associate-domain
  "Specifies a domain to be associated to Amazon WorkLink.

  request - `com.amazonaws.services.worklink.model.AssociateDomainRequest`

  returns: Result of the AssociateDomain operation returned by the service. - `com.amazonaws.services.worklink.model.AssociateDomainResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.AssociateDomainResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.AssociateDomainRequest request]
    (-> this (.associateDomain request))))

(defn update-audit-stream-configuration
  "Updates the audit stream configuration for the fleet.

  request - `com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationRequest`

  returns: Result of the UpdateAuditStreamConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationRequest request]
    (-> this (.updateAuditStreamConfiguration request))))

(defn update-identity-provider-configuration
  "Updates the identity provider configuration for the fleet.

  request - `com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationRequest`

  returns: Result of the UpdateIdentityProviderConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationRequest request]
    (-> this (.updateIdentityProviderConfiguration request))))

(defn list-domains
  "Retrieves a list of domains associated to a specified fleet.

  request - `com.amazonaws.services.worklink.model.ListDomainsRequest`

  returns: Result of the ListDomains operation returned by the service. - `com.amazonaws.services.worklink.model.ListDomainsResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.ListDomainsResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.ListDomainsRequest request]
    (-> this (.listDomains request))))

(defn update-company-network-configuration
  "Updates the company network configuration for the fleet.

  request - `com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationRequest`

  returns: Result of the UpdateCompanyNetworkConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationRequest request]
    (-> this (.updateCompanyNetworkConfiguration request))))

(defn disassociate-domain
  "Disassociates a domain from Amazon WorkLink. End users lose the ability to access the domain with Amazon
   WorkLink.

  request - `com.amazonaws.services.worklink.model.DisassociateDomainRequest`

  returns: Result of the DisassociateDomain operation returned by the service. - `com.amazonaws.services.worklink.model.DisassociateDomainResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DisassociateDomainResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.DisassociateDomainRequest request]
    (-> this (.disassociateDomain request))))

(defn sign-out-user
  "Signs the user out from all of their devices. The user can sign in again if they have valid credentials.

  request - `com.amazonaws.services.worklink.model.SignOutUserRequest`

  returns: Result of the SignOutUser operation returned by the service. - `com.amazonaws.services.worklink.model.SignOutUserResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.SignOutUserResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.SignOutUserRequest request]
    (-> this (.signOutUser request))))

(defn describe-domain
  "Provides information about the domain.

  request - `com.amazonaws.services.worklink.model.DescribeDomainRequest`

  returns: Result of the DescribeDomain operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeDomainResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeDomainResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.DescribeDomainRequest request]
    (-> this (.describeDomain request))))

(defn describe-identity-provider-configuration
  "Describes the identity provider configuration of the specified fleet.

  request - `com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationRequest`

  returns: Result of the DescribeIdentityProviderConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationRequest request]
    (-> this (.describeIdentityProviderConfiguration request))))

(defn list-fleets
  "Retrieves a list of fleets for the current account and Region.

  request - `com.amazonaws.services.worklink.model.ListFleetsRequest`

  returns: Result of the ListFleets operation returned by the service. - `com.amazonaws.services.worklink.model.ListFleetsResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.ListFleetsResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.ListFleetsRequest request]
    (-> this (.listFleets request))))

(defn update-device-policy-configuration
  "Updates the device policy configuration for the fleet.

  request - `com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationRequest`

  returns: Result of the UpdateDevicePolicyConfiguration operation returned by the service. - `com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationRequest request]
    (-> this (.updateDevicePolicyConfiguration request))))

(defn associate-website-certificate-authority
  "Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated
   websites within the company network.

  request - `com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityRequest`

  returns: Result of the AssociateWebsiteCertificateAuthority operation returned by the service. - `com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityRequest request]
    (-> this (.associateWebsiteCertificateAuthority request))))

(defn describe-fleet-metadata
  "Provides basic information for the specified fleet, excluding identity provider, networking, and device
   configuration details.

  request - `com.amazonaws.services.worklink.model.DescribeFleetMetadataRequest`

  returns: Result of the DescribeFleetMetadata operation returned by the service. - `com.amazonaws.services.worklink.model.DescribeFleetMetadataResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.DescribeFleetMetadataResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.DescribeFleetMetadataRequest request]
    (-> this (.describeFleetMetadata request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonWorkLinkClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn revoke-domain-access
  "Moves a domain to INACTIVE status if it was in the ACTIVE status.

  request - `com.amazonaws.services.worklink.model.RevokeDomainAccessRequest`

  returns: Result of the RevokeDomainAccess operation returned by the service. - `com.amazonaws.services.worklink.model.RevokeDomainAccessResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.RevokeDomainAccessResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.RevokeDomainAccessRequest request]
    (-> this (.revokeDomainAccess request))))

(defn list-website-authorization-providers
  "Retrieves a list of website authorization providers associated with a specified fleet.

  request - `com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersRequest`

  returns: Result of the ListWebsiteAuthorizationProviders operation returned by the service. - `com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersResult`

  throws: com.amazonaws.services.worklink.model.UnauthorizedException - You are not authorized to perform this action."
  (^com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersResult [^AmazonWorkLinkClient this ^com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersRequest request]
    (-> this (.listWebsiteAuthorizationProviders request))))

