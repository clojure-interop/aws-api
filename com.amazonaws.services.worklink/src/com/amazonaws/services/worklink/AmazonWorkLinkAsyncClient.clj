(ns com.amazonaws.services.worklink.AmazonWorkLinkAsyncClient
  "Client for accessing WorkLink asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.


  Amazon WorkLink is a cloud-based service that provides secure access to internal websites and web apps from iOS
  phones. In a single step, your users, such as employees, can access internal websites as efficiently as they access
  any other public website. They enter a URL in their web browser, or choose a link to an internal website in an email.
  Amazon WorkLink authenticates the user's access and securely renders authorized internal web content in a secure
  rendering service in the AWS cloud. Amazon WorkLink doesn't download or store any internal web content on mobile
  devices."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.worklink AmazonWorkLinkAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.worklink.AmazonWorkLinkAsyncClientBuilder`"
  (^com.amazonaws.services.worklink.AmazonWorkLinkAsyncClientBuilder []
    (AmazonWorkLinkAsyncClient/asyncBuilder )))

(defn update-fleet-metadata-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.UpdateFleetMetadataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFleetMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.UpdateFleetMetadataResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.UpdateFleetMetadataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFleetMetadataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.UpdateFleetMetadataRequest request]
    (-> this (.updateFleetMetadataAsync request))))

(defn associate-website-certificate-authority-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateWebsiteCertificateAuthority operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateWebsiteCertificateAuthorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityRequest request]
    (-> this (.associateWebsiteCertificateAuthorityAsync request))))

(defn describe-identity-provider-configuration-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityProviderConfiguration operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityProviderConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationRequest request]
    (-> this (.describeIdentityProviderConfigurationAsync request))))

(defn associate-website-authorization-provider-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateWebsiteAuthorizationProvider operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateWebsiteAuthorizationProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderRequest request]
    (-> this (.associateWebsiteAuthorizationProviderAsync request))))

(defn disassociate-website-certificate-authority-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateWebsiteCertificateAuthority operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateWebsiteCertificateAuthorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityRequest request]
    (-> this (.disassociateWebsiteCertificateAuthorityAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonWorkLinkAsyncClient this]
    (-> this (.getExecutorService))))

(defn describe-fleet-metadata-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.DescribeFleetMetadataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleetMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeFleetMetadataResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeFleetMetadataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetMetadataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeFleetMetadataRequest request]
    (-> this (.describeFleetMetadataAsync request))))

(defn list-website-certificate-authorities-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWebsiteCertificateAuthorities operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWebsiteCertificateAuthoritiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesRequest request]
    (-> this (.listWebsiteCertificateAuthoritiesAsync request))))

(defn revoke-domain-access-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.RevokeDomainAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeDomainAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.RevokeDomainAccessResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.RevokeDomainAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeDomainAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.RevokeDomainAccessRequest request]
    (-> this (.revokeDomainAccessAsync request))))

(defn update-domain-metadata-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.UpdateDomainMetadataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.UpdateDomainMetadataResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.UpdateDomainMetadataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainMetadataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.UpdateDomainMetadataRequest request]
    (-> this (.updateDomainMetadataAsync request))))

(defn restore-domain-access-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.RestoreDomainAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDomainAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.RestoreDomainAccessResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.RestoreDomainAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDomainAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.RestoreDomainAccessRequest request]
    (-> this (.restoreDomainAccessAsync request))))

(defn update-company-network-configuration-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCompanyNetworkConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCompanyNetworkConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationRequest request]
    (-> this (.updateCompanyNetworkConfigurationAsync request))))

(defn sign-out-user-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.SignOutUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SignOutUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.SignOutUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.SignOutUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.signOutUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.SignOutUserRequest request]
    (-> this (.signOutUserAsync request))))

(defn describe-audit-stream-configuration-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAuditStreamConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAuditStreamConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationRequest request]
    (-> this (.describeAuditStreamConfigurationAsync request))))

(defn describe-device-policy-configuration-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDevicePolicyConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDevicePolicyConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationRequest request]
    (-> this (.describeDevicePolicyConfigurationAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonWorkLinkAsyncClient this]
    (-> this (.shutdown))))

(defn create-fleet-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.CreateFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.CreateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.CreateFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.CreateFleetRequest request]
    (-> this (.createFleetAsync request))))

(defn describe-company-network-configuration-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCompanyNetworkConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCompanyNetworkConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationRequest request]
    (-> this (.describeCompanyNetworkConfigurationAsync request))))

(defn disassociate-domain-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.DisassociateDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DisassociateDomainResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DisassociateDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DisassociateDomainRequest request]
    (-> this (.disassociateDomainAsync request))))

(defn describe-website-certificate-authority-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWebsiteCertificateAuthority operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWebsiteCertificateAuthorityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityRequest request]
    (-> this (.describeWebsiteCertificateAuthorityAsync request))))

(defn delete-fleet-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.DeleteFleetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DeleteFleetResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DeleteFleetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFleetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DeleteFleetRequest request]
    (-> this (.deleteFleetAsync request))))

(defn disassociate-website-authorization-provider-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateWebsiteAuthorizationProvider operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateWebsiteAuthorizationProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderRequest request]
    (-> this (.disassociateWebsiteAuthorizationProviderAsync request))))

(defn describe-domain-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.DescribeDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeDomainResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeDomainRequest request]
    (-> this (.describeDomainAsync request))))

(defn list-devices-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.ListDevicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.ListDevicesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.ListDevicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.ListDevicesRequest request]
    (-> this (.listDevicesAsync request))))

(defn update-audit-stream-configuration-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAuditStreamConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAuditStreamConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationRequest request]
    (-> this (.updateAuditStreamConfigurationAsync request))))

(defn list-fleets-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.ListFleetsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.ListFleetsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.ListFleetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFleetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.ListFleetsRequest request]
    (-> this (.listFleetsAsync request))))

(defn update-device-policy-configuration-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDevicePolicyConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDevicePolicyConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationRequest request]
    (-> this (.updateDevicePolicyConfigurationAsync request))))

(defn list-website-authorization-providers-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWebsiteAuthorizationProviders operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWebsiteAuthorizationProvidersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersRequest request]
    (-> this (.listWebsiteAuthorizationProvidersAsync request))))

(defn associate-domain-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.AssociateDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.AssociateDomainResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.AssociateDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.AssociateDomainRequest request]
    (-> this (.associateDomainAsync request))))

(defn describe-device-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.DescribeDeviceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeDeviceResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeDeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.DescribeDeviceRequest request]
    (-> this (.describeDeviceAsync request))))

(defn list-domains-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.ListDomainsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomains operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.ListDomainsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.ListDomainsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.ListDomainsRequest request]
    (-> this (.listDomainsAsync request))))

(defn update-identity-provider-configuration-async
  "Description copied from interface: AmazonWorkLinkAsync

  request - `com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIdentityProviderConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIdentityProviderConfigurationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsyncClient this ^com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationRequest request]
    (-> this (.updateIdentityProviderConfigurationAsync request))))

