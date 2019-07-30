(ns com.amazonaws.services.sns.AmazonSNSClient
  "Client for accessing Amazon SNS. All service calls made using this client are blocking, and will not return until the
  service call completes.

  Amazon Simple Notification Service

  Amazon Simple Notification Service (Amazon SNS) is a web service that enables you to build distributed web-enabled
  applications. Applications can use Amazon SNS to easily push real-time notification messages to interested
  subscribers over multiple delivery protocols. For more information about this product see https://aws.amazon.com/sns. For detailed information about Amazon SNS features
  and their associated API calls, see the Amazon SNS Developer
  Guide.


  We also provide SDKs that enable you to access Amazon SNS from your preferred programming language. The SDKs contain
  functionality that automatically takes care of tasks such as: cryptographically signing your service requests,
  retrying requests, and handling error responses. For a list of available SDKs, go to Tools for Amazon Web Services."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sns AmazonSNSClient]))

(defn ->amazon-sns-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon SNS (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonSNSClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonSNSClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonSNSClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonSNSClient aws-credentials client-configuration))
  (^AmazonSNSClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonSNSClient client-configuration))
  (^AmazonSNSClient []
    (new AmazonSNSClient )))

(defn *builder
  "returns: `com.amazonaws.services.sns.AmazonSNSClientBuilder`"
  (^com.amazonaws.services.sns.AmazonSNSClientBuilder []
    (AmazonSNSClient/builder )))

(defn list-tags-for-resource
  "List all tags added to the specified Amazon SNS topic. For an overview, see Amazon SNS Tags in the Amazon Simple
   Notification Service Developer Guide.

  request - `com.amazonaws.services.sns.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.sns.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.sns.model.ResourceNotFoundException - Can't tag resource. Verify that the topic exists."
  (^com.amazonaws.services.sns.model.ListTagsForResourceResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-topic-attributes
  "Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of
   the user.

  request - `com.amazonaws.services.sns.model.GetTopicAttributesRequest`

  returns: Result of the GetTopicAttributes operation returned by the service. - `com.amazonaws.services.sns.model.GetTopicAttributesResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.GetTopicAttributesResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.GetTopicAttributesRequest request]
    (-> this (.getTopicAttributes request))))

(defn set-sms-attributes
  "Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports.


   You can override some of these settings for a single message when you use the Publish action with
   the MessageAttributes.entry.N parameter. For more information, see Sending an SMS Message in the
   Amazon SNS Developer Guide.

  request - `com.amazonaws.services.sns.model.SetSMSAttributesRequest`

  returns: Result of the SetSMSAttributes operation returned by the service. - `com.amazonaws.services.sns.model.SetSMSAttributesResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.SetSMSAttributesResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.SetSMSAttributesRequest request]
    (-> this (.setSMSAttributes request))))

(defn set-endpoint-attributes
  "Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM
   and APNS. For more information, see Using
   Amazon SNS Mobile Push Notifications.

  request - `com.amazonaws.services.sns.model.SetEndpointAttributesRequest`

  returns: Result of the SetEndpointAttributes operation returned by the service. - `com.amazonaws.services.sns.model.SetEndpointAttributesResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.SetEndpointAttributesResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.SetEndpointAttributesRequest request]
    (-> this (.setEndpointAttributes request))))

(defn delete-endpoint
  "Deletes the endpoint for a device and mobile app from Amazon SNS. This action is idempotent. For more
   information, see Using Amazon SNS Mobile
   Push Notifications.


   When you delete an endpoint that is also subscribed to a topic, then you must also unsubscribe the endpoint from
   the topic.

  request - `com.amazonaws.services.sns.model.DeleteEndpointRequest`

  returns: Result of the DeleteEndpoint operation returned by the service. - `com.amazonaws.services.sns.model.DeleteEndpointResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.DeleteEndpointResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.DeleteEndpointRequest request]
    (-> this (.deleteEndpoint request))))

(defn delete-platform-application
  "Deletes a platform application object for one of the supported push notification services, such as APNS and GCM.
   For more information, see Using Amazon SNS
   Mobile Push Notifications.

  request - `com.amazonaws.services.sns.model.DeletePlatformApplicationRequest`

  returns: Result of the DeletePlatformApplication operation returned by the service. - `com.amazonaws.services.sns.model.DeletePlatformApplicationResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.DeletePlatformApplicationResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.DeletePlatformApplicationRequest request]
    (-> this (.deletePlatformApplication request))))

(defn create-platform-application
  "Creates a platform application object for one of the supported push notification services, such as APNS and FCM,
   to which devices and mobile apps may register. You must specify PlatformPrincipal and PlatformCredential
   attributes when using the CreatePlatformApplication action. The PlatformPrincipal is received from
   the notification service. For APNS/APNS_SANDBOX, PlatformPrincipal is \"SSL certificate\". For GCM,
   PlatformPrincipal is not applicable. For ADM, PlatformPrincipal is \"client id\". The PlatformCredential is also
   received from the notification service. For WNS, PlatformPrincipal is \"Package Security Identifier\". For MPNS,
   PlatformPrincipal is \"TLS certificate\". For Baidu, PlatformPrincipal is \"API key\".


   For APNS/APNS_SANDBOX, PlatformCredential is \"private key\". For GCM, PlatformCredential is \"API key\". For ADM,
   PlatformCredential is \"client secret\". For WNS, PlatformCredential is \"secret key\". For MPNS, PlatformCredential
   is \"private key\". For Baidu, PlatformCredential is \"secret key\". The PlatformApplicationArn that is returned when
   using CreatePlatformApplication is then used as an attribute for the
   CreatePlatformEndpoint action. For more information, see Using Amazon SNS Mobile Push
   Notifications. For more information about obtaining the PlatformPrincipal and PlatformCredential for each of
   the supported push notification services, see Getting Started with Apple Push
   Notification Service, Getting
   Started with Amazon Device Messaging, Getting Started with Baidu Cloud
   Push, Getting Started with Google
   Cloud Messaging for Android, Getting Started with MPNS, or Getting Started with WNS.

  request - `com.amazonaws.services.sns.model.CreatePlatformApplicationRequest`

  returns: Result of the CreatePlatformApplication operation returned by the service. - `com.amazonaws.services.sns.model.CreatePlatformApplicationResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.CreatePlatformApplicationResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.CreatePlatformApplicationRequest request]
    (-> this (.createPlatformApplication request))))

(defn set-topic-attributes
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  attribute-name - `java.lang.String`
  attribute-value - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.SetTopicAttributesResult`"
  (^com.amazonaws.services.sns.model.SetTopicAttributesResult [^AmazonSNSClient this ^java.lang.String topic-arn ^java.lang.String attribute-name ^java.lang.String attribute-value]
    (-> this (.setTopicAttributes topic-arn attribute-name attribute-value)))
  (^com.amazonaws.services.sns.model.SetTopicAttributesResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.SetTopicAttributesRequest request]
    (-> this (.setTopicAttributes request))))

(defn untag-resource
  "Remove tags from the specified Amazon SNS topic. For an overview, see Amazon SNS Tags in the Amazon SNS Developer
   Guide.

  request - `com.amazonaws.services.sns.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.sns.model.UntagResourceResult`

  throws: com.amazonaws.services.sns.model.ResourceNotFoundException - Can't tag resource. Verify that the topic exists."
  (^com.amazonaws.services.sns.model.UntagResourceResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn confirm-subscription
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  token - `java.lang.String`
  authenticate-on-unsubscribe - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.ConfirmSubscriptionResult`"
  (^com.amazonaws.services.sns.model.ConfirmSubscriptionResult [^AmazonSNSClient this ^java.lang.String topic-arn ^java.lang.String token ^java.lang.String authenticate-on-unsubscribe]
    (-> this (.confirmSubscription topic-arn token authenticate-on-unsubscribe)))
  (^com.amazonaws.services.sns.model.ConfirmSubscriptionResult [^AmazonSNSClient this ^java.lang.String topic-arn ^java.lang.String token]
    (-> this (.confirmSubscription topic-arn token)))
  (^com.amazonaws.services.sns.model.ConfirmSubscriptionResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.ConfirmSubscriptionRequest request]
    (-> this (.confirmSubscription request))))

(defn list-topics
  "Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are
   more topics, a NextToken is also returned. Use the NextToken parameter in a new
   ListTopics call to get further results.


   This action is throttled at 30 transactions per second (TPS).

  request - `com.amazonaws.services.sns.model.ListTopicsRequest`

  returns: Result of the ListTopics operation returned by the service. - `com.amazonaws.services.sns.model.ListTopicsResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.ListTopicsResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.ListTopicsRequest request]
    (-> this (.listTopics request)))
  (^com.amazonaws.services.sns.model.ListTopicsResult [^AmazonSNSClient this]
    (-> this (.listTopics))))

(defn get-sms-attributes
  "Returns the settings for sending SMS messages from your account.


   These settings are set with the SetSMSAttributes action.

  request - `com.amazonaws.services.sns.model.GetSMSAttributesRequest`

  returns: Result of the GetSMSAttributes operation returned by the service. - `com.amazonaws.services.sns.model.GetSMSAttributesResult`

  throws: com.amazonaws.services.sns.model.ThrottledException - Indicates that the rate at which requests have been submitted for this action exceeds the limit for your account."
  (^com.amazonaws.services.sns.model.GetSMSAttributesResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.GetSMSAttributesRequest request]
    (-> this (.getSMSAttributes request))))

(defn check-if-phone-number-is-opted-out
  "Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your
   account. You cannot send SMS messages to a number that is opted out.


   To resume sending messages, you can opt in the number by using the OptInPhoneNumber action.

  request - `com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest`

  returns: Result of the CheckIfPhoneNumberIsOptedOut operation returned by the service. - `com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutResult`

  throws: com.amazonaws.services.sns.model.ThrottledException - Indicates that the rate at which requests have been submitted for this action exceeds the limit for your account."
  (^com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest request]
    (-> this (.checkIfPhoneNumberIsOptedOut request))))

(defn create-topic
  "Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more
   information, see https://aws.amazon.com/sns. This action is idempotent,
   so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a
   new topic.

  request - `com.amazonaws.services.sns.model.CreateTopicRequest`

  returns: Result of the CreateTopic operation returned by the service. - `com.amazonaws.services.sns.model.CreateTopicResult`

  throws: com.amazonaws.services.sns.model.InvalidSecurityException - The credential signature isn't valid. You must use an HTTPS endpoint and sign your request using Signature Version 4."
  (^com.amazonaws.services.sns.model.CreateTopicResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.CreateTopicRequest request]
    (-> this (.createTopic request))))

(defn set-subscription-attributes
  "Description copied from interface: AmazonSNS

  subscription-arn - `java.lang.String`
  attribute-name - `java.lang.String`
  attribute-value - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.SetSubscriptionAttributesResult`"
  (^com.amazonaws.services.sns.model.SetSubscriptionAttributesResult [^AmazonSNSClient this ^java.lang.String subscription-arn ^java.lang.String attribute-name ^java.lang.String attribute-value]
    (-> this (.setSubscriptionAttributes subscription-arn attribute-name attribute-value)))
  (^com.amazonaws.services.sns.model.SetSubscriptionAttributesResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest request]
    (-> this (.setSubscriptionAttributes request))))

(defn remove-permission
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  label - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.RemovePermissionResult`"
  (^com.amazonaws.services.sns.model.RemovePermissionResult [^AmazonSNSClient this ^java.lang.String topic-arn ^java.lang.String label]
    (-> this (.removePermission topic-arn label)))
  (^com.amazonaws.services.sns.model.RemovePermissionResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.RemovePermissionRequest request]
    (-> this (.removePermission request))))

(defn list-endpoints-by-platform-application
  "Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and
   APNS. The results for ListEndpointsByPlatformApplication are paginated and return a limited list of
   endpoints, up to 100. If additional records are available after the first page results, then a NextToken string
   will be returned. To receive the next page, you call ListEndpointsByPlatformApplication again using
   the NextToken string received from the previous call. When there are no more records to return, NextToken will be
   null. For more information, see Using
   Amazon SNS Mobile Push Notifications.


   This action is throttled at 30 transactions per second (TPS).

  request - `com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest`

  returns: Result of the ListEndpointsByPlatformApplication operation returned by the service. - `com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest request]
    (-> this (.listEndpointsByPlatformApplication request))))

(defn opt-in-phone-number
  "Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to
   the number.


   You can opt in a phone number only once every 30 days.

  request - `com.amazonaws.services.sns.model.OptInPhoneNumberRequest`

  returns: Result of the OptInPhoneNumber operation returned by the service. - `com.amazonaws.services.sns.model.OptInPhoneNumberResult`

  throws: com.amazonaws.services.sns.model.ThrottledException - Indicates that the rate at which requests have been submitted for this action exceeds the limit for your account."
  (^com.amazonaws.services.sns.model.OptInPhoneNumberResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.OptInPhoneNumberRequest request]
    (-> this (.optInPhoneNumber request))))

(defn get-subscription-attributes
  "Returns all of the properties of a subscription.

  request - `com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest`

  returns: Result of the GetSubscriptionAttributes operation returned by the service. - `com.amazonaws.services.sns.model.GetSubscriptionAttributesResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.GetSubscriptionAttributesResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest request]
    (-> this (.getSubscriptionAttributes request))))

(defn list-phone-numbers-opted-out
  "Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them.


   The results for ListPhoneNumbersOptedOut are paginated, and each page returns up to 100 phone
   numbers. If additional phone numbers are available after the first page of results, then a NextToken
   string will be returned. To receive the next page, you call ListPhoneNumbersOptedOut again using the
   NextToken string received from the previous call. When there are no more records to return,
   NextToken will be null.

  request - `com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest`

  returns: Result of the ListPhoneNumbersOptedOut operation returned by the service. - `com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutResult`

  throws: com.amazonaws.services.sns.model.ThrottledException - Indicates that the rate at which requests have been submitted for this action exceeds the limit for your account."
  (^com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest request]
    (-> this (.listPhoneNumbersOptedOut request))))

(defn get-endpoint-attributes
  "Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM
   and APNS. For more information, see Using
   Amazon SNS Mobile Push Notifications.

  request - `com.amazonaws.services.sns.model.GetEndpointAttributesRequest`

  returns: Result of the GetEndpointAttributes operation returned by the service. - `com.amazonaws.services.sns.model.GetEndpointAttributesResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.GetEndpointAttributesResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.GetEndpointAttributesRequest request]
    (-> this (.getEndpointAttributes request))))

(defn publish
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  message - `java.lang.String`
  subject - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.PublishResult`"
  (^com.amazonaws.services.sns.model.PublishResult [^AmazonSNSClient this ^java.lang.String topic-arn ^java.lang.String message ^java.lang.String subject]
    (-> this (.publish topic-arn message subject)))
  (^com.amazonaws.services.sns.model.PublishResult [^AmazonSNSClient this ^java.lang.String topic-arn ^java.lang.String message]
    (-> this (.publish topic-arn message)))
  (^com.amazonaws.services.sns.model.PublishResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.PublishRequest request]
    (-> this (.publish request))))

(defn get-platform-application-attributes
  "Retrieves the attributes of the platform application object for the supported push notification services, such as
   APNS and GCM. For more information, see Using Amazon SNS Mobile Push
   Notifications.

  request - `com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest`

  returns: Result of the GetPlatformApplicationAttributes operation returned by the service. - `com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest request]
    (-> this (.getPlatformApplicationAttributes request))))

(defn list-platform-applications
  "Lists the platform application objects for the supported push notification services, such as APNS and GCM. The
   results for ListPlatformApplications are paginated and return a limited list of applications, up to
   100. If additional records are available after the first page results, then a NextToken string will be returned.
   To receive the next page, you call ListPlatformApplications using the NextToken string received from
   the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push
   Notifications.


   This action is throttled at 15 transactions per second (TPS).

  request - `com.amazonaws.services.sns.model.ListPlatformApplicationsRequest`

  returns: Result of the ListPlatformApplications operation returned by the service. - `com.amazonaws.services.sns.model.ListPlatformApplicationsResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.ListPlatformApplicationsResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.ListPlatformApplicationsRequest request]
    (-> this (.listPlatformApplications request)))
  (^com.amazonaws.services.sns.model.ListPlatformApplicationsResult [^AmazonSNSClient this]
    (-> this (.listPlatformApplications))))

(defn list-subscriptions-by-topic
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  next-token - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult`"
  (^com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult [^AmazonSNSClient this ^java.lang.String topic-arn ^java.lang.String next-token]
    (-> this (.listSubscriptionsByTopic topic-arn next-token)))
  (^com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest request]
    (-> this (.listSubscriptionsByTopic request))))

(defn delete-topic
  "Deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the
   topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist
   does not result in an error.

  request - `com.amazonaws.services.sns.model.DeleteTopicRequest`

  returns: Result of the DeleteTopic operation returned by the service. - `com.amazonaws.services.sns.model.DeleteTopicResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.DeleteTopicResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.DeleteTopicRequest request]
    (-> this (.deleteTopic request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonSNSClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-platform-endpoint
  "Creates an endpoint for a device and mobile app on one of the supported push notification services, such as GCM
   and APNS. CreatePlatformEndpoint requires the PlatformApplicationArn that is returned from
   CreatePlatformApplication. The EndpointArn that is returned when using
   CreatePlatformEndpoint can then be used by the Publish action to send a message to a
   mobile app or by the Subscribe action for subscription to a topic. The
   CreatePlatformEndpoint action is idempotent, so if the requester already owns an endpoint with the
   same device token and attributes, that endpoint's ARN is returned without creating a new endpoint. For more
   information, see Using Amazon SNS Mobile
   Push Notifications.


   When using CreatePlatformEndpoint with Baidu, two attributes must be provided: ChannelId and UserId.
   The token field must also contain the ChannelId. For more information, see Creating an Amazon SNS Endpoint
   for Baidu.

  request - `com.amazonaws.services.sns.model.CreatePlatformEndpointRequest`

  returns: Result of the CreatePlatformEndpoint operation returned by the service. - `com.amazonaws.services.sns.model.CreatePlatformEndpointResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.CreatePlatformEndpointResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.CreatePlatformEndpointRequest request]
    (-> this (.createPlatformEndpoint request))))

(defn subscribe
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  protocol - `java.lang.String`
  endpoint - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.SubscribeResult`"
  (^com.amazonaws.services.sns.model.SubscribeResult [^AmazonSNSClient this ^java.lang.String topic-arn ^java.lang.String protocol ^java.lang.String endpoint]
    (-> this (.subscribe topic-arn protocol endpoint)))
  (^com.amazonaws.services.sns.model.SubscribeResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.SubscribeRequest request]
    (-> this (.subscribe request))))

(defn tag-resource
  "Add tags to the specified Amazon SNS topic. For an overview, see Amazon SNS Tags in the Amazon SNS Developer
   Guide.


   When you use topic tags, keep the following guidelines in mind:




   Adding more than 50 tags to a topic isn't recommended.




   Tags don't have any semantic meaning. Amazon SNS interprets tags as character strings.




   Tags are case-sensitive.




   A new tag with a key identical to that of an existing tag overwrites the existing tag.




   Tagging actions are limited to 10 TPS per AWS account. If your application requires a higher throughput, file a
   technical support
   request.




   For a full list of tag restrictions, see Limits Related to Topics in
   the Amazon SNS Developer Guide.

  request - `com.amazonaws.services.sns.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.sns.model.TagResourceResult`

  throws: com.amazonaws.services.sns.model.ResourceNotFoundException - Can't tag resource. Verify that the topic exists."
  (^com.amazonaws.services.sns.model.TagResourceResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn set-platform-application-attributes
  "Sets the attributes of the platform application object for the supported push notification services, such as APNS
   and GCM. For more information, see Using
   Amazon SNS Mobile Push Notifications. For information on configuring attributes for message delivery status,
   see Using Amazon SNS Application
   Attributes for Message Delivery Status.

  request - `com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest`

  returns: Result of the SetPlatformApplicationAttributes operation returned by the service. - `com.amazonaws.services.sns.model.SetPlatformApplicationAttributesResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.SetPlatformApplicationAttributesResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest request]
    (-> this (.setPlatformApplicationAttributes request))))

(defn add-permission
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  label - `java.lang.String`
  a-ws-account-ids - `java.util.List`
  action-names - `java.util.List`

  returns: `com.amazonaws.services.sns.model.AddPermissionResult`"
  (^com.amazonaws.services.sns.model.AddPermissionResult [^AmazonSNSClient this ^java.lang.String topic-arn ^java.lang.String label ^java.util.List a-ws-account-ids ^java.util.List action-names]
    (-> this (.addPermission topic-arn label a-ws-account-ids action-names)))
  (^com.amazonaws.services.sns.model.AddPermissionResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.AddPermissionRequest request]
    (-> this (.addPermission request))))

(defn list-subscriptions
  "Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If
   there are more subscriptions, a NextToken is also returned. Use the NextToken parameter
   in a new ListSubscriptions call to get further results.


   This action is throttled at 30 transactions per second (TPS).

  request - `com.amazonaws.services.sns.model.ListSubscriptionsRequest`

  returns: Result of the ListSubscriptions operation returned by the service. - `com.amazonaws.services.sns.model.ListSubscriptionsResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.ListSubscriptionsResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.ListSubscriptionsRequest request]
    (-> this (.listSubscriptions request)))
  (^com.amazonaws.services.sns.model.ListSubscriptionsResult [^AmazonSNSClient this]
    (-> this (.listSubscriptions))))

(defn unsubscribe
  "Deletes a subscription. If the subscription requires authentication for deletion, only the owner of the
   subscription or the topic's owner can unsubscribe, and an AWS signature is required. If the
   Unsubscribe call does not require authentication and the requester is not the subscription owner, a
   final cancellation message is delivered to the endpoint, so that the endpoint owner can easily resubscribe to the
   topic if the Unsubscribe request was unintended.


   This action is throttled at 100 transactions per second (TPS).

  request - `com.amazonaws.services.sns.model.UnsubscribeRequest`

  returns: Result of the Unsubscribe operation returned by the service. - `com.amazonaws.services.sns.model.UnsubscribeResult`

  throws: com.amazonaws.services.sns.model.InvalidParameterException - Indicates that a request parameter does not comply with the associated constraints."
  (^com.amazonaws.services.sns.model.UnsubscribeResult [^AmazonSNSClient this ^com.amazonaws.services.sns.model.UnsubscribeRequest request]
    (-> this (.unsubscribe request))))

