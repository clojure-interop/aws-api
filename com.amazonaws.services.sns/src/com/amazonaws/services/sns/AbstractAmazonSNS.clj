(ns com.amazonaws.services.sns.AbstractAmazonSNS
  "Abstract implementation of AmazonSNS. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sns AbstractAmazonSNS]))

(defn list-tags-for-resource
  "Description copied from interface: AmazonSNS

  request - `com.amazonaws.services.sns.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.sns.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.sns.model.ListTagsForResourceResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-topic-attributes
  "Description copied from interface: AmazonSNS

  request - Input for GetTopicAttributes action. - `com.amazonaws.services.sns.model.GetTopicAttributesRequest`

  returns: Result of the GetTopicAttributes operation returned by the service. - `com.amazonaws.services.sns.model.GetTopicAttributesResult`"
  (^com.amazonaws.services.sns.model.GetTopicAttributesResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.GetTopicAttributesRequest request]
    (-> this (.getTopicAttributes request))))

(defn set-region
  "Description copied from interface: AmazonSNS

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonSNS this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn set-sms-attributes
  "Description copied from interface: AmazonSNS

  request - The input for the SetSMSAttributes action. - `com.amazonaws.services.sns.model.SetSMSAttributesRequest`

  returns: Result of the SetSMSAttributes operation returned by the service. - `com.amazonaws.services.sns.model.SetSMSAttributesResult`"
  (^com.amazonaws.services.sns.model.SetSMSAttributesResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.SetSMSAttributesRequest request]
    (-> this (.setSMSAttributes request))))

(defn set-endpoint-attributes
  "Description copied from interface: AmazonSNS

  request - Input for SetEndpointAttributes action. - `com.amazonaws.services.sns.model.SetEndpointAttributesRequest`

  returns: Result of the SetEndpointAttributes operation returned by the service. - `com.amazonaws.services.sns.model.SetEndpointAttributesResult`"
  (^com.amazonaws.services.sns.model.SetEndpointAttributesResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.SetEndpointAttributesRequest request]
    (-> this (.setEndpointAttributes request))))

(defn delete-endpoint
  "Description copied from interface: AmazonSNS

  request - Input for DeleteEndpoint action. - `com.amazonaws.services.sns.model.DeleteEndpointRequest`

  returns: Result of the DeleteEndpoint operation returned by the service. - `com.amazonaws.services.sns.model.DeleteEndpointResult`"
  (^com.amazonaws.services.sns.model.DeleteEndpointResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.DeleteEndpointRequest request]
    (-> this (.deleteEndpoint request))))

(defn delete-platform-application
  "Description copied from interface: AmazonSNS

  request - Input for DeletePlatformApplication action. - `com.amazonaws.services.sns.model.DeletePlatformApplicationRequest`

  returns: Result of the DeletePlatformApplication operation returned by the service. - `com.amazonaws.services.sns.model.DeletePlatformApplicationResult`"
  (^com.amazonaws.services.sns.model.DeletePlatformApplicationResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.DeletePlatformApplicationRequest request]
    (-> this (.deletePlatformApplication request))))

(defn create-platform-application
  "Description copied from interface: AmazonSNS

  request - Input for CreatePlatformApplication action. - `com.amazonaws.services.sns.model.CreatePlatformApplicationRequest`

  returns: Result of the CreatePlatformApplication operation returned by the service. - `com.amazonaws.services.sns.model.CreatePlatformApplicationResult`"
  (^com.amazonaws.services.sns.model.CreatePlatformApplicationResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.CreatePlatformApplicationRequest request]
    (-> this (.createPlatformApplication request))))

(defn set-topic-attributes
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  attribute-name - `java.lang.String`
  attribute-value - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.SetTopicAttributesResult`"
  (^com.amazonaws.services.sns.model.SetTopicAttributesResult [^AbstractAmazonSNS this ^java.lang.String topic-arn ^java.lang.String attribute-name ^java.lang.String attribute-value]
    (-> this (.setTopicAttributes topic-arn attribute-name attribute-value)))
  (^com.amazonaws.services.sns.model.SetTopicAttributesResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.SetTopicAttributesRequest request]
    (-> this (.setTopicAttributes request))))

(defn untag-resource
  "Description copied from interface: AmazonSNS

  request - `com.amazonaws.services.sns.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.sns.model.UntagResourceResult`"
  (^com.amazonaws.services.sns.model.UntagResourceResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn confirm-subscription
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  token - `java.lang.String`
  authenticate-on-unsubscribe - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.ConfirmSubscriptionResult`"
  (^com.amazonaws.services.sns.model.ConfirmSubscriptionResult [^AbstractAmazonSNS this ^java.lang.String topic-arn ^java.lang.String token ^java.lang.String authenticate-on-unsubscribe]
    (-> this (.confirmSubscription topic-arn token authenticate-on-unsubscribe)))
  (^com.amazonaws.services.sns.model.ConfirmSubscriptionResult [^AbstractAmazonSNS this ^java.lang.String topic-arn ^java.lang.String token]
    (-> this (.confirmSubscription topic-arn token)))
  (^com.amazonaws.services.sns.model.ConfirmSubscriptionResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.ConfirmSubscriptionRequest request]
    (-> this (.confirmSubscription request))))

(defn list-topics
  "Description copied from interface: AmazonSNS

  request - `com.amazonaws.services.sns.model.ListTopicsRequest`

  returns: Result of the ListTopics operation returned by the service. - `com.amazonaws.services.sns.model.ListTopicsResult`"
  (^com.amazonaws.services.sns.model.ListTopicsResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.ListTopicsRequest request]
    (-> this (.listTopics request)))
  (^com.amazonaws.services.sns.model.ListTopicsResult [^AbstractAmazonSNS this]
    (-> this (.listTopics))))

(defn get-sms-attributes
  "Description copied from interface: AmazonSNS

  request - The input for the GetSMSAttributes request. - `com.amazonaws.services.sns.model.GetSMSAttributesRequest`

  returns: Result of the GetSMSAttributes operation returned by the service. - `com.amazonaws.services.sns.model.GetSMSAttributesResult`"
  (^com.amazonaws.services.sns.model.GetSMSAttributesResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.GetSMSAttributesRequest request]
    (-> this (.getSMSAttributes request))))

(defn check-if-phone-number-is-opted-out
  "Description copied from interface: AmazonSNS

  request - The input for the CheckIfPhoneNumberIsOptedOut action. - `com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest`

  returns: Result of the CheckIfPhoneNumberIsOptedOut operation returned by the service. - `com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutResult`"
  (^com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest request]
    (-> this (.checkIfPhoneNumberIsOptedOut request))))

(defn create-topic
  "Description copied from interface: AmazonSNS

  request - Input for CreateTopic action. - `com.amazonaws.services.sns.model.CreateTopicRequest`

  returns: Result of the CreateTopic operation returned by the service. - `com.amazonaws.services.sns.model.CreateTopicResult`"
  (^com.amazonaws.services.sns.model.CreateTopicResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.CreateTopicRequest request]
    (-> this (.createTopic request))))

(defn set-subscription-attributes
  "Description copied from interface: AmazonSNS

  subscription-arn - `java.lang.String`
  attribute-name - `java.lang.String`
  attribute-value - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.SetSubscriptionAttributesResult`"
  (^com.amazonaws.services.sns.model.SetSubscriptionAttributesResult [^AbstractAmazonSNS this ^java.lang.String subscription-arn ^java.lang.String attribute-name ^java.lang.String attribute-value]
    (-> this (.setSubscriptionAttributes subscription-arn attribute-name attribute-value)))
  (^com.amazonaws.services.sns.model.SetSubscriptionAttributesResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest request]
    (-> this (.setSubscriptionAttributes request))))

(defn remove-permission
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  label - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.RemovePermissionResult`"
  (^com.amazonaws.services.sns.model.RemovePermissionResult [^AbstractAmazonSNS this ^java.lang.String topic-arn ^java.lang.String label]
    (-> this (.removePermission topic-arn label)))
  (^com.amazonaws.services.sns.model.RemovePermissionResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.RemovePermissionRequest request]
    (-> this (.removePermission request))))

(defn list-endpoints-by-platform-application
  "Description copied from interface: AmazonSNS

  request - Input for ListEndpointsByPlatformApplication action. - `com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest`

  returns: Result of the ListEndpointsByPlatformApplication operation returned by the service. - `com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult`"
  (^com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest request]
    (-> this (.listEndpointsByPlatformApplication request))))

(defn opt-in-phone-number
  "Description copied from interface: AmazonSNS

  request - Input for the OptInPhoneNumber action. - `com.amazonaws.services.sns.model.OptInPhoneNumberRequest`

  returns: Result of the OptInPhoneNumber operation returned by the service. - `com.amazonaws.services.sns.model.OptInPhoneNumberResult`"
  (^com.amazonaws.services.sns.model.OptInPhoneNumberResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.OptInPhoneNumberRequest request]
    (-> this (.optInPhoneNumber request))))

(defn get-subscription-attributes
  "Description copied from interface: AmazonSNS

  request - Input for GetSubscriptionAttributes. - `com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest`

  returns: Result of the GetSubscriptionAttributes operation returned by the service. - `com.amazonaws.services.sns.model.GetSubscriptionAttributesResult`"
  (^com.amazonaws.services.sns.model.GetSubscriptionAttributesResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest request]
    (-> this (.getSubscriptionAttributes request))))

(defn shutdown
  "Description copied from interface: AmazonSNS"
  ([^AbstractAmazonSNS this]
    (-> this (.shutdown))))

(defn list-phone-numbers-opted-out
  "Description copied from interface: AmazonSNS

  request - The input for the ListPhoneNumbersOptedOut action. - `com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest`

  returns: Result of the ListPhoneNumbersOptedOut operation returned by the service. - `com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutResult`"
  (^com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest request]
    (-> this (.listPhoneNumbersOptedOut request))))

(defn set-endpoint
  "Description copied from interface: AmazonSNS

  endpoint - The endpoint (ex: \"sns.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://sns.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonSNS this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-endpoint-attributes
  "Description copied from interface: AmazonSNS

  request - Input for GetEndpointAttributes action. - `com.amazonaws.services.sns.model.GetEndpointAttributesRequest`

  returns: Result of the GetEndpointAttributes operation returned by the service. - `com.amazonaws.services.sns.model.GetEndpointAttributesResult`"
  (^com.amazonaws.services.sns.model.GetEndpointAttributesResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.GetEndpointAttributesRequest request]
    (-> this (.getEndpointAttributes request))))

(defn publish
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  message - `java.lang.String`
  subject - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.PublishResult`"
  (^com.amazonaws.services.sns.model.PublishResult [^AbstractAmazonSNS this ^java.lang.String topic-arn ^java.lang.String message ^java.lang.String subject]
    (-> this (.publish topic-arn message subject)))
  (^com.amazonaws.services.sns.model.PublishResult [^AbstractAmazonSNS this ^java.lang.String topic-arn ^java.lang.String message]
    (-> this (.publish topic-arn message)))
  (^com.amazonaws.services.sns.model.PublishResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.PublishRequest request]
    (-> this (.publish request))))

(defn get-platform-application-attributes
  "Description copied from interface: AmazonSNS

  request - Input for GetPlatformApplicationAttributes action. - `com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest`

  returns: Result of the GetPlatformApplicationAttributes operation returned by the service. - `com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult`"
  (^com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest request]
    (-> this (.getPlatformApplicationAttributes request))))

(defn list-platform-applications
  "Description copied from interface: AmazonSNS

  request - Input for ListPlatformApplications action. - `com.amazonaws.services.sns.model.ListPlatformApplicationsRequest`

  returns: Result of the ListPlatformApplications operation returned by the service. - `com.amazonaws.services.sns.model.ListPlatformApplicationsResult`"
  (^com.amazonaws.services.sns.model.ListPlatformApplicationsResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.ListPlatformApplicationsRequest request]
    (-> this (.listPlatformApplications request)))
  (^com.amazonaws.services.sns.model.ListPlatformApplicationsResult [^AbstractAmazonSNS this]
    (-> this (.listPlatformApplications))))

(defn list-subscriptions-by-topic
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  next-token - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult`"
  (^com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult [^AbstractAmazonSNS this ^java.lang.String topic-arn ^java.lang.String next-token]
    (-> this (.listSubscriptionsByTopic topic-arn next-token)))
  (^com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest request]
    (-> this (.listSubscriptionsByTopic request))))

(defn delete-topic
  "Description copied from interface: AmazonSNS

  request - `com.amazonaws.services.sns.model.DeleteTopicRequest`

  returns: Result of the DeleteTopic operation returned by the service. - `com.amazonaws.services.sns.model.DeleteTopicResult`"
  (^com.amazonaws.services.sns.model.DeleteTopicResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.DeleteTopicRequest request]
    (-> this (.deleteTopic request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonSNS

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonSNS this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-platform-endpoint
  "Description copied from interface: AmazonSNS

  request - Input for CreatePlatformEndpoint action. - `com.amazonaws.services.sns.model.CreatePlatformEndpointRequest`

  returns: Result of the CreatePlatformEndpoint operation returned by the service. - `com.amazonaws.services.sns.model.CreatePlatformEndpointResult`"
  (^com.amazonaws.services.sns.model.CreatePlatformEndpointResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.CreatePlatformEndpointRequest request]
    (-> this (.createPlatformEndpoint request))))

(defn subscribe
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  protocol - `java.lang.String`
  endpoint - `java.lang.String`

  returns: `com.amazonaws.services.sns.model.SubscribeResult`"
  (^com.amazonaws.services.sns.model.SubscribeResult [^AbstractAmazonSNS this ^java.lang.String topic-arn ^java.lang.String protocol ^java.lang.String endpoint]
    (-> this (.subscribe topic-arn protocol endpoint)))
  (^com.amazonaws.services.sns.model.SubscribeResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.SubscribeRequest request]
    (-> this (.subscribe request))))

(defn tag-resource
  "Description copied from interface: AmazonSNS

  request - `com.amazonaws.services.sns.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.sns.model.TagResourceResult`"
  (^com.amazonaws.services.sns.model.TagResourceResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn set-platform-application-attributes
  "Description copied from interface: AmazonSNS

  request - Input for SetPlatformApplicationAttributes action. - `com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest`

  returns: Result of the SetPlatformApplicationAttributes operation returned by the service. - `com.amazonaws.services.sns.model.SetPlatformApplicationAttributesResult`"
  (^com.amazonaws.services.sns.model.SetPlatformApplicationAttributesResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest request]
    (-> this (.setPlatformApplicationAttributes request))))

(defn add-permission
  "Description copied from interface: AmazonSNS

  topic-arn - `java.lang.String`
  label - `java.lang.String`
  a-ws-account-ids - `java.util.List`
  action-names - `java.util.List`

  returns: `com.amazonaws.services.sns.model.AddPermissionResult`"
  (^com.amazonaws.services.sns.model.AddPermissionResult [^AbstractAmazonSNS this ^java.lang.String topic-arn ^java.lang.String label ^java.util.List a-ws-account-ids ^java.util.List action-names]
    (-> this (.addPermission topic-arn label a-ws-account-ids action-names)))
  (^com.amazonaws.services.sns.model.AddPermissionResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.AddPermissionRequest request]
    (-> this (.addPermission request))))

(defn list-subscriptions
  "Description copied from interface: AmazonSNS

  request - Input for ListSubscriptions action. - `com.amazonaws.services.sns.model.ListSubscriptionsRequest`

  returns: Result of the ListSubscriptions operation returned by the service. - `com.amazonaws.services.sns.model.ListSubscriptionsResult`"
  (^com.amazonaws.services.sns.model.ListSubscriptionsResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.ListSubscriptionsRequest request]
    (-> this (.listSubscriptions request)))
  (^com.amazonaws.services.sns.model.ListSubscriptionsResult [^AbstractAmazonSNS this]
    (-> this (.listSubscriptions))))

(defn unsubscribe
  "Description copied from interface: AmazonSNS

  request - Input for Unsubscribe action. - `com.amazonaws.services.sns.model.UnsubscribeRequest`

  returns: Result of the Unsubscribe operation returned by the service. - `com.amazonaws.services.sns.model.UnsubscribeResult`"
  (^com.amazonaws.services.sns.model.UnsubscribeResult [^AbstractAmazonSNS this ^com.amazonaws.services.sns.model.UnsubscribeRequest request]
    (-> this (.unsubscribe request))))

