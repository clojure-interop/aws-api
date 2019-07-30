(ns com.amazonaws.services.sqs.AbstractAmazonSQSAsync
  "Abstract implementation of AmazonSQSAsync. Convenient method forms pass through to the corresponding overload
  that takes a request object and an AsyncHandler, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sqs AbstractAmazonSQSAsync]))

(defn get-queue-url-async
  "Description copied from interface: AmazonSQSAsync

  request - `com.amazonaws.services.sqs.model.GetQueueUrlRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQueueUrl operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.GetQueueUrlResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.GetQueueUrlRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueueUrlAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.GetQueueUrlRequest request]
    (-> this (.getQueueUrlAsync request))))

(defn get-queue-attributes-async
  "Simplified method form for invoking the GetQueueAttributes operation with an AsyncHandler.

  queue-url - `java.lang.String`
  attribute-names - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.GetQueueAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.util.List attribute-names ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueueAttributesAsync queue-url attribute-names async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.GetQueueAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueueAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.GetQueueAttributesRequest request]
    (-> this (.getQueueAttributesAsync request))))

(defn delete-message-batch-async
  "Simplified method form for invoking the DeleteMessageBatch operation with an AsyncHandler.

  queue-url - `java.lang.String`
  entries - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.DeleteMessageBatchResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.util.List entries ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMessageBatchAsync queue-url entries async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.DeleteMessageBatchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMessageBatchAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.DeleteMessageBatchRequest request]
    (-> this (.deleteMessageBatchAsync request))))

(defn list-queue-tags-async
  "Description copied from interface: AmazonSQSAsync

  request - `com.amazonaws.services.sqs.model.ListQueueTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListQueueTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.ListQueueTagsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.ListQueueTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listQueueTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.ListQueueTagsRequest request]
    (-> this (.listQueueTagsAsync request))))

(defn create-queue-async
  "Description copied from interface: AmazonSQSAsync

  request - `com.amazonaws.services.sqs.model.CreateQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.CreateQueueResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.CreateQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.CreateQueueRequest request]
    (-> this (.createQueueAsync request))))

(defn remove-permission-async
  "Simplified method form for invoking the RemovePermission operation with an AsyncHandler.

  queue-url - `java.lang.String`
  label - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.RemovePermissionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String label ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync queue-url label async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.RemovePermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.RemovePermissionRequest request]
    (-> this (.removePermissionAsync request))))

(defn untag-queue-async
  "Simplified method form for invoking the UntagQueue operation with an AsyncHandler.

  queue-url - `java.lang.String`
  tag-keys - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.UntagQueueResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.util.List tag-keys ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagQueueAsync queue-url tag-keys async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.UntagQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.UntagQueueRequest request]
    (-> this (.untagQueueAsync request))))

(defn send-message-async
  "Simplified method form for invoking the SendMessage operation with an AsyncHandler.

  queue-url - `java.lang.String`
  message-body - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.SendMessageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String message-body ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendMessageAsync queue-url message-body async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.SendMessageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendMessageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.SendMessageRequest request]
    (-> this (.sendMessageAsync request))))

(defn change-message-visibility-async
  "Simplified method form for invoking the ChangeMessageVisibility operation with an AsyncHandler.

  queue-url - `java.lang.String`
  receipt-handle - `java.lang.String`
  visibility-timeout - `java.lang.Integer`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String receipt-handle ^java.lang.Integer visibility-timeout ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changeMessageVisibilityAsync queue-url receipt-handle visibility-timeout async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String receipt-handle ^java.lang.Integer visibility-timeout]
    (-> this (.changeMessageVisibilityAsync queue-url receipt-handle visibility-timeout)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changeMessageVisibilityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest request]
    (-> this (.changeMessageVisibilityAsync request))))

(defn add-permission-async
  "Simplified method form for invoking the AddPermission operation with an AsyncHandler.

  queue-url - `java.lang.String`
  label - `java.lang.String`
  a-ws-account-ids - `java.util.List`
  actions - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.AddPermissionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String label ^java.util.List a-ws-account-ids ^java.util.List actions ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addPermissionAsync queue-url label a-ws-account-ids actions async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String label ^java.util.List a-ws-account-ids ^java.util.List actions]
    (-> this (.addPermissionAsync queue-url label a-ws-account-ids actions)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.AddPermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addPermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.AddPermissionRequest request]
    (-> this (.addPermissionAsync request))))

(defn set-queue-attributes-async
  "Simplified method form for invoking the SetQueueAttributes operation with an AsyncHandler.

  queue-url - `java.lang.String`
  attributes - `java.util.Map`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.SetQueueAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.util.Map attributes ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setQueueAttributesAsync queue-url attributes async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.SetQueueAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setQueueAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.SetQueueAttributesRequest request]
    (-> this (.setQueueAttributesAsync request))))

(defn receive-message-async
  "Description copied from interface: AmazonSQSAsync

  request - `com.amazonaws.services.sqs.model.ReceiveMessageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReceiveMessage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.ReceiveMessageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.ReceiveMessageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.receiveMessageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.ReceiveMessageRequest request]
    (-> this (.receiveMessageAsync request))))

(defn tag-queue-async
  "Simplified method form for invoking the TagQueue operation with an AsyncHandler.

  queue-url - `java.lang.String`
  tags - `java.util.Map`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.TagQueueResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.util.Map tags ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagQueueAsync queue-url tags async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.TagQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.TagQueueRequest request]
    (-> this (.tagQueueAsync request))))

(defn delete-message-async
  "Simplified method form for invoking the DeleteMessage operation with an AsyncHandler.

  queue-url - `java.lang.String`
  receipt-handle - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.DeleteMessageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String receipt-handle ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMessageAsync queue-url receipt-handle async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.DeleteMessageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMessageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.DeleteMessageRequest request]
    (-> this (.deleteMessageAsync request))))

(defn send-message-batch-async
  "Simplified method form for invoking the SendMessageBatch operation with an AsyncHandler.

  queue-url - `java.lang.String`
  entries - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.SendMessageBatchResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.util.List entries ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendMessageBatchAsync queue-url entries async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.SendMessageBatchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendMessageBatchAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.SendMessageBatchRequest request]
    (-> this (.sendMessageBatchAsync request))))

(defn change-message-visibility-batch-async
  "Simplified method form for invoking the ChangeMessageVisibilityBatch operation with an AsyncHandler.

  queue-url - `java.lang.String`
  entries - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^java.lang.String queue-url ^java.util.List entries ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changeMessageVisibilityBatchAsync queue-url entries async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changeMessageVisibilityBatchAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest request]
    (-> this (.changeMessageVisibilityBatchAsync request))))

(defn purge-queue-async
  "Description copied from interface: AmazonSQSAsync

  request - `com.amazonaws.services.sqs.model.PurgeQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurgeQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.PurgeQueueResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.PurgeQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purgeQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.PurgeQueueRequest request]
    (-> this (.purgeQueueAsync request))))

(defn list-queues-async
  "Description copied from interface: AmazonSQSAsync

  request - `com.amazonaws.services.sqs.model.ListQueuesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListQueues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.ListQueuesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.ListQueuesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listQueuesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.ListQueuesRequest request]
    (-> this (.listQueuesAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this]
    (-> this (.listQueuesAsync))))

(defn delete-queue-async
  "Description copied from interface: AmazonSQSAsync

  request - `com.amazonaws.services.sqs.model.DeleteQueueRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.DeleteQueueResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.DeleteQueueRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteQueueAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.DeleteQueueRequest request]
    (-> this (.deleteQueueAsync request))))

(defn list-dead-letter-source-queues-async
  "Description copied from interface: AmazonSQSAsync

  request - `com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeadLetterSourceQueues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeadLetterSourceQueuesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonSQSAsync this ^com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest request]
    (-> this (.listDeadLetterSourceQueuesAsync request))))

