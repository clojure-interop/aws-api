(ns com.amazonaws.services.pinpointemail.AmazonPinpointEmailAsync
  "Interface for accessing Pinpoint Email asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonPinpointEmailAsync instead.


  Amazon Pinpoint Email Service

  This document contains reference information for the Amazon Pinpoint
  Email API, version 1.0. This document is best used in conjunction with the Amazon Pinpoint Developer Guide.


  The Amazon Pinpoint Email API is available in several AWS Regions and it provides an endpoint for each of these
  Regions. For a list of all the Regions and endpoints where the API is currently available, see AWS Regions and Endpoints in the
  Amazon Web Services General Reference.


  In each Region, AWS maintains multiple Availability Zones. These Availability Zones are physically isolated from each
  other, but are united by private, low-latency, high-throughput, and highly redundant network connections. These
  Availability Zones enable us to provide very high levels of availability and redundancy, while also minimizing
  latency. To learn more about the number of Availability Zones that are available in each Region, see AWS Global Infrastructure."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.pinpointemail AmazonPinpointEmailAsync]))

(defn put-email-identity-dkim-attributes-async
  "Used to enable or disable DKIM authentication for an email identity.

  put-email-identity-dkim-attributes-request - A request to enable or disable DKIM signing of email that you send from an email identity. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEmailIdentityDkimAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesRequest put-email-identity-dkim-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEmailIdentityDkimAttributesAsync put-email-identity-dkim-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesRequest put-email-identity-dkim-attributes-request]
    (-> this (.putEmailIdentityDkimAttributesAsync put-email-identity-dkim-attributes-request))))

(defn untag-resource-async
  "Remove one or more tags (keys and values) from a specified resource.

  untag-resource-request - `com.amazonaws.services.pinpointemail.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn get-dedicated-ips-async
  "List the dedicated IP addresses that are associated with your Amazon Pinpoint account.

  get-dedicated-ips-request - A request to obtain more information about dedicated IP pools. - `com.amazonaws.services.pinpointemail.model.GetDedicatedIpsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDedicatedIps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetDedicatedIpsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDedicatedIpsRequest get-dedicated-ips-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDedicatedIpsAsync get-dedicated-ips-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDedicatedIpsRequest get-dedicated-ips-request]
    (-> this (.getDedicatedIpsAsync get-dedicated-ips-request))))

(defn get-account-async
  "Obtain information about the email-sending status and capabilities of your Amazon Pinpoint account in the current
   AWS Region.

  get-account-request - A request to obtain information about the email-sending capabilities of your Amazon Pinpoint account. - `com.amazonaws.services.pinpointemail.model.GetAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetAccountResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetAccountRequest get-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountAsync get-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetAccountRequest get-account-request]
    (-> this (.getAccountAsync get-account-request))))

(defn put-dedicated-ip-warmup-attributes-async
  "put-dedicated-ip-warmup-attributes-request - A request to change the warm-up attributes for a dedicated IP address. This operation is useful when you want to resume the warm-up process for an existing IP address. - `com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDedicatedIpWarmupAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesRequest put-dedicated-ip-warmup-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDedicatedIpWarmupAttributesAsync put-dedicated-ip-warmup-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesRequest put-dedicated-ip-warmup-attributes-request]
    (-> this (.putDedicatedIpWarmupAttributesAsync put-dedicated-ip-warmup-attributes-request))))

(defn list-domain-deliverability-campaigns-async
  "Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified
   time range. This data is available for a domain only if you enabled the Deliverability dashboard (
   PutDeliverabilityDashboardOption operation) for the domain.

  list-domain-deliverability-campaigns-request - Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified time range. This data is available for a domain only if you enabled the Deliverability dashboard (PutDeliverabilityDashboardOption operation) for the domain. - `com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomainDeliverabilityCampaigns operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsRequest list-domain-deliverability-campaigns-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainDeliverabilityCampaignsAsync list-domain-deliverability-campaigns-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsRequest list-domain-deliverability-campaigns-request]
    (-> this (.listDomainDeliverabilityCampaignsAsync list-domain-deliverability-campaigns-request))))

(defn send-email-async
  "Sends an email message. You can use the Amazon Pinpoint Email API to send two types of messages:




   Simple – A standard email message. When you create this type of message, you specify the sender, the
   recipient, and the message body, and Amazon Pinpoint assembles the message for you.




   Raw – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of
   the message headers, as well as the message body. You can use this message type to send messages that contain
   attachments. The message that you specify has to be a valid MIME message.

  send-email-request - A request to send an email message. - `com.amazonaws.services.pinpointemail.model.SendEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.SendEmailResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.SendEmailRequest send-email-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendEmailAsync send-email-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.SendEmailRequest send-email-request]
    (-> this (.sendEmailAsync send-email-request))))

(defn put-deliverability-dashboard-option-async
  "Enable or disable the Deliverability dashboard for your Amazon Pinpoint account. When you enable the
   Deliverability dashboard, you gain access to reputation, deliverability, and other metrics for the domains that
   you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement
   tests.


   When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees
   that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability
   dashboard subscription, see Amazon Pinpoint Pricing.

  put-deliverability-dashboard-option-request - Enable or disable the Deliverability dashboard for your Amazon Pinpoint account. When you enable the Deliverability dashboard, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability dashboard subscription, see Amazon Pinpoint Pricing. - `com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDeliverabilityDashboardOption operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionRequest put-deliverability-dashboard-option-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDeliverabilityDashboardOptionAsync put-deliverability-dashboard-option-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionRequest put-deliverability-dashboard-option-request]
    (-> this (.putDeliverabilityDashboardOptionAsync put-deliverability-dashboard-option-request))))

(defn get-dedicated-ip-async
  "Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated
   with, as well information about the automatic warm-up process for the address.

  get-dedicated-ip-request - A request to obtain more information about a dedicated IP address. - `com.amazonaws.services.pinpointemail.model.GetDedicatedIpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDedicatedIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetDedicatedIpResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDedicatedIpRequest get-dedicated-ip-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDedicatedIpAsync get-dedicated-ip-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDedicatedIpRequest get-dedicated-ip-request]
    (-> this (.getDedicatedIpAsync get-dedicated-ip-request))))

(defn get-domain-statistics-report-async
  "Retrieve inbox placement and engagement rates for the domains that you use to send email.

  get-domain-statistics-report-request - A request to obtain deliverability metrics for a domain. - `com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainStatisticsReport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportRequest get-domain-statistics-report-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainStatisticsReportAsync get-domain-statistics-report-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportRequest get-domain-statistics-report-request]
    (-> this (.getDomainStatisticsReportAsync get-domain-statistics-report-request))))

(defn put-account-sending-attributes-async
  "Enable or disable the ability of your account to send email.

  put-account-sending-attributes-request - A request to change the ability of your account to send email. - `com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAccountSendingAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesRequest put-account-sending-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAccountSendingAttributesAsync put-account-sending-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesRequest put-account-sending-attributes-request]
    (-> this (.putAccountSendingAttributesAsync put-account-sending-attributes-request))))

(defn list-configuration-sets-async
  "List all of the configuration sets associated with your Amazon Pinpoint account in the current region.


   In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You
   apply a configuration set to an email by including a reference to the configuration set in the headers of the
   email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
   the email.

  list-configuration-sets-request - A request to obtain a list of configuration sets for your Amazon Pinpoint account in the current AWS Region. - `com.amazonaws.services.pinpointemail.model.ListConfigurationSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurationSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.ListConfigurationSetsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListConfigurationSetsRequest list-configuration-sets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationSetsAsync list-configuration-sets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListConfigurationSetsRequest list-configuration-sets-request]
    (-> this (.listConfigurationSetsAsync list-configuration-sets-request))))

(defn update-configuration-set-event-destination-async
  "Update the configuration of an event destination for a configuration set.


   In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints.
   Event destinations are places that you can send information about these events to. For example, you can
   send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
   Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.

  update-configuration-set-event-destination-request - A request to change the settings for an event destination for a configuration set. - `com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationRequest update-configuration-set-event-destination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationSetEventDestinationAsync update-configuration-set-event-destination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationRequest update-configuration-set-event-destination-request]
    (-> this (.updateConfigurationSetEventDestinationAsync update-configuration-set-event-destination-request))))

(defn get-deliverability-dashboard-options-async
  "Retrieve information about the status of the Deliverability dashboard for your Amazon Pinpoint account. When the
   Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the
   domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox
   placement tests.


   When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees
   that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability
   dashboard subscription, see Amazon Pinpoint Pricing.

  get-deliverability-dashboard-options-request - Retrieve information about the status of the Deliverability dashboard for your Amazon Pinpoint account. When the Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement tests. When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability dashboard subscription, see Amazon Pinpoint Pricing. - `com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeliverabilityDashboardOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsRequest get-deliverability-dashboard-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeliverabilityDashboardOptionsAsync get-deliverability-dashboard-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsRequest get-deliverability-dashboard-options-request]
    (-> this (.getDeliverabilityDashboardOptionsAsync get-deliverability-dashboard-options-request))))

(defn get-configuration-set-event-destinations-async
  "Retrieve a list of event destinations that are associated with a configuration set.


   In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints.
   Event destinations are places that you can send information about these events to. For example, you can
   send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
   Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.

  get-configuration-set-event-destinations-request - A request to obtain information about the event destinations for a configuration set. - `com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConfigurationSetEventDestinations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsRequest get-configuration-set-event-destinations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConfigurationSetEventDestinationsAsync get-configuration-set-event-destinations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsRequest get-configuration-set-event-destinations-request]
    (-> this (.getConfigurationSetEventDestinationsAsync get-configuration-set-event-destinations-request))))

(defn get-configuration-set-async
  "Get information about an existing configuration set, including the dedicated IP pool that it's associated with,
   whether or not it's enabled for sending email, and more.


   In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You
   apply a configuration set to an email by including a reference to the configuration set in the headers of the
   email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
   the email.

  get-configuration-set-request - A request to obtain information about a configuration set. - `com.amazonaws.services.pinpointemail.model.GetConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetConfigurationSetRequest get-configuration-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getConfigurationSetAsync get-configuration-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetConfigurationSetRequest get-configuration-set-request]
    (-> this (.getConfigurationSetAsync get-configuration-set-request))))

(defn create-deliverability-test-report-async
  "Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your
   messages will be handled by various email providers around the world. When you perform a predictive inbox
   placement test, you provide a sample message that contains the content that you plan to send to your customers.
   Amazon Pinpoint then sends that message to special email addresses spread across several major email providers.
   After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport
   operation to view the results of the test.

  create-deliverability-test-report-request - A request to perform a predictive inbox placement test. Predictive inbox placement tests can help you predict how your messages will be handled by various email providers around the world. When you perform a predictive inbox placement test, you provide a sample message that contains the content that you plan to send to your customers. Amazon Pinpoint then sends that message to special email addresses spread across several major email providers. After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport operation to view the results of the test. - `com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDeliverabilityTestReport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportRequest create-deliverability-test-report-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDeliverabilityTestReportAsync create-deliverability-test-report-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportRequest create-deliverability-test-report-request]
    (-> this (.createDeliverabilityTestReportAsync create-deliverability-test-report-request))))

(defn create-configuration-set-event-destination-async
  "Create an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks,
   bounces, and complaints. Event destinations are places that you can send information about these events
   to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or
   complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.


   A single configuration set can include more than one event destination.

  create-configuration-set-event-destination-request - A request to add an event destination to a configuration set. - `com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationRequest create-configuration-set-event-destination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetEventDestinationAsync create-configuration-set-event-destination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationRequest create-configuration-set-event-destination-request]
    (-> this (.createConfigurationSetEventDestinationAsync create-configuration-set-event-destination-request))))

(defn put-account-dedicated-ip-warmup-attributes-async
  "Enable or disable the automatic warm-up feature for dedicated IP addresses.

  put-account-dedicated-ip-warmup-attributes-request - A request to enable or disable the automatic IP address warm-up feature. - `com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutAccountDedicatedIpWarmupAttributes operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesRequest put-account-dedicated-ip-warmup-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putAccountDedicatedIpWarmupAttributesAsync put-account-dedicated-ip-warmup-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesRequest put-account-dedicated-ip-warmup-attributes-request]
    (-> this (.putAccountDedicatedIpWarmupAttributesAsync put-account-dedicated-ip-warmup-attributes-request))))

(defn put-configuration-set-tracking-options-async
  "Specify a custom domain to use for open and click tracking elements in email that you send using Amazon Pinpoint.

  put-configuration-set-tracking-options-request - A request to add a custom domain for tracking open and click events to a configuration set. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationSetTrackingOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsRequest put-configuration-set-tracking-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationSetTrackingOptionsAsync put-configuration-set-tracking-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsRequest put-configuration-set-tracking-options-request]
    (-> this (.putConfigurationSetTrackingOptionsAsync put-configuration-set-tracking-options-request))))

(defn delete-dedicated-ip-pool-async
  "Delete a dedicated IP pool.

  delete-dedicated-ip-pool-request - A request to delete a dedicated IP pool. - `com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDedicatedIpPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolRequest delete-dedicated-ip-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDedicatedIpPoolAsync delete-dedicated-ip-pool-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolRequest delete-dedicated-ip-pool-request]
    (-> this (.deleteDedicatedIpPoolAsync delete-dedicated-ip-pool-request))))

(defn get-domain-deliverability-campaign-async
  "Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the
   campaign sent email by using a domain that the Deliverability dashboard is enabled for (
   PutDeliverabilityDashboardOption operation).

  get-domain-deliverability-campaign-request - Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the campaign sent email by using a domain that the Deliverability dashboard is enabled for ( PutDeliverabilityDashboardOption operation). - `com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainDeliverabilityCampaign operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignRequest get-domain-deliverability-campaign-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainDeliverabilityCampaignAsync get-domain-deliverability-campaign-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignRequest get-domain-deliverability-campaign-request]
    (-> this (.getDomainDeliverabilityCampaignAsync get-domain-deliverability-campaign-request))))

(defn get-deliverability-test-report-async
  "Retrieve the results of a predictive inbox placement test.

  get-deliverability-test-report-request - A request to retrieve the results of a predictive inbox placement test. - `com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDeliverabilityTestReport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportRequest get-deliverability-test-report-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDeliverabilityTestReportAsync get-deliverability-test-report-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportRequest get-deliverability-test-report-request]
    (-> this (.getDeliverabilityTestReportAsync get-deliverability-test-report-request))))

(defn create-configuration-set-async
  "Create a configuration set. Configuration sets are groups of rules that you can apply to the emails you
   send using Amazon Pinpoint. You apply a configuration set to an email by including a reference to the
   configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules
   in that configuration set are applied to the email.

  create-configuration-set-request - A request to create a configuration set. - `com.amazonaws.services.pinpointemail.model.CreateConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.CreateConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetRequest create-configuration-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetAsync create-configuration-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetRequest create-configuration-set-request]
    (-> this (.createConfigurationSetAsync create-configuration-set-request))))

(defn put-configuration-set-reputation-options-async
  "Enable or disable collection of reputation metrics for emails that you send using a particular configuration set
   in a specific AWS Region.

  put-configuration-set-reputation-options-request - A request to enable or disable tracking of reputation metrics for a configuration set. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationSetReputationOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsRequest put-configuration-set-reputation-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationSetReputationOptionsAsync put-configuration-set-reputation-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsRequest put-configuration-set-reputation-options-request]
    (-> this (.putConfigurationSetReputationOptionsAsync put-configuration-set-reputation-options-request))))

(defn put-dedicated-ip-in-pool-async
  "Move a dedicated IP address to an existing dedicated IP pool.



   The dedicated IP address that you specify must already exist, and must be associated with your Amazon Pinpoint
   account.


   The dedicated IP pool you specify must already exist. You can create a new pool by using the
   CreateDedicatedIpPool operation.

  put-dedicated-ip-in-pool-request - A request to move a dedicated IP address to a dedicated IP pool. - `com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutDedicatedIpInPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolRequest put-dedicated-ip-in-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putDedicatedIpInPoolAsync put-dedicated-ip-in-pool-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolRequest put-dedicated-ip-in-pool-request]
    (-> this (.putDedicatedIpInPoolAsync put-dedicated-ip-in-pool-request))))

(defn get-email-identity-async
  "Provides information about a specific identity associated with your Amazon Pinpoint account, including the
   identity's verification status, its DKIM authentication status, and its custom Mail-From settings.

  get-email-identity-request - A request to return details about an email identity. - `com.amazonaws.services.pinpointemail.model.GetEmailIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEmailIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetEmailIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetEmailIdentityRequest get-email-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEmailIdentityAsync get-email-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetEmailIdentityRequest get-email-identity-request]
    (-> this (.getEmailIdentityAsync get-email-identity-request))))

(defn list-email-identities-async
  "Returns a list of all of the email identities that are associated with your Amazon Pinpoint account. An identity
   can be either an email address or a domain. This operation returns identities that are verified as well as those
   that aren't.

  list-email-identities-request - A request to list all of the email identities associated with your Amazon Pinpoint account. This list includes identities that you've already verified, identities that are unverified, and identities that were verified in the past, but are no longer verified. - `com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEmailIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesRequest list-email-identities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEmailIdentitiesAsync list-email-identities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesRequest list-email-identities-request]
    (-> this (.listEmailIdentitiesAsync list-email-identities-request))))

(defn put-email-identity-feedback-attributes-async
  "Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an
   identity is used to send an email that results in a bounce or complaint event.


   When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce or complaint
   events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header
   of the original email.


   When you disable feedback forwarding, Amazon Pinpoint sends notifications through other mechanisms, such as by
   notifying an Amazon SNS topic. You're required to have a method of tracking bounces and complaints. If you
   haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email
   notification when these events occur (even if this setting is disabled).

  put-email-identity-feedback-attributes-request - A request to set the attributes that control how bounce and complaint events are processed. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEmailIdentityFeedbackAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesRequest put-email-identity-feedback-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEmailIdentityFeedbackAttributesAsync put-email-identity-feedback-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesRequest put-email-identity-feedback-attributes-request]
    (-> this (.putEmailIdentityFeedbackAttributesAsync put-email-identity-feedback-attributes-request))))

(defn get-blacklist-reports-async
  "Retrieve a list of the blacklists that your dedicated IP addresses appear on.

  get-blacklist-reports-request - A request to retrieve a list of the blacklists that your dedicated IP addresses appear on. - `com.amazonaws.services.pinpointemail.model.GetBlacklistReportsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBlacklistReports operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.GetBlacklistReportsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetBlacklistReportsRequest get-blacklist-reports-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBlacklistReportsAsync get-blacklist-reports-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.GetBlacklistReportsRequest get-blacklist-reports-request]
    (-> this (.getBlacklistReportsAsync get-blacklist-reports-request))))

(defn list-tags-for-resource-async
  "Retrieve a list of the tags (keys and values) that are associated with a specified resource. A tag is a
   label that you optionally define and associate with a resource in Amazon Pinpoint. Each tag consists of a
   required tag key and an optional associated tag value. A tag key is a general label that acts as a
   category for more specific tag values. A tag value acts as a descriptor within a tag key.

  list-tags-for-resource-request - `com.amazonaws.services.pinpointemail.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn create-dedicated-ip-pool-async
  "Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are
   associated with your Amazon Pinpoint account. You can associate a pool with a configuration set. When you send an
   email that uses that configuration set, Amazon Pinpoint sends it using only the IP addresses in the associated
   pool.

  create-dedicated-ip-pool-request - A request to create a new dedicated IP pool. - `com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDedicatedIpPool operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolRequest create-dedicated-ip-pool-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDedicatedIpPoolAsync create-dedicated-ip-pool-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolRequest create-dedicated-ip-pool-request]
    (-> this (.createDedicatedIpPoolAsync create-dedicated-ip-pool-request))))

(defn list-dedicated-ip-pools-async
  "List all of the dedicated IP pools that exist in your Amazon Pinpoint account in the current AWS Region.

  list-dedicated-ip-pools-request - A request to obtain a list of dedicated IP pools. - `com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDedicatedIpPools operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsRequest list-dedicated-ip-pools-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDedicatedIpPoolsAsync list-dedicated-ip-pools-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsRequest list-dedicated-ip-pools-request]
    (-> this (.listDedicatedIpPoolsAsync list-dedicated-ip-pools-request))))

(defn put-configuration-set-delivery-options-async
  "Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of
   dedicated IP addresses for sending specific types of email.

  put-configuration-set-delivery-options-request - A request to associate a configuration set with a dedicated IP pool. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationSetDeliveryOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsRequest put-configuration-set-delivery-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationSetDeliveryOptionsAsync put-configuration-set-delivery-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsRequest put-configuration-set-delivery-options-request]
    (-> this (.putConfigurationSetDeliveryOptionsAsync put-configuration-set-delivery-options-request))))

(defn list-deliverability-test-reports-async
  "Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For
   predictive inbox placement tests that are complete, you can use the GetDeliverabilityTestReport
   operation to view the results.

  list-deliverability-test-reports-request - A request to list all of the predictive inbox placement tests that you've performed. - `com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeliverabilityTestReports operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsRequest list-deliverability-test-reports-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeliverabilityTestReportsAsync list-deliverability-test-reports-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsRequest list-deliverability-test-reports-request]
    (-> this (.listDeliverabilityTestReportsAsync list-deliverability-test-reports-request))))

(defn create-email-identity-async
  "Verifies an email identity for use with Amazon Pinpoint. In Amazon Pinpoint, an identity is an email address or
   domain that you use when you send email. Before you can use an identity to send email with Amazon Pinpoint, you
   first have to verify it. By verifying an address, you demonstrate that you're the owner of the address, and that
   you've given Amazon Pinpoint permission to send email from the address.


   When you verify an email address, Amazon Pinpoint sends an email to the address. Your email address is verified
   as soon as you follow the link in the verification email.


   When you verify a domain, this operation provides a set of DKIM tokens, which you can convert into CNAME tokens.
   You add these CNAME tokens to the DNS configuration for your domain. Your domain is verified when Amazon Pinpoint
   detects these records in the DNS configuration for your domain. It usually takes around 72 hours to complete the
   domain verification process.

  create-email-identity-request - A request to begin the verification process for an email identity (an email address or domain). - `com.amazonaws.services.pinpointemail.model.CreateEmailIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEmailIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.CreateEmailIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateEmailIdentityRequest create-email-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEmailIdentityAsync create-email-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.CreateEmailIdentityRequest create-email-identity-request]
    (-> this (.createEmailIdentityAsync create-email-identity-request))))

(defn delete-configuration-set-event-destination-async
  "Delete an event destination.


   In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints.
   Event destinations are places that you can send information about these events to. For example, you can
   send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
   Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.

  delete-configuration-set-event-destination-request - A request to delete an event destination from a configuration set. - `com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationRequest delete-configuration-set-event-destination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetEventDestinationAsync delete-configuration-set-event-destination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationRequest delete-configuration-set-event-destination-request]
    (-> this (.deleteConfigurationSetEventDestinationAsync delete-configuration-set-event-destination-request))))

(defn delete-email-identity-async
  "Deletes an email identity that you previously verified for use with Amazon Pinpoint. An identity can be either an
   email address or a domain name.

  delete-email-identity-request - A request to delete an existing email identity. When you delete an identity, you lose the ability to use Amazon Pinpoint to send email from that identity. You can restore your ability to send email by completing the verification process for the identity again. - `com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEmailIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityRequest delete-email-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEmailIdentityAsync delete-email-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityRequest delete-email-identity-request]
    (-> this (.deleteEmailIdentityAsync delete-email-identity-request))))

(defn put-configuration-set-sending-options-async
  "Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.

  put-configuration-set-sending-options-request - A request to enable or disable the ability of Amazon Pinpoint to send emails that use a specific configuration set. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationSetSendingOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsRequest put-configuration-set-sending-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationSetSendingOptionsAsync put-configuration-set-sending-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsRequest put-configuration-set-sending-options-request]
    (-> this (.putConfigurationSetSendingOptionsAsync put-configuration-set-sending-options-request))))

(defn tag-resource-async
  "Add one or more tags (keys and values) to a specified resource. A tag is a label that you optionally
   define and associate with a resource in Amazon Pinpoint. Tags can help you categorize and manage resources in
   different ways, such as by purpose, owner, environment, or other criteria. A resource can have as many as 50
   tags.


   Each tag consists of a required tag key and an associated tag value, both of which you define. A
   tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor
   within a tag key.

  tag-resource-request - `com.amazonaws.services.pinpointemail.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn put-email-identity-mail-from-attributes-async
  "Used to enable or disable the custom Mail-From domain configuration for an email identity.

  put-email-identity-mail-from-attributes-request - A request to configure the custom MAIL FROM domain for a verified identity. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutEmailIdentityMailFromAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesRequest put-email-identity-mail-from-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putEmailIdentityMailFromAttributesAsync put-email-identity-mail-from-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesRequest put-email-identity-mail-from-attributes-request]
    (-> this (.putEmailIdentityMailFromAttributesAsync put-email-identity-mail-from-attributes-request))))

(defn delete-configuration-set-async
  "Delete an existing configuration set.


   In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You
   apply a configuration set to an email by including a reference to the configuration set in the headers of the
   email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
   the email.

  delete-configuration-set-request - A request to delete a configuration set. - `com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetRequest delete-configuration-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetAsync delete-configuration-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonPinpointEmailAsync this ^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetRequest delete-configuration-set-request]
    (-> this (.deleteConfigurationSetAsync delete-configuration-set-request))))

