(ns com.amazonaws.services.mediastore.AbstractAWSMediaStore
  "Abstract implementation of AWSMediaStore. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.mediastore AbstractAWSMediaStore]))

(defn create-container
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.CreateContainerRequest`

  returns: Result of the CreateContainer operation returned by the service. - `com.amazonaws.services.mediastore.model.CreateContainerResult`"
  (^com.amazonaws.services.mediastore.model.CreateContainerResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.CreateContainerRequest request]
    (-> this (.createContainer request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.mediastore.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.mediastore.model.ListTagsForResourceResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn get-lifecycle-policy
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.GetLifecyclePolicyRequest`

  returns: Result of the GetLifecyclePolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.GetLifecyclePolicyResult`"
  (^com.amazonaws.services.mediastore.model.GetLifecyclePolicyResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.GetLifecyclePolicyRequest request]
    (-> this (.getLifecyclePolicy request))))

(defn delete-cors-policy
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest`

  returns: Result of the DeleteCorsPolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.DeleteCorsPolicyResult`"
  (^com.amazonaws.services.mediastore.model.DeleteCorsPolicyResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.DeleteCorsPolicyRequest request]
    (-> this (.deleteCorsPolicy request))))

(defn put-cors-policy
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.PutCorsPolicyRequest`

  returns: Result of the PutCorsPolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.PutCorsPolicyResult`"
  (^com.amazonaws.services.mediastore.model.PutCorsPolicyResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.PutCorsPolicyRequest request]
    (-> this (.putCorsPolicy request))))

(defn describe-container
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.DescribeContainerRequest`

  returns: Result of the DescribeContainer operation returned by the service. - `com.amazonaws.services.mediastore.model.DescribeContainerResult`"
  (^com.amazonaws.services.mediastore.model.DescribeContainerResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.DescribeContainerRequest request]
    (-> this (.describeContainer request))))

(defn untag-resource
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.mediastore.model.UntagResourceResult`"
  (^com.amazonaws.services.mediastore.model.UntagResourceResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn delete-lifecycle-policy
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyRequest`

  returns: Result of the DeleteLifecyclePolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyResult`"
  (^com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.DeleteLifecyclePolicyRequest request]
    (-> this (.deleteLifecyclePolicy request))))

(defn put-container-policy
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.PutContainerPolicyRequest`

  returns: Result of the PutContainerPolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.PutContainerPolicyResult`"
  (^com.amazonaws.services.mediastore.model.PutContainerPolicyResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.PutContainerPolicyRequest request]
    (-> this (.putContainerPolicy request))))

(defn get-cors-policy
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.GetCorsPolicyRequest`

  returns: Result of the GetCorsPolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.GetCorsPolicyResult`"
  (^com.amazonaws.services.mediastore.model.GetCorsPolicyResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.GetCorsPolicyRequest request]
    (-> this (.getCorsPolicy request))))

(defn shutdown
  "Description copied from interface: AWSMediaStore"
  ([^AbstractAWSMediaStore this]
    (-> this (.shutdown))))

(defn delete-container
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.DeleteContainerRequest`

  returns: Result of the DeleteContainer operation returned by the service. - `com.amazonaws.services.mediastore.model.DeleteContainerResult`"
  (^com.amazonaws.services.mediastore.model.DeleteContainerResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.DeleteContainerRequest request]
    (-> this (.deleteContainer request))))

(defn delete-container-policy
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest`

  returns: Result of the DeleteContainerPolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.DeleteContainerPolicyResult`"
  (^com.amazonaws.services.mediastore.model.DeleteContainerPolicyResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.DeleteContainerPolicyRequest request]
    (-> this (.deleteContainerPolicy request))))

(defn list-containers
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.ListContainersRequest`

  returns: Result of the ListContainers operation returned by the service. - `com.amazonaws.services.mediastore.model.ListContainersResult`"
  (^com.amazonaws.services.mediastore.model.ListContainersResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.ListContainersRequest request]
    (-> this (.listContainers request))))

(defn start-access-logging
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.StartAccessLoggingRequest`

  returns: Result of the StartAccessLogging operation returned by the service. - `com.amazonaws.services.mediastore.model.StartAccessLoggingResult`"
  (^com.amazonaws.services.mediastore.model.StartAccessLoggingResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.StartAccessLoggingRequest request]
    (-> this (.startAccessLogging request))))

(defn stop-access-logging
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.StopAccessLoggingRequest`

  returns: Result of the StopAccessLogging operation returned by the service. - `com.amazonaws.services.mediastore.model.StopAccessLoggingResult`"
  (^com.amazonaws.services.mediastore.model.StopAccessLoggingResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.StopAccessLoggingRequest request]
    (-> this (.stopAccessLogging request))))

(defn get-container-policy
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.GetContainerPolicyRequest`

  returns: Result of the GetContainerPolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.GetContainerPolicyResult`"
  (^com.amazonaws.services.mediastore.model.GetContainerPolicyResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.GetContainerPolicyRequest request]
    (-> this (.getContainerPolicy request))))

(defn put-lifecycle-policy
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.PutLifecyclePolicyRequest`

  returns: Result of the PutLifecyclePolicy operation returned by the service. - `com.amazonaws.services.mediastore.model.PutLifecyclePolicyResult`"
  (^com.amazonaws.services.mediastore.model.PutLifecyclePolicyResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.PutLifecyclePolicyRequest request]
    (-> this (.putLifecyclePolicy request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSMediaStore

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSMediaStore this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn tag-resource
  "Description copied from interface: AWSMediaStore

  request - `com.amazonaws.services.mediastore.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.mediastore.model.TagResourceResult`"
  (^com.amazonaws.services.mediastore.model.TagResourceResult [^AbstractAWSMediaStore this ^com.amazonaws.services.mediastore.model.TagResourceRequest request]
    (-> this (.tagResource request))))

