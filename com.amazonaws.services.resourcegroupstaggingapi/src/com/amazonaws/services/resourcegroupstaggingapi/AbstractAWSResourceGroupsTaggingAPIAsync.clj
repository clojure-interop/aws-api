(ns com.amazonaws.services.resourcegroupstaggingapi.AbstractAWSResourceGroupsTaggingAPIAsync
  "Abstract implementation of AWSResourceGroupsTaggingAPIAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.resourcegroupstaggingapi AbstractAWSResourceGroupsTaggingAPIAsync]))

(defn get-resources-async
  "Description copied from interface: AWSResourceGroupsTaggingAPIAsync

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest request]
    (-> this (.getResourcesAsync request))))

(defn get-tag-keys-async
  "Description copied from interface: AWSResourceGroupsTaggingAPIAsync

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTagKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest request]
    (-> this (.getTagKeysAsync request))))

(defn get-tag-values-async
  "Description copied from interface: AWSResourceGroupsTaggingAPIAsync

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTagValues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTagValuesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest request]
    (-> this (.getTagValuesAsync request))))

(defn tag-resources-async
  "Description copied from interface: AWSResourceGroupsTaggingAPIAsync

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest request]
    (-> this (.tagResourcesAsync request))))

(defn untag-resources-async
  "Description copied from interface: AWSResourceGroupsTaggingAPIAsync

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSResourceGroupsTaggingAPIAsync this ^com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest request]
    (-> this (.untagResourcesAsync request))))

