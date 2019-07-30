(ns com.amazonaws.services.sns.AmazonSNSAsync
  "Interface for accessing Amazon SNS asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonSNSAsync instead.


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
  (:import [com.amazonaws.services.sns AmazonSNSAsync]))

(defn untag-resource-async
  "Remove tags from the specified Amazon SNS topic. For an overview, see Amazon SNS Tags in the Amazon SNS Developer
   Guide.

  untag-resource-request - `com.amazonaws.services.sns.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn get-endpoint-attributes-async
  "Retrieves the endpoint attributes for a device on one of the supported push notification services, such as GCM
   and APNS. For more information, see Using
   Amazon SNS Mobile Push Notifications.

  get-endpoint-attributes-request - Input for GetEndpointAttributes action. - `com.amazonaws.services.sns.model.GetEndpointAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEndpointAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.GetEndpointAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.GetEndpointAttributesRequest get-endpoint-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEndpointAttributesAsync get-endpoint-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.GetEndpointAttributesRequest get-endpoint-attributes-request]
    (-> this (.getEndpointAttributesAsync get-endpoint-attributes-request))))

(defn list-subscriptions-by-topic-async
  "Simplified method form for invoking the ListSubscriptionsByTopic operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  next-token - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String topic-arn ^java.lang.String next-token ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscriptionsByTopicAsync topic-arn next-token async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest list-subscriptions-by-topic-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscriptionsByTopicAsync list-subscriptions-by-topic-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest list-subscriptions-by-topic-request]
    (-> this (.listSubscriptionsByTopicAsync list-subscriptions-by-topic-request))))

(defn list-endpoints-by-platform-application-async
  "Lists the endpoints and endpoint attributes for devices in a supported push notification service, such as GCM and
   APNS. The results for ListEndpointsByPlatformApplication are paginated and return a limited list of
   endpoints, up to 100. If additional records are available after the first page results, then a NextToken string
   will be returned. To receive the next page, you call ListEndpointsByPlatformApplication again using
   the NextToken string received from the previous call. When there are no more records to return, NextToken will be
   null. For more information, see Using
   Amazon SNS Mobile Push Notifications.


   This action is throttled at 30 transactions per second (TPS).

  list-endpoints-by-platform-application-request - Input for ListEndpointsByPlatformApplication action. - `com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEndpointsByPlatformApplication operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest list-endpoints-by-platform-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEndpointsByPlatformApplicationAsync list-endpoints-by-platform-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest list-endpoints-by-platform-application-request]
    (-> this (.listEndpointsByPlatformApplicationAsync list-endpoints-by-platform-application-request))))

(defn subscribe-async
  "Simplified method form for invoking the Subscribe operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  protocol - `java.lang.String`
  endpoint - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.SubscribeResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String topic-arn ^java.lang.String protocol ^java.lang.String endpoint ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.subscribeAsync topic-arn protocol endpoint async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String topic-arn ^java.lang.String protocol ^java.lang.String endpoint]
    (-> this (.subscribeAsync topic-arn protocol endpoint)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.SubscribeRequest subscribe-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.subscribeAsync subscribe-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.SubscribeRequest subscribe-request]
    (-> this (.subscribeAsync subscribe-request))))

(defn list-phone-numbers-opted-out-async
  "Returns a list of phone numbers that are opted out, meaning you cannot send SMS messages to them.


   The results for ListPhoneNumbersOptedOut are paginated, and each page returns up to 100 phone
   numbers. If additional phone numbers are available after the first page of results, then a NextToken
   string will be returned. To receive the next page, you call ListPhoneNumbersOptedOut again using the
   NextToken string received from the previous call. When there are no more records to return,
   NextToken will be null.

  list-phone-numbers-opted-out-request - The input for the ListPhoneNumbersOptedOut action. - `com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPhoneNumbersOptedOut operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest list-phone-numbers-opted-out-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPhoneNumbersOptedOutAsync list-phone-numbers-opted-out-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest list-phone-numbers-opted-out-request]
    (-> this (.listPhoneNumbersOptedOutAsync list-phone-numbers-opted-out-request))))

(defn opt-in-phone-number-async
  "Use this request to opt in a phone number that is opted out, which enables you to resume sending SMS messages to
   the number.


   You can opt in a phone number only once every 30 days.

  opt-in-phone-number-request - Input for the OptInPhoneNumber action. - `com.amazonaws.services.sns.model.OptInPhoneNumberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the OptInPhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.OptInPhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.OptInPhoneNumberRequest opt-in-phone-number-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.optInPhoneNumberAsync opt-in-phone-number-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.OptInPhoneNumberRequest opt-in-phone-number-request]
    (-> this (.optInPhoneNumberAsync opt-in-phone-number-request))))

(defn delete-topic-async
  "Deletes a topic and all its subscriptions. Deleting a topic might prevent some messages previously sent to the
   topic from being delivered to subscribers. This action is idempotent, so deleting a topic that does not exist
   does not result in an error.

  delete-topic-request - `com.amazonaws.services.sns.model.DeleteTopicRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTopic operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.DeleteTopicResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.DeleteTopicRequest delete-topic-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTopicAsync delete-topic-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.DeleteTopicRequest delete-topic-request]
    (-> this (.deleteTopicAsync delete-topic-request))))

(defn delete-endpoint-async
  "Deletes the endpoint for a device and mobile app from Amazon SNS. This action is idempotent. For more
   information, see Using Amazon SNS Mobile
   Push Notifications.


   When you delete an endpoint that is also subscribed to a topic, then you must also unsubscribe the endpoint from
   the topic.

  delete-endpoint-request - Input for DeleteEndpoint action. - `com.amazonaws.services.sns.model.DeleteEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.DeleteEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.DeleteEndpointRequest delete-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointAsync delete-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.DeleteEndpointRequest delete-endpoint-request]
    (-> this (.deleteEndpointAsync delete-endpoint-request))))

(defn list-platform-applications-async
  "Lists the platform application objects for the supported push notification services, such as APNS and GCM. The
   results for ListPlatformApplications are paginated and return a limited list of applications, up to
   100. If additional records are available after the first page results, then a NextToken string will be returned.
   To receive the next page, you call ListPlatformApplications using the NextToken string received from
   the previous call. When there are no more records to return, NextToken will be null. For more information, see Using Amazon SNS Mobile Push
   Notifications.


   This action is throttled at 15 transactions per second (TPS).

  list-platform-applications-request - Input for ListPlatformApplications action. - `com.amazonaws.services.sns.model.ListPlatformApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPlatformApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListPlatformApplicationsResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListPlatformApplicationsRequest list-platform-applications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPlatformApplicationsAsync list-platform-applications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListPlatformApplicationsRequest list-platform-applications-request]
    (-> this (.listPlatformApplicationsAsync list-platform-applications-request)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this]
    (-> this (.listPlatformApplicationsAsync))))

(defn remove-permission-async
  "Simplified method form for invoking the RemovePermission operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  label - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.RemovePermissionResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String topic-arn ^java.lang.String label ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync topic-arn label async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.RemovePermissionRequest remove-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync remove-permission-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.RemovePermissionRequest remove-permission-request]
    (-> this (.removePermissionAsync remove-permission-request))))

(defn publish-async
  "Simplified method form for invoking the Publish operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  message - `java.lang.String`
  subject - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.PublishResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String topic-arn ^java.lang.String message ^java.lang.String subject ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishAsync topic-arn message subject async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String topic-arn ^java.lang.String message ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishAsync topic-arn message async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.PublishRequest publish-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishAsync publish-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.PublishRequest publish-request]
    (-> this (.publishAsync publish-request))))

(defn list-subscriptions-async
  "Returns a list of the requester's subscriptions. Each call returns a limited list of subscriptions, up to 100. If
   there are more subscriptions, a NextToken is also returned. Use the NextToken parameter
   in a new ListSubscriptions call to get further results.


   This action is throttled at 30 transactions per second (TPS).

  list-subscriptions-request - Input for ListSubscriptions action. - `com.amazonaws.services.sns.model.ListSubscriptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListSubscriptionsRequest list-subscriptions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscriptionsAsync list-subscriptions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListSubscriptionsRequest list-subscriptions-request]
    (-> this (.listSubscriptionsAsync list-subscriptions-request)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this]
    (-> this (.listSubscriptionsAsync))))

(defn create-platform-application-async
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

  create-platform-application-request - Input for CreatePlatformApplication action. - `com.amazonaws.services.sns.model.CreatePlatformApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePlatformApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.CreatePlatformApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.CreatePlatformApplicationRequest create-platform-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPlatformApplicationAsync create-platform-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.CreatePlatformApplicationRequest create-platform-application-request]
    (-> this (.createPlatformApplicationAsync create-platform-application-request))))

(defn get-topic-attributes-async
  "Returns all of the properties of a topic. Topic properties returned might differ based on the authorization of
   the user.

  get-topic-attributes-request - Input for GetTopicAttributes action. - `com.amazonaws.services.sns.model.GetTopicAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTopicAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.GetTopicAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.GetTopicAttributesRequest get-topic-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTopicAttributesAsync get-topic-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.GetTopicAttributesRequest get-topic-attributes-request]
    (-> this (.getTopicAttributesAsync get-topic-attributes-request))))

(defn delete-platform-application-async
  "Deletes a platform application object for one of the supported push notification services, such as APNS and GCM.
   For more information, see Using Amazon SNS
   Mobile Push Notifications.

  delete-platform-application-request - Input for DeletePlatformApplication action. - `com.amazonaws.services.sns.model.DeletePlatformApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePlatformApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.DeletePlatformApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.DeletePlatformApplicationRequest delete-platform-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePlatformApplicationAsync delete-platform-application-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.DeletePlatformApplicationRequest delete-platform-application-request]
    (-> this (.deletePlatformApplicationAsync delete-platform-application-request))))

(defn add-permission-async
  "Simplified method form for invoking the AddPermission operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  label - `java.lang.String`
  a-ws-account-ids - `java.util.List`
  action-names - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.AddPermissionResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String topic-arn ^java.lang.String label ^java.util.List a-ws-account-ids ^java.util.List action-names ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addPermissionAsync topic-arn label a-ws-account-ids action-names async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String topic-arn ^java.lang.String label ^java.util.List a-ws-account-ids ^java.util.List action-names]
    (-> this (.addPermissionAsync topic-arn label a-ws-account-ids action-names)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.AddPermissionRequest add-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addPermissionAsync add-permission-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.AddPermissionRequest add-permission-request]
    (-> this (.addPermissionAsync add-permission-request))))

(defn unsubscribe-async
  "Deletes a subscription. If the subscription requires authentication for deletion, only the owner of the
   subscription or the topic's owner can unsubscribe, and an AWS signature is required. If the
   Unsubscribe call does not require authentication and the requester is not the subscription owner, a
   final cancellation message is delivered to the endpoint, so that the endpoint owner can easily resubscribe to the
   topic if the Unsubscribe request was unintended.


   This action is throttled at 100 transactions per second (TPS).

  unsubscribe-request - Input for Unsubscribe action. - `com.amazonaws.services.sns.model.UnsubscribeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Unsubscribe operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.UnsubscribeResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.UnsubscribeRequest unsubscribe-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unsubscribeAsync unsubscribe-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.UnsubscribeRequest unsubscribe-request]
    (-> this (.unsubscribeAsync unsubscribe-request))))

(defn confirm-subscription-async
  "Simplified method form for invoking the ConfirmSubscription operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  token - `java.lang.String`
  authenticate-on-unsubscribe - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.ConfirmSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String topic-arn ^java.lang.String token ^java.lang.String authenticate-on-unsubscribe ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmSubscriptionAsync topic-arn token authenticate-on-unsubscribe async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String topic-arn ^java.lang.String token ^java.lang.String authenticate-on-unsubscribe]
    (-> this (.confirmSubscriptionAsync topic-arn token authenticate-on-unsubscribe)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ConfirmSubscriptionRequest confirm-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmSubscriptionAsync confirm-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ConfirmSubscriptionRequest confirm-subscription-request]
    (-> this (.confirmSubscriptionAsync confirm-subscription-request))))

(defn create-platform-endpoint-async
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

  create-platform-endpoint-request - Input for CreatePlatformEndpoint action. - `com.amazonaws.services.sns.model.CreatePlatformEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePlatformEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.CreatePlatformEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.CreatePlatformEndpointRequest create-platform-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPlatformEndpointAsync create-platform-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.CreatePlatformEndpointRequest create-platform-endpoint-request]
    (-> this (.createPlatformEndpointAsync create-platform-endpoint-request))))

(defn get-platform-application-attributes-async
  "Retrieves the attributes of the platform application object for the supported push notification services, such as
   APNS and GCM. For more information, see Using Amazon SNS Mobile Push
   Notifications.

  get-platform-application-attributes-request - Input for GetPlatformApplicationAttributes action. - `com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPlatformApplicationAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest get-platform-application-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPlatformApplicationAttributesAsync get-platform-application-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest get-platform-application-attributes-request]
    (-> this (.getPlatformApplicationAttributesAsync get-platform-application-attributes-request))))

(defn check-if-phone-number-is-opted-out-async
  "Accepts a phone number and indicates whether the phone holder has opted out of receiving SMS messages from your
   account. You cannot send SMS messages to a number that is opted out.


   To resume sending messages, you can opt in the number by using the OptInPhoneNumber action.

  check-if-phone-number-is-opted-out-request - The input for the CheckIfPhoneNumberIsOptedOut action. - `com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CheckIfPhoneNumberIsOptedOut operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest check-if-phone-number-is-opted-out-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.checkIfPhoneNumberIsOptedOutAsync check-if-phone-number-is-opted-out-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest check-if-phone-number-is-opted-out-request]
    (-> this (.checkIfPhoneNumberIsOptedOutAsync check-if-phone-number-is-opted-out-request))))

(defn list-tags-for-resource-async
  "List all tags added to the specified Amazon SNS topic. For an overview, see Amazon SNS Tags in the Amazon Simple
   Notification Service Developer Guide.

  list-tags-for-resource-request - `com.amazonaws.services.sns.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn list-topics-async
  "Returns a list of the requester's topics. Each call returns a limited list of topics, up to 100. If there are
   more topics, a NextToken is also returned. Use the NextToken parameter in a new
   ListTopics call to get further results.


   This action is throttled at 30 transactions per second (TPS).

  list-topics-request - `com.amazonaws.services.sns.model.ListTopicsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTopics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListTopicsResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListTopicsRequest list-topics-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTopicsAsync list-topics-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.ListTopicsRequest list-topics-request]
    (-> this (.listTopicsAsync list-topics-request)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this]
    (-> this (.listTopicsAsync))))

(defn get-subscription-attributes-async
  "Returns all of the properties of a subscription.

  get-subscription-attributes-request - Input for GetSubscriptionAttributes. - `com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSubscriptionAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.GetSubscriptionAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest get-subscription-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSubscriptionAttributesAsync get-subscription-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest get-subscription-attributes-request]
    (-> this (.getSubscriptionAttributesAsync get-subscription-attributes-request))))

(defn set-topic-attributes-async
  "Simplified method form for invoking the SetTopicAttributes operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  attribute-name - `java.lang.String`
  attribute-value - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.SetTopicAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String topic-arn ^java.lang.String attribute-name ^java.lang.String attribute-value ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setTopicAttributesAsync topic-arn attribute-name attribute-value async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String topic-arn ^java.lang.String attribute-name ^java.lang.String attribute-value]
    (-> this (.setTopicAttributesAsync topic-arn attribute-name attribute-value)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.SetTopicAttributesRequest set-topic-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setTopicAttributesAsync set-topic-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.SetTopicAttributesRequest set-topic-attributes-request]
    (-> this (.setTopicAttributesAsync set-topic-attributes-request))))

(defn create-topic-async
  "Creates a topic to which notifications can be published. Users can create at most 100,000 topics. For more
   information, see https://aws.amazon.com/sns. This action is idempotent,
   so if the requester already owns a topic with the specified name, that topic's ARN is returned without creating a
   new topic.

  create-topic-request - Input for CreateTopic action. - `com.amazonaws.services.sns.model.CreateTopicRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTopic operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.CreateTopicResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.CreateTopicRequest create-topic-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTopicAsync create-topic-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.CreateTopicRequest create-topic-request]
    (-> this (.createTopicAsync create-topic-request))))

(defn set-platform-application-attributes-async
  "Sets the attributes of the platform application object for the supported push notification services, such as APNS
   and GCM. For more information, see Using
   Amazon SNS Mobile Push Notifications. For information on configuring attributes for message delivery status,
   see Using Amazon SNS Application
   Attributes for Message Delivery Status.

  set-platform-application-attributes-request - Input for SetPlatformApplicationAttributes action. - `com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetPlatformApplicationAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.SetPlatformApplicationAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest set-platform-application-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setPlatformApplicationAttributesAsync set-platform-application-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest set-platform-application-attributes-request]
    (-> this (.setPlatformApplicationAttributesAsync set-platform-application-attributes-request))))

(defn set-subscription-attributes-async
  "Simplified method form for invoking the SetSubscriptionAttributes operation with an AsyncHandler.

  subscription-arn - `java.lang.String`
  attribute-name - `java.lang.String`
  attribute-value - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.SetSubscriptionAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String subscription-arn ^java.lang.String attribute-name ^java.lang.String attribute-value ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSubscriptionAttributesAsync subscription-arn attribute-name attribute-value async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^java.lang.String subscription-arn ^java.lang.String attribute-name ^java.lang.String attribute-value]
    (-> this (.setSubscriptionAttributesAsync subscription-arn attribute-name attribute-value)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest set-subscription-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSubscriptionAttributesAsync set-subscription-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest set-subscription-attributes-request]
    (-> this (.setSubscriptionAttributesAsync set-subscription-attributes-request))))

(defn set-sms-attributes-async
  "Use this request to set the default settings for sending SMS messages and receiving daily SMS usage reports.


   You can override some of these settings for a single message when you use the Publish action with
   the MessageAttributes.entry.N parameter. For more information, see Sending an SMS Message in the
   Amazon SNS Developer Guide.

  set-sms-attributes-request - The input for the SetSMSAttributes action. - `com.amazonaws.services.sns.model.SetSMSAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetSMSAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.SetSMSAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.SetSMSAttributesRequest set-sms-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSMSAttributesAsync set-sms-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.SetSMSAttributesRequest set-sms-attributes-request]
    (-> this (.setSMSAttributesAsync set-sms-attributes-request))))

(defn set-endpoint-attributes-async
  "Sets the attributes for an endpoint for a device on one of the supported push notification services, such as GCM
   and APNS. For more information, see Using
   Amazon SNS Mobile Push Notifications.

  set-endpoint-attributes-request - Input for SetEndpointAttributes action. - `com.amazonaws.services.sns.model.SetEndpointAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetEndpointAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.SetEndpointAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.SetEndpointAttributesRequest set-endpoint-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setEndpointAttributesAsync set-endpoint-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.SetEndpointAttributesRequest set-endpoint-attributes-request]
    (-> this (.setEndpointAttributesAsync set-endpoint-attributes-request))))

(defn tag-resource-async
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

  tag-resource-request - `com.amazonaws.services.sns.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn get-sms-attributes-async
  "Returns the settings for sending SMS messages from your account.


   These settings are set with the SetSMSAttributes action.

  get-sms-attributes-request - The input for the GetSMSAttributes request. - `com.amazonaws.services.sns.model.GetSMSAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSMSAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.GetSMSAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.GetSMSAttributesRequest get-sms-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSMSAttributesAsync get-sms-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsync this ^com.amazonaws.services.sns.model.GetSMSAttributesRequest get-sms-attributes-request]
    (-> this (.getSMSAttributesAsync get-sms-attributes-request))))

