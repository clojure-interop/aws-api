(ns com.amazonaws.services.worklink.AmazonWorkLinkAsync
  "Interface for accessing WorkLink asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonWorkLinkAsync instead.



  Amazon WorkLink is a cloud-based service that provides secure access to internal websites and web apps from iOS
  phones. In a single step, your users, such as employees, can access internal websites as efficiently as they access
  any other public website. They enter a URL in their web browser, or choose a link to an internal website in an email.
  Amazon WorkLink authenticates the user's access and securely renders authorized internal web content in a secure
  rendering service in the AWS cloud. Amazon WorkLink doesn't download or store any internal web content on mobile
  devices."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.worklink AmazonWorkLinkAsync]))

(defn update-fleet-metadata-async
  "Updates fleet metadata, such as DisplayName.

  update-fleet-metadata-request - `com.amazonaws.services.worklink.model.UpdateFleetMetadataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateFleetMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.UpdateFleetMetadataResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.UpdateFleetMetadataRequest update-fleet-metadata-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateFleetMetadataAsync update-fleet-metadata-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.UpdateFleetMetadataRequest update-fleet-metadata-request]
    (-> this (.updateFleetMetadataAsync update-fleet-metadata-request))))

(defn associate-website-certificate-authority-async
  "Imports the root certificate of a certificate authority (CA) used to obtain TLS certificates used by associated
   websites within the company network.

  associate-website-certificate-authority-request - `com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateWebsiteCertificateAuthority operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityRequest associate-website-certificate-authority-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateWebsiteCertificateAuthorityAsync associate-website-certificate-authority-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.AssociateWebsiteCertificateAuthorityRequest associate-website-certificate-authority-request]
    (-> this (.associateWebsiteCertificateAuthorityAsync associate-website-certificate-authority-request))))

(defn describe-identity-provider-configuration-async
  "Describes the identity provider configuration of the specified fleet.

  describe-identity-provider-configuration-request - `com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeIdentityProviderConfiguration operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationRequest describe-identity-provider-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeIdentityProviderConfigurationAsync describe-identity-provider-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeIdentityProviderConfigurationRequest describe-identity-provider-configuration-request]
    (-> this (.describeIdentityProviderConfigurationAsync describe-identity-provider-configuration-request))))

(defn associate-website-authorization-provider-async
  "Associates a website authorization provider with a specified fleet. This is used to authorize users against
   associated websites in the company network.

  associate-website-authorization-provider-request - `com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateWebsiteAuthorizationProvider operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderRequest associate-website-authorization-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateWebsiteAuthorizationProviderAsync associate-website-authorization-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.AssociateWebsiteAuthorizationProviderRequest associate-website-authorization-provider-request]
    (-> this (.associateWebsiteAuthorizationProviderAsync associate-website-authorization-provider-request))))

(defn disassociate-website-certificate-authority-async
  "Removes a certificate authority (CA).

  disassociate-website-certificate-authority-request - `com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateWebsiteCertificateAuthority operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityRequest disassociate-website-certificate-authority-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateWebsiteCertificateAuthorityAsync disassociate-website-certificate-authority-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DisassociateWebsiteCertificateAuthorityRequest disassociate-website-certificate-authority-request]
    (-> this (.disassociateWebsiteCertificateAuthorityAsync disassociate-website-certificate-authority-request))))

(defn describe-fleet-metadata-async
  "Provides basic information for the specified fleet, excluding identity provider, networking, and device
   configuration details.

  describe-fleet-metadata-request - `com.amazonaws.services.worklink.model.DescribeFleetMetadataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeFleetMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeFleetMetadataResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeFleetMetadataRequest describe-fleet-metadata-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeFleetMetadataAsync describe-fleet-metadata-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeFleetMetadataRequest describe-fleet-metadata-request]
    (-> this (.describeFleetMetadataAsync describe-fleet-metadata-request))))

(defn list-website-certificate-authorities-async
  "Retrieves a list of certificate authorities added for the current account and Region.

  list-website-certificate-authorities-request - `com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWebsiteCertificateAuthorities operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesRequest list-website-certificate-authorities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWebsiteCertificateAuthoritiesAsync list-website-certificate-authorities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.ListWebsiteCertificateAuthoritiesRequest list-website-certificate-authorities-request]
    (-> this (.listWebsiteCertificateAuthoritiesAsync list-website-certificate-authorities-request))))

(defn revoke-domain-access-async
  "Moves a domain to INACTIVE status if it was in the ACTIVE status.

  revoke-domain-access-request - `com.amazonaws.services.worklink.model.RevokeDomainAccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RevokeDomainAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.RevokeDomainAccessResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.RevokeDomainAccessRequest revoke-domain-access-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.revokeDomainAccessAsync revoke-domain-access-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.RevokeDomainAccessRequest revoke-domain-access-request]
    (-> this (.revokeDomainAccessAsync revoke-domain-access-request))))

(defn update-domain-metadata-async
  "Updates domain metadata, such as DisplayName.

  update-domain-metadata-request - `com.amazonaws.services.worklink.model.UpdateDomainMetadataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainMetadata operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.UpdateDomainMetadataResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.UpdateDomainMetadataRequest update-domain-metadata-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainMetadataAsync update-domain-metadata-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.UpdateDomainMetadataRequest update-domain-metadata-request]
    (-> this (.updateDomainMetadataAsync update-domain-metadata-request))))

(defn restore-domain-access-async
  "Moves a domain to ACTIVE status if it was in the INACTIVE status.

  restore-domain-access-request - `com.amazonaws.services.worklink.model.RestoreDomainAccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDomainAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.RestoreDomainAccessResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.RestoreDomainAccessRequest restore-domain-access-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDomainAccessAsync restore-domain-access-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.RestoreDomainAccessRequest restore-domain-access-request]
    (-> this (.restoreDomainAccessAsync restore-domain-access-request))))

(defn update-company-network-configuration-async
  "Updates the company network configuration for the fleet.

  update-company-network-configuration-request - `com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCompanyNetworkConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationRequest update-company-network-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCompanyNetworkConfigurationAsync update-company-network-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.UpdateCompanyNetworkConfigurationRequest update-company-network-configuration-request]
    (-> this (.updateCompanyNetworkConfigurationAsync update-company-network-configuration-request))))

(defn sign-out-user-async
  "Signs the user out from all of their devices. The user can sign in again if they have valid credentials.

  sign-out-user-request - `com.amazonaws.services.worklink.model.SignOutUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SignOutUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.SignOutUserResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.SignOutUserRequest sign-out-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.signOutUserAsync sign-out-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.SignOutUserRequest sign-out-user-request]
    (-> this (.signOutUserAsync sign-out-user-request))))

(defn describe-audit-stream-configuration-async
  "Describes the configuration for delivering audit streams to the customer account.

  describe-audit-stream-configuration-request - `com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAuditStreamConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationRequest describe-audit-stream-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAuditStreamConfigurationAsync describe-audit-stream-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeAuditStreamConfigurationRequest describe-audit-stream-configuration-request]
    (-> this (.describeAuditStreamConfigurationAsync describe-audit-stream-configuration-request))))

(defn describe-device-policy-configuration-async
  "Describes the device policy configuration for the specified fleet.

  describe-device-policy-configuration-request - `com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDevicePolicyConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationRequest describe-device-policy-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDevicePolicyConfigurationAsync describe-device-policy-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeDevicePolicyConfigurationRequest describe-device-policy-configuration-request]
    (-> this (.describeDevicePolicyConfigurationAsync describe-device-policy-configuration-request))))

(defn create-fleet-async
  "Creates a fleet. A fleet consists of resources and the configuration that delivers associated websites to
   authorized users who download and set up the Amazon WorkLink app.

  create-fleet-request - `com.amazonaws.services.worklink.model.CreateFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.CreateFleetResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.CreateFleetRequest create-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createFleetAsync create-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.CreateFleetRequest create-fleet-request]
    (-> this (.createFleetAsync create-fleet-request))))

(defn describe-company-network-configuration-async
  "Describes the networking configuration to access the internal websites associated with the specified fleet.

  describe-company-network-configuration-request - `com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCompanyNetworkConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationRequest describe-company-network-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCompanyNetworkConfigurationAsync describe-company-network-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeCompanyNetworkConfigurationRequest describe-company-network-configuration-request]
    (-> this (.describeCompanyNetworkConfigurationAsync describe-company-network-configuration-request))))

(defn disassociate-domain-async
  "Disassociates a domain from Amazon WorkLink. End users lose the ability to access the domain with Amazon
   WorkLink.

  disassociate-domain-request - `com.amazonaws.services.worklink.model.DisassociateDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DisassociateDomainResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DisassociateDomainRequest disassociate-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateDomainAsync disassociate-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DisassociateDomainRequest disassociate-domain-request]
    (-> this (.disassociateDomainAsync disassociate-domain-request))))

(defn describe-website-certificate-authority-async
  "Provides information about the certificate authority.

  describe-website-certificate-authority-request - `com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWebsiteCertificateAuthority operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityRequest describe-website-certificate-authority-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWebsiteCertificateAuthorityAsync describe-website-certificate-authority-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeWebsiteCertificateAuthorityRequest describe-website-certificate-authority-request]
    (-> this (.describeWebsiteCertificateAuthorityAsync describe-website-certificate-authority-request))))

(defn delete-fleet-async
  "Deletes a fleet. Prevents users from accessing previously associated websites.

  delete-fleet-request - `com.amazonaws.services.worklink.model.DeleteFleetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFleet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DeleteFleetResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DeleteFleetRequest delete-fleet-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFleetAsync delete-fleet-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DeleteFleetRequest delete-fleet-request]
    (-> this (.deleteFleetAsync delete-fleet-request))))

(defn disassociate-website-authorization-provider-async
  "Disassociates a website authorization provider from a specified fleet. After the disassociation, users can't load
   any associated websites that require this authorization provider.

  disassociate-website-authorization-provider-request - `com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateWebsiteAuthorizationProvider operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderRequest disassociate-website-authorization-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateWebsiteAuthorizationProviderAsync disassociate-website-authorization-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DisassociateWebsiteAuthorizationProviderRequest disassociate-website-authorization-provider-request]
    (-> this (.disassociateWebsiteAuthorizationProviderAsync disassociate-website-authorization-provider-request))))

(defn describe-domain-async
  "Provides information about the domain.

  describe-domain-request - `com.amazonaws.services.worklink.model.DescribeDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeDomainResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeDomainRequest describe-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDomainAsync describe-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeDomainRequest describe-domain-request]
    (-> this (.describeDomainAsync describe-domain-request))))

(defn list-devices-async
  "Retrieves a list of devices registered with the specified fleet.

  list-devices-request - `com.amazonaws.services.worklink.model.ListDevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.ListDevicesResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.ListDevicesRequest list-devices-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDevicesAsync list-devices-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.ListDevicesRequest list-devices-request]
    (-> this (.listDevicesAsync list-devices-request))))

(defn update-audit-stream-configuration-async
  "Updates the audit stream configuration for the fleet.

  update-audit-stream-configuration-request - `com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAuditStreamConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationRequest update-audit-stream-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAuditStreamConfigurationAsync update-audit-stream-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.UpdateAuditStreamConfigurationRequest update-audit-stream-configuration-request]
    (-> this (.updateAuditStreamConfigurationAsync update-audit-stream-configuration-request))))

(defn list-fleets-async
  "Retrieves a list of fleets for the current account and Region.

  list-fleets-request - `com.amazonaws.services.worklink.model.ListFleetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFleets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.ListFleetsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.ListFleetsRequest list-fleets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFleetsAsync list-fleets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.ListFleetsRequest list-fleets-request]
    (-> this (.listFleetsAsync list-fleets-request))))

(defn update-device-policy-configuration-async
  "Updates the device policy configuration for the fleet.

  update-device-policy-configuration-request - `com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDevicePolicyConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationRequest update-device-policy-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDevicePolicyConfigurationAsync update-device-policy-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.UpdateDevicePolicyConfigurationRequest update-device-policy-configuration-request]
    (-> this (.updateDevicePolicyConfigurationAsync update-device-policy-configuration-request))))

(defn list-website-authorization-providers-async
  "Retrieves a list of website authorization providers associated with a specified fleet.

  list-website-authorization-providers-request - `com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWebsiteAuthorizationProviders operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersRequest list-website-authorization-providers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWebsiteAuthorizationProvidersAsync list-website-authorization-providers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.ListWebsiteAuthorizationProvidersRequest list-website-authorization-providers-request]
    (-> this (.listWebsiteAuthorizationProvidersAsync list-website-authorization-providers-request))))

(defn associate-domain-async
  "Specifies a domain to be associated to Amazon WorkLink.

  associate-domain-request - `com.amazonaws.services.worklink.model.AssociateDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.AssociateDomainResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.AssociateDomainRequest associate-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateDomainAsync associate-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.AssociateDomainRequest associate-domain-request]
    (-> this (.associateDomainAsync associate-domain-request))))

(defn describe-device-async
  "Provides information about a user's device.

  describe-device-request - `com.amazonaws.services.worklink.model.DescribeDeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.DescribeDeviceResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeDeviceRequest describe-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDeviceAsync describe-device-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.DescribeDeviceRequest describe-device-request]
    (-> this (.describeDeviceAsync describe-device-request))))

(defn list-domains-async
  "Retrieves a list of domains associated to a specified fleet.

  list-domains-request - `com.amazonaws.services.worklink.model.ListDomainsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomains operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.ListDomainsResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.ListDomainsRequest list-domains-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainsAsync list-domains-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.ListDomainsRequest list-domains-request]
    (-> this (.listDomainsAsync list-domains-request))))

(defn update-identity-provider-configuration-async
  "Updates the identity provider configuration for the fleet.

  update-identity-provider-configuration-request - `com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateIdentityProviderConfiguration operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationResult>`"
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationRequest update-identity-provider-configuration-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateIdentityProviderConfigurationAsync update-identity-provider-configuration-request async-handler)))
  (^java.util.concurrent.Future [^AmazonWorkLinkAsync this ^com.amazonaws.services.worklink.model.UpdateIdentityProviderConfigurationRequest update-identity-provider-configuration-request]
    (-> this (.updateIdentityProviderConfigurationAsync update-identity-provider-configuration-request))))

