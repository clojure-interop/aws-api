(ns com.amazonaws.services.sqs.AbstractAmazonSQS
  "Abstract implementation of AmazonSQS. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sqs AbstractAmazonSQS]))

(defn get-queue-url
  "Description copied from interface: AmazonSQS

  request - `com.amazonaws.services.sqs.model.GetQueueUrlRequest`

  returns: Result of the GetQueueUrl operation returned by the service. - `com.amazonaws.services.sqs.model.GetQueueUrlResult`"
  (^com.amazonaws.services.sqs.model.GetQueueUrlResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.GetQueueUrlRequest request]
    (-> this (.getQueueUrl request))))

(defn set-queue-attributes
  "Description copied from interface: AmazonSQS

  queue-url - `java.lang.String`
  attributes - `java.util.Map`

  returns: `com.amazonaws.services.sqs.model.SetQueueAttributesResult`"
  (^com.amazonaws.services.sqs.model.SetQueueAttributesResult [^AbstractAmazonSQS this ^java.lang.String queue-url ^java.util.Map attributes]
    (-> this (.setQueueAttributes queue-url attributes)))
  (^com.amazonaws.services.sqs.model.SetQueueAttributesResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.SetQueueAttributesRequest request]
    (-> this (.setQueueAttributes request))))

(defn list-dead-letter-source-queues
  "Description copied from interface: AmazonSQS

  request - `com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest`

  returns: Result of the ListDeadLetterSourceQueues operation returned by the service. - `com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult`"
  (^com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest request]
    (-> this (.listDeadLetterSourceQueues request))))

(defn set-region
  "Description copied from interface: AmazonSQS

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonSQS this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn send-message-batch
  "Description copied from interface: AmazonSQS

  queue-url - `java.lang.String`
  entries - `java.util.List`

  returns: `com.amazonaws.services.sqs.model.SendMessageBatchResult`"
  (^com.amazonaws.services.sqs.model.SendMessageBatchResult [^AbstractAmazonSQS this ^java.lang.String queue-url ^java.util.List entries]
    (-> this (.sendMessageBatch queue-url entries)))
  (^com.amazonaws.services.sqs.model.SendMessageBatchResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.SendMessageBatchRequest request]
    (-> this (.sendMessageBatch request))))

(defn list-queues
  "Description copied from interface: AmazonSQS

  request - `com.amazonaws.services.sqs.model.ListQueuesRequest`

  returns: Result of the ListQueues operation returned by the service. - `com.amazonaws.services.sqs.model.ListQueuesResult`"
  (^com.amazonaws.services.sqs.model.ListQueuesResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.ListQueuesRequest request]
    (-> this (.listQueues request)))
  (^com.amazonaws.services.sqs.model.ListQueuesResult [^AbstractAmazonSQS this]
    (-> this (.listQueues))))

(defn tag-queue
  "Description copied from interface: AmazonSQS

  queue-url - `java.lang.String`
  tags - `java.util.Map`

  returns: `com.amazonaws.services.sqs.model.TagQueueResult`"
  (^com.amazonaws.services.sqs.model.TagQueueResult [^AbstractAmazonSQS this ^java.lang.String queue-url ^java.util.Map tags]
    (-> this (.tagQueue queue-url tags)))
  (^com.amazonaws.services.sqs.model.TagQueueResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.TagQueueRequest request]
    (-> this (.tagQueue request))))

(defn delete-message
  "Description copied from interface: AmazonSQS

  queue-url - `java.lang.String`
  receipt-handle - `java.lang.String`

  returns: `com.amazonaws.services.sqs.model.DeleteMessageResult`"
  (^com.amazonaws.services.sqs.model.DeleteMessageResult [^AbstractAmazonSQS this ^java.lang.String queue-url ^java.lang.String receipt-handle]
    (-> this (.deleteMessage queue-url receipt-handle)))
  (^com.amazonaws.services.sqs.model.DeleteMessageResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.DeleteMessageRequest request]
    (-> this (.deleteMessage request))))

(defn list-queue-tags
  "Description copied from interface: AmazonSQS

  request - `com.amazonaws.services.sqs.model.ListQueueTagsRequest`

  returns: Result of the ListQueueTags operation returned by the service. - `com.amazonaws.services.sqs.model.ListQueueTagsResult`"
  (^com.amazonaws.services.sqs.model.ListQueueTagsResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.ListQueueTagsRequest request]
    (-> this (.listQueueTags request))))

(defn create-queue
  "Description copied from interface: AmazonSQS

  request - `com.amazonaws.services.sqs.model.CreateQueueRequest`

  returns: Result of the CreateQueue operation returned by the service. - `com.amazonaws.services.sqs.model.CreateQueueResult`"
  (^com.amazonaws.services.sqs.model.CreateQueueResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.CreateQueueRequest request]
    (-> this (.createQueue request))))

(defn receive-message
  "Description copied from interface: AmazonSQS

  request - `com.amazonaws.services.sqs.model.ReceiveMessageRequest`

  returns: Result of the ReceiveMessage operation returned by the service. - `com.amazonaws.services.sqs.model.ReceiveMessageResult`"
  (^com.amazonaws.services.sqs.model.ReceiveMessageResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.ReceiveMessageRequest request]
    (-> this (.receiveMessage request))))

(defn remove-permission
  "Description copied from interface: AmazonSQS

  queue-url - `java.lang.String`
  label - `java.lang.String`

  returns: `com.amazonaws.services.sqs.model.RemovePermissionResult`"
  (^com.amazonaws.services.sqs.model.RemovePermissionResult [^AbstractAmazonSQS this ^java.lang.String queue-url ^java.lang.String label]
    (-> this (.removePermission queue-url label)))
  (^com.amazonaws.services.sqs.model.RemovePermissionResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.RemovePermissionRequest request]
    (-> this (.removePermission request))))

(defn delete-message-batch
  "Description copied from interface: AmazonSQS

  queue-url - `java.lang.String`
  entries - `java.util.List`

  returns: `com.amazonaws.services.sqs.model.DeleteMessageBatchResult`"
  (^com.amazonaws.services.sqs.model.DeleteMessageBatchResult [^AbstractAmazonSQS this ^java.lang.String queue-url ^java.util.List entries]
    (-> this (.deleteMessageBatch queue-url entries)))
  (^com.amazonaws.services.sqs.model.DeleteMessageBatchResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.DeleteMessageBatchRequest request]
    (-> this (.deleteMessageBatch request))))

(defn send-message
  "Description copied from interface: AmazonSQS

  queue-url - `java.lang.String`
  message-body - `java.lang.String`

  returns: `com.amazonaws.services.sqs.model.SendMessageResult`"
  (^com.amazonaws.services.sqs.model.SendMessageResult [^AbstractAmazonSQS this ^java.lang.String queue-url ^java.lang.String message-body]
    (-> this (.sendMessage queue-url message-body)))
  (^com.amazonaws.services.sqs.model.SendMessageResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.SendMessageRequest request]
    (-> this (.sendMessage request))))

(defn purge-queue
  "Description copied from interface: AmazonSQS

  request - `com.amazonaws.services.sqs.model.PurgeQueueRequest`

  returns: Result of the PurgeQueue operation returned by the service. - `com.amazonaws.services.sqs.model.PurgeQueueResult`"
  (^com.amazonaws.services.sqs.model.PurgeQueueResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.PurgeQueueRequest request]
    (-> this (.purgeQueue request))))

(defn shutdown
  "Description copied from interface: AmazonSQS"
  ([^AbstractAmazonSQS this]
    (-> this (.shutdown))))

(defn delete-queue
  "Description copied from interface: AmazonSQS

  request - `com.amazonaws.services.sqs.model.DeleteQueueRequest`

  returns: Result of the DeleteQueue operation returned by the service. - `com.amazonaws.services.sqs.model.DeleteQueueResult`"
  (^com.amazonaws.services.sqs.model.DeleteQueueResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.DeleteQueueRequest request]
    (-> this (.deleteQueue request))))

(defn untag-queue
  "Description copied from interface: AmazonSQS

  queue-url - `java.lang.String`
  tag-keys - `java.util.List`

  returns: `com.amazonaws.services.sqs.model.UntagQueueResult`"
  (^com.amazonaws.services.sqs.model.UntagQueueResult [^AbstractAmazonSQS this ^java.lang.String queue-url ^java.util.List tag-keys]
    (-> this (.untagQueue queue-url tag-keys)))
  (^com.amazonaws.services.sqs.model.UntagQueueResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.UntagQueueRequest request]
    (-> this (.untagQueue request))))

(defn set-endpoint
  "Description copied from interface: AmazonSQS

  endpoint - The endpoint (ex: \"sqs.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://sqs.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonSQS this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-queue-attributes
  "Description copied from interface: AmazonSQS

  queue-url - `java.lang.String`
  attribute-names - `java.util.List`

  returns: `com.amazonaws.services.sqs.model.GetQueueAttributesResult`"
  (^com.amazonaws.services.sqs.model.GetQueueAttributesResult [^AbstractAmazonSQS this ^java.lang.String queue-url ^java.util.List attribute-names]
    (-> this (.getQueueAttributes queue-url attribute-names)))
  (^com.amazonaws.services.sqs.model.GetQueueAttributesResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.GetQueueAttributesRequest request]
    (-> this (.getQueueAttributes request))))

(defn change-message-visibility-batch
  "Description copied from interface: AmazonSQS

  queue-url - `java.lang.String`
  entries - `java.util.List`

  returns: `com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult`"
  (^com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult [^AbstractAmazonSQS this ^java.lang.String queue-url ^java.util.List entries]
    (-> this (.changeMessageVisibilityBatch queue-url entries)))
  (^com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest request]
    (-> this (.changeMessageVisibilityBatch request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonSQS

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonSQS this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn change-message-visibility
  "Description copied from interface: AmazonSQS

  queue-url - `java.lang.String`
  receipt-handle - `java.lang.String`
  visibility-timeout - `java.lang.Integer`

  returns: `com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult`"
  (^com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult [^AbstractAmazonSQS this ^java.lang.String queue-url ^java.lang.String receipt-handle ^java.lang.Integer visibility-timeout]
    (-> this (.changeMessageVisibility queue-url receipt-handle visibility-timeout)))
  (^com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest request]
    (-> this (.changeMessageVisibility request))))

(defn add-permission
  "Description copied from interface: AmazonSQS

  queue-url - `java.lang.String`
  label - `java.lang.String`
  a-ws-account-ids - `java.util.List`
  actions - `java.util.List`

  returns: `com.amazonaws.services.sqs.model.AddPermissionResult`"
  (^com.amazonaws.services.sqs.model.AddPermissionResult [^AbstractAmazonSQS this ^java.lang.String queue-url ^java.lang.String label ^java.util.List a-ws-account-ids ^java.util.List actions]
    (-> this (.addPermission queue-url label a-ws-account-ids actions)))
  (^com.amazonaws.services.sqs.model.AddPermissionResult [^AbstractAmazonSQS this ^com.amazonaws.services.sqs.model.AddPermissionRequest request]
    (-> this (.addPermission request))))

