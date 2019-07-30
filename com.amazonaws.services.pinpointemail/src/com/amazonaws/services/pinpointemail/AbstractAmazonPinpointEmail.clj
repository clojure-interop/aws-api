(ns com.amazonaws.services.pinpointemail.AbstractAmazonPinpointEmail
  "Abstract implementation of AmazonPinpointEmail. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpointemail AbstractAmazonPinpointEmail]))

(defn get-domain-statistics-report
  "Description copied from interface: AmazonPinpointEmail

  request - A request to obtain deliverability metrics for a domain. - `com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportRequest`

  returns: Result of the GetDomainStatisticsReport operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportResult`"
  (^com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportRequest request]
    (-> this (.getDomainStatisticsReport request))))

(defn list-tags-for-resource
  "Description copied from interface: AmazonPinpointEmail

  request - `com.amazonaws.services.pinpointemail.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.pinpointemail.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.pinpointemail.model.ListTagsForResourceResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn put-dedicated-ip-in-pool
  "Description copied from interface: AmazonPinpointEmail

  request - A request to move a dedicated IP address to a dedicated IP pool. - `com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolRequest`

  returns: Result of the PutDedicatedIpInPool operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolResult`"
  (^com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolRequest request]
    (-> this (.putDedicatedIpInPool request))))

(defn list-dedicated-ip-pools
  "Description copied from interface: AmazonPinpointEmail

  request - A request to obtain a list of dedicated IP pools. - `com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsRequest`

  returns: Result of the ListDedicatedIpPools operation returned by the service. - `com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsResult`"
  (^com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsRequest request]
    (-> this (.listDedicatedIpPools request))))

(defn list-configuration-sets
  "Description copied from interface: AmazonPinpointEmail

  request - A request to obtain a list of configuration sets for your Amazon Pinpoint account in the current AWS Region. - `com.amazonaws.services.pinpointemail.model.ListConfigurationSetsRequest`

  returns: Result of the ListConfigurationSets operation returned by the service. - `com.amazonaws.services.pinpointemail.model.ListConfigurationSetsResult`"
  (^com.amazonaws.services.pinpointemail.model.ListConfigurationSetsResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.ListConfigurationSetsRequest request]
    (-> this (.listConfigurationSets request))))

(defn get-configuration-set-event-destinations
  "Description copied from interface: AmazonPinpointEmail

  request - A request to obtain information about the event destinations for a configuration set. - `com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsRequest`

  returns: Result of the GetConfigurationSetEventDestinations operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsResult`"
  (^com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsRequest request]
    (-> this (.getConfigurationSetEventDestinations request))))

(defn create-configuration-set-event-destination
  "Description copied from interface: AmazonPinpointEmail

  request - A request to add an event destination to a configuration set. - `com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationRequest`

  returns: Result of the CreateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationResult`"
  (^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationRequest request]
    (-> this (.createConfigurationSetEventDestination request))))

(defn put-configuration-set-delivery-options
  "Description copied from interface: AmazonPinpointEmail

  request - A request to associate a configuration set with a dedicated IP pool. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsRequest`

  returns: Result of the PutConfigurationSetDeliveryOptions operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsResult`"
  (^com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsRequest request]
    (-> this (.putConfigurationSetDeliveryOptions request))))

(defn create-email-identity
  "Description copied from interface: AmazonPinpointEmail

  request - A request to begin the verification process for an email identity (an email address or domain). - `com.amazonaws.services.pinpointemail.model.CreateEmailIdentityRequest`

  returns: Result of the CreateEmailIdentity operation returned by the service. - `com.amazonaws.services.pinpointemail.model.CreateEmailIdentityResult`"
  (^com.amazonaws.services.pinpointemail.model.CreateEmailIdentityResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.CreateEmailIdentityRequest request]
    (-> this (.createEmailIdentity request))))

(defn put-account-dedicated-ip-warmup-attributes
  "Description copied from interface: AmazonPinpointEmail

  request - A request to enable or disable the automatic IP address warm-up feature. - `com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesRequest`

  returns: Result of the PutAccountDedicatedIpWarmupAttributes operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesResult`"
  (^com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesRequest request]
    (-> this (.putAccountDedicatedIpWarmupAttributes request))))

(defn put-configuration-set-reputation-options
  "Description copied from interface: AmazonPinpointEmail

  request - A request to enable or disable tracking of reputation metrics for a configuration set. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsRequest`

  returns: Result of the PutConfigurationSetReputationOptions operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsResult`"
  (^com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsRequest request]
    (-> this (.putConfigurationSetReputationOptions request))))

(defn put-email-identity-dkim-attributes
  "Description copied from interface: AmazonPinpointEmail

  request - A request to enable or disable DKIM signing of email that you send from an email identity. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesRequest`

  returns: Result of the PutEmailIdentityDkimAttributes operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesResult`"
  (^com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesRequest request]
    (-> this (.putEmailIdentityDkimAttributes request))))

(defn untag-resource
  "Description copied from interface: AmazonPinpointEmail

  request - `com.amazonaws.services.pinpointemail.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.pinpointemail.model.UntagResourceResult`"
  (^com.amazonaws.services.pinpointemail.model.UntagResourceResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn put-configuration-set-sending-options
  "Description copied from interface: AmazonPinpointEmail

  request - A request to enable or disable the ability of Amazon Pinpoint to send emails that use a specific configuration set. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsRequest`

  returns: Result of the PutConfigurationSetSendingOptions operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsResult`"
  (^com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsRequest request]
    (-> this (.putConfigurationSetSendingOptions request))))

(defn delete-configuration-set-event-destination
  "Description copied from interface: AmazonPinpointEmail

  request - A request to delete an event destination from a configuration set. - `com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationRequest`

  returns: Result of the DeleteConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationResult`"
  (^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationRequest request]
    (-> this (.deleteConfigurationSetEventDestination request))))

(defn get-dedicated-ip
  "Description copied from interface: AmazonPinpointEmail

  request - A request to obtain more information about a dedicated IP address. - `com.amazonaws.services.pinpointemail.model.GetDedicatedIpRequest`

  returns: Result of the GetDedicatedIp operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetDedicatedIpResult`"
  (^com.amazonaws.services.pinpointemail.model.GetDedicatedIpResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.GetDedicatedIpRequest request]
    (-> this (.getDedicatedIp request))))

(defn put-account-sending-attributes
  "Description copied from interface: AmazonPinpointEmail

  request - A request to change the ability of your account to send email. - `com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesRequest`

  returns: Result of the PutAccountSendingAttributes operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesResult`"
  (^com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesRequest request]
    (-> this (.putAccountSendingAttributes request))))

(defn put-email-identity-feedback-attributes
  "Description copied from interface: AmazonPinpointEmail

  request - A request to set the attributes that control how bounce and complaint events are processed. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesRequest`

  returns: Result of the PutEmailIdentityFeedbackAttributes operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesResult`"
  (^com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesRequest request]
    (-> this (.putEmailIdentityFeedbackAttributes request))))

(defn delete-configuration-set
  "Description copied from interface: AmazonPinpointEmail

  request - A request to delete a configuration set. - `com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetRequest`

  returns: Result of the DeleteConfigurationSet operation returned by the service. - `com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetResult`"
  (^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetRequest request]
    (-> this (.deleteConfigurationSet request))))

(defn shutdown
  "Description copied from interface: AmazonPinpointEmail"
  ([^AbstractAmazonPinpointEmail this]
    (-> this (.shutdown))))

(defn get-email-identity
  "Description copied from interface: AmazonPinpointEmail

  request - A request to return details about an email identity. - `com.amazonaws.services.pinpointemail.model.GetEmailIdentityRequest`

  returns: Result of the GetEmailIdentity operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetEmailIdentityResult`"
  (^com.amazonaws.services.pinpointemail.model.GetEmailIdentityResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.GetEmailIdentityRequest request]
    (-> this (.getEmailIdentity request))))

(defn send-email
  "Description copied from interface: AmazonPinpointEmail

  request - A request to send an email message. - `com.amazonaws.services.pinpointemail.model.SendEmailRequest`

  returns: Result of the SendEmail operation returned by the service. - `com.amazonaws.services.pinpointemail.model.SendEmailResult`"
  (^com.amazonaws.services.pinpointemail.model.SendEmailResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.SendEmailRequest request]
    (-> this (.sendEmail request))))

(defn get-deliverability-test-report
  "Description copied from interface: AmazonPinpointEmail

  request - A request to retrieve the results of a predictive inbox placement test. - `com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportRequest`

  returns: Result of the GetDeliverabilityTestReport operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportResult`"
  (^com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportRequest request]
    (-> this (.getDeliverabilityTestReport request))))

(defn put-email-identity-mail-from-attributes
  "Description copied from interface: AmazonPinpointEmail

  request - A request to configure the custom MAIL FROM domain for a verified identity. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesRequest`

  returns: Result of the PutEmailIdentityMailFromAttributes operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesResult`"
  (^com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesRequest request]
    (-> this (.putEmailIdentityMailFromAttributes request))))

(defn update-configuration-set-event-destination
  "Description copied from interface: AmazonPinpointEmail

  request - A request to change the settings for an event destination for a configuration set. - `com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationRequest`

  returns: Result of the UpdateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationResult`"
  (^com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationRequest request]
    (-> this (.updateConfigurationSetEventDestination request))))

(defn get-domain-deliverability-campaign
  "Description copied from interface: AmazonPinpointEmail

  request - Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for ( PutDeliverabilityDashboardOption operation). - `com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignRequest`

  returns: Result of the GetDomainDeliverabilityCampaign operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignResult`"
  (^com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignRequest request]
    (-> this (.getDomainDeliverabilityCampaign request))))

(defn list-email-identities
  "Description copied from interface: AmazonPinpointEmail

  request - A request to list all of the email identities associated with your Amazon Pinpoint account. This list includes identities that you've already verified, identities that are unverified, and identities that were verified in the past, but are no longer verified. - `com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesRequest`

  returns: Result of the ListEmailIdentities operation returned by the service. - `com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesResult`"
  (^com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesRequest request]
    (-> this (.listEmailIdentities request))))

(defn delete-dedicated-ip-pool
  "Description copied from interface: AmazonPinpointEmail

  request - A request to delete a dedicated IP pool. - `com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolRequest`

  returns: Result of the DeleteDedicatedIpPool operation returned by the service. - `com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolResult`"
  (^com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolRequest request]
    (-> this (.deleteDedicatedIpPool request))))

(defn get-account
  "Description copied from interface: AmazonPinpointEmail

  request - A request to obtain information about the email-sending capabilities of your Amazon Pinpoint account. - `com.amazonaws.services.pinpointemail.model.GetAccountRequest`

  returns: Result of the GetAccount operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetAccountResult`"
  (^com.amazonaws.services.pinpointemail.model.GetAccountResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.GetAccountRequest request]
    (-> this (.getAccount request))))

(defn list-deliverability-test-reports
  "Description copied from interface: AmazonPinpointEmail

  request - A request to list all of the predictive inbox placement tests that you've performed. - `com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsRequest`

  returns: Result of the ListDeliverabilityTestReports operation returned by the service. - `com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsResult`"
  (^com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsRequest request]
    (-> this (.listDeliverabilityTestReports request))))

(defn put-deliverability-dashboard-option
  "Description copied from interface: AmazonPinpointEmail

  request - Enable or disable the Deliverability dashboard for your Amazon Pinpoint account. When you enable the Deliverability dashboard, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability dashboard subscription, see Amazon Pinpoint Pricing. - `com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionRequest`

  returns: Result of the PutDeliverabilityDashboardOption operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionResult`"
  (^com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionRequest request]
    (-> this (.putDeliverabilityDashboardOption request))))

(defn create-deliverability-test-report
  "Description copied from interface: AmazonPinpointEmail

  request - A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport operation to view the results of the test. - `com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportRequest`

  returns: Result of the CreateDeliverabilityTestReport operation returned by the service. - `com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportResult`"
  (^com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportRequest request]
    (-> this (.createDeliverabilityTestReport request))))

(defn get-dedicated-ips
  "Description copied from interface: AmazonPinpointEmail

  request - A request to obtain more information about dedicated IP pools. - `com.amazonaws.services.pinpointemail.model.GetDedicatedIpsRequest`

  returns: Result of the GetDedicatedIps operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetDedicatedIpsResult`"
  (^com.amazonaws.services.pinpointemail.model.GetDedicatedIpsResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.GetDedicatedIpsRequest request]
    (-> this (.getDedicatedIps request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonPinpointEmail

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonPinpointEmail this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-blacklist-reports
  "Description copied from interface: AmazonPinpointEmail

  request - A request to retrieve a list of the blacklists that your dedicated IP addresses appear on. - `com.amazonaws.services.pinpointemail.model.GetBlacklistReportsRequest`

  returns: Result of the GetBlacklistReports operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetBlacklistReportsResult`"
  (^com.amazonaws.services.pinpointemail.model.GetBlacklistReportsResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.GetBlacklistReportsRequest request]
    (-> this (.getBlacklistReports request))))

(defn put-dedicated-ip-warmup-attributes
  "Description copied from interface: AmazonPinpointEmail

  request - A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you want to resume the warm-up process for an existing IP address. - `com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesRequest`

  returns: Result of the PutDedicatedIpWarmupAttributes operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesResult`"
  (^com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesRequest request]
    (-> this (.putDedicatedIpWarmupAttributes request))))

(defn tag-resource
  "Description copied from interface: AmazonPinpointEmail

  request - `com.amazonaws.services.pinpointemail.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.pinpointemail.model.TagResourceResult`"
  (^com.amazonaws.services.pinpointemail.model.TagResourceResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-configuration-set
  "Description copied from interface: AmazonPinpointEmail

  request - A request to obtain information about a configuration set. - `com.amazonaws.services.pinpointemail.model.GetConfigurationSetRequest`

  returns: Result of the GetConfigurationSet operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetConfigurationSetResult`"
  (^com.amazonaws.services.pinpointemail.model.GetConfigurationSetResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.GetConfigurationSetRequest request]
    (-> this (.getConfigurationSet request))))

(defn list-domain-deliverability-campaigns
  "Description copied from interface: AmazonPinpointEmail

  request - Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified time range. This data is available for a domain only if you enabled the Deliverability dashboard (PutDeliverabilityDashboardOption operation) for the domain. - `com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsRequest`

  returns: Result of the ListDomainDeliverabilityCampaigns operation returned by the service. - `com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsResult`"
  (^com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsRequest request]
    (-> this (.listDomainDeliverabilityCampaigns request))))

(defn put-configuration-set-tracking-options
  "Description copied from interface: AmazonPinpointEmail

  request - A request to add a custom domain for tracking open and click events to a configuration set. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsRequest`

  returns: Result of the PutConfigurationSetTrackingOptions operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsResult`"
  (^com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsRequest request]
    (-> this (.putConfigurationSetTrackingOptions request))))

(defn create-dedicated-ip-pool
  "Description copied from interface: AmazonPinpointEmail

  request - A request to create a new dedicated IP pool. - `com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolRequest`

  returns: Result of the CreateDedicatedIpPool operation returned by the service. - `com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolResult`"
  (^com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolRequest request]
    (-> this (.createDedicatedIpPool request))))

(defn get-deliverability-dashboard-options
  "Description copied from interface: AmazonPinpointEmail

  request - Retrieve information about the status of the Deliverability dashboard for your Amazon Pinpoint account. When the Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability dashboard subscription, see Amazon Pinpoint Pricing. - `com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsRequest`

  returns: Result of the GetDeliverabilityDashboardOptions operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsResult`"
  (^com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsRequest request]
    (-> this (.getDeliverabilityDashboardOptions request))))

(defn create-configuration-set
  "Description copied from interface: AmazonPinpointEmail

  request - A request to create a configuration set. - `com.amazonaws.services.pinpointemail.model.CreateConfigurationSetRequest`

  returns: Result of the CreateConfigurationSet operation returned by the service. - `com.amazonaws.services.pinpointemail.model.CreateConfigurationSetResult`"
  (^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetRequest request]
    (-> this (.createConfigurationSet request))))

(defn delete-email-identity
  "Description copied from interface: AmazonPinpointEmail

  request - A request to delete an existing email identity. When you delete an identity, you lose the ability to use Amazon Pinpoint to send email from that identity. You can restore your ability to send email by completing the verification process for the identity again. - `com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityRequest`

  returns: Result of the DeleteEmailIdentity operation returned by the service. - `com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityResult`"
  (^com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityResult [^AbstractAmazonPinpointEmail this ^com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityRequest request]
    (-> this (.deleteEmailIdentity request))))

