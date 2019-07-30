(ns com.amazonaws.services.pinpointemail.AmazonPinpointEmailClient
  "Client for accessing Pinpoint Email. All service calls made using this client are blocking, and will not return until
  the service call completes.

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
  (:import [com.amazonaws.services.pinpointemail AmazonPinpointEmailClient]))

(defn *builder
  "returns: `com.amazonaws.services.pinpointemail.AmazonPinpointEmailClientBuilder`"
  (^com.amazonaws.services.pinpointemail.AmazonPinpointEmailClientBuilder []
    (AmazonPinpointEmailClient/builder )))

(defn get-domain-statistics-report
  "Retrieve inbox placement and engagement rates for the domains that you use to send email.

  request - `com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportRequest`

  returns: Result of the GetDomainStatisticsReport operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.GetDomainStatisticsReportRequest request]
    (-> this (.getDomainStatisticsReport request))))

(defn list-tags-for-resource
  "Retrieve a list of the tags (keys and values) that are associated with a specified resource. A tag is a
   label that you optionally define and associate with a resource in Amazon Pinpoint. Each tag consists of a
   required tag key and an optional associated tag value. A tag key is a general label that acts as a
   category for more specific tag values. A tag value acts as a descriptor within a tag key.

  request - `com.amazonaws.services.pinpointemail.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.pinpointemail.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.pinpointemail.model.BadRequestException - The input you provided is invalid."
  (^com.amazonaws.services.pinpointemail.model.ListTagsForResourceResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn put-dedicated-ip-in-pool
  "Move a dedicated IP address to an existing dedicated IP pool.



   The dedicated IP address that you specify must already exist, and must be associated with your Amazon Pinpoint
   account.


   The dedicated IP pool you specify must already exist. You can create a new pool by using the
   CreateDedicatedIpPool operation.

  request - `com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolRequest`

  returns: Result of the PutDedicatedIpInPool operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.PutDedicatedIpInPoolRequest request]
    (-> this (.putDedicatedIpInPool request))))

(defn list-dedicated-ip-pools
  "List all of the dedicated IP pools that exist in your Amazon Pinpoint account in the current AWS Region.

  request - `com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsRequest`

  returns: Result of the ListDedicatedIpPools operation returned by the service. - `com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.ListDedicatedIpPoolsRequest request]
    (-> this (.listDedicatedIpPools request))))

(defn list-configuration-sets
  "List all of the configuration sets associated with your Amazon Pinpoint account in the current region.


   In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You
   apply a configuration set to an email by including a reference to the configuration set in the headers of the
   email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
   the email.

  request - `com.amazonaws.services.pinpointemail.model.ListConfigurationSetsRequest`

  returns: Result of the ListConfigurationSets operation returned by the service. - `com.amazonaws.services.pinpointemail.model.ListConfigurationSetsResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.ListConfigurationSetsResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.ListConfigurationSetsRequest request]
    (-> this (.listConfigurationSets request))))

(defn get-configuration-set-event-destinations
  "Retrieve a list of event destinations that are associated with a configuration set.


   In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints.
   Event destinations are places that you can send information about these events to. For example, you can
   send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
   Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.

  request - `com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsRequest`

  returns: Result of the GetConfigurationSetEventDestinations operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.GetConfigurationSetEventDestinationsRequest request]
    (-> this (.getConfigurationSetEventDestinations request))))

(defn create-configuration-set-event-destination
  "Create an event destination. In Amazon Pinpoint, events include message sends, deliveries, opens, clicks,
   bounces, and complaints. Event destinations are places that you can send information about these events
   to. For example, you can send event data to Amazon SNS to receive notifications when you receive bounces or
   complaints, or you can use Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.


   A single configuration set can include more than one event destination.

  request - `com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationRequest`

  returns: Result of the CreateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetEventDestinationRequest request]
    (-> this (.createConfigurationSetEventDestination request))))

(defn put-configuration-set-delivery-options
  "Associate a configuration set with a dedicated IP pool. You can use dedicated IP pools to create groups of
   dedicated IP addresses for sending specific types of email.

  request - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsRequest`

  returns: Result of the PutConfigurationSetDeliveryOptions operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetDeliveryOptionsRequest request]
    (-> this (.putConfigurationSetDeliveryOptions request))))

(defn create-email-identity
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

  request - `com.amazonaws.services.pinpointemail.model.CreateEmailIdentityRequest`

  returns: Result of the CreateEmailIdentity operation returned by the service. - `com.amazonaws.services.pinpointemail.model.CreateEmailIdentityResult`

  throws: com.amazonaws.services.pinpointemail.model.LimitExceededException - There are too many instances of the specified resource type."
  (^com.amazonaws.services.pinpointemail.model.CreateEmailIdentityResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.CreateEmailIdentityRequest request]
    (-> this (.createEmailIdentity request))))

(defn put-account-dedicated-ip-warmup-attributes
  "Enable or disable the automatic warm-up feature for dedicated IP addresses.

  request - `com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesRequest`

  returns: Result of the PutAccountDedicatedIpWarmupAttributes operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.PutAccountDedicatedIpWarmupAttributesRequest request]
    (-> this (.putAccountDedicatedIpWarmupAttributes request))))

(defn put-configuration-set-reputation-options
  "Enable or disable collection of reputation metrics for emails that you send using a particular configuration set
   in a specific AWS Region.

  request - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsRequest`

  returns: Result of the PutConfigurationSetReputationOptions operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetReputationOptionsRequest request]
    (-> this (.putConfigurationSetReputationOptions request))))

(defn put-email-identity-dkim-attributes
  "Used to enable or disable DKIM authentication for an email identity.

  request - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesRequest`

  returns: Result of the PutEmailIdentityDkimAttributes operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityDkimAttributesRequest request]
    (-> this (.putEmailIdentityDkimAttributes request))))

(defn untag-resource
  "Remove one or more tags (keys and values) from a specified resource.

  request - `com.amazonaws.services.pinpointemail.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.pinpointemail.model.UntagResourceResult`

  throws: com.amazonaws.services.pinpointemail.model.BadRequestException - The input you provided is invalid."
  (^com.amazonaws.services.pinpointemail.model.UntagResourceResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn put-configuration-set-sending-options
  "Enable or disable email sending for messages that use a particular configuration set in a specific AWS Region.

  request - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsRequest`

  returns: Result of the PutConfigurationSetSendingOptions operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetSendingOptionsRequest request]
    (-> this (.putConfigurationSetSendingOptions request))))

(defn delete-configuration-set-event-destination
  "Delete an event destination.


   In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints.
   Event destinations are places that you can send information about these events to. For example, you can
   send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
   Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.

  request - `com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationRequest`

  returns: Result of the DeleteConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetEventDestinationRequest request]
    (-> this (.deleteConfigurationSetEventDestination request))))

(defn get-dedicated-ip
  "Get information about a dedicated IP address, including the name of the dedicated IP pool that it's associated
   with, as well information about the automatic warm-up process for the address.

  request - `com.amazonaws.services.pinpointemail.model.GetDedicatedIpRequest`

  returns: Result of the GetDedicatedIp operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetDedicatedIpResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.GetDedicatedIpResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.GetDedicatedIpRequest request]
    (-> this (.getDedicatedIp request))))

(defn put-account-sending-attributes
  "Enable or disable the ability of your account to send email.

  request - `com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesRequest`

  returns: Result of the PutAccountSendingAttributes operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.PutAccountSendingAttributesRequest request]
    (-> this (.putAccountSendingAttributes request))))

(defn put-email-identity-feedback-attributes
  "Used to enable or disable feedback forwarding for an identity. This setting determines what happens when an
   identity is used to send an email that results in a bounce or complaint event.


   When you enable feedback forwarding, Amazon Pinpoint sends you email notifications when bounce or complaint
   events occur. Amazon Pinpoint sends this notification to the address that you specified in the Return-Path header
   of the original email.


   When you disable feedback forwarding, Amazon Pinpoint sends notifications through other mechanisms, such as by
   notifying an Amazon SNS topic. You're required to have a method of tracking bounces and complaints. If you
   haven't set up another mechanism for receiving bounce or complaint notifications, Amazon Pinpoint sends an email
   notification when these events occur (even if this setting is disabled).

  request - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesRequest`

  returns: Result of the PutEmailIdentityFeedbackAttributes operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityFeedbackAttributesRequest request]
    (-> this (.putEmailIdentityFeedbackAttributes request))))

(defn delete-configuration-set
  "Delete an existing configuration set.


   In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You
   apply a configuration set to an email by including a reference to the configuration set in the headers of the
   email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
   the email.

  request - `com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetRequest`

  returns: Result of the DeleteConfigurationSet operation returned by the service. - `com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.DeleteConfigurationSetRequest request]
    (-> this (.deleteConfigurationSet request))))

(defn get-email-identity
  "Provides information about a specific identity associated with your Amazon Pinpoint account, including the
   identity's verification status, its DKIM authentication status, and its custom Mail-From settings.

  request - `com.amazonaws.services.pinpointemail.model.GetEmailIdentityRequest`

  returns: Result of the GetEmailIdentity operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetEmailIdentityResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.GetEmailIdentityResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.GetEmailIdentityRequest request]
    (-> this (.getEmailIdentity request))))

(defn send-email
  "Sends an email message. You can use the Amazon Pinpoint Email API to send two types of messages:




   Simple – A standard email message. When you create this type of message, you specify the sender, the
   recipient, and the message body, and Amazon Pinpoint assembles the message for you.




   Raw – A raw, MIME-formatted email message. When you send this type of email, you have to specify all of
   the message headers, as well as the message body. You can use this message type to send messages that contain
   attachments. The message that you specify has to be a valid MIME message.

  request - `com.amazonaws.services.pinpointemail.model.SendEmailRequest`

  returns: Result of the SendEmail operation returned by the service. - `com.amazonaws.services.pinpointemail.model.SendEmailResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.SendEmailResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.SendEmailRequest request]
    (-> this (.sendEmail request))))

(defn get-deliverability-test-report
  "Retrieve the results of a predictive inbox placement test.

  request - `com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportRequest`

  returns: Result of the GetDeliverabilityTestReport operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.GetDeliverabilityTestReportRequest request]
    (-> this (.getDeliverabilityTestReport request))))

(defn put-email-identity-mail-from-attributes
  "Used to enable or disable the custom Mail-From domain configuration for an email identity.

  request - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesRequest`

  returns: Result of the PutEmailIdentityMailFromAttributes operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.PutEmailIdentityMailFromAttributesRequest request]
    (-> this (.putEmailIdentityMailFromAttributes request))))

(defn update-configuration-set-event-destination
  "Update the configuration of an event destination for a configuration set.


   In Amazon Pinpoint, events include message sends, deliveries, opens, clicks, bounces, and complaints.
   Event destinations are places that you can send information about these events to. For example, you can
   send event data to Amazon SNS to receive notifications when you receive bounces or complaints, or you can use
   Amazon Kinesis Data Firehose to stream data to Amazon S3 for long-term storage.

  request - `com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationRequest`

  returns: Result of the UpdateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.UpdateConfigurationSetEventDestinationRequest request]
    (-> this (.updateConfigurationSetEventDestination request))))

(defn get-domain-deliverability-campaign
  "Retrieve all the deliverability data for a specific campaign. This data is available for a campaign only if the
   campaign sent email by using a domain that the Deliverability dashboard is enabled for (
   PutDeliverabilityDashboardOption operation).

  request - `com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignRequest`

  returns: Result of the GetDomainDeliverabilityCampaign operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.GetDomainDeliverabilityCampaignRequest request]
    (-> this (.getDomainDeliverabilityCampaign request))))

(defn list-email-identities
  "Returns a list of all of the email identities that are associated with your Amazon Pinpoint account. An identity
   can be either an email address or a domain. This operation returns identities that are verified as well as those
   that aren't.

  request - `com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesRequest`

  returns: Result of the ListEmailIdentities operation returned by the service. - `com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.ListEmailIdentitiesRequest request]
    (-> this (.listEmailIdentities request))))

(defn delete-dedicated-ip-pool
  "Delete a dedicated IP pool.

  request - `com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolRequest`

  returns: Result of the DeleteDedicatedIpPool operation returned by the service. - `com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.DeleteDedicatedIpPoolRequest request]
    (-> this (.deleteDedicatedIpPool request))))

(defn get-account
  "Obtain information about the email-sending status and capabilities of your Amazon Pinpoint account in the current
   AWS Region.

  request - `com.amazonaws.services.pinpointemail.model.GetAccountRequest`

  returns: Result of the GetAccount operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetAccountResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.GetAccountResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.GetAccountRequest request]
    (-> this (.getAccount request))))

(defn list-deliverability-test-reports
  "Show a list of the predictive inbox placement tests that you've performed, regardless of their statuses. For
   predictive inbox placement tests that are complete, you can use the GetDeliverabilityTestReport
   operation to view the results.

  request - `com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsRequest`

  returns: Result of the ListDeliverabilityTestReports operation returned by the service. - `com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.ListDeliverabilityTestReportsRequest request]
    (-> this (.listDeliverabilityTestReports request))))

(defn put-deliverability-dashboard-option
  "Enable or disable the Deliverability dashboard for your Amazon Pinpoint account. When you enable the
   Deliverability dashboard, you gain access to reputation, deliverability, and other metrics for the domains that
   you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox placement
   tests.


   When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees
   that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability
   dashboard subscription, see Amazon Pinpoint Pricing.

  request - `com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionRequest`

  returns: Result of the PutDeliverabilityDashboardOption operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionResult`

  throws: com.amazonaws.services.pinpointemail.model.AlreadyExistsException - The resource specified in your request already exists."
  (^com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.PutDeliverabilityDashboardOptionRequest request]
    (-> this (.putDeliverabilityDashboardOption request))))

(defn create-deliverability-test-report
  "Create a new predictive inbox placement test. Predictive inbox placement tests can help you predict how your
   messages will be handled by various email providers around the world. When you perform a predictive inbox
   placement test, you provide a sample message that contains the content that you plan to send to your customers.
   Amazon Pinpoint then sends that message to special email addresses spread across several major email providers.
   After about 24 hours, the test is complete, and you can use the GetDeliverabilityTestReport
   operation to view the results of the test.

  request - `com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportRequest`

  returns: Result of the CreateDeliverabilityTestReport operation returned by the service. - `com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportResult`

  throws: com.amazonaws.services.pinpointemail.model.AccountSuspendedException - The message can't be sent because the account's ability to send email has been permanently restricted."
  (^com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.CreateDeliverabilityTestReportRequest request]
    (-> this (.createDeliverabilityTestReport request))))

(defn get-dedicated-ips
  "List the dedicated IP addresses that are associated with your Amazon Pinpoint account.

  request - `com.amazonaws.services.pinpointemail.model.GetDedicatedIpsRequest`

  returns: Result of the GetDedicatedIps operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetDedicatedIpsResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.GetDedicatedIpsResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.GetDedicatedIpsRequest request]
    (-> this (.getDedicatedIps request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonPinpointEmailClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-blacklist-reports
  "Retrieve a list of the blacklists that your dedicated IP addresses appear on.

  request - `com.amazonaws.services.pinpointemail.model.GetBlacklistReportsRequest`

  returns: Result of the GetBlacklistReports operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetBlacklistReportsResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.GetBlacklistReportsResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.GetBlacklistReportsRequest request]
    (-> this (.getBlacklistReports request))))

(defn put-dedicated-ip-warmup-attributes
  "request - `com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesRequest`

  returns: Result of the PutDedicatedIpWarmupAttributes operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.PutDedicatedIpWarmupAttributesRequest request]
    (-> this (.putDedicatedIpWarmupAttributes request))))

(defn tag-resource
  "Add one or more tags (keys and values) to a specified resource. A tag is a label that you optionally
   define and associate with a resource in Amazon Pinpoint. Tags can help you categorize and manage resources in
   different ways, such as by purpose, owner, environment, or other criteria. A resource can have as many as 50
   tags.


   Each tag consists of a required tag key and an associated tag value, both of which you define. A
   tag key is a general label that acts as a category for more specific tag values. A tag value acts as a descriptor
   within a tag key.

  request - `com.amazonaws.services.pinpointemail.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.pinpointemail.model.TagResourceResult`

  throws: com.amazonaws.services.pinpointemail.model.BadRequestException - The input you provided is invalid."
  (^com.amazonaws.services.pinpointemail.model.TagResourceResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn get-configuration-set
  "Get information about an existing configuration set, including the dedicated IP pool that it's associated with,
   whether or not it's enabled for sending email, and more.


   In Amazon Pinpoint, configuration sets are groups of rules that you can apply to the emails you send. You
   apply a configuration set to an email by including a reference to the configuration set in the headers of the
   email. When you apply a configuration set to an email, all of the rules in that configuration set are applied to
   the email.

  request - `com.amazonaws.services.pinpointemail.model.GetConfigurationSetRequest`

  returns: Result of the GetConfigurationSet operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetConfigurationSetResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.GetConfigurationSetResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.GetConfigurationSetRequest request]
    (-> this (.getConfigurationSet request))))

(defn list-domain-deliverability-campaigns
  "Retrieve deliverability data for all the campaigns that used a specific domain to send email during a specified
   time range. This data is available for a domain only if you enabled the Deliverability dashboard (
   PutDeliverabilityDashboardOption operation) for the domain.

  request - `com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsRequest`

  returns: Result of the ListDomainDeliverabilityCampaigns operation returned by the service. - `com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.ListDomainDeliverabilityCampaignsRequest request]
    (-> this (.listDomainDeliverabilityCampaigns request))))

(defn put-configuration-set-tracking-options
  "Specify a custom domain to use for open and click tracking elements in email that you send using Amazon Pinpoint.

  request - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsRequest`

  returns: Result of the PutConfigurationSetTrackingOptions operation returned by the service. - `com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.PutConfigurationSetTrackingOptionsRequest request]
    (-> this (.putConfigurationSetTrackingOptions request))))

(defn create-dedicated-ip-pool
  "Create a new pool of dedicated IP addresses. A pool can include one or more dedicated IP addresses that are
   associated with your Amazon Pinpoint account. You can associate a pool with a configuration set. When you send an
   email that uses that configuration set, Amazon Pinpoint sends it using only the IP addresses in the associated
   pool.

  request - `com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolRequest`

  returns: Result of the CreateDedicatedIpPool operation returned by the service. - `com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolResult`

  throws: com.amazonaws.services.pinpointemail.model.AlreadyExistsException - The resource specified in your request already exists."
  (^com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.CreateDedicatedIpPoolRequest request]
    (-> this (.createDedicatedIpPool request))))

(defn get-deliverability-dashboard-options
  "Retrieve information about the status of the Deliverability dashboard for your Amazon Pinpoint account. When the
   Deliverability dashboard is enabled, you gain access to reputation, deliverability, and other metrics for the
   domains that you use to send email using Amazon Pinpoint. You also gain the ability to perform predictive inbox
   placement tests.


   When you use the Deliverability dashboard, you pay a monthly subscription charge, in addition to any other fees
   that you accrue by using Amazon Pinpoint. For more information about the features and cost of a Deliverability
   dashboard subscription, see Amazon Pinpoint Pricing.

  request - `com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsRequest`

  returns: Result of the GetDeliverabilityDashboardOptions operation returned by the service. - `com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsResult`

  throws: com.amazonaws.services.pinpointemail.model.TooManyRequestsException - Too many requests have been made to the operation."
  (^com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.GetDeliverabilityDashboardOptionsRequest request]
    (-> this (.getDeliverabilityDashboardOptions request))))

(defn create-configuration-set
  "Create a configuration set. Configuration sets are groups of rules that you can apply to the emails you
   send using Amazon Pinpoint. You apply a configuration set to an email by including a reference to the
   configuration set in the headers of the email. When you apply a configuration set to an email, all of the rules
   in that configuration set are applied to the email.

  request - `com.amazonaws.services.pinpointemail.model.CreateConfigurationSetRequest`

  returns: Result of the CreateConfigurationSet operation returned by the service. - `com.amazonaws.services.pinpointemail.model.CreateConfigurationSetResult`

  throws: com.amazonaws.services.pinpointemail.model.AlreadyExistsException - The resource specified in your request already exists."
  (^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.CreateConfigurationSetRequest request]
    (-> this (.createConfigurationSet request))))

(defn delete-email-identity
  "Deletes an email identity that you previously verified for use with Amazon Pinpoint. An identity can be either an
   email address or a domain name.

  request - `com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityRequest`

  returns: Result of the DeleteEmailIdentity operation returned by the service. - `com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityResult`

  throws: com.amazonaws.services.pinpointemail.model.NotFoundException - The resource you attempted to access doesn't exist."
  (^com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityResult [^AmazonPinpointEmailClient this ^com.amazonaws.services.pinpointemail.model.DeleteEmailIdentityRequest request]
    (-> this (.deleteEmailIdentity request))))

