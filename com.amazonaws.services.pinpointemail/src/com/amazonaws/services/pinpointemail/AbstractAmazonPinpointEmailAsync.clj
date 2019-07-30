(ns com.amazonaws.services.pinpointemail.AbstractAmazonPinpointEmailAsync
  "Abstract implementation of AmazonPinpointEmailAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpointemail AbstractAmazonPinpointEmailAsync]))

(defn put-email-identity-dkim-attributes-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to enable or disable DKIM signing of email that you send from an email identity. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEmailIdentityDkimAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEmailIdentityDkimAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesRequest request]
    (-> this (.putEmailIdentityDkimAttributesAsync request))))

(defn untag-resource-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - `com.amazonaws.services.pinpointemail.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-dedicated-ips-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to obtain more information about dedicated IP pools. - `com.amazonaws.services.pinpointemail.model.GetDedicatedIpsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDedicatedIps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetDedicatedIpsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDedicatedIpsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDedicatedIpsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDedicatedIpsRequest request]
    (-> this (.getDedicatedIpsAsync request))))

(defn get-account-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to obtain information about the email-sending capabilities of your Amazon Pinpoint account. - `com.amazonaws.services.pinpointemail.model.GetAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetAccountRequest request]
    (-> this (.getAccountAsync request))))

(defn put-dedicated-ip-warmup-attributes-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you want to resume the warm-up process for an existing IP address. - `com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDedicatedIpWarmupAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDedicatedIpWarmupAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesRequest request]
    (-> this (.putDedicatedIpWarmupAttributesAsync request))))

(defn list-domain-deliverability-campaigns-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified time range. This data is available for a domain only if you enabled the Deliverability dashboard (PutDeliverabilityDashboardOption operation) for the domain. - `com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomainDeliverabilityCampaigns operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainDeliverabilityCampaignsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsRequest request]
    (-> this (.listDomainDeliverabilityCampaignsAsync request))))

(defn send-email-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to send an email message. - `com.amazonaws.services.pinpointemail.model.SendEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.SendEmailResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.SendEmailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendEmailAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.SendEmailRequest request]
    (-> this (.sendEmailAsync request))))

(defn put-deliverability-dashboard-option-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - Enable or disable the Deliverability dashboard for your Amazon Pinpoint account. When you enable the Deliverability dashboard, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability dashboard subscription, see Amazon Pinpoint Pricing. - `com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDeliverabilityDashboardOption operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDeliverabilityDashboardOptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionRequest request]
    (-> this (.putDeliverabilityDashboardOptionAsync request))))

(defn get-dedicated-ip-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to obtain more information about a dedicated IP address. - `com.amazonaws.services.pinpointemail.model.GetDedicatedIpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDedicatedIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetDedicatedIpResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDedicatedIpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDedicatedIpAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDedicatedIpRequest request]
    (-> this (.getDedicatedIpAsync request))))

(defn get-domain-statistics-report-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to obtain deliverability metrics for a domain. - `com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainStatisticsReport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainStatisticsReportAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportRequest request]
    (-> this (.getDomainStatisticsReportAsync request))))

(defn put-account-sending-attributes-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to change the ability of your account to send email. - `com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAccountSendingAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAccountSendingAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesRequest request]
    (-> this (.putAccountSendingAttributesAsync request))))

(defn list-configuration-sets-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to obtain a list of configuration sets for your Amazon Pinpoint account in the current AWS Region. - `com.amazonaws.services.pinpointemail.model.ListConfigurationSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurationSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.ListConfigurationSetsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListConfigurationSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListConfigurationSetsRequest request]
    (-> this (.listConfigurationSetsAsync request))))

(defn update-configuration-set-event-destination-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to change the settings for an event destination for a configuration set. - `com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationSetEventDestinationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationRequest request]
    (-> this (.updateConfigurationSetEventDestinationAsync request))))

(defn get-deliverability-dashboard-options-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - Retrieve information about the status of the Deliverability dashboard for your Amazon Pinpoint account. When the Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability dashboard subscription, see Amazon Pinpoint Pricing. - `com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeliverabilityDashboardOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeliverabilityDashboardOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsRequest request]
    (-> this (.getDeliverabilityDashboardOptionsAsync request))))

(defn get-configuration-set-event-destinations-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to obtain information about the event destinations for a configuration set. - `com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConfigurationSetEventDestinations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConfigurationSetEventDestinationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsRequest request]
    (-> this (.getConfigurationSetEventDestinationsAsync request))))

(defn get-configuration-set-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to obtain information about a configuration set. - `com.amazonaws.services.pinpointemail.model.GetConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetConfigurationSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConfigurationSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetConfigurationSetRequest request]
    (-> this (.getConfigurationSetAsync request))))

(defn create-deliverability-test-report-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport operation to view the results of the test. - `com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeliverabilityTestReport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeliverabilityTestReportAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportRequest request]
    (-> this (.createDeliverabilityTestReportAsync request))))

(defn create-configuration-set-event-destination-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to add an event destination to a configuration set. - `com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetEventDestinationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationRequest request]
    (-> this (.createConfigurationSetEventDestinationAsync request))))

(defn put-account-dedicated-ip-warmup-attributes-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to enable or disable the automatic IP address warm-up feature. - `com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAccountDedicatedIpWarmupAttributes operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAccountDedicatedIpWarmupAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesRequest request]
    (-> this (.putAccountDedicatedIpWarmupAttributesAsync request))))

(defn put-configuration-set-tracking-options-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to add a custom domain for tracking open and click events to a configuration set. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationSetTrackingOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationSetTrackingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsRequest request]
    (-> this (.putConfigurationSetTrackingOptionsAsync request))))

(defn delete-dedicated-ip-pool-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to delete a dedicated IP pool. - `com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDedicatedIpPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDedicatedIpPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolRequest request]
    (-> this (.deleteDedicatedIpPoolAsync request))))

(defn get-domain-deliverability-campaign-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for ( PutDeliverabilityDashboardOption operation). - `com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainDeliverabilityCampaign operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainDeliverabilityCampaignAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignRequest request]
    (-> this (.getDomainDeliverabilityCampaignAsync request))))

(defn get-deliverability-test-report-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to retrieve the results of a predictive inbox placement test. - `com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeliverabilityTestReport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeliverabilityTestReportAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportRequest request]
    (-> this (.getDeliverabilityTestReportAsync request))))

(defn create-configuration-set-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to create a configuration set. - `com.amazonaws.services.pinpointemail.model.CreateConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.CreateConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetRequest request]
    (-> this (.createConfigurationSetAsync request))))

(defn put-configuration-set-reputation-options-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to enable or disable tracking of reputation metrics for a configuration set. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationSetReputationOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationSetReputationOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsRequest request]
    (-> this (.putConfigurationSetReputationOptionsAsync request))))

(defn put-dedicated-ip-in-pool-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to move a dedicated IP address to a dedicated IP pool. - `com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDedicatedIpInPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDedicatedIpInPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolRequest request]
    (-> this (.putDedicatedIpInPoolAsync request))))

(defn get-email-identity-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to return details about an email identity. - `com.amazonaws.services.pinpointemail.model.GetEmailIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEmailIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetEmailIdentityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetEmailIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEmailIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetEmailIdentityRequest request]
    (-> this (.getEmailIdentityAsync request))))

(defn list-email-identities-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to list all of the email identities associated with your Amazon Pinpoint account. This list includes identities that you've already verified, identities that are unverified, and identities that were verified in the past, but are no longer verified. - `com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEmailIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEmailIdentitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesRequest request]
    (-> this (.listEmailIdentitiesAsync request))))

(defn put-email-identity-feedback-attributes-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to set the attributes that control how bounce and complaint events are processed. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEmailIdentityFeedbackAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEmailIdentityFeedbackAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesRequest request]
    (-> this (.putEmailIdentityFeedbackAttributesAsync request))))

(defn get-blacklist-reports-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to retrieve a list of the blacklists that your dedicated IP addresses appear on. - `com.amazonaws.services.pinpointemail.model.GetBlacklistReportsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBlacklistReports operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetBlacklistReportsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetBlacklistReportsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBlacklistReportsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetBlacklistReportsRequest request]
    (-> this (.getBlacklistReportsAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - `com.amazonaws.services.pinpointemail.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn create-dedicated-ip-pool-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to create a new dedicated IP pool. - `com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDedicatedIpPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDedicatedIpPoolAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolRequest request]
    (-> this (.createDedicatedIpPoolAsync request))))

(defn list-dedicated-ip-pools-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to obtain a list of dedicated IP pools. - `com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDedicatedIpPools operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDedicatedIpPoolsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsRequest request]
    (-> this (.listDedicatedIpPoolsAsync request))))

(defn put-configuration-set-delivery-options-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to associate a configuration set with a dedicated IP pool. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationSetDeliveryOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationSetDeliveryOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsRequest request]
    (-> this (.putConfigurationSetDeliveryOptionsAsync request))))

(defn list-deliverability-test-reports-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to list all of the predictive inbox placement tests that you've performed. - `com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeliverabilityTestReports operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeliverabilityTestReportsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsRequest request]
    (-> this (.listDeliverabilityTestReportsAsync request))))

(defn create-email-identity-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to begin the verification process for an email identity (an email address or domain). - `com.amazonaws.services.pinpointemail.model.CreateEmailIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEmailIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.CreateEmailIdentityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateEmailIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEmailIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateEmailIdentityRequest request]
    (-> this (.createEmailIdentityAsync request))))

(defn delete-configuration-set-event-destination-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to delete an event destination from a configuration set. - `com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetEventDestinationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationRequest request]
    (-> this (.deleteConfigurationSetEventDestinationAsync request))))

(defn delete-email-identity-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to delete an existing email identity. When you delete an identity, you lose the ability to use Amazon Pinpoint to send email from that identity. You can restore your ability to send email by completing the verification process for the identity again. - `com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEmailIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEmailIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityRequest request]
    (-> this (.deleteEmailIdentityAsync request))))

(defn put-configuration-set-sending-options-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to enable or disable the ability of Amazon Pinpoint to send emails that use a specific configuration set. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationSetSendingOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationSetSendingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsRequest request]
    (-> this (.putConfigurationSetSendingOptionsAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - `com.amazonaws.services.pinpointemail.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn put-email-identity-mail-from-attributes-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to configure the custom MAIL FROM domain for a verified identity. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEmailIdentityMailFromAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEmailIdentityMailFromAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesRequest request]
    (-> this (.putEmailIdentityMailFromAttributesAsync request))))

(defn delete-configuration-set-async
  "Description copied from interface: AmazonPinpointEmailAsync

  request - A request to delete a configuration set. - `com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetRequest request]
    (-> this (.deleteConfigurationSetAsync request))))

