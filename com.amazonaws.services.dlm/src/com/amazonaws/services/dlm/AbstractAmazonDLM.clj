(ns com.amazonaws.services.dlm.AbstractAmazonDLM
  "Abstract implementation of AmazonDLM. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.dlm AbstractAmazonDLM]))

(defn create-lifecycle-policy
  "Description copied from interface: AmazonDLM

  request - `com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest`

  returns: Result of the CreateLifecyclePolicy operation returned by the service. - `com.amazonaws.services.dlm.model.CreateLifecyclePolicyResult`"
  (^com.amazonaws.services.dlm.model.CreateLifecyclePolicyResult [^AbstractAmazonDLM this ^com.amazonaws.services.dlm.model.CreateLifecyclePolicyRequest request]
    (-> this (.createLifecyclePolicy request))))

(defn delete-lifecycle-policy
  "Description copied from interface: AmazonDLM

  request - `com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest`

  returns: Result of the DeleteLifecyclePolicy operation returned by the service. - `com.amazonaws.services.dlm.model.DeleteLifecyclePolicyResult`"
  (^com.amazonaws.services.dlm.model.DeleteLifecyclePolicyResult [^AbstractAmazonDLM this ^com.amazonaws.services.dlm.model.DeleteLifecyclePolicyRequest request]
    (-> this (.deleteLifecyclePolicy request))))

(defn get-lifecycle-policies
  "Description copied from interface: AmazonDLM

  request - `com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest`

  returns: Result of the GetLifecyclePolicies operation returned by the service. - `com.amazonaws.services.dlm.model.GetLifecyclePoliciesResult`"
  (^com.amazonaws.services.dlm.model.GetLifecyclePoliciesResult [^AbstractAmazonDLM this ^com.amazonaws.services.dlm.model.GetLifecyclePoliciesRequest request]
    (-> this (.getLifecyclePolicies request))))

(defn get-lifecycle-policy
  "Description copied from interface: AmazonDLM

  request - `com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest`

  returns: Result of the GetLifecyclePolicy operation returned by the service. - `com.amazonaws.services.dlm.model.GetLifecyclePolicyResult`"
  (^com.amazonaws.services.dlm.model.GetLifecyclePolicyResult [^AbstractAmazonDLM this ^com.amazonaws.services.dlm.model.GetLifecyclePolicyRequest request]
    (-> this (.getLifecyclePolicy request))))

(defn update-lifecycle-policy
  "Description copied from interface: AmazonDLM

  request - `com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest`

  returns: Result of the UpdateLifecyclePolicy operation returned by the service. - `com.amazonaws.services.dlm.model.UpdateLifecyclePolicyResult`"
  (^com.amazonaws.services.dlm.model.UpdateLifecyclePolicyResult [^AbstractAmazonDLM this ^com.amazonaws.services.dlm.model.UpdateLifecyclePolicyRequest request]
    (-> this (.updateLifecyclePolicy request))))

(defn shutdown
  "Description copied from interface: AmazonDLM"
  ([^AbstractAmazonDLM this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonDLM

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonDLM this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

