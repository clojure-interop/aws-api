(ns com.amazonaws.services.resourcegroupstaggingapi.AbstractAWSResourceGroupsTaggingAPI
  "Abstract implementation of AWSResourceGroupsTaggingAPI. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.resourcegroupstaggingapi AbstractAWSResourceGroupsTaggingAPI]))

(defn get-resources
  "Description copied from interface: AWSResourceGroupsTaggingAPI

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest`

  returns: Result of the GetResources operation returned by the service. - `com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult`"
  (^com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesResult [^AbstractAWSResourceGroupsTaggingAPI this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetResourcesRequest request]
    (-> this (.getResources request))))

(defn get-tag-keys
  "Description copied from interface: AWSResourceGroupsTaggingAPI

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest`

  returns: Result of the GetTagKeys operation returned by the service. - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult`"
  (^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysResult [^AbstractAWSResourceGroupsTaggingAPI this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagKeysRequest request]
    (-> this (.getTagKeys request))))

(defn get-tag-values
  "Description copied from interface: AWSResourceGroupsTaggingAPI

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest`

  returns: Result of the GetTagValues operation returned by the service. - `com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult`"
  (^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesResult [^AbstractAWSResourceGroupsTaggingAPI this ^com.amazonaws.services.resourcegroupstaggingapi.model.GetTagValuesRequest request]
    (-> this (.getTagValues request))))

(defn tag-resources
  "Description copied from interface: AWSResourceGroupsTaggingAPI

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest`

  returns: Result of the TagResources operation returned by the service. - `com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult`"
  (^com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesResult [^AbstractAWSResourceGroupsTaggingAPI this ^com.amazonaws.services.resourcegroupstaggingapi.model.TagResourcesRequest request]
    (-> this (.tagResources request))))

(defn untag-resources
  "Description copied from interface: AWSResourceGroupsTaggingAPI

  request - `com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest`

  returns: Result of the UntagResources operation returned by the service. - `com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult`"
  (^com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesResult [^AbstractAWSResourceGroupsTaggingAPI this ^com.amazonaws.services.resourcegroupstaggingapi.model.UntagResourcesRequest request]
    (-> this (.untagResources request))))

(defn shutdown
  "Description copied from interface: AWSResourceGroupsTaggingAPI"
  ([^AbstractAWSResourceGroupsTaggingAPI this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSResourceGroupsTaggingAPI

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSResourceGroupsTaggingAPI this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

